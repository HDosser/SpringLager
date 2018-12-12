package dosser.lagerverwaltung.lagerverwaltung.repository;

import dosser.lagerverwaltung.lagerverwaltung.model.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionenRepository extends CrudRepository<Position, Long> {
}
