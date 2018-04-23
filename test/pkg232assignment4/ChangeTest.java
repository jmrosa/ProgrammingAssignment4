/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg232assignment4;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static pkg232assignment4.Change.minCoin;

/**
 *
 * @author jessicarosa
 */
public class ChangeTest {
    
    public ChangeTest() {
    }

    /**
     * Test of minCoin method, of class Change.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testMinCoinIllegalArgument() {
        int array[] = {};
        int a = 17;
        assertEquals(minCoin(array, a), "Array of size 0 is not allowed");
    }

    @Test       //example guest lecturer did in class
    public void testMinCoin1() {
        int array[] = {1, 5, 12, 25};
        int a = 16;
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1); expected.add(5); expected.add(5); expected.add(5);
        assertEquals(expected, minCoin(array, a));
    }
    
    @Test   //test using standard US coin system
    public void testMinCoin2() {
        int array[] = {1, 5, 10, 25};
        int a = 16;
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1); expected.add(5); expected.add(10);
        assertEquals(expected, minCoin(array, a));
    }
    
    @Test
    public void testMinCoin3() {
        int array[] = {1, 5, 10, 25};
        int a = 25;
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(25);
        assertEquals(expected, minCoin(array, a));
    }
    
    @Test
    public void testMinCoin4() {
        int array[] = {1, 3, 5, 7, 9};
        int a = 13;
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1); expected.add(3); expected.add(9);
        assertEquals(expected, minCoin(array, a));
    }
}
