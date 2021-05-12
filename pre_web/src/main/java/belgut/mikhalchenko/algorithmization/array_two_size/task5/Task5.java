package belgut.mikhalchenko.algorithmization.array_two_size.task5;

import java.util.Scanner;

/*5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
            1(00)   1(01)   1(02)   1(03)
            2(10)   2(11)   2(12)   0(13) // 4 - 1
            3(20)   3(21)   0(22)   0(23)//4 - 2 (n - i) <= j
            4(30)   0(31)   0(30)   0(33)// 4 - 3
*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of strings and number of colons ");
        int n = scanner.nextInt();
        printArray(n);
    }

    private static void printArray(int n) {
        int[][] array = new int[n][n];
        if (n % 2 != 0) {
            System.out.println("Введите четное число");
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = i + 1;
                    if (n - i <= j) {
                      array[i][j] = 0;
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
