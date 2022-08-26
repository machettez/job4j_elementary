package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 174;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Идеальный вес для мужчины с ростом " + manHeight + " = " + man + " кг.");
        System.out.println("Идеальный вес для женщины с ростом " + womanHeight + " = " + woman + " кг.");
    }

}
