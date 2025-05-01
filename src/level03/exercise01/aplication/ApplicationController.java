package level03.exercise01.aplication;

import level03.exercise01.model.Cinema;
import level03.exercise01.utils.ConsoleUtils;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class ApplicationController {

    private static Cinema cinema = new Cinema();

    public void run() {

        cinema.start();
        ConsoleUtils.closeScanner();

    }
}