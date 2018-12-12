package dosser.lagerverwaltung.lagerverwaltung.service;

import dosser.lagerverwaltung.lagerverwaltung.model.Lieferant;

import java.util.List;

public interface IntLieferantenService {

    List<Lieferant> getAllLieferanten();
    void saveLieferant(Lieferant lieferant);
    Lieferant getLieferntById(long id);
    Lieferant getRandomLieferant();
}
