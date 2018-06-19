package ex11;

public class DecoratableSample {
    public static void main(String[] args) {
        Decoratable star, box, exbox, list;
        star = new Star("Hello Tokyo");
        box = new Box("Hello Japan");
        exbox = new Box("コードGammaを実行中");
        list = new List("Hello Universe", 3);
        star.decorate();
        box.decorate();
        exbox.decorate();
        list.decorate();
    }
}
