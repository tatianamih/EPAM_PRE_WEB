package belgut.mikhalchenko.basics_of_software_code_development_master.branching.task4;

public class Task4 {


    private static void task(int a, int b, int x, int y, int z) {

        if (x <= a && y <= b || x <= b && y <= a ||x <= a && z <= b || x <= b && z <= a || z <= a && y <= b || z <= b && y <= a) {

            System.out.println("Кирпич пройдет");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }
    public static void main(String[] args) {

        task(100, 20, 54, 79, 41);
    }
}
