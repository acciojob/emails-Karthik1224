package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId()
    {
        return emailId;
    }

    public String getPassword()
    {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(password.equals(oldPassword))
        {
            boolean flag = validate(newPassword);
            if(flag == true)
            {
                this.password = newPassword;
            }
        }
    }
    public boolean validate(String pass)
    {
        if(pass.length() < 8) return false;
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean specialCharFlag = false;
        for(int i=0;i < pass.length();i++) {
            ch = pass.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            else {
                specialCharFlag = true;
            }
            if(numberFlag && capitalFlag && lowerCaseFlag & specialCharFlag)
                return true;
        }
        return false;

    }
}
