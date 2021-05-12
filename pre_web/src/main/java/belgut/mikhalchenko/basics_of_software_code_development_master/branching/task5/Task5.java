package belgut.mikhalchenko.basics_of_software_code_development_master.branching.task5;

import static java.lang.Math.pow;

public class Task5 {

    private static void task(double x) {
        double result;
        if (x <= 3) {
            result = pow(x, 2) - 3 * x + 9;
            System.out.println(result);
        } else {
          result = 1 / (pow(x, 3) + 6);
            System.out.println(result);
        }
    }
    public static void main(String[] args) {

        task(1.8);
    }
}
