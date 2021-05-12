package belgut.mikhalchenko.algorithmization.array_two_size.task9;

import java.util.InputMismatchException;
import java.util.Scanner;

/*9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
*/
public class Task9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input number of string");
            int m = input.nextInt();
            System.out.println("Input number of colon");
            int n = input.nextInt();
            int[][] array = new int[n][m];
            array = createArray(array);
            int[] sumArray = countSum(array);
            findMax(sumArray);
        }catch(InputMismatchException e){
            System.out.println("Incorrect input. Input number again");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Input number from 0 to 9.");
        }

    }

    private static int[][] createArray(int[][]array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (10 - 1) + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

        private static int[] countSum(int[][] array) {
        System.out.println("sum");
        int[] sum = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
        for (int i = 0; i < array.length; i++) {

                sum[j] += array[i][j];

            }System.out.print(sum[j] + " ");

        }
        System.out.println();
        return sum;
    }
    private static void findMax(int[]array){
        System.out.println("max");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]> max){
                max = array[i];
            }

        }System.out.println(max);
    }

}




