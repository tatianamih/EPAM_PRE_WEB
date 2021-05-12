package belgut.mikhalchenko.algorithmization.array_two_size.task6;


public class Task61 {
    /*
    6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
            1 (00)   1 (01)   1 (02)   1 (03)   1 (04)   1 (05)
            0 (10)   1 (11)   1 (12)   1 (13)   1 (14)   0 (15)//10  i =1 j =0            15
            0 (20)   0 (21)   1 (22)   1 (23)   0 (24)   0 (25)// 20 21 i=2 j=0 j=1
            0 (30)   0 (31)   1 (32)   1 (33)   0 (34)   0 (35)
            0 (40)   1 (41)   1 (42)   1 (43)   1 (44)   0 (45)
            1 (50)   1 (51)   1 (52)   1 (53)   1 (54)   1 (55)
     */
    private static int[][] createArrray(int n) {
        int array[][] = new int[n][n];

        for (int i = 0; i < array.length; i++) {//
            for (int j = i; j < array[i].length - i; j++) {
               array[i][j] = 1;
                array[array.length - i - 1][array.length - j - 1] = 1;//55 //54...
            }
        }
        return array;
    }
        private static void printArray(int[][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printArray( createArrray(6));
    }
}

