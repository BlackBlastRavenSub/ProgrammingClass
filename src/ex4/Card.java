package ex4;

import java.util.logging.Logger;

//スペード,クラブ＝黒 ダイヤ,ハート＝赤
public class Card {

    private int mark;
    private int number;

    public static final int SPADE = 0;
    public static final int HEART = 1;
    public static final int CLUB = 2;
    public static final int DIAMOND = 3;

    public static final int BLACK = 0;
    public static final int RED = 1;

    public Card(int m, int num) {
        this.mark = m;
        this.number = num;
        if (mark >= 0 && mark <= 3 || number == 0 || number == 1) {
        } else {
            System.out.println("カードの入力情報に問題があります");
            System.exit(1);
        }

    }

    public int getMark() {
        return 0;
    }

    public int getNumber() {
        return 0;
    }

    //ここから
    public int getColor() {
        return Color();
    }

    public String toString() {
        return sendString();
    }
    //ここまで

    public static void main(String[] args) {
        Card card1, card2, card3;
        card1 = new Card(Card.SPADE, 1);
        card2 = new Card(Card.DIAMOND, 2);
        card3 = new Card(Card.SPADE, 13);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        System.out.println("カード1と" + "カード2のマークは同じか？" + card1.isEqualMark(card2));
        System.out.println("カード1と" + "カード2の数字はカード1の方が大きいか？" + card1.isLargerThan(card2));
    }

    //ここから
    int Color() {
        switch (mark) {
            case 0:
            case 2:
                return BLACK;

            case 1:
            case 3:
                return RED;
            default:
                System.out.println("Color処理で問題発生!");
                System.exit(1);
                return 0;
        }
    }

    String sendString() {
        String r;
        r = "a Card(" + setMark() + "," + setNumber() + ")";
        return r;
    }

    String setMark() {
        switch (mark) {
            case 0:
                return "SPADE";
            case 1:
                return "HEART";
            case 2:
                return "CLUB";
            case 3:
                return "DIAMOND";

            default:
                System.out.println("setMark処理で問題発生!");
                System.exit(1);
                return "ERROR";
        }
    }

    String setNumber() {
        if (number == 1 || number >= 11) {
            switch (number) {
                case 1:
                    return "A";
                case 11:
                    return "J";
                case 12:
                    return "Q";
                case 13:
                    return "K";
                default:
                    System.out.println("setNumber処理で問題発生!");
                    System.exit(1);
                    return "ERROR";
            }
        } else {
            return String.valueOf(number);
        }
    }

    boolean isEqualMark(Card AnotherCard) {
        if (this.mark == AnotherCard.mark) {
            return true;
        } else {
            return false;
        }
    }

    boolean isLargerThan(Card AnotherCard) {
        if (this.number == 1 && AnotherCard.number == 13) {
            return true;
        } else {
            if (this.number > AnotherCard.number) {
                return true;
            } else {
                return false;
            }
        }
    }
    //ここまで

}
