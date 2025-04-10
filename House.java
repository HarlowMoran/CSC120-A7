/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{

//**Attributes */
private ArrayList<Student> residents;
private boolean hasDiningRoom;
private boolean hasElevator;

/*Default constructor...builds a house */
public House() {
  this("<Name Unknown>", "<Address Unknown>", 1, false, new ArrayList<Student>(), false);
}

/* Overloaded constructor with address only */
public House(String address) {
  this(); // Call default constructor
  this.address = address; // Override address
}

/* Overloaded constructor with name, address */
public House(String name, String address) {
  this(); // Call default constructor
  this.address = address; // Override address
  this.name = name; //Override name
}

/* Full constructor */
public House(String name, String address, int nFloors, boolean hasDiningRoom, ArrayList<Student>residents, boolean hasElevator){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<Student>(residents);
    this.hasElevator = hasElevator;
    
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Default method
   * Checks for a dining room
   * @return hasDiningRoom
   */
  public boolean getDiningRoom(){
    return hasDiningRoom;
  } 

  /**
   * Overloaded method
   * takes the number of dining rooms and returns weather it is greater than 0
   * @param nDiningRooms
   * @return
   */
  public boolean getDiningRoom(int nDiningRooms){
    if(nDiningRooms >= 1){
      hasDiningRoom = true;
    }
    else{
      hasDiningRoom = false;
    }
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
   * @param s
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


/**
 * Overrides showOptions method to show all options within the house class
 */
@Override
public void showOptions() {
  System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown() \n + goToFloor(n) \n + getDiningRoom() \n + nResidents() \n + isResident(s) \n + moveIn(s) \n + moveOut(s)");
}

/**
 * Overrides goToFloors method to allow users to go to different floors based on whether or not the instance of house has an elevator
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


//  public static void main(String[] args) {
//  new House();
//  }

}