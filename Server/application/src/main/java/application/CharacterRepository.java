package application;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//@Component
public interface CharacterRepository extends CrudRepository<Character, Long> {
    List<Character> findByCharacterName(String characterName);
}
