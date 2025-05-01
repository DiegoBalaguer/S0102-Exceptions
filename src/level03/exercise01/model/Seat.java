package level03.exercise01.model;

/**
 * PROGRAM: Seat
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class Seat {

    private int row;
    private int seatRow;
    private Person person;

    public Seat(int row, int seatRow, Person person) {
        this.row = row;
        this.seatRow = seatRow;
        this.person = person;
    }

    public boolean equals(Seat seat) {
        return ((this.row == seat.row) && (this.seatRow == seat.seatRow));
    }

    public int getRow() {
        return row;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Row: " + row +
                ", Seat: " + seatRow +
                ", viewer: " + person.getName() + ".";
    }
}
