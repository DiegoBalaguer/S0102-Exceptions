package level03.exercise01.model;

import level03.exercise01.aplication.CinemaWorkerers;
import level03.exercise01.aplication.SeatWorkers;
import level03.exercise01.utils.ConsoleUtils;
import level03.exercise01.enums.MenuOptionsMain;
import level03.exercise01.exceptions.SeatListIsEmptyException;

/**
 * PROGRAM: Cinema
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class Cinema {

    private int rows;
    private int seatsRow;
    private SeatWorkers seatWorkers;
    private CinemaWorkerers cinemaWorkerers;

    public Cinema() {

        seatWorkers = new SeatWorkers();
        cinemaWorkerers = new CinemaWorkerers(this);
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

    public SeatWorkers getSeatManager() {
        return seatWorkers;
    }

    public void start() {

        do {
            try {
                MenuOptionsMain idMenu = MenuOptionsMain.values()[cinemaWorkerers.menu() - 1];
                switch (idMenu) {
                    case EXIT -> {
                        return;
                    }
                    case SEAT_LIST_RES -> seatListReserved();
                    case SEAT_LIST_PER -> seatListReservedByPerson();
                    case SEAT_RESERVE -> reserveSeat();
                    case SEAT_CANCEL -> cancelReserve();
                    case SEAT_CEL_PER -> cancelReservePerson();
                    default -> System.err.println("Error: The value is wrong.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: The value is wrong.");
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
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    private void askSeatsRow() {

        do {
            try {
                setSeatsRow(ConsoleUtils.readRequiredInt("Please enter the seat number (5 to 40): "));
                return;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    private void seatListReserved() {

        System.out.println("SEATS RESERVED: ....................");
       try {
           seatWorkers.isListSeatEmpty();
           System.out.println(cinemaWorkerers.seatListReserved());
       } catch (SeatListIsEmptyException e) {
            System.err.println(e.getMessage());
        }
    }

    private void seatListReservedByPerson() {

        System.out.println("SEATS RESERVED BY PERSON: ....................");
        try {
            seatWorkers.isListSeatEmpty();
            String person = ConsoleUtils.readRequiredString("Please enter the person name: ");
            System.out.println(System.lineSeparator() + cinemaWorkerers.seatListReservedByPerson(person));
        } catch (SeatListIsEmptyException e) {
            System.err.println(e.getMessage());
        }
    }

    private void reserveSeat() {

        System.out.println("RESERVE SEAT: ....................");
        cinemaWorkerers.reserveSeat();
    }

    private void cancelReserve() {

        System.out.println("CANCEL RESERVE: ....................");
        try {
            seatWorkers.isListSeatEmpty();
            cinemaWorkerers.cancelReserve();
        } catch (SeatListIsEmptyException e) {
            System.err.println(e.getMessage());
        }
    }

    private void cancelReservePerson() {

        System.out.println("CANCEL RESERVE BY PERSON: ....................");
        try {
            seatWorkers.isListSeatEmpty();
            System.out.println("Deleted reservations: " + cinemaWorkerers.cancelReservePerson());
        } catch (SeatListIsEmptyException e) {
            System.err.println(e.getMessage());
        }
    }
}