package dosser.lagerverwaltung.lagerverwaltung.view;

import dosser.lagerverwaltung.lagerverwaltung.service.Tastatur;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class Menue implements UserInterface {
	
	
	public Menue()
	{
			
	}
	
	public void menueAnzeigen()
	{
		System.out.println("#################################");
		System.out.println("#          Menue                #");
		System.out.println("#-------------------------------#");
		System.out.println("#                               #");
		System.out.println("# 1. Inventar                   #");
		System.out.println("# 2. Lager kofigurieren         #");
		System.out.println("# 3. Artikel einlagern          #");
		System.out.println("# 4. Artikel ausliefern         #");
		System.out.println("# 5. Position                   #");
		System.out.println("# 6. Artikel Inhalt             #");
		System.out.println("# 7. Hilfe                      #");
		System.out.println("#                               #");
		System.out.println("#-------------------------------#");
		System.out.println("# 8. Beenden                    #");
		System.out.println("#                               #");
		System.out.println("#################################");
		System.out.println();
				
	}

	public List<Integer[]> artikelAnzeigen(List<String> liste)
	{
		return AnzeigeLager.anzeige(liste);
	}
	
	public void konfigurieren() {
		int spalten = Tastatur.liesInt("Wie viele Splaten soll die Anzeige haben??");
		int reihen = Tastatur.liesInt("Wie viele Reihen soll die Anzeige haben??");
		AnzeigeLager.setSpalten(spalten);
		AnzeigeLager.setReihen(reihen);
	}
	
	public String[] artikelEinlagern() {
		double preis = Tastatur.liesDouble("Preis :");
		String bezeichnung = Tastatur.liesString("Bezeichnung :");
		String verpackung  = Tastatur.liesString("Verpackungseinheit :");
		
		String rueckgabe[] = {preis+"",bezeichnung,verpackung};
		return rueckgabe;
		
	}
	public String artikelAusliefern()
	{
		String artikel = Tastatur.liesString("Welcher Artikel soll ausgeliefert werden?? (name)");
		return artikel;
	}

	public int[] inhalt() {
		System.out.println("Artikel nach Position suchen:");
		int reihe = Tastatur.liesInt("In welcher Reihe befindet sich der Artikel ?");
		int spalte = Tastatur.liesInt("In welcher Spalte befindet sich der Artikel ?");
		
		int[] werte = {reihe,spalte};
		return werte;
		
	}
	public String position() {
		String suche =  Tastatur.liesString("Nach welchen artikel suchen Sie?? (name)");
		return suche;
		
	}


	

}
