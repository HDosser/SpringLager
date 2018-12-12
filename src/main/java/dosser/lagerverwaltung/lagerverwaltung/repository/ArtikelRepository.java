package dosser.lagerverwaltung.lagerverwaltung.repository;

import dosser.lagerverwaltung.lagerverwaltung.model.Artikel;
import dosser.lagerverwaltung.lagerverwaltung.model.Position;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArtikelRepository extends CrudRepository<Artikel, Long> {
    //klapp kann zusammenstellen die funktionen
    Artikel findByBezeichnung(String bezeichnung);
    void deleteByBezeichnung(String bezeichnung);
    Artikel findByPosition(Position p);

}
