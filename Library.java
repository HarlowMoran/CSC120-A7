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

    public void addTitle(String title){
      collection.put(title, true);
    }

    public String removeTitle(String title){
      collection.remove(title);
      return title;
    } 

    public void checkOut(String title){
      collection.replace(title, false);
    }

    public void returnBook(String title){
      collection.replace(title, true);
    }

    public boolean containsTitle(String title){
      if(collection.contains(title)){
        return true;
      }
      else{
        return false;
      }
    }

    public boolean isAvailable(String title){
      if(collection.contains(true)){
        return true;
      }
      else{
        return false;
      }
    }

    public void printCollection(){
      System.out.println(collection.toString());
    }
  
//    public static void main(String[] args) {
//      new Library();
//    }
  
  }