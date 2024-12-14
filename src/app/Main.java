package app;

import java.util.Scanner;

public class Main {

    static double rate1;
    static double rate2;
    static double rate3;

    public static void main(String[] args) {
        rate1 = 2.5;
        rate2 = 4.3;
        rate3 = 6.7;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input for incomeValue: ");

        double incomeValue = sc.nextDouble();

        double result;
        double a = 0;
        double b = 10000;
        double c = 25000;

        if (incomeValue > a && incomeValue <= b) {
            result = incomeValue * rate1 / 100;
            System.out.printf("Income tax is %.2f%n", result);
        } else if (incomeValue > b && incomeValue <= c) {
            result = incomeValue * rate2 / 100;
            System.out.printf("Income tax is %.2f%n", result);
        } else if (incomeValue > c) {
            result = incomeValue * rate3 / 100;
            System.out.printf("Income tax is %.2f%n", result);
        } else {
            System.out.println("Income tax is 0");
        }
    }
}
