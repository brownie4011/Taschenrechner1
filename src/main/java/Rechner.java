import java.util.Scanner;


public class Rechner {
	Scanner scan = new Scanner(System.in);
	boolean running;
	int zahl1;
	int zahl2;
	String zeichen;
	int ergebnis;
	String nochmal;

	public Rechner()
	{ 
	    ergebnis = 0;
		running = true;
		zahl1 = 0;
		zahl2 = 0;
		zeichen = "";
		nochmal= "";
		System.out.println("Willkommen bei Philipp's Taschenrechner");
		
		start();
	}
	
	
	public void start()
	{
		System.out.println("Geben sie den ersten Wert ein: ");
		this.zahl1 = scan.nextInt();
		System.out.println("Geben sie eine Rechenmethode ein (+,-,*,/): ");
		this.zeichen = scan.next();
		System.out.println("Geben sie den zweiten Wert ein: ");
		this.zahl2 = scan.nextInt();
		
		rechne();
		
		System.out.println("Das Ergebniss ist: " + ergebnis);
		
		System.out.println("Möchten sie noch eine Berechnung durchführen? j/n: ");
		this.nochmal=scan.next();
		if(nochmal.equals("j")|| nochmal.equals("J"))
		{
		    start();
		}
		else
		{
		    System.out.println("Schönen Tag");
		}
		
	}
	
	public void rechne()
	{
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
			rechne();
		}
	}
	
	
	

}
