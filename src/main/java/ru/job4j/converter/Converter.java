package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEur = 140;
        float inDol = 180;
        float expectedEur = 2;
        float expectedDol = 3;
        float euro = Converter.rubleToEuro(inEur);
        float dollar = Converter.rubleToDollar(inDol);
        boolean passed1 = expectedEur == euro;
        boolean passed2 = expectedDol == dollar;
        System.out.println("140 rubles are 2 euro. Test result: " + passed1);
        System.out.println("180 rubles are 3 dollar. Test result: " + passed2);
    }

}
