package domain.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    //hexagonal grid map
    private long xAxis; //Max x
    private long yAxis; //Max y

    protected Map() {
    }

    public Map(String name, long xAxis, long yAxis) {
        this.name = name;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public long getXAxis() {
        return xAxis;
    }

    public long getYAxis() {
        return yAxis;
    }

}
