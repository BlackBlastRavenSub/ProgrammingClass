package ex11;

public class FreeStyle implements Decoratable {
    private String str;
    private String mirror = "";

    FreeStyle(String str) {
        this.str = str;
    }

    public void decorate() {
        for (int i = 0; i < str.length(); i++) {
            mirror += str.charAt(str.length() - (i + 1));

        }
        System.out.println(mirror);
    }
}