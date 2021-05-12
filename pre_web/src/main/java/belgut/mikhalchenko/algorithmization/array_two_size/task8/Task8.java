package belgut.mikhalchenko.algorithmization.array_two_size.task8;

import java.util.InputMismatchException;
import java.util.Scanner;

/*. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        try {
            System.out.println("Input number of colon one from 0 to 10");
            int k = input.nextInt();
            System.out.println("Input number of colon two from 0 to 10");
            int p = input.nextInt();
            printArray(swapColumns(createArray(), k, p));
        }catch(InputMismatchException e){
            System.out.println("Incorrect input. Input number again");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Input number from 0 to 9.");
        }
        System.out.println();
    }

   private static int[][] createArray() {
        int n = 10;
        int m = 10;
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (10 - 1) + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    /* index
      1(00) 2(01) 3(02)
      4(10) 5(11) 6(12)
      7(20) 8(21) 9(22)

      if k =0 & p = 2

       3(0k) 2(0p) 1(02)
       6(1k) 5(1p) 4(12)
       9(2k) 8(2p) 7(22)

        */
   private static int[][] swapColumns(int[][] array, int k, int p) {
        System.out.println("Change array");
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i][k];
            array[i][k] = array[i][p];
            array[i][p] = tmp;
        }
        return array;
    }


    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

    }

}

