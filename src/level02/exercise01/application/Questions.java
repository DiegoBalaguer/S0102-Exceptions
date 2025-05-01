package level02.exercise01.application;

import level02.exercise01.exceptions.*;
import level02.exercise01.utils.Entrance;

/**
 * PROGRAM: Questions
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class Questions {
    private InputValidator validator = new InputValidator();

    public void ScannerClose() {
        Entrance.scannerClose();
    }

    public void fingersHandByteQuestion() {
        while (true) {
            byte fingers = Entrance.valueByte("\nType number of fingers on your hand (0 to 10): ");
            try {
                validator.fingersFilter(fingers);
                printSuccess("You have " + fingers + " fingers on your hand.");
                return;
            } catch (FingersException e) {
                printError(e);
            }
        }
    }

    public void floorsHotelQuestion() {
        while (true) {
            int floors = Entrance.valueInt("\nType number of floors in Hotel Miramar (1 to 65): ");
            try {
                validator.floorsFilter(floors);
                printSuccess("Hotel Miramar has " + floors + " floors.");
                return;
            } catch (FloorsException e) {
                printError(e);
            }
        }
    }

    public void computersPriceQuestion() {
        while (true) {
            float price = Entrance.valueFloat("\nType the price of office computers (1 to 6000): ");
            try {
                validator.computersPrice(price);
                printSuccess("The price of office computers is: " + price + "€.");
                return;
            } catch (ComputersPriceException e) {
                printError(e);
            }
        }
    }

    public void stockPapersQuestion() {
        while (true) {
            double stock = Entrance.valueDouble("\nType the number of paper sheets in stock (1 to 100000): ");
            try {
                validator.sheetsStock(stock);
                printSuccess("There are " + stock + " paper sheets in stock.");
                return;
            } catch (SheetsException e) {
                printError(e);
            }
        }
    }

    public void insertVocalQuestion() {
        while (true) {
            char vocal = Entrance.valueChar("\nInsert a vowel (a to u): ");
            try {
                validator.vocalsChar(vocal);
                printSuccess("The character is a vowel: " + vocal + ".");
                return;
            } catch (VocalsException e) {
                printError(e);
            }
        }
    }

    public void insertPasswrdQuestion() {
        while (true) {
            String password = Entrance.valueString("\nInsert a password (10 characters or more): ");
            try {
                validator.passwdLenght(password);
                printSuccess("The password is valid.");
                return;
            } catch (PasswdException e) {
                printError(e);
            }
        }
    }

    public void destroyWorld() {
        boolean destroy = Entrance.valueBoolean("\nDestroy the world? (S/N): ");
        String msg = destroy ? "The world is destroyed." : "The world has one more day.";
        printSuccess(msg);
    }

    private void printSuccess(String message) {
        System.out.println("✅ " + message);
    }

    private void printError(Exception e) {
        System.err.println("❌ Error: " + e.getMessage());
    }
}
