package domain.character;

import domain.game.GameInstance;
import domain.map.MapLocation;
import domain.tendency.Tendency;

import javax.persistence.*;

@Entity
public class GameCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private GameCharacterAttributes gameCharacterAttributes;
    @OneToOne
    private MapLocation mapLocation;
    @OneToOne
    private Tendency tendency;

    protected GameCharacter() {
    }

    public GameCharacter(GameCharacterAttributes gameCharacterAttributes,
                         MapLocation mapLocation,
                         Tendency tendency) {
        this.gameCharacterAttributes = gameCharacterAttributes;
        this.mapLocation = mapLocation;
        this.tendency = tendency;
    }

    @Override
    public String toString() {
        return String.format(
                "GameCharacter[id=%d, %s]",
                id, gameCharacterAttributes.getCharacter().getCharacterName());
    }

}
