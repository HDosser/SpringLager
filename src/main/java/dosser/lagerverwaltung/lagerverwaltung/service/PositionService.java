package dosser.lagerverwaltung.lagerverwaltung.service;

import dosser.lagerverwaltung.lagerverwaltung.model.Position;
import dosser.lagerverwaltung.lagerverwaltung.repository.PositionenRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PositionService implements IntPositionService {

    private PositionenRepository positionenRepository;

    public PositionService(PositionenRepository positionenRepository) {
        this.positionenRepository = positionenRepository;
    }

    @Override
    public void replaceAllPositionen(List<Integer[]> liste) {

        List<Position> it = new ArrayList<Position>();

        for (Integer[] i: liste ) {
            it.add(new Position(i[0],i[1]));
        }

       // positionenRepository.deleteAll();
        positionenRepository.saveAll(it);
    }

    @Override
    public void savePosition(Position position) {
        positionenRepository.save(position);

    }
}
