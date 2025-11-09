package com.mycompany.runapplication.test;

import com.mycompany.runapplication.RoadsConstructed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadsConstructedTest {

    private RoadsConstructed testRoad;

    @BeforeEach
    void setUp() {
        // Create an anonymous subclass of RoadsConstructed for testing
        testRoad = new RoadsConstructed("Cape Town", 155) {};
    }

    @Test
    void testGetCity_ReturnsCorrectCity() {
        assertEquals("Cape Town", testRoad.getCity(),
                "getCity() should return the city provided in constructor");
    }

    @Test
    void testGetTotalRoadsConstructed_ReturnsCorrectValue() {
        assertEquals(155, testRoad.getTotalRoadsConstructed(),
                "getTotalRoadsConstructed() should return the total roads provided in constructor");
    }

    @Test
    void testDifferentCityAndRoads() {
        RoadsConstructed anotherRoad = new RoadsConstructed("Johannesburg", 200) {};
        assertEquals("Johannesburg", anotherRoad.getCity());
        assertEquals(200, anotherRoad.getTotalRoadsConstructed());
    }
}

