package dosser.lagerverwaltung.lagerverwaltung.service;

import dosser.lagerverwaltung.lagerverwaltung.model.Position;

import java.util.List;

public interface IntPositionService {

    void replaceAllPositionen(List<Integer[]> liste);
    void savePosition(Position position);

}
