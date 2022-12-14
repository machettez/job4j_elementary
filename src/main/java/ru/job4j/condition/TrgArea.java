package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double abc = ((a + b + c) / 2);
        double rsl = Math.sqrt(abc * (abc - a) * (abc - b) * (abc - c));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result1);
        double result2 = TrgArea.area(5, 6, 7);
        System.out.println("area (5, 6, 7) = " + result2);
        double result3 = TrgArea.area(13, 15, 14);
        System.out.println("area (13, 15, 14) = " + result3);
    }

}
