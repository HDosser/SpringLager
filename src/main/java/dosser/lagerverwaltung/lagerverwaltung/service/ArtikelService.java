package dosser.lagerverwaltung.lagerverwaltung.service;

import dosser.lagerverwaltung.lagerverwaltung.model.Artikel;
import dosser.lagerverwaltung.lagerverwaltung.model.Position;
import dosser.lagerverwaltung.lagerverwaltung.repository.ArtikelRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ArtikelService implements IntArtikelService {

    private ArtikelRepository artikelRepository;

    public ArtikelService(ArtikelRepository artikelRepository) {
        this.artikelRepository = artikelRepository;
    }

    //wenns artikel nicht gibe dan null zurück geben
    // moeglich auch ein tdo artikel zurueckgeben mit nur name preis id und verpackungseinheit
    @Override
    public Artikel getArtikelById(long id) {
        try {
            return artikelRepository.findById(id).get();
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public void saveArtikel(Artikel a) {
        artikelRepository.save(a);
    }

    @Override
    public boolean deleteArtikelByBezeichnung(String bezeichnung) {
        try{
            artikelRepository.deleteByBezeichnung(bezeichnung);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public Artikel getArtikelByPosition(int reihe, int splate) {
        return artikelRepository.findByPosition(new Position(reihe,splate));
    }

    @Override
    public Artikel getArtikelByBezeichnung(String bezeichnung) {
        try {
            return artikelRepository.findByBezeichnung(bezeichnung);
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public List<String> getAllArtikelBezeichnungen() {
        List<Artikel> liste = new ArrayList<Artikel>();
        artikelRepository.findAll().forEach(liste::add);

        List<String> stringListe = new ArrayList<String>();
        for (Artikel a: liste) {
            stringListe.add(a.getBezeichnung());
        }

        return stringListe;
    }

    @Override
    public List<Artikel> getAllArtikel() {
        List<Artikel> liste = new ArrayList<Artikel>();
        artikelRepository.findAll().forEach(liste::add);

        return liste;
    }


}
