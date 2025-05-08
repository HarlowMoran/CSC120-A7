public class Course {

    // Attributes
    private String name;
    private String subjectNumber;
    private String meetingTime; 

    /**
     * Default constructor to create a course
     * @param name
     * @param subjectNumber
     * @param meetingTime
     */
    public Course(String name, String subjectNumber, String meetingTime) {
        this.name = name;
        this.subjectNumber = subjectNumber;
        this.meetingTime = meetingTime; 
    }

    /**
     * Gets the name of the course
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the subject number of the course
     * @return subjectNumber
     */
    public String getSubjectNumber() {
        return this.subjectNumber;
    }

    /**
     * Gets the meeting time of the course
     * @return meetingTime
     */
    public String getMeetingTime() {
        return this.meetingTime;
    }

    /**
     * @return the subjectNumber and the name and the meetingTime
     */
    public String toString() {
        return this.subjectNumber + ": " + this.name + " " + this.meetingTime; 
    }

    /**
     * Tests the course by adding classes
     * @param args
     */
    public static void main(String[] args) {
        Course csc120 = new Course("OOP", "CSC120", "TR 10:50");
        System.out.println(csc120);
    }
    
}
