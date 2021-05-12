package belgut.mikhalchenko.basics_of_software_code_development_master.linear.task5;

/*  Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc.*/

public class Task5 {
    private static void task(int t) {

       String result;
       result = t / 3600 + "ч " + (t % 3600) / 60 + "мин " + (t % 3600) % 60 + "с";
        System.out.println(result);
    }

    public static void main(String[] args) {

        task(4815);

    }
}
