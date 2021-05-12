package belgut.mikhalchenko.algorithmization.arrays_one_size.task10;

import java.util.Scanner;

public class Task10 {
    /*
  Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

{1,2,3,4,5,6}  => ({1,3,5}=>)     ( {1,3,5,0,0,0} )         {1,0,3,0,5,0}
{1,2,0,4,5,6} => {1,0,0,0,5,0}=> 1,5,
   */
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

        for (int i = 1; i <= array.length / 2; i++) {
            for (int j = i; j < array.length - 1; j++) {
                array[j] = array[j + 1];
                array[j + 1] = 0;
            }
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

