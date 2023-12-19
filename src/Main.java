public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 6");
        //
        System.out.println("          Задача 1");
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
        //
        System.out.println("          Задача 2");
        for (int i=10; i>=1; i--) {
            System.out.println(i);
        }
        //
        System.out.println("          Задача 3");
        for (int i=0; i<=17; i=i+2) {
            System.out.println("Чётное число = " + i);
        }
        //
        System.out.println("          Задача 4");
        for (int i=10; i>=-10; i--) {
            System.out.println(i);
        }
        //
        System.out.println("          Задача 5");
        for (int i=1904; i<=2096; i=i+4) {
            System.out.println(i + " год является високосным");
        }
        //
        System.out.println("          Задача 6");
        for (int i=7; i<=98; i=i+7) {
            System.out.printf(i + " ");;
        }
        System.out.println();
        //
        System.out.println("          Задача 7");
        for (int i=1; i<=512; i=i*2) {
            System.out.printf(i + " ");;
        }
        System.out.println();
        //
        System.out.println("          Задача 8");
        int deposit1 = 0;
        int monthSum1 = 29000;
        for (int i=1; i<=12; i++) {
            deposit1 = deposit1 + monthSum1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit1);;
        }
        //
        System.out.println("          Задача 9");
        float deposit2 = 0;
        float monthSum2 = 29000;
        float depositProc = 0.01f;
        for (int i=1; i<=12; i++) {
            deposit2 = deposit2 * (1 + depositProc) + monthSum2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit2);
        }
        //
        System.out.println("         Задача 10");
        int multiplicationTableNum = 2;
        for (int i=1; i<=10; i++) {
            System.out.println( multiplicationTableNum + "*" + i + "=" + (i * multiplicationTableNum) );
        }
    }
}