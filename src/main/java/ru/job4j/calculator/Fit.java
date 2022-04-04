package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = 187 * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = 165 * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightW = 165;
        short heightM = 187;
        double woman = womanWeight(heightW);
        double man = Fit.manWeight(heightM);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 165 is " + woman);
    }

}