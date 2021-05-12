package belgut.mikhalchenko.basics_of_software_code_development_master.linear.task6;

/* Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: */
public class Task6 {
    private void task(int x, int y) {

        boolean result;
        result = (x >= -2) && (x <= 2) && (y >= 0) && (y <= 4) || (x >= -4) && (x <= 4) && (y >= -3) && (y <= 0);

        if (x == 0 && y == -1) {
            System.out.println(false);
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        new Task6().task(2,2);
    }
}
