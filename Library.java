/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building{

  /**Attributes */
  private Hashtable<String, Boolean> collection;
  private boolean hasElevator;

  /**
   * defualt contructor...creates a library
   */
  public Library() {
    this("<Name Unknown>", "<Address Unknown>", 1, new Hashtable<String, Boolean>(), false);
  }

  /**
   * Overloaded constructor with address only
   * @param address
   */
  public Library(String address) {
    this(); // Call default constructor
    this.address = address; // Override address
  }

  /**
   * Overloaded constructor with name, address
   * @param name
   * @param address
   */
  public Library(String name, String address) {
    this(); // Call default constructor
    this.address = address; // Override address
    this.name = name; //Override name
  }

  /**
   * Full constructor
   * @param name
   * @param address
   * @param nFloors
   * @param collection
   * @param hasElevator
   */
  public Library(String name, String address, int nFloors, Hashtable<String, Boolean>collection, boolean hasElevator) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>(collection);
      this.hasElevator = hasElevator;
      System.out.println("You have built a library: 📖");
    }

    /**
     * adds a title to the library's collection
     * @param title
     */
    public void addTitle(String title){
      collection.put(title, true);
    }

    /**
     * removes a title from the library's collection
     * @param title
     * @return title
     */
    public String removeTitle(String title){
      collection.remove(title);
      return title;
    } 

    /**
     * changes the availablity of a book from available (true) to unavailable (false) as it is checked out
     * @param title
     */
    public void checkOut(String title){
      collection.replace(title, false);
    }

    /**
     * changes the availablity of a book from unavailable (false) to available (true) as it is returned
     * @param title
     */
    public void returnBook(String title){
      collection.replace(title, true);
    }

    /**
     * default method
     * checks if a book in the inventory has a certain title
     * @param title
     * @return true | false
     */
    public boolean containsTitle(String title){
      if(collection.contains(title)){
        return true;
      }
      else{
        return false;
      }
    }

    /**
     * overloaded method
     * checks if a book in the inventory has a certain title or is by a certain author
     * @param title
     * @return true | false
     */
    public boolean containsTitle(String title, String author){
      if(collection.contains(title) || collection.contains(author)){
        return true;
      }
      else{
        return false;
      }
    }


    /**
     * Checks is a certain book is available
     * @param title
     * @return true | false
     */
    public boolean isAvailable(String title){
      if(collection.contains(true)){
        return true;
      }
      else{
        return false;
      }
    }

    /**
     * prints out the library's collection
     */
    public void printCollection(){
      System.out.println(collection.toString());
    }

    /**
     * Overriden showOptions method that returns all of the options avaiable in the Library class
     */
    @Override
    public void showOptions() {
        System.out.println("Available options at " + this.name + " :\n + enter() \n + exit() \n + goUp() \n + goDown() \n + goToFloor(n):\n + addTitle(title) \n + removeTitle(title) \n + checkOut(title) \n + returnBook(title) \n + containsTitle(title) \n + isAvailable(title) \n + printCollection()");
    }

    /**
     * Overrides goToFloors method to allow users to go to different floors based on whether or not the instance of library has an elevator
     */
    @Override
    public void goToFloor(int floorNum) {
      if (hasElevator == true){
        if (this.activeFloor == -1) {
          throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (floorNum < 1 || floorNum > this.nFloors) {
          throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
        }
        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
      }else{
        throw new RuntimeException("This building does not have an elevator.");
      }
    }

//    public static void main(String[] args) {
//      new Library();
//    }
  
  }