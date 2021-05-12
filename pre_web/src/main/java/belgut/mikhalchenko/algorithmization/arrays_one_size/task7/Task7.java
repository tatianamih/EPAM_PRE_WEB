package belgut.mikhalchenko.algorithmization.arrays_one_size.task7;

import java.util.Scanner;
/*Даны действительные числа  a1 a2  .. an  Найти
max( a1 + a2n , a2 + a2n−1 , ... , an + an+1)
*/
public class Task7 {



    static void findMaxOfNewArray(int[] array, int n) {

        int m;
        if (n % 2 == 0) {
            m = n / 2;
        } else {
            m = n / 2 + 1;
        }
        int[] array1 = new int[m];
        for (int i = 0; i < m; i++) {
            array1[i] = array[i] + array[n - 1 - i];
            System.out.print(array1[i] + " ");
        }
        int ar1Max = Integer.MIN_VALUE;
        for (int ar : array1) {
            if (ar > ar1Max) {
                ar1Max = ar;
            }
        }
        System.out.println();
        System.out.println(ar1Max);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size :");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Input number in array");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        findMaxOfNewArray(array, n);
    }
}
