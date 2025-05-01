package level02.exercise01.utils;

import level02.exercise01.exceptions.LengthCharException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * PROGRAM: Entrance
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class Entrance {

    private static final Scanner sc = new Scanner(System.in);

    public static void scannerClose() {
        sc.close();
    }

    public static String valueString(String message) {

        do {
            try {
                return enterValueString(message);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    private static String enterValueString(String message) {
        String resp = readKeystrokesString(message);
        if (resp.isBlank()) {
            throw new IllegalArgumentException("Empty inputs are wrong.");
        } else {
            return resp;
        }
    }

    public static byte valueByte(String message) {

        do {
            String resp = valueString(message);
            try {
                return Byte.parseByte(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    public static int valueInt(String message) {

        do {
            String resp = valueString(message);
            try {
                return Integer.parseInt(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    public static int valueIntWithoutException(String message) {

        do {
            String resp = valueString(message);
            if (isNumber(resp)) {
                return Integer.parseInt(resp);
            }
        } while (true);
    }

    public static float valueFloat(String message) {

        do {
            String resp = valueString(message);
            try {
                return Float.parseFloat(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    public static double valueDouble(String message) {

        do {
            String resp = valueString(message);
            try {
                return Double.parseDouble(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    public static char valueChar(String message) {

        do {
            String resp = valueString(message);
            try {
                lenghtChar(resp.length());
                return resp.charAt(0);
            } catch (LengthCharException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    private static void lenghtChar(int r) throws LengthCharException {

        if (r != 1) {
            throw new LengthCharException();
        }
    }

    public static boolean valueBoolean(String message) {

        do {
            char resp = Character.toUpperCase(valueChar(message));
            try {
                return calculateValueBoolean(resp);
            } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
        } while (true);
    }

    private static boolean calculateValueBoolean(char valueBoolean) {

        return switch (valueBoolean) {
            case 'Y', 'T', 'S' -> true;
            case 'F', 'N' -> false;
            default -> throw new IllegalArgumentException("Error: Please enter 'S', 'Y' or 'T' for yes or 'N' or 'F' for no.");
        };
    }

    public static String readKeystrokesString(String message) {

        System.out.println(message);
        return sc.nextLine();
    }

    public static boolean isNumber(String resp) {

        return (resp.matches("\\d+")) ? true : false;
    }
}
