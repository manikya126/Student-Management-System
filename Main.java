import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    service.addStudent(new Student(id, name, branch, cgpa));
                    break;

                case 2:
                    service.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    service.searchStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new Branch: ");
                    String newBranch = sc.nextLine();

                    System.out.print("Enter new CGPA: ");
                    double newCgpa = sc.nextDouble();

                    service.updateStudent(updateId, newName, newBranch, newCgpa);
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

