import java.util.ArrayList;

public class Student {
    // Attributes 
    private String name; 
    private String id; 
    private int classYear; 
    private ArrayList<Course> classes; 

    /**
     * Creates a student
     * @param name
     * @param id
     * @param classYear
     */
    public Student(String name, String id, int classYear) {
        this.name = name;
        this.id = id;
        this.classYear = classYear;
        this.classes = new ArrayList<>(); 
    }

    /**
     * Gets the name of the student
     * @return name
     */
    public String getName() {
        return this.name; 
    }

    /**
     * @return the student's name and ID and class year
     */
    public String toString() {
        return this.name + " ID: " + this.id + " Class Year: " + this.classYear;
    }

    /**
     * tests student by creating a new instance of student
     * @param args
     */
    public static void main(String[] args) {
        Student ab = new Student("Ab", "9909abc", 2014);
        System.out.println(ab);
        Course csc120 = new Course("OOP", "CSC120", "TR 10:50");
        ab.classes.add(csc120);
        System.out.println(ab.classes);
    }
    
}
