package entities.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MapLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected long mapId;
    protected long gameCharacterId;
    protected long xPosition;
    protected long yPosition;

    public MapLocation() {
    }

    public MapLocation(long xPos, long yPos) {
        this.xPosition = xPos;
        this.yPosition = yPos;
    }

    public long getId() {
        return id;
    }

    public long getXPosition() {
        return xPosition;
    }

    public long getYPosition() {
        return yPosition;
    }

}
