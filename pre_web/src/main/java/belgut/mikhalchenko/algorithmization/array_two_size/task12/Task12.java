package belgut.mikhalchenko.algorithmization.array_two_size.task12;

import java.util.InputMismatchException;
import java.util.Scanner;

/*12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/
public class Task12 {
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
                int[][] arrayInAscendingOrder = sortTheArrayInAscendingOrder(randomArray);
                printArray1(arrayInAscendingOrder);
                int[][] arrayInDescendingOrder = sortTheArrayInDescendingOrder(randomArray);
                printArray1(arrayInDescendingOrder);
            }

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Input number");
        } catch (NegativeArraySizeException e) {
            System.out.println("Input number from 2");
        }
    }

    private static int[][] createArray(int[][] array) {
        System.out.println("\nrandom array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (10 - 1) + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    private static int[][] sortTheArrayInAscendingOrder(int[][] array) {
       /*  1(00)   1(01)   1(02)   0(03)
           2(10)   2(11)   2(12)   0(13) // 4 - 1

           {{0,2,1},{3,2,1}}*/
        System.out.println("\narray in ascending order");
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j + 1; k < array[i].length; k++) {

                    if (array[i][j] > array[i][k]) {
                        temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }
        return array;
    }

    private static int[][] sortTheArrayInDescendingOrder(int[][] array) {
       /*  1(00)   4(01)   1(02)   8(03)
           2(10)   2(11)   2(12)   0(13) // 4 - 1

           {{0,2,1},{3,2,1}}*/
        System.out.println("\narray in descending order");
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j + 1; k < array[i].length; k++) {

                    if (array[i][j] < array[i][k]) {
                        temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }
        return array;
    }

        private static void printArray1(int[][] array){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }






