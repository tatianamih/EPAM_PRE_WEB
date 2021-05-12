package belgut.mikhalchenko.basics_of_software_code_development_master.linear.task2;

public class Task2 {

    private static double task(int a, int b, int c) {

        double z = Math.sqrt(b * b + 4 * a * c);
        double result;
        result = (b + z) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        return result;
    }
    public static void main(String[] args) {

        System.out.println(task(1, 8, 3));
    }
}
