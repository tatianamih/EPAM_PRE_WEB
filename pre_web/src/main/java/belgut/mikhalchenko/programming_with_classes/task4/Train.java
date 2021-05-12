package belgut.mikhalchenko.programming_with_classes.task4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train implements  Comparable<Train>,Comparator<Train> {
    //Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    //Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
    //номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    //Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
    //назначения должны быть упорядочены по времени отправления.
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public Train() {
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }





    //   @Override
    //  public int compareTo(Train anotherTrain) {
//        if(this.trainNumber == anotherTrain.trainNumber){
//            return 0;
//        } else if (this.trainNumber < anotherTrain.trainNumber){
//            return -1;
//        }else {
//            return 1;
//        }
    //       return this.trainNumber - anotherTrain.trainNumber;// variant 2
  //  return this.trainNumber.compareTo(anotherTrain.trainNumber);// if trainNumber is Integer
    //
    //  }
    @Override
    public int compare(Train train1, Train train2) {
        if(train1.trainNumber == train2.trainNumber){
            return 0;
        }
        else if (train1.trainNumber < train2.trainNumber){
            return -1;
        }else {

            return 1;
        }

    }

public static void sortedByNumberOfTrain(List<Train> list){
    Collections.sort(list);
    System.out.println(list);

}
    @Override
    public int compareTo(Train anotherTrain) {

        int result = this.destination.compareTo(anotherTrain.destination);

        if (result == 0) {
            result = this.departureTime.compareTo(anotherTrain.departureTime);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
