package level02.exercice01.aplication;

/**
 * PROGRAM: MainProcess
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class MainProcess {

    private final Questions questions;

    public MainProcess() {
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