import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        // Create an instance of StudentService to manage students
        StudentService service = new StudentService();
        
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to display the menu and perform operations until the user exits
        while (true) 
        {
            // Displaying the menu options
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            // Reading the user's menu choice
            int choice = sc.nextInt();

            // Handling the user's choice with a switch statement
            switch (choice) 
            {
                case 1:
                    // Adding a new student
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    // Create a new student object and add it using the service
                    service.addStudent(new Student(id, name, branch, cgpa));
                    break;

                case 2:
                    // Displaying all students
                    service.displayStudents();
                    break;

                case 3:
                    // Searching for a student by ID
                    System.out.print("Enter ID to search: ");
                    service.searchStudent(sc.nextInt());
                    break;

                case 4:
                    // Deleting a student by ID
                    System.out.print("Enter ID to delete: ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    // Updating a student's details by ID
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new Branch: ");
                    String newBranch = sc.nextLine();

                    System.out.print("Enter new CGPA: ");
                    double newCgpa = sc.nextDouble();

                    // Update the student details using the service
                    service.updateStudent(updateId, newName, newBranch, newCgpa);
                    break;
                
                case 6:
                    // Exiting the application
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    // Handling invalid menu choices
                    System.out.println("Invalid choice.");
            }
        }
    }
}


