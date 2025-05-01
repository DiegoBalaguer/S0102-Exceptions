package level03.exercise01.enums;

/**
 * PROGRAM: MenuOptionsMain
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public enum MenuOptionsMain {

    SEAT_LIST_RES("Show all reserved seats"),
    SEAT_LIST_PER("Show seats reserved by a person"),
    SEAT_RESERVE("Reserve a seat"),
    SEAT_CANCEL("Cancel a seat reservation"),
    SEAT_CEL_PER("Cancel all reservations for a person"),
    EXIT("Exit");

    private final String description;

    MenuOptionsMain(String d) {
        this.description = d;
    }

    public String getDescription() {
        return description;
    }

    public static void viewMenu() {
        System.out.println(System.lineSeparator() + "CINEMA" + System.lineSeparator());
        for (MenuOptionsMain o : MenuOptionsMain.values()) {
            System.out.println(o.ordinal() + 1 + ". " + o.getDescription());
        }
        System.out.println(System.lineSeparator() + "Choose an option: ");
    }
}