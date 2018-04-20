package domain.map;

import domain.character.GameCharacter;

import javax.persistence.*;

@Entity
public class MapLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Map map;
    @OneToOne
    private GameCharacter gameCharacter;
    private long xPosition;
    private long yPosition;

    protected MapLocation() {
    }

    public MapLocation(Map map, long xPos, long yPos) {
        this.map = map;
        this.xPosition = xPos;
        this.yPosition = yPos;
    }

    public Map getMap() {
        return map;
    }

    public long getXPosition() {
        return xPosition;
    }

    public long getYPosition() {
        return yPosition;
    }

    @Override
    public String toString() {
        return String.format(
                "MapLocation[id=%d, x='%d', y='%d']",
                id, xPosition, yPosition);
    }

}
