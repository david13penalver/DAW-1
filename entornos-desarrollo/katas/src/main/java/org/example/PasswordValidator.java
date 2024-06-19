package org.example;

public class PasswordValidator {

    public boolean validate(String password) {
        if (password.length() < 8 || !hasAtLeastTwoNumbers(password) || !hasAtLeast1CapitalLetter(password) || !hasSpecialCharacter(password)) {
            return false;
        }
        return true;

    }

    private boolean hasAtLeastTwoNumbers(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        return count >= 2;
    }

    private boolean hasAtLeast1CapitalLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
