package tech.triviumcapital.clients.java.security;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.time.Instant;

public class CallbackUtilsTest {

    @Test
    void testSignatureVerification() throws NoSuchAlgorithmException, InvalidKeySpecException, SignatureException, InvalidKeyException {
        String signature = "ecU4QPwIEVCBDUt8tubvl84fO5pAsIKTn4OeyZRFuVYIQABrL+KhWD1zaF4e1W5z/LZtOLDrMAtyW7csaBu544q4SqZwFO/gKhJAfvGUUbx7czW6xDK+HiHkBB3HMa6NsZqVzrHlArJG5ti3v0iKgoY/VcbvwCR/NFLojiC6H5/1ic7nwla8/HZXTK7d4dC2QRtjvaJXq/jhJ+FjNtkbt4OIZBa4PDBUwPyfCcpiN1dy12crJJxO/rh8deYrwu8CCOmKSR7j5BVH0M7X/METFeUb/srub3AIwckhQCqH8gEaSe9MzNgHMfQdXRWtJtV1EGCmLDE94n/ppgp2Ig8Y8g==";
        String requestBody = "{\"type\":\"UserActivated\",\"userId\":\"84d68dda-da91-4ae6-a21a-6faee2f6c8ad\"}";
        String timestamp = "2024-07-20T06:03:42.420161Z";
        String publicKeyString = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqgdWNgGR+kR5sA7+oAXghDwXOPQAqo780XqRhP5R9kBid65I25pe+IIDT2bDlGs+uZtQnGdlg9GzWglpVs+gtIglalOVD96xv1cor+IWGRSRuBZolsq00LbWYuJBOJ1TW1M/u1+jNNjlML/WRvxpXbL3hMgp5Jk5FSq/Mj5BCc+I+SmPJBlIo/4+toJu4T41+Y29+h/C0L8WsUcUoP32cxQMCl/sRdFMGrRAFFIx1NtyXCmQDSUCtEwQ24o3oMnk3h0kTzmNNRPhk30Px4UaP/2NuECsuQIdC3Qm9OToHlrF2hDg073phthleZTZ/+4asb265l0cIBLv8x/AjIqU7wIDAQAB";
        Instant now = Instant.parse("2024-07-20T06:04:42Z");
        assertTrue(CallbackUtils.verifyTriviumCallbackRequest(signature, requestBody, timestamp, publicKeyString, 600, now));
    }
}
