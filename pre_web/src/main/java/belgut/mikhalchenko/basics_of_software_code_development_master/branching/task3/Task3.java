package belgut.mikhalchenko.basics_of_software_code_development_master.branching.task3;

/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */

public class Task3 {


    private static void task(int x1, int y1, int x2, int y2, int x3, int y3) {

        String result;
        boolean flag;

        flag = (x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3);
        result = flag ? "Точки расположены на одной прямой" : "Точки расположены не на одной прямой";

        System.out.println(result);
    }

    public static void main(String[] args) {

        task(1, 3, 1, 4, 1, 6);
    }
}