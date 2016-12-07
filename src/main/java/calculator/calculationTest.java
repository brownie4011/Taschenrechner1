package calculator;

import junit.framework.*;

import org.junit.Test;

public class calculationTest {
	
	
	public void setUp()
	{
		double zahl1 = 3.4;
		double zahl2 = 5.7;
	}

	@Test
	public void testAddieren() {
		
		String zeichen = "+";
		Rechner rechner = new Rechner();
		expectedresult = 9.1;
		
		assertEquals(expectedResult, rechner.rechne(zahl1, zahl2, zeichen));
		
		
	}

}
