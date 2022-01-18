package SE_UT.UT;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCal {

	@Test
	public void testAdd() {
		int expectedResult = 5;
		Cal addObj = new Cal();
		assertEquals(expectedResult, addObj.Add(2 ,3));
	}
	
	@Test
	public void testSub(){
		int expectedResult = 1;
		Cal subObj = new Cal();
		assertEquals(expectedResult, subObj.Sub(3 ,2));
	}
	
	@Test
	public void testMul(){
		int expectedResult = 6;
		Cal mulObj = new Cal();
		assertEquals(expectedResult, mulObj.Mul(3 ,2));
	}

	@Test
	public void testDiv(){
		double expectedResult = 1.5;
		Cal divObj = new Cal();
		assertEquals(expectedResult, divObj.Div(3 ,2), 0.01);
	}

}
