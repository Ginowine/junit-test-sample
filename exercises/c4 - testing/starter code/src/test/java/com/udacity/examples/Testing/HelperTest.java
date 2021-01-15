package com.udacity.examples.Testing;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HelperTest {
    @Test
    public void test(){
        assertEquals("4", "4");
    }

    @Test
    public void test1(){
        List<String> empName = Arrays.asList("Gino Mazoni", "Eseosa", "Eghosa");
        final long actual = Helper.getCount(empName);
        assertEquals(3, actual);

    }
}
