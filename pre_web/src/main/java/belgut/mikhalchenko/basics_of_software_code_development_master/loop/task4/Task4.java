package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task4;

/*4. Составить программу нахождения произведения квадратов первых двухсот чисел*/
public class Task4 {
    private static void sumFirstTwoHundredNumber() {

        int sum = 0;
        for (int i = 1; i <= 200; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumFirstTwoHundredNumber();
    }
}
