package belgut.mikhalchenko.algorithmization.array_two_size.task3;

import java.util.Scanner;

/* Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of  stings from 0 to 9");
        int k = scanner.nextInt();
        System.out.println("Enter number of colons from 0 to 9");
        int p = scanner.nextInt();
        int[][] array = createArray();

        printArray(array, k, p);
        System.out.println();

    }

    private static int[][] createArray() {

        int n = 10;
        int m = 10;
        int array[][] = new int[n][m];

        array = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };
        for (int i = 0; i < array.length; i++) {//
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        return array;

    }

    private static void printArray(int[][] array, int k, int p) {
        for (int i = 0; i < array.length; i++) {//
            for (int j = 0; j < array[i].length; j++) {
                if (i == k && j == p) {

                    System.out.print(array[i][j]);
                }
            }

        }
    }
}

