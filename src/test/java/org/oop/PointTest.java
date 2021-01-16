package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        double expected = 0;

        double actual = origin.distance(origin);

        assertEquals(expected, actual);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        double expected = 1;

        double actual = origin.distance(point1);
        double actual1 = origin.distance(point2);

        assertEquals(expected, actual);
        assertEquals(expected, actual1);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        double expected = 2;

        double actual = point1.distance(point2);

        assertEquals(expected, actual);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        double expected = 0;

        double actual = origin.direction(point1);
        double actual1 = origin.direction(point2);

        assertEquals(expected, actual);
        assertEquals(expected, actual1);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        double expected = Math.PI;

        double actual = origin.direction(point1);
        double actual1 = origin.direction(point2);

        assertEquals(expected, actual);
        assertEquals(expected, actual1);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        double expected = Math.PI / 2;

        double actual = origin.direction(point2);
        double actual1 = origin.direction(point1);

        assertEquals(expected, actual);
        assertEquals(expected, actual1);
    }
}
