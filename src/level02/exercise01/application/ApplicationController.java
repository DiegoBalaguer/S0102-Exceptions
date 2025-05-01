package level02.exercise01.application;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class ApplicationController {

    private final Questions questions;

    public ApplicationController() {
        this.questions = new Questions();
    }

    public void run() {
        askAllQuestions();
        closeResources();
    }

    private void askAllQuestions() {
        questions.fingersHandByteQuestion();
        questions.floorsHotelQuestion();
        questions.computersPriceQuestion();
        questions.stockPapersQuestion();
        questions.insertVocalQuestion();
        questions.insertPasswrdQuestion();
        questions.destroyWorld();
    }

    private void closeResources() {
        questions.ScannerClose();
    }
}