package org.example;

/**
 * author :  sanghoonkim
 * date : 2022/12/26
 */
public class WrongFixedPasswordGenerator implements PwGenerator {
    @Override
    public String generatePassword() {
        return "ab";  //2글자
    }
}
