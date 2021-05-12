package belgut.mikhalchenko.programming_with_classes.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestForListTrain {
    public static void main(String[] args) {

        Train tr1 = new Train("Rechitsa", 5, "6:00");
        Train tr2 = new Train("Vasilevichi", 2, "6:30");
        Train tr3 = new Train("Kalinkovichi", 3, "7:00");
        Train tr4 = new Train("Rechitsa", 4, "9:00");
        Train tr5 = new Train("Zhloben", 1, "9:45");
        Train[] trains = new Train[]{tr1, tr2, tr3, tr4, tr5};
        List<Train> listTrains = new ArrayList<>();

        listTrains.add(tr1);
        listTrains.add(tr2);
        listTrains.add(tr3);
        listTrains.add(tr4);
        listTrains.add(tr5);
//
//        System.out.println(listTrains);
//
//        Collections.sort(listTrains);
//        System.out.println(listTrains);
        Train.sortedByNumberOfTrain(listTrains);

    }


}
