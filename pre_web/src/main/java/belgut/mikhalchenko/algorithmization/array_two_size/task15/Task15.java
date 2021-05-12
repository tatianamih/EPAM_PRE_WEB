package belgut.mikhalchenko.algorithmization.array_two_size.task15;

import java.util.InputMismatchException;
import java.util.Scanner;

/*15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/
public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Input number of string");
            int n = input.nextInt();
            System.out.println("Input number of colon");
            int m = input.nextInt();
            if (n < 2 || m < 2) {
                System.out.println("Input number from 2");
            } else {
                int[][] array = new int[n][m];
                int[][] randomArray = createArray(array);
                int max = findMaxElement(randomArray);
                int[][] updateArray = replaceElementsInArray(randomArray, max);
                printArray(updateArray);
            }

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Input number");
        } catch (NegativeArraySizeException e) {
            System.out.println("Input number from 2");
        }
    }

    private static int[][] createArray(int[][] array) {
        System.out.println("\nrandom array\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (10 - 1) + 1);
                System.out.print(array[i][j] + "\t ");
            }
            System.out.println();
        }
        return array;
    }

    private static int findMaxElement(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("\nmax element : " + max);
        return max;
    }

    private static int[][] replaceElementsInArray(int[][] array, int max) {
        System.out.println();
        System.out.println("Replace odd numbers with the maximum element\n");
        System.out.println("new array\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }
        return array;
    }

    private static void printArray(int[][] array) {
        for (int[] ar : array) {
            for (int a : ar) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }
}
