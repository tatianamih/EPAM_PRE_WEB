package belgut.mikhalchenko.programming_with_classes.task4;

import java.util.Comparator;

public class CompareTrainByNumber implements Comparator<Train> {


    @Override
    public int compare(Train train1, Train train2) {
             if(train1.getTrainNumber() == train2.getTrainNumber()){
            return 0;
        }
        else if (train1.getTrainNumber() < train2.getTrainNumber()){
            return -1;
        }else {

            return 1;
        }
    }
}
