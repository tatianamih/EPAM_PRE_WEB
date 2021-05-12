package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task3;

/*Найти сумму квадратов первых ста чисел.*/
public class Task3 {
    private static void sum() {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {

            sum += i * i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum();
    }
}
