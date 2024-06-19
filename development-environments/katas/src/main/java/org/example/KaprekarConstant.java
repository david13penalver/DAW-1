package org.example;

import java.util.Arrays;

public class KaprekarConstant {
    public static int kaprekarIteration(int number) {
        // Se asegura de que el número tenga exactamente 4 dígitos
        String numberString = String.format("%04d", number);

        // Convierte el número en un array de caracteres y lo ordena en orden ascendente y descendente
        char[] ascendingDigits = numberString.toCharArray();
        Arrays.sort(ascendingDigits);
        char[] descendingDigits = new char[4];
        for (int i = 0; i < 4; i++) {
            descendingDigits[i] = ascendingDigits[3 - i];
        }

        // Convierte los arrays de caracteres en números enteros
        int ascendingNumber = Integer.parseInt(new String(ascendingDigits));
        int descendingNumber = Integer.parseInt(new String(descendingDigits));

        // Resta el menor al mayor
        int difference = descendingNumber - ascendingNumber;

        // Devuelve la diferencia
        return difference;
    }

    public static void main(String[] args) {
        int startingNumber = 1234; // Puedes elegir cualquier número de cuatro dígitos válido aquí

        // Itera el proceso hasta que se alcanza la constante de Kaprekar (6174) o se repite un número
        while (startingNumber != 6174) {
            startingNumber = kaprekarIteration(startingNumber);
            System.out.println(startingNumber);
            // Si se repite un número, termina el bucle
            if (startingNumber == 0) {
                System.out.println("El número no es válido para el algoritmo de Kaprekar.");
                break;
            }
        }
    }
    }
