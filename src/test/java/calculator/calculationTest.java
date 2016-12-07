package calculator;

import junit.framework.*;


public class calculationTest extends TestCase{
	double zahl1, zahl2;
	
	
	public void setUp()
	{
		zahl1 = 7.4;
		zahl2 = 5.7;
	}


	public void testAddieren() {
		
		String zeichen = "+";
		Rechner rechner = new Rechner();
		String expectedresult = "13.1";
		
		assertEquals(expectedresult, rechner.rechne(zahl1, zahl2, zeichen));
		
		
	}
	
public void testSubtrahieren() {
		
		String zeichen = "-";
		Rechner rechner = new Rechner();
		String expectedresult = "1.7";
		
		assertEquals(expectedresult, rechner.rechne(zahl1, zahl2, zeichen));
		
		
	}
public void testMultiplizieren() {
	
	String zeichen = "*";
	Rechner rechner = new Rechner();
	String expectedresult = "42.18";
	
	assertEquals(expectedresult, rechner.rechne(zahl1, zahl2, zeichen));
	
	
}

}
