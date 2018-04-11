import java.util.ArrayList;

/* Max Morrison & Jackson Kolb
    Tile class handles all of the tile actions for a tile
*/


public final class Tile {

    private Region tileRegion;
    private boolean traversable;
    private boolean border;
    private ArrayList<Tile> neighborList;

    public Tile(Region tileRegion, boolean traversable, boolean border, ArrayList neighborList) {
        this.tileRegion = tileRegion;
        this.traversable = traversable;
        this.border = border;
        this.neighborList = neighborList;
    }

    public Region getTileRegion() {
        return tileRegion;
    }

    public boolean isTraversable() {
        return traversable;
    }

    public boolean isBorder() {
        return border;
    }

    public ArrayList<Tile> getNeighborList() {
        return neighborList;
    }
}
