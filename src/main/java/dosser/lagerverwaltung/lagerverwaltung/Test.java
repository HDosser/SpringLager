package dosser.lagerverwaltung.lagerverwaltung;

import dosser.lagerverwaltung.lagerverwaltung.model.Artikel;
import dosser.lagerverwaltung.lagerverwaltung.model.Lieferant;
import dosser.lagerverwaltung.lagerverwaltung.repository.ArtikelRepository;
import dosser.lagerverwaltung.lagerverwaltung.repository.LieferantenRepository;
import dosser.lagerverwaltung.lagerverwaltung.repository.PositionenRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Test implements ApplicationListener<ContextRefreshedEvent> {


    private LieferantenRepository lieferantenRepository;
    private ArtikelRepository artikelRepository;
    private PositionenRepository positionenRepository;

    public Test( LieferantenRepository lieferantenRepository, ArtikelRepository artikelRepository, PositionenRepository positionenRepository) {
        this.lieferantenRepository = lieferantenRepository;
        this.artikelRepository = artikelRepository;
        this.positionenRepository = positionenRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {


        Lieferant a = new Lieferant("UPS AT", "Irgendwo 4", "Wien", "364236463248");
        Lieferant b = new Lieferant("Bartolli", "FranzHuber 25", "Bozen", "+39 9329474763");
        Lieferant c = new Lieferant("DHL DE", "Friedrichshafen 12", "Hamburg", "+42 286487237856");
        Lieferant d = new Lieferant("UPS IT", "Rennweg 13", "Meran", "+39 0473765435");

        lieferantenRepository.save(a);
        lieferantenRepository.save(b);
        lieferantenRepository.save(c);
        lieferantenRepository.save(d);

        artikelRepository.save(new Artikel(199, "Matratze" , "1 stck", a));
        artikelRepository.save(new Artikel(38.90, "Kindersitz" , "1 stck", b));
        artikelRepository.save(new Artikel(23, "TischLampe" , "1 stck", c));
        artikelRepository.save(new Artikel(70, "Tablet",  "1 stck", d));
        artikelRepository.save(new Artikel(28.50, "Rucksack", "1 stck", a));
        artikelRepository.save(new Artikel(110, "Smartwatch", "1 stck", b));
        artikelRepository.save(new Artikel(33.90, "Akkuschrauber",  "1 stck", c));
        artikelRepository.save(new Artikel(60, "Staubsauger", "1 stck", d));


    }
}
