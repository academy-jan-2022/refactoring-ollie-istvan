package com.fibonacci;

import org.junit.Assert;
import org.junit.Test;


public class FibonacciIndexEdgeCaseTest {

    @Test
    public void whenNumberNotFoundThenIndexIsMinusOne() {
        Assert.assertEquals(-1, new FibonacciIndexer().findIndexOf(7));
    }

    @Test
    public void cannotFindIndexOfNegativeNumber() {
        Assert.assertEquals(-1, new FibonacciIndexer().findIndexOf(-1));
    }


}
