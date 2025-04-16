package level02.exercice01;

import level02.exercice01.aplication.MainProcess;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class Main {

    public static void main(String[] args) {

        MainProcess initialProcess = new MainProcess();

        initialProcess.run();
        System.out.println("PROCESS FINISHED...");
    }
}

