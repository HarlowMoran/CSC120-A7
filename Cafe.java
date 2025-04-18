/* This is a stub for the Cafe class */
public class Cafe extends Building{

    /**Atrributes */
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * defualt constructor... builds a cafe
     */
    public Cafe() {
        this("<Name Unknown>", "<Address Unknown>", 1, 0, 0, 0, 0);
    }

    /* Overloaded constructor with address only */
    public Cafe(String address) {
        this(); // Call default constructor
        this.address = address; // Override address
    }

    /* Overloaded constructor with name, address */
    public Cafe(String name, String address) {
        this(); // Call default constructor
        this.address = address; // Override address
        this.name = name; // Override name
    }

    /* Overloaded constructor with name, address and nFloors*/
    public Cafe(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }
    /* Full contructor */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * defualt method
     * decreases inventory after a coffee is sold
     * @param size
     */
    public void sellCoffee(int size){
        nCoffeeOunces -= size;
        nCups -= 1;
    }
    /**
     * Overloaded method with order requesting cream
     * @param size
     * @param nCreams
     */
    public void sellCoffee(int size, int nCreams){
        nCoffeeOunces -= size;
        this.nCreams -= nCreams; 
        nCups -= 1;
    }
    /**
     * Overloaded method with order requesting cream and sugar
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        nCoffeeOunces -= size;
        nSugarPackets -= nSugarPackets;
        nCreams -= nCreams;
        nCups -= 1;
    }

    /**
     * increases inventory after a restock
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces += nCoffeeOunces;
        nSugarPackets += nSugarPackets;
        nCreams += nCreams;
        nCups += nCups;
    }

    /**
     * Overrides showOptions method to show all options within the house class
     */
    @Override
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown() \n + goToFloor(n) :\n + sellCoffee(size, nSugarPackets, nCreams) \n + restock(nCoffeeOunces, nSugarPackets, nCreams, nCups)");
    }
    
    /**
     * Overrides goToFloor to prohibit people from going to different floors in the cafe class
     */
    @Override
    public void goToFloor(int floorNum) {
        System.out.println("Movements to other floors is not allowed within the cafe.");
    }
    
//    public static void main(String[] args) {
//        new Cafe();
//    }
    
}
