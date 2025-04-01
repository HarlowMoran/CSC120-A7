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

  public boolean getDiningRoom(){
    return hasDiningRoom;
  } 

  public int nResidents(){
    int nResidents = residents.size();
    return nResidents;
  }

  public boolean isResident(Student s){
    if(residents.contains(s)){
      return true;
    }
    else {
      return false;
    }
  }
  
  private void moveIn(Student s) {
    if(isResident(s) == true){
        System.out.println(s + " already lives in this house.");
    } 
    else {
        residents.add(s);
    }
  }


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