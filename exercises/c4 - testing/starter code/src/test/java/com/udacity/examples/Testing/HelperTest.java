package com.udacity.examples.Testing;

import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HelperTest {
    @Test
    public void test(){
        assertEquals("4", "4");
    }

    @Test
    public void verify_getCount(){
        List<String> empName = Arrays.asList("Gino Mazoni", "Eseosa", "Eghosa");
        final long actual = Helper.getCount(empName);
        assertEquals(3, actual);
    }

    @Test
    public void verify_getStats(){
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        List<Integer> expectedList = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        IntSummaryStatistics stats = Helper.getStats(yrsOfExperience);
        assertEquals(19, stats.getMax());
        assertEquals(1, stats.getMin());
        assertEquals(expectedList, yrsOfExperience);
    }

    @Test
    public void compare_arrays(){
        int[] yrs = {12, 5, 6, 11};
        int[] expectedyrs = {12, 5, 6, 11};
        assertArrayEquals(expectedyrs, yrs);
    }
}
