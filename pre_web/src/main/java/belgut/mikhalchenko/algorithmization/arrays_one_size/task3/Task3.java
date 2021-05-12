package belgut.mikhalchenko.algorithmization.arrays_one_size.task3;
/*. Дан массив действительных чисел, размерность которого N.
 Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

public class Task3 {
    static  void  counterOfTheNumbers (int n){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int c = -2;
        int b = 10;
        int [] array = new int[n];
        for (int a : array){
            a = c + ((int) (Math.random() * b));
            if (a > 0){
                positive++;
            }else if (a < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.print(a +" ");
        }


        System.out.println();
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
        System.out.println("zero = " + zero);

    }

    public static void main(String[] args) {
//    int [] ar1 = new int[] {1,3,-5,-2,0,0,7} ;
        counterOfTheNumbers(5);
    }
}

