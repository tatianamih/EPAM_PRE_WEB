package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task2;

public class Task2 {
    /* Вычислить значения функции на отрезке [а,b] c шагом h:*/



        public static void main(String[] args) {

            task(-13, 13, 2);
        }

        private static void task(int a, int b, int h) {

            int x;

            for (int i = a; i <= b; i += h) {

                x = i;

                if (x <= 2) {
                    x = -x;
                    System.out.println(x);
                }
            }
        }
}
