package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Kaprekar {

    Scanner reader = new Scanner(System.in);
    String number = reader.nextLine();

    public String kaprekarMethod(String number) {
        char[] ascendingDigits = number.toCharArray();
        Arrays.sort(ascendingDigits);
        char[] descendingDigits = new char[4];
        for (int i = 0; i < 4; i++) {
            descendingDigits[i] = ascendingDigits[3 - 1];
        }

        int ascendingNumber = Integer.parseInt(new String(ascendingDigits));
        int descendingNumber = Integer.parseInt(new String(descendingDigits));

        int difference = descendingNumber - ascendingNumber;
        String result = Integer.toString(difference);

        return result;
    }

    public boolean hasFourDigits(String number) {
        if (number.length() == 4) {
            return true;
        }
        return false;
    }

    public boolean hasTwoDifferentDigits(String number) {
        char[] digits = number.toCharArray();
        if (digits[0] == digits[1] && digits[1] == digits[2] &&
        digits[2] == digits[3] && digits[3] == digits[4]) {
            return true;
        }
        return false;
    }

    public Kaprekar(String number) {
    }

    public Kaprekar() {
    }
}
