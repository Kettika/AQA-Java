package school.lesson1;

public class SumLessonsApp {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords () {
        System.out.println("Orange\nBanana\nApple\n");
    }

    static void checkSumSign () {
        int a = 7;
        int b = -15;
        if ((a + b) >= 0)
            System.out.println("Сумма положительная");
        if ((a + b) < 0)
            System.out.println("Сумма отрицательная");
    }

     static void printColor() {
        int c = 456;
        if (c <=0)
            System.out.println("Красный");
        if (c>0 & c<=100)
             System.out.println("Желтый");
        if(c >100)
             System.out.println("Зеленый");
     }

     static void compareNumbers() {
        int a = -573;
        int b = -87;
        if(a>=b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
     }
}