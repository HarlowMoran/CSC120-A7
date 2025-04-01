/* This is a stub for the Cafe class */
public class Cafe extends Building{

    /**Atrributes */
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * decreases inventory after a coffee is sold
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
    
//    public static void main(String[] args) {
//        new Cafe();
//    }
    
}
