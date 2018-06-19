package ex11;

public class Star implements Decoratable {
    private String str;

    Star(String str) {
        this.str = str;
    }

    public void decorate() {
        System.out.println("*" + str + "*");
    }
}
