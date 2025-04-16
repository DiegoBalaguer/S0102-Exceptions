package level03.exercice01.model;

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
        setRow(row);
        setSeatRow(seatRow);
        setPerson(person);
    }

    private void setRow(int row) {
        if (!(row > 0 && row <= 50)) {
            throw new IllegalArgumentException("The row has to be between 1 and 50.");
        } else
            this.row = row;
    }

    private void setSeatRow(int seatRow) {
        if (!(seatRow > 0 && seatRow <= 30)) {
            throw new IllegalArgumentException("The numSeat has to be between 1 and 30.");
        } else
            this.seatRow = seatRow;
    }

    private void setPerson(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("The person cannot be a null object.");
        } else
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
