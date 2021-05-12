package belgut.mikhalchenko.programming_with_classes.task1;

public class App {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.setA(5);
        test.setB(8);
        test.print();
        System.out.println(test.getMax());
        System.out.println(test.getSum());
    }

}
