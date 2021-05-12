package belgut.mikhalchenko.basics_of_software_code_development_master.loop.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8NewVariant {

    private static List<Integer> createdArrayListA(int a){
        List<Integer> array1 = new ArrayList<Integer>();
        while (a != 0) {


            int i = 0;
            array1.add(i, a % 10);
            i++;
            a /= 10;

        } //System.out.print(array1 + " ");
        return array1;
    }
    private static List<Integer> createdArrayListB(int b){
        List<Integer> array2 = new ArrayList<Integer>();
        while (b != 0) {

            array2.add(0, b % 10);
            b /= 10;

        }
//        System.out.println();
//        System.out.print(array2 + " ");
        return array2;
    }
    private static void equalNumber(int a, int b) {
        List<Integer> array1;
        List<Integer> array2;
        {
           array1 = createdArrayListA(a);
        }
        {
            array2 = createdArrayListA(b);
        }
        for (int a1: array1) {
            for (int b2 : array2) {
                if(a1 == b2){
                    System.out.print(a1 + " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number one :");
        int a = scanner.nextInt();
        System.out.println("Input number two :");
        int b = scanner.nextInt();
        System.out.println("Your result :");
        equalNumber(a,b);
    }

}
