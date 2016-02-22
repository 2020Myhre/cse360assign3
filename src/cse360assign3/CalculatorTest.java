package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void ConstructorTest() {
		
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		int value = calc.getTotal();
		assertEquals(value,0);
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		int value = calc.getTotal();
		assertEquals(value,5);
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(2);
		int value = calc.getTotal();
		assertEquals(value,3);
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(2);
		calc.multiply(2);
		int value = calc.getTotal();
		assertEquals(value,6);
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(2);
		calc.multiply(2);
		calc.divide(3);
		int value = calc.getTotal();
		assertEquals(value,2);
	}
	
	@Test
	public void testDivideZero() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(2);
		calc.multiply(2);
		calc.divide(0);
		int value = calc.getTotal();
		assertEquals(value,0);
	}
	
	
	@Test
	public void testGetHistroy() {
		fail("Not yet implemented");
	}

}
