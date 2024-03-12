package com.mycompany.app;
import java.lang.reflect.Array;
import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */


public class AppTest {

    public void testNull() {
        assertFalse(new App().calculatePrice(null, null, "message", 0));
    }
    
    public void testFound() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(new App().calculatePrice(array1, array2, "message is valid", 0));
    }

    
    public void testNotFound() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(new App().calculatePrice(array1, array2, "message is not valid", 0));
    }
    

    public void testEmptyArray() {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        assertFalse(new App().calculatePrice(array1, array2, "message", 0 ));
    }
}
