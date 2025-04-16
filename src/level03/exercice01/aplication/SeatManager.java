package level03.exercice01.aplication;

import level03.exercice01.exceptions.FreeSeatException;
import level03.exercice01.exceptions.OccupiedSeatException;
import level03.exercice01.exceptions.SeatListIsEmptyException;
import level03.exercice01.model.Seat;

import java.util.ArrayList;

/**
 * PROGRAM: SeatManager
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */


public class SeatManager {

    private ArrayList<Seat> seats;

    public SeatManager() {
        seats = new ArrayList<>();
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void isListSeatEmpty() throws SeatListIsEmptyException {

        if (seats.isEmpty()) {
            throw new SeatListIsEmptyException();
        }
    }

    public void addSeat(Seat seat) throws OccupiedSeatException {

        if (searchSeat(seat) != -1) {
            throw new OccupiedSeatException();
        } else
            seats.add(seat);
    }

    public void deleteSeat(Seat seat) throws FreeSeatException {

        int idSeat = searchSeat(seat);
        if (idSeat == -1) {
            throw new FreeSeatException();
        } else seats.remove(idSeat);
    }

    public int searchSeat(Seat seatSearch) {

        for (Seat seat : seats) {
            if (seat.equals(seatSearch)) {
                return seats.indexOf(seat);
            }
        }
        return -1;
    }
}
