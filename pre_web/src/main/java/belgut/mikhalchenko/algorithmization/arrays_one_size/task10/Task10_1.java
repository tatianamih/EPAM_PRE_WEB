package belgut.mikhalchenko.algorithmization.arrays_one_size.task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task10_1 {
      /*
    Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

{1,2,3,4,5,6}  => ({1,3,5}=>)     ( {1,3,5,0,0,0} )         {1,0,3,0,5,0}
{1,2,0,4,5,6} => {1,0,0,0,5,0}=> 1,5,
     */

    static void changeArray() {
        int n = 7;
        int[] array = new int[]{1, 2, 3, 4, 5, 6,7};
        printArray(array);

//        for (int i = 0; i < array.length; i++) {
////            System.out.print(array[i] + " ");
//
//            if (i % 2 != 0) {
//                array[i] = 0;
//            }
//
//            System.out.print(array[i] + " ");
////for (int j = 0; int )
//            System.out.println();
//            if (array[i] != 0){
//                System.out.print(array[i] + " ");
//            }
//        }
////        if (array[i] != 0){
////            System.out.println(array[i]);
//
////        if (i % 2 != 0){

////            System.out.println(array[i]);
    }
    static void printArray(int []array){
        for (int ar : array) {
            System.out.print(ar + " ");
        }
    }
    //      No       i = 0 - NO   Starting from [1]
    // 1,2,3,4,5,6 i=1 =>  j=1; [1]= [2]=> 2 ==3; [2] = 0 => 1,3,0,4,5,6 ; 1,3,4,5,0,6; 1,3,4,5,6,0
    //              i=2 => j=2; [2]= [3]=> 0==4; [3] = 0 => 1,3,0        ; 1,3,5,0,6,0;      135000
    static void creatNewArray (int [] array){
        for ( int i = 1; i <= array.length/2; i ++){
            for ( int j = i; j < array.length - 1; j ++){
                array[j] = array[j + 1];
                array[j +1] = 0;
            }
        }
        for ( int i = 0; i<array.length; i++){
            System.out.print( array[i] + " ");
        }
    }
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        changeArray();
        int[] array = new int[]{1, 2, 3, 4, 5, 6,7};
        printArray(array);
        System.out.println();
        creatNewArray(array);
    }

}
