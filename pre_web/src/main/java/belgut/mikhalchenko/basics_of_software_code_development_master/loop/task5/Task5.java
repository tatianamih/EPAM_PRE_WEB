package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task5;

/*5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
модуль которых больше или равен заданному е. Общий член ряда имеет вид:
                       a(n) = 1/2^n + 1/3^n*/

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Task5 {
    private static void sum(int n, double e) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double x = abs(1 / (pow(2, i)) + 1 / (pow(3, i)));
            if (x >= e) {
                sum += x;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(10, 0.25);
    }


}
