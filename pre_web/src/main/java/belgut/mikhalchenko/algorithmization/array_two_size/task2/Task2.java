package belgut.mikhalchenko.algorithmization.array_two_size.task2;

import java.util.Scanner;

public class Task2 {
    /*
   2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
    */ // n = 3, 5......
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of colons and stings");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
     array =  createArray(array, n);
        printTask(array);
        System.out.println();
       printTask2(array);
    }

    /* index
    00 01 02
    10 11 12
    20 21 22
     */
    static int[][] createArray(int[][] array, int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * (6 - 1) + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    static void printTask(int[][] array) {
        System.out.println("Главная диагональ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
    static void printTask2(int[][] array) {
        System.out.println("Побочная диагональ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length - 1 == i + j ) {
                    System.out.print(array[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}


