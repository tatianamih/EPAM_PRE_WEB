package belgut.mikhalchenko.programming_with_classes.task3;

public class App {

    public static void main(String[] args) {

        int[] marks1 = new int[]{9, 9, 9, 9, 9};
        int[] marks2 = new int[]{9, 9, 9, 7, 9};
        int[] marks3 = new int[]{8, 8, 8, 10, 8};
        int[] marks4 = new int[]{4, 5, 6, 6, 4};
        int[] marks5 = new int[]{10, 10, 10, 10, 10};
        int[] marks6 = new int[]{9, 10, 9, 10, 9};

        Student st1 = new Student("Ivanov I.I.", 1, marks1);//+
        Student st2 = new Student("Petrov P.P.", 2, marks4);
        Student st3 = new Student("Kats A.I.", 3, marks5);//+
        Student st4 = new Student("Popovichenko I.E.", 3, marks4);
        Student st5 = new Student("Sidorov D.D.", 2, marks2);
        Student st6 = new Student("Kalinovskay L.I.", 1, marks3);
        Student st7 = new Student("Ray I.G.", 1, marks4);//----
        Student st8 = new Student("Danilenko D.V.", 3, marks2);
        Student st9 = new Student("Bobr V.V.", 2, marks6);//+
        Student st10 = new Student("Vetoshkina I.V.", 1, marks3);

        Student[] students =
                {st1, st2, st3, st4, st5, st6, st7, st8, st9, st10};
        Student.getFIOAndGroupNumberForBestStudent(students);

    }
}

