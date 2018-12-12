package dosser.lagerverwaltung.lagerverwaltung.controller;

import dosser.lagerverwaltung.lagerverwaltung.model.Artikel;
import dosser.lagerverwaltung.lagerverwaltung.model.Lieferant;
import dosser.lagerverwaltung.lagerverwaltung.model.Position;
import dosser.lagerverwaltung.lagerverwaltung.service.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Lager implements I_lager {

	private IntArtikelService artikelService;
	private IntLieferantenService lieferantenService;
	private IntPositionService positionService;

	public Lager(IntArtikelService artikelService, IntLieferantenService lieferantenService, IntPositionService positionService) {
		this.artikelService = artikelService;
		this.lieferantenService = lieferantenService;
		this.positionService = positionService;
	}

	public void neuerArtikelErstellen(String[] werte) {
		double preis = Double.parseDouble(werte[0]);
		Lieferant l = lieferantenService.getRandomLieferant();
		artikelService.saveArtikel(new Artikel(preis,werte[1],werte[2], l ));
	}

	public void sucheArtikelName(String suche)
	{
		Artikel gefunden = artikelService.getArtikelByBezeichnung(suche);
		if(gefunden != null)
		{
			System.out.println("Position von "+suche+": ");
			System.out.println("Reihe :" +(gefunden.getPosition().getX()+1));
			System.out.println("Spalte :" +(gefunden.getPosition().getY()+1));
		}
		else System.out.println("Keinen Artikel mit der Bezeichnung "+suche+" gefunden!");
	}
	
	public void sucheArtikelPosition(int reihe, int spalte)
	{
		Artikel gefunden = artikelService.getArtikelByPosition(reihe,spalte);

		if(gefunden == null) System.out.println("Es wurde kein Artikel mit der position Reihe:"+reihe+" Splate:"+spalte+" gefunden!");

		else {
			System.out.println("Der Artikel mit der Position Reieh:"+reihe+" Spalte:"+spalte+" heist :"+gefunden.getBezeichnung());
		}
	}
	
	public void loescheArtikel(String nameArtikel)
	{

		boolean gefunden = artikelService.deleteArtikelByBezeichnung(nameArtikel);

		if(gefunden == false) System.out.println("Kein Artikel mit dem Namen"+nameArtikel+" gefunden!");
		else System.out.println(nameArtikel+" wurde ausgeliefert!");
	}

	public List<String> getListe() {
		List<String> liste = artikelService.getAllArtikelBezeichnungen();
		return liste;
	}
	 public void updatePositionen(List<Integer[]> positionen){

		positionService.replaceAllPositionen(positionen);
		List<Artikel> liste = artikelService.getAllArtikel();

		for(int i = 0; i < positionen.size();i++){

			Integer[] position = positionen.get(i);
			Artikel a = liste.get(i);
			a.setPosition(new Position(position[0],position[1]));
			artikelService.saveArtikel(a);
		}
	 }


	
	
	 
}
