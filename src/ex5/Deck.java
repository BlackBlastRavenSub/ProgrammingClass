package ex5;


import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck;

    Deck() {
        deck = new ArrayList<Card>();
        Random R = new Random();
        for (int i = 0; i < 52; i++) {
            deck.add(new Card(R.nextInt(4), R.nextInt(13) + 1));
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.show();
    }

    public void show() {
        for (Card D : deck) {
            System.out.println(D);

        }
    }
}
