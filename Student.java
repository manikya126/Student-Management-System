public class Student 
{
    private int studentId;
    private String name;
    private String branch;
    private double cgpa;

    public Student(int studentId, String name, String branch, double cgpa) 
    {
        this.studentId = studentId;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public int getStudentId() 
    {
        return studentId;
    }

    public String getName() 
    {
        return name;
    }

    public String getBranch() 
    {
        return branch;
    }

    public double getCgpa() 
    {
        return cgpa;
    }

    @Override
    public String toString() 
    {
        return studentId + " | " + name + " | " + branch + " | " + cgpa;
    }

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
