package dosser.lagerverwaltung.lagerverwaltung.controller;


import dosser.lagerverwaltung.lagerverwaltung.service.Tastatur;
import dosser.lagerverwaltung.lagerverwaltung.view.UserInterface;
import org.springframework.stereotype.Controller;

@Controller
public class Logic {

	//TODO (Hannes): richtige springbpacket runterladen ohne web!!!!!!!!!!!!!!!

		
	I_lager lager;
	UserInterface menue;

	public Logic(I_lager lager, UserInterface menue) {
		this.lager = lager;
		this.menue = menue;
	}

	//@EventListener(ApplicationReadyEvent.class)
		public void start(){

		menue.menueAnzeigen();
		while(true)
		{
		
			String auswahl = Tastatur.liesAuswahl("Nr: ");
	
			if(auswahl.equals("artikelAnzeigen")) {
				lager.updatePositionen(menue.artikelAnzeigen(lager.getListe()));
			}
			else if(auswahl.equals("konfigurieren")) {
				menue.konfigurieren();
			}
			else if(auswahl.equals("artikelEinlagern")) {
				lager.neuerArtikelErstellen(menue.artikelEinlagern());
			}
			else if(auswahl.equals("artikelAusliefern")) {
				lager.loescheArtikel(menue.artikelAusliefern());
			}
			else if(auswahl.equals("position")) {
				lager.sucheArtikelName(menue.position());
			}
			else if(auswahl.equals("inhalt")) {
				int[] werte = menue.inhalt();
				lager.sucheArtikelPosition(werte[1], werte[2]);
			}
			else if(auswahl.equals("menueAnzeigen")) {
				menue.menueAnzeigen();
			}
			
			else if(auswahl.equals("beenden")) break;
			else System.out.println("Bitte eine zahl von 1-8 eingeben!!");
		}
			
		
	}

}
