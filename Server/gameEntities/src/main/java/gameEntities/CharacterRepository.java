package gameEntities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<GameCharacter, Long> {
    List<GameCharacter> findByCharacterName(String characterName);
}
