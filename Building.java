public class Building {

    protected String name;
    protected String address;
    protected int nFloors;
    protected int activeFloor = -1; // Default value indicating we are not inside this building

    /**
     * Default constructor
     */
    public Building() {
        this("<Name Unknown>", "<Address Unknown>", 1);
    }

    /**
     * Overloaded constructor with address only
     * @param address
     */
    public Building(String address) {
        this(); // Call default constructor
        this.address = address; // Override address
    }

    /**
     * Overloaded constructor with name, address
     * @param name
     * @param address
     */
    public Building(String name, String address) {
        this(name, address, 1); // Call full constructor with hard-coded # floors
    }

    /**
     * Full constructor
     * @param name
     * @param address
     * @param nFloors
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /** Accessors */


    /**
     * Gets the name of the building
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the address of the building
     * @return address
     */
    public String getAddress() {
        return this.address;
    }
    /**
     * Gets the number of floors the building has
     * @return nFloors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /** Navigation methods */

    /**
     * Allows the user to enter the building if they are not already inside
     * @return this -> a pointer to the current building
     */
    public Building enter() {
        if (activeFloor != -1) {
            throw new RuntimeException("You are already inside this Building.");
        }
        this.activeFloor = 1;
        System.out.println("You are now inside " + this.name + " on the ground floor.");
        return this; // Return a pointer to the current building
    }
    /**
     * Allows the user to exit the building if they are inside of it.
     * @return null -> symbolizing we are no longer in any buildings
     */
    public Building exit() {
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before exit().");
        }
        if (this.activeFloor > 1) {
            throw new RuntimeException("You have fallen out a window from floor #" +this.activeFloor + "!");
        }
        System.out.println("You have left " + this.name + ".");
        this.activeFloor = -1; // We're leaving the building, so we no longer have a valid active floor
        return null; // We're outside now, so the building is null
    }

        /**
         * Allows the unser to travel to different floors.
         * @param floorNum
         */
    public void goToFloor(int floorNum) {
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (floorNum < 1 || floorNum > this.nFloors) {
            throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
        }
        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
    }

    /**
     * Allows the user to go up a floor.
     */
    public void goUp() {
        this.goToFloor(this.activeFloor + 1);
    }

    /**
     * Allows the user to go down a floor.
     */
    public void goDown() {
        this.goToFloor(this.activeFloor - 1);
    }

    /**
     * Shows the user the options they have available to them in this building.
     */
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)");
    }

    /**
     * @return *building name* is a *number of floors* story building located at *building address*
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address + ".";
    }

    /**
     * Tests the creation of a new building.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Test of Building constructor/methods");
        System.out.println("------------------------------------");
        
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
        fordHall.showOptions();

        System.out.println("-----------------------------------");
        System.out.println("Demonstrating enter/exit/navigation");
        System.out.println("-----------------------------------");
        fordHall.enter();
        fordHall.goUp();
        fordHall.goDown();
        fordHall.exit();
    }

}
