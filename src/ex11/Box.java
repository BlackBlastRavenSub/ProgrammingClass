package ex11;

public class Box implements Decoratable {
    private String str;

    Box(String str) {
        this.str = str;
    }

    public void decorate() {
        if (str != null) {
            printLine(str);
            System.out.println("|" + str + "|");
            printLine(str);
        } else {
            System.out.println("最低でも1文字入力してください");
        }
    }

    private void printLine(String input) {
        char[] check = input.toCharArray();
        String bar = "";
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(check[i]).getBytes().length < 2) {
                bar += "-";
            } else {
                bar += "ー";
            }
        }
        System.out.println("+" + bar + "+");
    }
}