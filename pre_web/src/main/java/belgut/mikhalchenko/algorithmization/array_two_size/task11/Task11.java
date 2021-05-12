package belgut.mikhalchenko.algorithmization.array_two_size.task11;

/*11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз*/
public class Task11 {
    public static void main(String[] args) {
        int[][] array = createArray();
        print(array);
    }

    private static int[][] createArray() {
        int n = 10;
        int m = 20;
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (15 - 0) + 0);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }

    private static void print(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.print(i + " ");
            }
        }
    }
}

