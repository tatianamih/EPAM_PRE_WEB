package belgut.mikhalchenko.basics_of_software_code_development_master.linear.task4;

/*. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/

public class Task4 {

    private static void task(double x) {

        double y;
        y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }

    public static void main(String[] args) {
        task(111.222);
    }
}
