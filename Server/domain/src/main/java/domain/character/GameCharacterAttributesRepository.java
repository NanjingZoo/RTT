package domain.character;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameCharacterAttributesRepository extends CrudRepository<GameCharacterAttributes, Long> {
}
