package level03.exercice01.model;

import level03.exercice01.aplication.CinemaManager;
import level03.exercice01.aplication.SeatManager;
import level03.exercice01.utils.ConsoleUtils;
import level03.exercice01.enums.MnuOptMain;
import level03.exercice01.exceptions.SeatListIsEmptyException;

/**
 * PROGRAM: Cinema
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class Cinema {

    private int rows;
    private int seatsRow;
    private SeatManager seatManager;
    private CinemaManager cinemaManager;

    public Cinema() {

        seatManager = new SeatManager();
        cinemaManager = new CinemaManager(this);
        askInitialData();

    }

    private void setRows(int rows) {
        if (!(rows >= 10 && rows <= 50)) {
            throw new IllegalArgumentException("The rows has to be between 10 and 50.");
        } else
            this.rows = rows;
    }

    private void setSeatsRow(int seatsRow) {
        if (!(seatsRow >= 5 && seatsRow <= 40)) {
            throw new IllegalArgumentException("The rows has to be between 5 and 40.");
        } else
            this.seatsRow = seatsRow;
    }

    public int getRows() {
        return rows;
    }

    public int getSeatsRow() {
        return seatsRow;
    }

    public SeatManager getSeatManager() {
        return seatManager;
    }

    public void start() {

        MnuOptMain idMenu = null;

        do {
            try {
                idMenu = MnuOptMain.values()[cinemaManager.menu() - 1];
                switch (idMenu) {
                    case EXIT -> {
                        return;
                    }
                    case SEAT_LIST_RES -> seatListReserved();
                    case SEAT_LIST_PER -> seatListReservedByPerson();
                    case SEAT_RESERVE -> reserveSeat();
                    case SEAT_CANCEL -> cancelReserve();
                    case SEAT_CEL_PER -> cancelReservePerson();
                    default -> System.out.println("Error: The value is wrong.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: The value is wrong.");
            }
        } while (true);
    }

    private void askInitialData() {

        askRow();
        askSeatsRow();
    }

    private void askRow() {

        do {
            try {
                setRows(ConsoleUtils.readRequiredInt("Please enter the row number (10 to 50): "));
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    private void askSeatsRow() {

        do {
            try {
                setSeatsRow(ConsoleUtils.readRequiredInt("Please enter the seat number (5 to 40): "));
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    private void seatListReserved() {

        System.out.println("SEATS RESERVED: ....................");
       try {
           seatManager.isListSeatEmpty();
           System.out.println(cinemaManager.seatListReserved());
       } catch (SeatListIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    private void seatListReservedByPerson() {

        System.out.println("SEATS RESERVED BY PERSON: ....................");
        try {
            seatManager.isListSeatEmpty();
            String person = ConsoleUtils.readRequiredString("Please enter the person name: ");
            System.out.println(System.lineSeparator() + cinemaManager.seatListReservedByPerson(person));
        } catch (SeatListIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    private void reserveSeat() {

        System.out.println("RESERVE SEAT: ....................");
        cinemaManager.reserveSeat();
    }

    private void cancelReserve() {

        System.out.println("CANCEL RESERVE: ....................");
        try {
            seatManager.isListSeatEmpty();
            cinemaManager.cancelReserve();
        } catch (SeatListIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    private void cancelReservePerson() {

        System.out.println("CANCEL REVERVE BY PERSON: ....................");
        try {
            seatManager.isListSeatEmpty();
            System.out.println("Deleted reservations: " + cinemaManager.cancelReservePerson());
        } catch (SeatListIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}