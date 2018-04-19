package domain.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MapLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long mapId;
    private long gameCharacterId;
    private long xPosition;
    private long yPosition;

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
