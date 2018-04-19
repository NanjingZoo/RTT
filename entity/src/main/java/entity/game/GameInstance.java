package entity.game;

import entity.map.Map;
import entity.GameCharacter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class GameInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Set<GameCharacter> gameCharacterSet;
    private Map map;

    public GameInstance() {

    }

    public GameInstance(Set<GameCharacter> gameCharacterSet, Map map) {
        this.gameCharacterSet = gameCharacterSet;
        this.map = map;
    }

}
