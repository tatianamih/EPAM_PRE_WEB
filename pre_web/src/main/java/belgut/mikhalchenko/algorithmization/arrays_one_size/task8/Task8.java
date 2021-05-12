package belgut.mikhalchenko.algorithmization.arrays_one_size.task8;

import java.util.Scanner;

public class Task8 {


   /*
    Дана последовательность целых чисел  a1, a2, ... , an
 Образовать новую последовательность, выбросив из исходной те члены, которые равны
min( a1, a2, ... , an)
*/
   public static void main (String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter array size");
       int n = scanner.nextInt();
       int[] array = new int[n];
       System.out.println("Enter min (enter), and then Max value of array");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       creatArray(a, b, array);
       createNewArray(array, findMinInArray(array)); 
   }
        static int[] creatArray(int a, int b, int[] array){
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * (b - a) + a);
                //           array[i] = a + (int) (Math.random() * b);
                System.out.print("[" + i + "]" + array[i] + " ");
            }
            return array;
        }

        static int findMinInArray ( int[] array){
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("\n min = " + min);
            return min;
        }

        static void createNewArray ( int[] array, int min){
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == min) {
                    for (int j = i; j < array.length - (count + 1); j++) {
                        array[j] = array[j + 1];
                    }
                    count++;
                    i--;
                }
            }
            for (int i = 0; i < array.length - count; i++)
                System.out.print("[" + i + "]" + array[i] + " ");
        }
}
