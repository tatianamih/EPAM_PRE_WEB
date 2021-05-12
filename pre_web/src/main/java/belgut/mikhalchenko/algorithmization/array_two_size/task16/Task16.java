package belgut.mikhalchenko.algorithmization.array_two_size.task16;

import java.util.InputMismatchException;
import java.util.Scanner;

/*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
...,n^2

так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:
6(00) 1(01) 8(02)
7(10) 5(11) 3(12)
2(20) 9(21) 4(22)

1(00) 2(01) 3(02) 4(03) //10
4(10) 1(11) 1(12)
2(20) 9(21) 4(22)
 */
public class Task16 {
    public static void main(String[] args) {

        System.out.print("Give an odd number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 != 0) {
            printArray(createSquare(n));

        }else{
           printArray(evenMatrixSquare(n));
        }

    }
    private static  int[][]  createSquare(int n) {
        int[][] magicSquare = new int[n][n];
        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        return magicSquare;
    }
    public static int[][] standardMatrixFilling(int n){
        int[][] matrix = new int[n][n];
        int count = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        return  matrix;
    }
    public static  int[][] evenMatrixSquare(int n){
        int[][] matrix = standardMatrixFilling(n);
        // Перестановка элементов главной диагонали
        int count = 0;
        for (int i = 0; i < matrix.length/2; i++) {
            int transition;
            if(i<matrix.length/2) {
                transition = matrix[i][i];
                matrix[i][i] = matrix[matrix.length-1-count][matrix.length-1-count];
                matrix[matrix.length-1-count][matrix.length-1-count] = transition;
                count++;
            }
        }
        // Перестановка элементов побочной диагонали
        count = 0;
        for (int i = 0; i <matrix.length/2 ; i++) {
            int transition;
            if(i<matrix.length/2){
                transition = matrix[matrix.length - 1 -count][i];
                matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length-1-count];
                matrix[i][matrix.length-1-count] = transition;
                count++;
            }
        }

        return matrix;
    }

        private static void printArray(int[][] magicSquare) {
            for (int[] ar : magicSquare) {
                for (int a : ar) {
                    System.out.print(a + "\t");
                }
                System.out.println();
            }
        }
}