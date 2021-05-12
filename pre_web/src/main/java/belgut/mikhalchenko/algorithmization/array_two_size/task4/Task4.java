package belgut.mikhalchenko.algorithmization.array_two_size.task4;

import java.util.Scanner;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     1    2   3  ... n                       1(00)   2(01)   3(02)   4(03)
     n   n-1  n-2 ...1                       4(10)   3(11)   2(12)   1(13)
     1    2   3  ... n                       1(20)   2(21)   3(22)   4(23)
     n   n-1  n-2 ...1                       4(30)   3(31)   2(32)   1(33)
     :    :    :     :                       {{1,2,3,4,},{4,3,2,1},{1,2,3,4},{4,3,2,1}}
     n   n-1  n-2 ...1
  */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of stings and number of colons ");
        int n = scanner.nextInt();
        createArray(n);
    }

    private static void createArray(int n) {
        int[][] array = new int[n][n];
        if (n % 2 != 0) {
            System.out.println("Введите четное число");
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i % 2 == 0) {
                        array[i][j] = j + 1;

                    } else {
                        array[i][j] = n - j;
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}


