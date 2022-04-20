package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan187WeightThan100() {
    short in = 180;
    double expected = 92;
    double out = Fit.manWeight(in);
    Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman165WeightThan63() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}