package belgut.mikhalchenko.basics_of_software_code_development_master.linear.task3;

public class Task3 {
    /* Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/

        private static double task(double a, double b) {

            double result;

            result = ((Math.sin(a) + Math.cos(b)) / ((Math.cos(a) - Math.sin(b)))) * Math.tan(a * b);

            return result;
        }

    public static void main(String[] args) {

        System.out.println(task(3, 5));
    }
}
