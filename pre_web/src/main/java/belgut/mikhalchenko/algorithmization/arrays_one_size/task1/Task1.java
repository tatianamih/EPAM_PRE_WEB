package belgut.mikhalchenko.algorithmization.arrays_one_size.task1;

/*. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К*/
public class Task1 {
    int n;
    int[] array = new int[n];

    public static void sum(int[] array, int k) {
        int sum = 0;
        for (int a : array) {
            if (a % k == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(new int[]{2, 4, 6, 5},2);
    }
}
