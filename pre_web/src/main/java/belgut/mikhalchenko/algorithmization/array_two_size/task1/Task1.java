package belgut.mikhalchenko.algorithmization.array_two_size.task1;
/*1. Дана матрица. Вывести на экран все нечетные столбцы,
 у которых первый элемент больше последнего*/
/* 1 2 3 4 2 9
  2  3 5 1 0 8
  1  4 0 0 1 2   */
public class Task1 {
    private static int[][] createArray(int n, int m) {
        int array[][] = new int[n][m];
        double b = 0.0;
        double c = 10.0;
        for (int i = 0; i < array.length; i++) {//
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (b + (Math.random() * c));
                System.out.print(array[i][j] + " ");
            }System.out.println();
        } System.out.println();

        return array;

    }
    private static void printArray(int[][]array) {

        for (int j = 0; j < array[0].length; j += 2) {
            if (array[0][j] > array[array.length - 1][j]) {
                System.out.println(j + 1 + "th" + " colum");
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i][j] + " ");
                }


            }

        }
    }

    public static void main(String[] args) {
      //  createArray(3,3);
        int [][] array1 = {{10,5,3,12,10, 18},{9,4,1,1,9,11,15}};

        printArray(array1);
    }
}



