package gameEntities.Characters;

import gameEntities.Maps.MapLocation;
import gameEntities.Behaviours.MovementBehaviourBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GameCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected long gameId;
    protected GameCharacterAttributes gameCharacterAttributes;
    protected MapLocation mapLocation;
    protected MovementBehaviourBase movementBehaviourBase;

    public GameCharacter() {
    }

    public GameCharacter(long gameId,
                         GameCharacterAttributes gameCharacterAttributes,
                         MapLocation mapLocation,
                         MovementBehaviourBase movementBehaviourBase) {
        this.gameId = gameId;
        this.gameCharacterAttributes = gameCharacterAttributes;
        this.mapLocation = mapLocation;
        this.movementBehaviourBase = movementBehaviourBase;
    }


}
