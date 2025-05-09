import java.util.ArrayList;
import java.util.Hashtable;

public class CampusMap {

    ArrayList<Building> buildings;

    /**
     *  Default constructor, initializes empty ArrayList 
     */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }
    /**
     * Prints out a directory of all the buildings on the map
     */
    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }
    /**
     * Tests Campus Map by adding buildings
     * @param args
     */
    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Cafe("Compass Cafe", "7 Neilson Drive Northampton, MA 01063", 1, 50, 50, 50, 50));
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Campus Bookstore", "8 Green Street Northampton, MA 01063", 1, new Hashtable<String, Boolean>(), false));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive Northampton, MA 01063", 5, new Hashtable<String, Boolean>(), true));
        myMap.addBuilding(new Library("Alumnae Gynmasium", "83 Green Street Northampton, MA 01063", 3, new Hashtable<String, Boolean>(), true));
        myMap.addBuilding(new House("Scales House", "170 Elm Street Northampton, MA 01063", 4, true, new ArrayList<Student>(), false));
        myMap.addBuilding(new House("King House", "170 Elm Street Northampton, MA 01063", 4, true, new ArrayList<Student>(), false));
        myMap.addBuilding(new House("Northrop House", "49 Elm Street Northampton, MA 01063", 4, true, new ArrayList<Student>(), true));
        myMap.addBuilding(new House("Gillet House", "47 Elm Street Northampton, MA 01063", 4, true, new ArrayList<Student>(), true));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Drive Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("McConnell Hall", "2 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Cafe("Campus Center", "100 Elm Street Northampton, MA 01063", 3));

        System.out.println(myMap);
    }
    
}
