package level03.exercise01.aplication;

import level03.exercise01.model.Person;
import level03.exercise01.model.Seat;
import level03.exercise01.utils.ConsoleUtils;
import level03.exercise01.enums.MenuOptionsMain;
import level03.exercise01.exceptions.*;
import level03.exercise01.model.Cinema;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * PROGRAM: CinemaWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class CinemaWorkerers {

    private Cinema cinema;

    public CinemaWorkerers(Cinema cinema) {
        setCinema(cinema);
    }

    private void setCinema(Cinema cinema) {
        if (cinema == null) {
            throw new IllegalArgumentException("An empty or null can not be assigned to cinema.");
        } else
            this.cinema = cinema;
    }

    public int menu() {
        MenuOptionsMain.viewMenu();
        return ConsoleUtils.readRequiredInt("");

    }

    public String seatListReserved() {
        StringBuilder message = new StringBuilder();
        ArrayList<Seat> copySeatList = copySeatListOrderByRowAndSeat(cinema.getSeatManager().getSeats());

        for (Seat seat : copySeatList) {
            message.append(seat).append(System.lineSeparator());
        }
        return message.toString();
    }

    public String seatListReservedByPerson(String personReverved) {
        StringBuilder message = new StringBuilder();
        ArrayList<Seat> copySeatList = copySeatListOrderByRowAndSeat(cinema.getSeatManager().getSeats());

        for (Seat seat : copySeatList) {
            if (seat.getPerson().getName().equalsIgnoreCase(personReverved)) {
                message.append(seat).append(System.lineSeparator());
            }
        }
        return message.toString();
    }

    private ArrayList<Seat> copySeatListOrderByRowAndSeat(ArrayList<Seat> seatList) {
        ArrayList<Seat> copySeatList = new ArrayList<>(seatList);

        copySeatList.sort(Comparator
                .comparingInt(Seat::getRow)
                .thenComparingInt(Seat::getSeatRow));

        return copySeatList;
    }

    public void reserveSeat() {
        do {
            try {
                Seat seatReserve = enterSeat();
                String nomPerson = enterPersonName();
                cinema.getSeatManager().addSeat(new Seat(seatReserve.getRow(), seatReserve.getSeatRow(), new Person(nomPerson)));
                return;
            } catch (OccupiedSeatException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public void cancelReserve() {
        do {
            try {
                cinema.getSeatManager().deleteSeat(enterSeat());
                return;
            } catch (FreeSeatException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public int cancelReservePerson() {
        String nomPerson = enterPersonName();
        int count = 0;

        Iterator<Seat> iteratorSeats = cinema.getSeatManager().getSeats().iterator();

        while (iteratorSeats.hasNext()) {
            Seat seat = iteratorSeats.next();
            if (seat.getPerson().getName().equalsIgnoreCase(nomPerson)) {
                iteratorSeats.remove();
                count++;
            }
        }
        return count;
    }

    private Seat enterSeat() {
        int row = enterRow();
        int numSeat = enterSeatRow();
        return new Seat(row, numSeat, new Person("nothing"));
    }

    private String enterPersonName() {
        do {
            String namePerson = ConsoleUtils.readRequiredString("Enter name Person: ");
            try {
                FiltersCinema.namePersonFilter(namePerson);
                return namePerson;
            } catch (InvalidPersonNameException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    private int enterRow() {
        do {
            int row = ConsoleUtils.readRequiredInt("Enter Row (1 to " + cinema.getRows() + "): ");

            try {
                FiltersCinema.rowFilter(row, cinema.getRows());
                return row;
            } catch (InvalidRowException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    private int enterSeatRow() {
        do {
            int seatRow = ConsoleUtils.readRequiredInt("Enter Seat (1 to " + cinema.getSeatsRow() + "): ");
            try {
                FiltersCinema.seatFilter(seatRow, cinema.getSeatsRow());
                return seatRow;
            } catch (InvalidSeatException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }
}


