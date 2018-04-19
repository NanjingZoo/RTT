package entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameCharacterRepository extends CrudRepository<GameCharacter, Long> {

}
