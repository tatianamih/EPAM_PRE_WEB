package belgut.mikhalchenko.algorithmization.arrays_one_size.task2;

/* Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен */
public class Task2 {
    private static void task(int n, int z) {

        int[] array = new int[n];
        int count = 0;
        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"
      //  System.out.print("array {");
        for (int x : array) {
            x = a + ((int) (Math.random() * b));

            System.out.print(x + " ");
//        }
//        System.out.print("}");
//
//        for (int x : array) {
            if (x > z) {
                x = z;
                count++;

            }
           // System.out.print(x + " " );
        }System.out.println();

        System.out.println("counter = " + count);

    }

    public static void main(String[] args) {
        task(4, 5);
    }
}
