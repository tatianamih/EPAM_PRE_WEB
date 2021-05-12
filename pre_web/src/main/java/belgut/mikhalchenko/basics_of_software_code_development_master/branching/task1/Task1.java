package belgut.mikhalchenko.basics_of_software_code_development_master.branching.task1;

/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/
public class Task1 {
    private static void task(int a, int b) {
        if (a + b >= 180) {
            System.out.println("This triangle does not exist");
        } else if (a == 90 || b == 90 || a + b == 90) {
            System.out.println("This triangle has a right angle");
        } else {
            System.out.println("This is a triangle");
        }
    }

    public static void main(String[] args) {
        task(90, 20);
    }
}


