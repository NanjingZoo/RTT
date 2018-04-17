package entities.game;

import entities.map.Map;
import entities.character.GameCharacter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class GameInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected Set<GameCharacter> gameCharacterSet;
    protected Map map;

    public GameInstance() {

    }

    public GameInstance(Set<GameCharacter> gameCharacterSet, Map map) {
        this.gameCharacterSet = gameCharacterSet;
        this.map = map;
    }

}
