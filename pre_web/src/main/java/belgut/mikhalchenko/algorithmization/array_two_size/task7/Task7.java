package belgut.mikhalchenko.algorithmization.array_two_size.task7;

import java.util.Scanner;

import static java.lang.StrictMath.sin;

/*7. Сформировать квадратную матрицу порядка N по правилу:

ar [i][j] = (sin(i*i - j*j)/n)
2 2
[ , ] sin
и подсчитать количество положительных элементов в ней.
*/
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of strings and number of colons ");
        int n = scanner.nextInt();
        findNumberPositiveElements(createArray(n));
    }
private static double[][] createArray(int n){
        double[][]array = new double[n][n];
        for(int i = 0; i < array.length; i++){
            for(int j =0; j < array[i].length; j++){
                array[i][j]= (sin(i*i - j*j)/n);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    return array;
}
private static void findNumberPositiveElements(double[][]array){
        int counter = 0;
    for(int i = 0; i < array.length; i++){
        for(int j =0; j < array[i].length; j++) {
            if(array[i][j] > 0){
                counter++;
            }

        }
        }System.out.print("Number of positive element \n" + counter);
}
}
