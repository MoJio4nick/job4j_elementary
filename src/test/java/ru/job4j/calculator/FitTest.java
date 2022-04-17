package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan187Weight100() {
    short in = 187;
    double expected = 100;
    double out = Fit.manWeight(in);
    Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void womanWeight() {
        short in = 165;
        double expected = 63;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.25);
    }
}