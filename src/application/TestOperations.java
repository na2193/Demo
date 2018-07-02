package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOperations {
	private static final double DELTA = 1e-10;
	private Operation op = new Operation();
	
	private double num1 = 10, num2 = 12.3;
	
	@Test
	public void testAddition() {
		double expectedSum = num1 + num2;
		double actualSum = op.add(num1, num2);
		assertEquals(expectedSum, actualSum, DELTA);
	}
	
	@Test
	public void testSubtraction() {
		double expectedSub = num1 - num2;
		double actualSub = op.subtract(num1, num2);
		assertEquals(expectedSub, actualSub, DELTA);
		
		num1 = 800.34;
		num2 = 500.99;
		expectedSub = num1 - num2;
		actualSub = op.subtract(num1, num2);
		assertEquals(expectedSub, actualSub, DELTA);
	}
	
	@Test
	public void testMultiply() {
		double expectedMult = num1 * num2;
		double actualMult = op.multiply(num1, num2);
		assertEquals(expectedMult, actualMult, DELTA);
	}
	
	@Test
	public void testDivide() {
		double expectedDivide = num1 / num2;
		double actualDivide = op.divide(num1, num2);
		assertEquals(expectedDivide, actualDivide, DELTA);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivdieWithZero() {
		num1 = 40;
		num2 = 0;
		double actualDivide = op.divide(num1, num2);
	}
}
