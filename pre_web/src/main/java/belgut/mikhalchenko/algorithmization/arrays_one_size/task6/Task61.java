package belgut.mikhalchenko.algorithmization.arrays_one_size.task6;
/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами*/
public class Task61 {

    static void findSum(int n) {
        double[] array = new double[n];
        double b = 0.0;
        double c = 10.0;
        System.out.print("array { ");
        for (int i = 0; i < array.length; i ++) {
            array[i] = b + (Math.random() * c);

            System.out.print(array[i] + " ");}

        double sum = 0;
        for (int i = 2; i < array.length; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        findSum(6);
    }
}
