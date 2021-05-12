package belgut.mikhalchenko.basics_of_software_code_development_master.branching.task2;

/*Найти max{min(a, b), min(c, d)}.*/
public class Task2 {
    private static void task(int a, int b, int c, int d) {

        int minAb;
        int minCd;
        int max;

        if (a < b) {
            minAb = a;
        } else {
            minAb = b;
        }

        if (c < d) {
            minCd = c;
        } else {
            minCd = d;
        }

        if (minAb > minCd) {
            max = minAb;
        } else {
            max = minCd;
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        task(1,2,3,4);
    }
}
