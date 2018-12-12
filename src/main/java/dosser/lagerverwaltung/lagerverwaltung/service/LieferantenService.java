package dosser.lagerverwaltung.lagerverwaltung.service;

import dosser.lagerverwaltung.lagerverwaltung.model.Lieferant;
import dosser.lagerverwaltung.lagerverwaltung.repository.LieferantenRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class LieferantenService implements IntLieferantenService {

    private LieferantenRepository lieferantenRepository;

    public LieferantenService(LieferantenRepository lieferantenRepository) {
        this.lieferantenRepository = lieferantenRepository;
    }

    @Override
    public List<Lieferant> getAllLieferanten() {
        List<Lieferant> liste = (List<Lieferant>) lieferantenRepository.findAll();
        return liste;
    }

    @Override
    public void saveLieferant(Lieferant lieferant) {
        lieferantenRepository.save(lieferant);
    }

    @Override
    public Lieferant getLieferntById(long id) {
        return lieferantenRepository.findById(id).get();
    }

    @Override
    public Lieferant getRandomLieferant() {
        Random random = new Random();
        long i = random.nextInt((int)lieferantenRepository.count());
        return lieferantenRepository.findById(i).get();

    }
}
