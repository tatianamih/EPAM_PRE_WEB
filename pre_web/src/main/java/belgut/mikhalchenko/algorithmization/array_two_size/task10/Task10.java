package belgut.mikhalchenko.algorithmization.array_two_size.task10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*10. Найти положительные элементы главной диагонали квадратной матрицы.
4 8 1 5 6
4 2 8 1 8
4 8 1 5 -1
4 2 8 1 0
*/
public class Task10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input number of strings and colons more 2");

            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println("Input odd number");

            } else if (n < 2) {
                System.out.println("Input  a number greater than 2");
            } else {

                int[][] array = new int[n][n];
                array = createArray(array);
                //int[][] array1 = {{-5, -7, -1}, {2, 0, 4}, {-7, 4, -8}};
                int[] elementsOfMainDiagonal = getElementsMainDiagonal(array);

                findPositive(elementsOfMainDiagonal);
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Input number again");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input number from 0 to 9.");
        }
    }


    private static int[][] createArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (10 - (-10)) - 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    private static int[] getElementsMainDiagonal(int[][] array) {
        System.out.println("main diagonal");
        int[] elements = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    elements[i] = array[i][j];
                    System.out.print(elements[i] + " ");

                }

            }

        }
        System.out.println();
        return elements;
    }


    private static int findPositive(int[] array) {
        int positive = 0;
        System.out.print("positive numbers");
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {

                positive = array[i];
                counter++;
                System.out.print("\t" + positive + " ");
            }

        }
        if (counter == 0) {
            System.out.print(" missing ");
        }

        return positive;
    }

}


