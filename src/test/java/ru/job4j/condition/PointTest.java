package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to46then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 4;
        int x2 = 4;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.83);
    }

    @Test
    public void when23to41then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.83);
    }

    @Test
    public void when58to96then4() {
        double expected = 4;
        int x1 = 5;
        int y1 = 8;
        int x2 = 9;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.48);
    }

    @Test
    public void when39to87then5() {
        double expected = 5;
        int x1 = 3;
        int y1 = 9;
        int x2 = 8;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.39);
    }
}