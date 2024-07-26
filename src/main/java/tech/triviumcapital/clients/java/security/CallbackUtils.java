package tech.triviumcapital.clients.java.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.time.Instant;
import java.util.Base64;

public class CallbackUtils {

    /**
     * @param signatureHeaderValue   Comma-separated signatures to enable zero-downtime key rotation. Retrieve from HTTP header: "Trivium-Signature".
     * @param rawCallbackRequestBody Raw string body received by server.
     * @param timestampHeaderValue   Retrieve from HTTP header: "Trivium-Timestamp".
     * @param publicKeyBase64Encoded Retrieve upon event subscription from Trivium API.
     * @param validityPeriodSeconds  Defines window in which timestamp is valid to prevent replay attacks. Recommended value: 600 seconds (10 minutes).
     * @param now                    Current time.
     * @return true if any signature matches for the supplied public key, otherwise false.
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws SignatureException
     * @throws InvalidKeyException
     * @throws IllegalArgumentException Thrown when time difference between current time and supplied timestamp is greater than validityPeriodSeconds.
     */
    public static boolean verifyTriviumCallbackRequest(
            String signatureHeaderValue,
            String rawCallbackRequestBody,
            String timestampHeaderValue,
            String publicKeyBase64Encoded,
            int validityPeriodSeconds,
            Instant now
    ) throws NoSuchAlgorithmException, InvalidKeySpecException, SignatureException, InvalidKeyException, IllegalArgumentException {
        Instant requestTimestamp = Instant.parse(timestampHeaderValue);
        long timeDifference = Math.abs(now.getEpochSecond() - requestTimestamp.getEpochSecond());
        if (timeDifference > validityPeriodSeconds)
            throw new IllegalArgumentException(
                    "Callback received from Trivium with timestamp" +
                            timestampHeaderValue +
                            ", " +
                            timeDifference +
                            " seconds difference from " +
                            now +
                            ", which is greater than the configured validity period of " +
                            validityPeriodSeconds +
                            " seconds.");

        for (String signature : signatureHeaderValue.trim().split(",")) {
            String toVerify = timestampHeaderValue + "|" + rawCallbackRequestBody;
            if (SigningUtils.verify(
                    SigningUtils.publicKeyFromBase64String(publicKeyBase64Encoded),
                    Base64.getDecoder().decode(signature),
                    toVerify)) {
                return true;
            }
        }
        return false;
    }

}
