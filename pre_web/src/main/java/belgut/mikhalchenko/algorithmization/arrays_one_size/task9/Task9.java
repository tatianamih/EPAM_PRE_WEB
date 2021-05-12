package belgut.mikhalchenko.algorithmization.arrays_one_size.task9;

import java.util.Scanner;

/*В массиве целых чисел с количеством элементов n найти наиболее
 часто встречающееся число. Если таких чисел несколько, то
 определить наименьшее из них. {1,2,1,2,3,4,5}*/
public class Task9 {
    static int[] createArray(int n) {
        int[] array = new int[n];
        int b = 0;
        int c = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (b + (Math.random() * c));

        }
        return array;
    }

    static void printArray(int[] array) {
        for (int ar : array) {
            System.out.print(ar + " ");
        }
    }

    static void changeArray(int[] array) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == array[i + 1]) {
                int x = array[i];
                array[i] = x;
                count++;

            }
            if (count > 1) {
                int[] arrayBuffer = new int[count];
                for (int j = 0; i <= arrayBuffer.length; j++)
                    arrayBuffer[j] = array[i];
            }
           // if ( arrayBuffer[j])
        }
    }



    public static void main(String[] args) {
        System.out.println("Insert int");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = createArray(n);
        printArray(array);
        System.out.println();
        changeArray(array);
        System.out.println();
        printArray(array);

    }
}
