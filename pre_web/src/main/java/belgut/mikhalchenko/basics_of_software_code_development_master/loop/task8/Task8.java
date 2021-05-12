package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task8;

import java.util.ArrayList;

/*8. Даны два числа. Определить цифры, входящие
 в запись как первого так и второго числа. */
public class Task8 {
    public static void main(String[] args) {
        equalNumber(123, 355);
    }

    private static void equalNumber(int a, int b) {
        int[] array = new int[10];
        while (a != 0) {
            array[a % 10]++;
            a /= 10;
        }

        while (b != 0) {
            if (array[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /= 10;
        }
    }
}
