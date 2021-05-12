package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task7;

/*7. Для каждого натурального числа в промежутке от m до n вывести все делители,
 кроме единицы и самого числа.m и n вводятся с клавиатуры. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task7 {

    public static void getTheDivisor() throws IOException {
        int m;
        int n;
        boolean print;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input numbers m и n ");
        m = Integer.parseInt(reader.readLine());
        n = Integer.parseInt(reader.readLine());

        for (int i = m; i <= n; i++) {
            print = true;
            System.out.print(i + " - ");

            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    print = false;
                    System.out.print(j + " ");
                }
            }
            System.out.println(print ? "simple number" : " ");
        }
    }

    public static void main(String[] args) throws IOException {
        getTheDivisor();
    }
}