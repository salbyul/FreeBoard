package com.study.freeboard.encryptor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Encryptor implements Encryptor {

    /**
     * value를 SHA-256 알고리즘으로 암호화하여 반환한다.
     *
     * @param value 암호화할 값
     * @return SHA-256 알고리즘으로 암호화한 값
     * @throws NoSuchAlgorithmException 알고리즘을 사용할 수 없을 시 발생
     */
    @Override
    public String encrypt(String value) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(value.getBytes());
        return bytesToHex(md.digest());
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();

        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
