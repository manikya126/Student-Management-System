import java.util.ArrayList;

public class StudentService 
{
    // ArrayList to store student objects
    private ArrayList<Student> students = new ArrayList<>();

    // Method to add a new student to the list
    public void addStudent(Student student) 
    {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Method to display all students in the list
    public void displayStudents() 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No student records found.");
            return;
        }
        for (Student s : students) 
        {
            System.out.println(s);
        }
    }

    // Method to search for a student by ID
    public void searchStudent(int id) 
    {
        for (Student s : students) 
        {
            if (s.getStudentId() == id) 
            {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to delete a student by ID
    public void deleteStudent(int id) 
    {
        boolean removed = students.removeIf(s -> s.getStudentId() == id);
        if (removed) 
        {
            System.out.println("Student deleted.");
        } 
        else 
        {
            System.out.println("Student not found.");
        }
    }

    // Method to update student details by ID
    public void updateStudent(int id, String name, String branch, double cgpa) 
    {
        for (Student s : students) 
        {
            if (s.getStudentId() == id) 
            {
                s.setName(name);
                s.setBranch(branch);
                s.setCgpa(cgpa);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

}

