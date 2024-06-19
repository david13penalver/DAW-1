package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Kaprekar kaprekar = new Kaprekar();
        System.out.println(kaprekar.hasFourDigits("1234"));
        System.out.println(kaprekar.hasTwoDifferentDigits("1234"));
        //System.out.println(kaprekar.kaprekarMethod("1"));
        int startingNumber = 1234;

        while (startingNumber != 6174) {
            kaprekar.kaprekarMethod(Integer.toString(startingNumber));
        }
    }
}

