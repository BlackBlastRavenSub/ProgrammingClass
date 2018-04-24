package ex3;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getR() {
        return Math.sqrt(x * x + y * y);
    }

    public double getTheta() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public double distance(MyPoint anotherPoint) {
        int x1 = anotherPoint.x - x;
        int y1 = anotherPoint.y - y;
        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    public String toString() {
        return "a MyPoint(" + getX() + ", " + getY() + ")";
    }

}