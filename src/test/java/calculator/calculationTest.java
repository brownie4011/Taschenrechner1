package calculator;

import junit.framework.*;


public class calculationTest extends TestCase{
	double zahl1, zahl2;
	
	
	public void setUp()
	{
		zahl1 = 3.4;
		zahl2 = 5.7;
	}


	public void testAddieren() {
		
		String zeichen = "+";
		Rechner rechner = new Rechner();
		String expectedresult = "9.1";
		
		assertEquals(expectedresult, rechner.rechne(zahl1, zahl2, zeichen));
		
		
	}

}
