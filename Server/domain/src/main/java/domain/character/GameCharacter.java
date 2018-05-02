package domain.character;

import domain.map.Location;
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
    private Location location;
    @OneToOne
    private Tendency tendency;

    protected GameCharacter() {
    }

    public GameCharacter(GameCharacterAttributes gameCharacterAttributes,
                         Location location,
                         Tendency tendency) {
        this.gameCharacterAttributes = gameCharacterAttributes;
        this.location = location;
        this.tendency = tendency;
    }

    @Override
    public String toString() {
        return String.format(
                "GameCharacter[id=%d, %s]",
                id, gameCharacterAttributes.getCharacter().getCharacterName());
    }

}
