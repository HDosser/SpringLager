package dosser.lagerverwaltung.lagerverwaltung.controller;

import java.util.List;

public interface I_lager {
	
	List<String> getListe();
	void neuerArtikelErstellen(String[] werte);
	void sucheArtikelName(String name);
	void sucheArtikelPosition(int reihe, int splate);
	void loescheArtikel(String name);
	void updatePositionen(List<Integer[]> positionen);
	
	
}
