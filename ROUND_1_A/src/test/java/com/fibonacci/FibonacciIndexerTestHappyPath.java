package com.fibonacci;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FibonacciIndexerTestHappyPath {

    private final int expectedIndex;
    private final long fibonacci;
    private FibonacciIndexer fibonacciIndexer;

    @Before
    public void setUp() {
        fibonacciIndexer = new FibonacciIndexer();
    }

    public FibonacciIndexerTestHappyPath(int expectedIndex, long fibonacci) {
        this.expectedIndex = expectedIndex;
        this.fibonacci = fibonacci;
    }


    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {0, 0}, {1, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}, {8, 21}, {49, 7778742049L}
        });
    }

    @Test
    public void findsIndexOfFibonacciNumber() {
        assertEquals(expectedIndex, fibonacciIndexer.findIndexOf(fibonacci));
    }

}
