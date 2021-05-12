package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task6;

/*6. Вывести на экран соответствий между символами и их численными обозначениями в
памяти компьютера.*/
public class Task6 {
    public static void main(String[] args) {
        getIntFromChar("hhhh");
    }

    public static void getIntFromChar(String str) {
        char[] myCharArray = str.toCharArray();
        for (int i = 0; i < myCharArray.length; i++) {
            int x = myCharArray[i];
            System.out.println(i + " - " + x);
        }
    }


}
