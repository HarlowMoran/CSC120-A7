/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building{

  /**Attributes */
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors, Hashtable<String, Boolean>collection) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>(collection);
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
     * @return
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
  
//    public static void main(String[] args) {
//      new Library();
//    }
  
  }