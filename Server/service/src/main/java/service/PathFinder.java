package service;

import domain.map.Location;
import domain.map.Map;

import java.util.*;

public class PathFinder {

    private Map map;
    private Location startLocation;
    private Location destLocation;
    private List<Location> pathLocations;
    private List<Location> closedList;
    private List<Location> openList;

    public PathFinder(){

    }

    public PathFinder(Map map, Location startLocation, Location destLocation) {
        this.map = map;
        this.startLocation = startLocation;
        this.destLocation = destLocation;
        pathLocations = new ArrayList<Location>();
        FindPath();
    }

    public List<Location> FindPath() {
        List<Location> path_locations = new ArrayList<Location>();
        return path_locations;
    }

    long GetFValue(Tile currentTile, Tile destTile) {
        long g_value = GetGValue(currentTile, destTile);
        long h_value = GetHValue(currentTile, destTile);
        long f_value = g_value + h_value;
        return f_value;
    }

    long GetGValue(Tile currentTile, Tile destTile) {
        return currentTile.gValue;
    }

    long GetHValue(Tile currentTile, Tile destTile) {
        long x_diff = Math.abs(destTile.location.getXPosition() - currentTile.location.getXPosition());
        long y_diff = Math.abs(destTile.location.getYPosition() - currentTile.location.getYPosition());
        return x_diff + y_diff;
    }

    void GetAdjacentTiles(List<Tile> allTiles) {

    }

    void GetWalkableTiles(List<Tile> allTiles) {

    }

}
