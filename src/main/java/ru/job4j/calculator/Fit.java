package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (187 - 100) * 1.15;

    }

    public static double womanWeight(short height) {
        return (165 - 110) * 1.15;
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