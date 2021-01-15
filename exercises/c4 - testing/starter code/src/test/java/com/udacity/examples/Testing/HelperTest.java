package com.udacity.examples.Testing;

import org.junit.*;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HelperTest {
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

    @Test
    public void verify_getMergedList(){
        List<String> empNames = Arrays.asList("sareeta", "", "john","");
        String actual = Helper.getMergedList(empNames);
        assertEquals("sareeta, john", actual);
    }

    @Test
    public void verify_list_is_squared(){
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        List<Integer> expected = Arrays.asList(169, 16, 225, 36, 289, 64, 361, 1, 4, 9);
        assertEquals(expected, Helper.getSquareList(yrsOfExperience));
    }

    @Test
    public void verify_strings_of_length3(){
        List<String> empNames = Arrays.asList("sareeta", "mac", "john","ben");
        assertEquals(2, Helper.getStringsOfLength3(empNames));
    }

    @Test
    public void test(){
        assertEquals("4", "4");
    }


    @Test
    public void test2() {
        assertEquals("test", "test1");
    }

    @Test
    public void test1() {
        assertEquals("test", "test");
    }

    @Before
    public void init(){
        System.out.println("This method runs before each test method");
    }

    @BeforeClass
    public static void setUp(){
        System.out.println("This method runs once before every other methods in the class");
    }

    @After
    public void initEnd(){
        System.out.println("Runs after each test method");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Runs after each class");
    }
}
