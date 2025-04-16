package level03.exercice01.aplication;

import level03.exercice01.model.Cinema;
import level03.exercice01.utils.ConsoleUtils;

/**
 * PROGRAM: MainProcess
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class MainProcess {

    private static Cinema cinema = new Cinema();

    public void run() {

        cinema.start();
        ConsoleUtils.closeScanner();

    }
}