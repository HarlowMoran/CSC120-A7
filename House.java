/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{

//**Attributes */
private ArrayList<Student> residents;
private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom, ArrayList<Student>residents){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<Student>(residents);
    
    System.out.println("You have built a house: 🏠");
  }
  /**
   * Checks for a dining room
   * @return hasDiningRoom
   */
  public boolean getDiningRoom(){
    return hasDiningRoom;
  } 
  /**
   * Checks for number of residents in the house
   * @return nResidents
   */
  public int nResidents(){
    int nResidents = residents.size();
    return nResidents;
  }
  /**
   * Checks if a student is a resident
   * @param s
   * @return true | false
   */
  public boolean isResident(Student s){
    if(residents.contains(s)){
      return true;
    }
    else {
      return false;
    }
  }
  
  /**
   * Adds a student to the list of residents if they are not already a resident
   */
  private void moveIn(Student s) {
    if(isResident(s) == true){
        System.out.println(s + " already lives in this house.");
    } 
    else {
        residents.add(s);
    }
  }

  /**
   * Removes a student from the list of residents if they were on the list
   * @param s
   * @return s
   */
  public Student moveOut(Student s) {
    if(isResident(s) == true){
        residents.remove(s);
        return s;
    }
    else {
      System.out.println(s + " did not live in this house.");
        return s;
    }
}


//  public static void main(String[] args) {
//  new House();
//  }

}