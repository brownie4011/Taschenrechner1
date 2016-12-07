package calculator;
import java.util.Scanner;


public class Rechner {
	
	Scanner scan = new Scanner(System.in);
	String nochmal ="";




public void start()
{
	double zahl1;
	double zahl2;
	String zeichen ="";
	
	System.out.println("Geben sie den ersten Wert ein: ");
	zahl1 = scan.nextInt();
	System.out.println("Geben sie eine Rechenmethode ein (+,-,*,/): ");
	zeichen = scan.next();
	System.out.println("Geben sie den zweiten Wert ein: ");
	zahl2 = scan.nextInt();
	
	String ergebnis2 = rechne(zahl1, zahl2, zeichen);

	System.out.println("Das Ergebniss ist: " + ergebnis2);
	
	neueBerechnung();
	
}
	public void neueBerechnung()
	{
		System.out.println("Möchten sie noch eine Berechnung durchführen? j/n: ");
		this.nochmal=scan.next();
	
		if(nochmal.equals("j")|| nochmal.equals("J"))
		{
			start();
		}
		else if(nochmal.equals("n")|| nochmal.equals("N"))
		{
			System.out.println("Schönen Tag");
		}
		else
		{
			System.out.println("Geben sie einen gültigen Wert ein");
			neueBerechnung();
		}
	
	}

public String rechne(double zahl1, double zahl2, String zeichen)
{
	double ergebnis = 0;
	
	if(zeichen.equals("+"))
	{
		ergebnis = zahl1+zahl2;
	}
	else if(zeichen.equals("-"))
	{
		ergebnis = zahl1-zahl2;
	}
	else if(zeichen.equals("*"))
	{
		ergebnis = zahl1*zahl2;
	}
	else if(zeichen.equals("/"))
	{
		ergebnis = zahl1/zahl2;
	}
	else
	{
		System.out.println("Geben sie einen gültigen Operator ein: ");
		zeichen= scan.next();
		rechne(zahl1, zahl2, zeichen);
	}
	 String ergebnis2 = String.valueOf(ergebnis);
	 return ergebnis2;
}

	
}
