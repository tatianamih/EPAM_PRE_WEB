package belgut.mikhalchenko.programming_with_classes.task1;

public class Test1 {
    //Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
   // переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
   // наибольшее значение из этих двух переменны a;
    // int b;х.
    int a;
    int b;

    public void print(){
        System.out.println("a = " + a + ", b = " + b + ".");
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public int getSum() {
        return a + b;
    }

    public int getMax() {
        return a > b ? a : b;
    }


}