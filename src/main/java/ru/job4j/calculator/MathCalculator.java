package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOperationDeductAndShare(double first, double second) {
        return deduct(first, second)
                + share(first, second);
    }

    public static double sumAllOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + deduct(first, second)
                + share(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + sumOperationDeductAndShare(10, 20));
        System.out.println("Результат расчета равен: " + sumAllOperation(10, 20));
    }

}
