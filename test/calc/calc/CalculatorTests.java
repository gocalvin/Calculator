package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTests {

	@Test
	public void testAddition() {
	
		assertEquals("Addition output incorrect",5, CreateCalculator.add(2, 3));
	}

	@Test
	public void testSubtraction() {
	
		assertEquals("Subtraction output incorrect",4, CreateCalculator.subtract(2, 3));
		System.out.println("Trying to commit to branch");
	}
}
