package ru.job4j.loop;

public class Counter {

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int p = start; p <= finish; p++) {
            if (p % 2 == 0) {
                sum += p;
            }
        }
        return sum;
    }
}
