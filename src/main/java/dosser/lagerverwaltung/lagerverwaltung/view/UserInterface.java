package dosser.lagerverwaltung.lagerverwaltung.view;

import java.util.List;

public interface UserInterface {
	void konfigurieren();
	int[] inhalt();
	String position();
	void menueAnzeigen();
	List<Integer[]> artikelAnzeigen(List<String> liste);
	String[] artikelEinlagern();
	String artikelAusliefern();
}
