package com.study.freeboard.encryptor;

import java.security.NoSuchAlgorithmException;

public interface Encryptor {

    /**
     * value의 값을 암호화한 값을 반환한다.
     *
     * @param value 암호화할 값
     * @return 암호화된 값
     * @throws NoSuchAlgorithmException 알고리즘을 사용할 수 없을 시 발생
     */
    String encrypt(String value) throws NoSuchAlgorithmException;
}
