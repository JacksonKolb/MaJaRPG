import java.util.ArrayList;

/* Max Morrison & Jackson Kolb
    Region class handles all of the Region objects for a World
*/


public final class Region {

    private String regionName;
    private ArrayList<Tile> tileList;
    private ArrayList<Region> neighborList;

    public Region(String regionName, ArrayList tileList, ArrayList neighborList) {
        this.regionName = regionName;
        this.tileList = tileList;
        this.neighborList = neighborList;
    }

    //TODO Add a getter for a specific tile in the Region list?
    public String getRegionName() {
        return regionName;
    }

    public ArrayList<Tile> getTileList() {
        return tileList;
    }

    public ArrayList<Region> getNeighborList() {
        return neighborList;
    }
}
