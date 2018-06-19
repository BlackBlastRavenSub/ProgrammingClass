package ex11;

import java.util.ArrayList;

public class DecoratableList {

    public static void main(String[] args) {
        ArrayList<Decoratable> list = new ArrayList();

        list.add(new Star("Hello Tokyo"));
        list.add(new Box("Hello Japan"));
        list.add(new List("Hello Universe", 3));
        list.add(new FreeStyle("コードX-10"));
        for (Decoratable d : list) {
            d.decorate();
        }
    }
}