public class Student 
{
    // Private fields to store student information
    private int studentId;
    private String name;
    private String branch;
    private double cgpa;

    // Constructor to initialize the student object
    public Student(int studentId, String name, String branch, double cgpa) 
    {
        this.studentId = studentId;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    // Getter methods to access student information
    public int getStudentId() 
    {
        return studentId;
    }
    
    // Overriding the toString method to display student details
    @Override
    public String toString() 
    {
        return studentId + " | " + name + " | " + branch + " | " + cgpa;
    }

    // Setter methods to update student information
    public void setName(String name) 
    {
    this.name = name;
    }

    public void setBranch(String branch) 
    {
    this.branch = branch;
    }

    public void setCgpa(double cgpa) 
    {
    this.cgpa = cgpa;
    }

}


