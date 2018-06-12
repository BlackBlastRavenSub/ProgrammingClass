package ex10;

public class Access {
    public static void main(String[] args) {
        One example1 = new One();
        Two example2 = new Two();
        Three example3 = new Three();
        Four example4 = new Four();

        System.out.println("1." + example1.test());//1
        System.out.println("2." + example1.result1());//2
        System.out.println("3." + example2.test());//3
        System.out.println("4." + example2.result1());//4
        System.out.println("5." + example3.test());//5
        System.out.println("6." + example4.result1());//6
        System.out.println("7." + example3.result2());//7
        System.out.println("8." + example4.result2());//8
        System.out.println("9." + example3.result3());//9
        System.out.println("10." + example4.result3());//10
    }
}