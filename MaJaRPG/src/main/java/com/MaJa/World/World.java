import java.util.ArrayList;

/* Max Morrison & Jackson Kolb
    World class handles all of the World actions and generation
*/

public final class World {

    private String worldName;
    private ArrayList<Region> regionList;
    private Player player;

    public World(String worldName, ArrayList regionList, Player player) {
        this.worldName = worldName;
        this.regionList = regionList;
        this.player = player;
    }

    public getWorldName() {
        return worldName;
    }

    public getRegionList() {
        return regionList;
    }

    public getPlayer() {
        return player;
    }
}
