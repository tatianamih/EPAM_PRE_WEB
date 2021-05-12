package belgut.mikhalchenko.algorithmization.array_two_size.task14;

/*14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца
1(00) 1(01) 1(02)
0(10) 1(11) 1(12)
0(20) 0(21) 1(22)
0(30) 0(31) 0(32)// если j = 0 ar[i][j] = 0; если  j=1
------
1     2     3
*/
public class Task14 {
    public static void main(String[] args)
    {
        //printArray(createArray());
    }

    private static int[][] createArray() {
        int n = (int) ((Math.random() * (10 - 3 + 1) + 3));
        int m = (int) ((Math.random() * (10 - n + 1) + n)); // корректрировка числа столбцов от числа строк по правилу : (кол-во строк >= кол-ву столбцов )
        System.out.println("Created array " + m + " x " + n);
        System.out.println();
        System.out.println("Number colon");

        int arr[][] = new int[m][n];
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i <= j; i++) {//(если i < j если все нули в нулевом столбце
                arr[i][j] = 1;
            }
            for (int i = 0; i > j; i++) {
                arr[i][j] = 0;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
            }
            System.out.print(j + 1 + "\t");
        }
        System.out.println("\n");
        return arr;
    }


    private static void printArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
