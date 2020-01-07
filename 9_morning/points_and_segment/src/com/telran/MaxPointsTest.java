package com.telran;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class MaxPointsTest {

    MaxPoints maxPoints = new MaxPoints();

    @Test
    public void leftCoordinateOfSegmentCoveringMaxPoints() {

        List<Double> points = Arrays.asList(0., 0.1, 0.7, 0.5, 0.8, 0.3, 0.6, 1.);
        double d = 0.3;

        assertEquals(0.5, maxPoints.leftCoordinateOfSegmentCoveringMaxPoints(points, d));
    }
}