package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.*/
public class Task1 {
    public static void main(String[] args) throws IOException {
        task();
    }
    private static void task() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int digit;
        System.out.println("Введите целое положительное число");

        digit = Integer.parseInt(reader.readLine());

        for (int i = 0; i < digit; i++) {
            sum += i;
        }

        System.out.println(sum);
    }


}
