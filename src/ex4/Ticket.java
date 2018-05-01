package ex4;

public class Ticket {
    static private int count = 0;
    private int number;

    Ticket() {
        count++;
        number = count;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "Ticket(" + getNumber() + ")";
    }
}