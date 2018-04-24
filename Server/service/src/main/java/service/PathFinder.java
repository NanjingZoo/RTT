package service;

import domain.map.Map;
import domain.map.MapLocation;

import java.util.*;

public class PathFinder {

    private Map map;
    private MapLocation startLocation;
    private MapLocation destLocation;
    private List<MapLocation> pathLocations;

    public PathFinder(Map map, MapLocation startLocation, MapLocation destLocation){
        this.map = map;
        this.startLocation = startLocation;
        this.destLocation = destLocation;
        pathLocations = new ArrayList<MapLocation>();
        FindPath();
    }

    public List<MapLocation> FindPath() {
        long x_diff = destLocation.getXPosition() - startLocation.getXPosition();
        long y_diff = destLocation.getYPosition() - startLocation.getYPosition();
        List<MapLocation> path_locations = new ArrayList<MapLocation>();
        return path_locations;
    }

    public MapLocation Seek(MapLocation targetPosition){
        MapLocation next_location = new MapLocation(map, 1, 1);
        return next_location;
    }

    public MapLocation Pursuit(MapLocation targetPosition){
        MapLocation next_location = new MapLocation(map, 1, 1);
        return next_location;
    }

    public MapLocation Evading(MapLocation targetPosition){
        MapLocation next_location = new MapLocation(map, 1, 1);
        return next_location;
    }

    public void test(){
        System.out.println("This is a test.");
    }

}
