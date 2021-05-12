package belgut.mikhalchenko.programming_with_classes.task3;

public class Student {
    private String fio;
    private int groupNumber;
    private int[] marks = new int[5];

    public Student(String fio, int groupNumber, int[] marks) {
        this.fio = fio;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public static void getFIOAndGroupNumberForBestStudent(Student[] students) {
        for (Student student : students) {
            int count = 0;
            for (int mark : student.marks) {
                if (mark < 9) {
                    count++;

                }
            }
            if (count == 0)
                System.out.println(student.fio + "  " + student.groupNumber);
        }
    }
}








