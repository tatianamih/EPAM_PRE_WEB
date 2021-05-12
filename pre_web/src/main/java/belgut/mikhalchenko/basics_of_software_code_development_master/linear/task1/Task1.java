package belgut.mikhalchenko.basics_of_software_code_development_master.linear.task1;

public class Task1 {
    //1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
    private static double task(int a, int b, int c) {

        int z;

        z = ((a - 3) * b / 2) + c;

        return z;
    }

    public static void main(String[] args) {
        System.out.println(task(4, 4, 3));
    }
}
