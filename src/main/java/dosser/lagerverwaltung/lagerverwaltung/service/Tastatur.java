package dosser.lagerverwaltung.lagerverwaltung.service;

import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

@Service
public class Tastatur {
	
	// geklaut  
	// https://entwickler-forum.de/showthread.php/61067-If-Schleife-pr%C3%BCfe-ob-Eingabe-ein-Int-ist
	
	public static Scanner sc = new Scanner(System.in);
	public static String liesString(String ausgabe) {
		String rs = null;
		boolean error = true;
		while (error) {
			
			System.out.println(ausgabe);
			try {
				rs = sc.next();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Bitte einen String eingeben!!");
			}
		}
		return rs;
	}

	public static int liesInt(String ausgabe) {
		int rs = 0;
		boolean error = true;
		while (error) {
			//Scanner sc = new Scanner(System.in);
			System.out.println(ausgabe);
			try {
				rs = sc.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Bitte eine Ganzzahl eingeben!!");
			}
		}
		
		return rs;
	}

	public static double liesDouble(String ausgabe) {
		double rs = 0;
		boolean error = true;
		while (error) {
			//Scanner sc = new Scanner(System.in);
			System.out.println(ausgabe);
			try {
				rs = sc.nextDouble();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Bitte eine Ganz- oder Kommazahl eingeben!!");
			}
		}
		return rs;
	}
	
	public static String liesAuswahl(String ausgabe) {
		String[] auswahlMoeglichkeiten = {"inventar","lager konfigurieren","artikel einlagen","artikel ausliefern",
				"positon","artikel inhalt","beenden"};
		String rs = null;
		boolean error = true;
		while (error) {
			
			System.out.println(ausgabe);
			try {
				rs = sc.next().toLowerCase();
				for(int i = 0; i < auswahlMoeglichkeiten.length;i++)
				{
					if(auswahlMoeglichkeiten[i].equals(rs))
					{
						rs = (i+1)+"";
					}
				}
				
				if(rs.equals("1")) rs = "artikelAnzeigen";
				else if(rs.equals("2")) rs = "konfigurieren";
				else if(rs.equals("3")) rs = "artikelEinlagern";
				else if(rs.equals("4")) rs = "artikelAusliefern";
				else if(rs.equals("5")) rs = "position";
				else if(rs.equals("6")) rs = "inhalt";
				else if(rs.equals("7")) rs = "menueAnzeigen";
				else if(rs.equals("8")) rs = "beenden";
				
				
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Bitte einen String eingeben!!");
			}
		}
		
		
		
		return rs;
	}
	
	
}