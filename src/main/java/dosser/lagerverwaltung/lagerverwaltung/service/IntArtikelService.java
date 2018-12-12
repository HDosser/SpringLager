package dosser.lagerverwaltung.lagerverwaltung.service;

import dosser.lagerverwaltung.lagerverwaltung.model.Artikel;

import java.util.List;

public interface IntArtikelService {
     Artikel getArtikelById(long id);
     void saveArtikel(Artikel a);
     boolean deleteArtikelByBezeichnung(String bezeichnung);
     Artikel getArtikelByPosition(int reihe, int splate);
     Artikel getArtikelByBezeichnung(String bezeichnung);
     List<String> getAllArtikelBezeichnungen();
     List<Artikel> getAllArtikel();
}
