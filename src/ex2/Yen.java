package ex2;

import java.awt.*;

public class Yen {
    private int x;
    private int y;

    public Yen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);
        //g.drawOval(x, y, 10, 10);
        g.drawString("円", x, y);
    }
}

