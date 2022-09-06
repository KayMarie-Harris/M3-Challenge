package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    // Division Tests
    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }

    // Addition Tests
    @Test
    public void shouldAddTwoPositiveIntegers()
    {
        assertEquals(3, calc.add(1,2));
    }

    @Test
    public void shouldAddTwoNegativeIntegers()
    {
        assertEquals(-5,calc.add(-1,-4));
    }

    @Test
    public void shouldAddOneNegOnePosInt()
    {
        assertEquals(-2,calc.add(-5,3));
        assertEquals(2,calc.add(5,-3));
    }

    @Test
    public void shouldAddZeros()
    {
        assertEquals(0,calc.add(0,0));
        assertEquals(23, calc.add(0,23));
        assertEquals(-7,calc.add(-7,0));
    }

    // Subtraction Tests
    @Test
    public void shouldSubtractTwoPositiveIntegers()
    {
        assertEquals(-1, calc.subtract(1,2));
        assertEquals(11,calc.subtract(34,23));
    }

    @Test
    public void shouldSubtractTwoNegativeIntegers()
    {
        assertEquals(3,calc.subtract(-1,-4));
        assertEquals(-3,calc.subtract(-4,-1));
    }

    @Test
    public void shouldSubtractOneNegOnePosInt()
    {
        assertEquals(-8,calc.subtract(-5,3));
        assertEquals(8,calc.subtract(5,-3));
    }

    @Test
    public void shouldSubtractZeros()
    {
        assertEquals(0, calc.subtract(0, 0));
        assertEquals(-23, calc.subtract(0, 23));
        assertEquals(-7, calc.subtract(-7, 0));
    }

    // Multiplication Tests
    @Test
    public void shouldMultiplyPositiveIntegers()
    {
        assertEquals(9,calc.multiply(3,3));
        assertEquals(21,calc.multiply(7,3));
        assertEquals(2,calc.multiply(2,1));
    }

    @Test
    public void shouldMultiplyNegativeIntegers()
    {
        assertEquals(12,calc.multiply(-6,-2));
        assertEquals(8,calc.multiply(-1,-8));
    }

    @Test
    public void shouldMultiplyPosAndNegIntegers()
    {
        assertEquals(-15,calc.multiply(5,-3));
        assertEquals(-9,calc.multiply(-9,1));
    }

    @Test
    public void shouldMultiplyByZero()
    {
        assertEquals(0,calc.multiply(5,0));
        assertEquals(0,calc.multiply(0,0));
        assertEquals(0,calc.multiply(0,-2));
    }
}
