package level01.exercice01;

import level01.exercice01.aplication.MainProcess;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class Main {

    public static void main(String[] args) {

        MainProcess initialProcess = new MainProcess();

        initialProcess.run();
        System.out.println("PROCESS FINISHED...");
    }
}


