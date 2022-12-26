package org.example;

/**
 * author :  sanghoonkim
 * date : 2022/12/26
 */
public class CorrectFixedPasswordGenerator implements PwGenerator {
    @Override
    public String generatePassword() {
        return "abcdefgh";  //8글자
    }
}
