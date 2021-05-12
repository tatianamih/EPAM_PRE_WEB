package belgut.mikhalchenko.programming_with_classes.task2;

public class App {

    public static void main(String[] args) {
        Test2 test1 = new Test2();
        Test2 test2 = new Test2(10, 9);

        System.out.println("a = " + test2.getA() + ", b = " + test2.getB());

        test1.setA(2);
        test1.setB(3);

        System.out.println("a = " + test1.getA() + ", b = " + test1.getB());

        test1.setA(8);
        test1.setB(10);

        System.out.println("a = " + test1.getA() + ", b = " + test1.getB());

    }
}
