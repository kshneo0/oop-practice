package org.example;

/**
 * author :  sanghoonkim
 * date : 2022/12/26
 */
public class User {
    private String password;

    public void initPassword(PwGenerator passwordGenerator) {
        //as-is
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        //to-be
        String password = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if (password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
