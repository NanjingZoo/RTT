package service;

import domain.map.Location;

public class Tile {

    public Location location;
    public boolean open;
    public boolean closed;
    public boolean walkable;
    public long gValue;

    public Tile(Location location){
        this.location = location;
        this.open = false;
        this.closed = false;
        this.walkable = false;
        gValue = 0;
    }

    public Tile(Location location, boolean open, boolean closed, boolean walkable){
        this.location = location;
        this.open = open;
        this.closed = closed;
        this.walkable = walkable;
        gValue = 0;
    }
}
