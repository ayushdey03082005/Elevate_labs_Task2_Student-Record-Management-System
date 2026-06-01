import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentManager manager = new studentManager();
        System.out.println("==================================");
        System.out.println(" STUDENT RECORD MANAGEMENT SYSTEM ");
        System.out.println("==================================");

        while(true) {
            System.out.println("\n-----MENU-----");
            System.out.println("1. ADD STUDENTS ");
            System.out.println("2. VIEW ALL STUDENTS");
            System.out.println("3. UPDATE STUDENTS");
            System.out.println("4. DELELTE STUDENTS");
            System.out.println("5. SEARCH STUDENTS BY ID");
            System.out.println("6. EXIT");
            System.out.print("\n Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch(choice) {
                case 1: // ADD
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine().trim();
                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }
                    double marks;
                    try {
                        System.out.print("Enter Marks (0-100): ");
                        marks = Double.parseDouble(sc.nextLine().trim());
                        if (marks < 0 || marks > 100) {
                            System.out.println("Marks must be between 0 and 100.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid marks. Please enter a number.");
                        break;
                    }
                    manager.addStudent(name, marks);
                    break;
 
                case 2: // VIEW ALL
                    manager.viewAllStudents();
                    break;
 
                case 3: // UPDATE
                    System.out.print("Enter Student ID to update: ");
                    int updateId;
                    try {
                        updateId = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                        break;
                    }
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine().trim();
                    if (newName.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }
                    double newMarks;
                    try {
                        System.out.print("Enter New Marks (0-100): ");
                        newMarks = Double.parseDouble(sc.nextLine().trim());
                        if (newMarks < 0 || newMarks > 100) {
                            System.out.println("Marks must be between 0 and 100.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid marks.");
                        break;
                    }
                    manager.updateStudent(updateId, newName, newMarks);
                    break;
 
                case 4: // DELETE
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId;
                    try {
                        deleteId = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                        break;
                    }
                    manager.deleteStudent(deleteId);
                    break;
 
                case 5: // SEARCH
                    System.out.print("Enter Student ID to search: ");
                    int searchId;
                    try {
                        searchId = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                        break;
                    }
                    manager.searchStudent(searchId);
                    break;
 
                case 6: // EXIT
                    System.out.println("\nExiting...");
                    sc.close();
                    return;
 
                default:
                    System.out.println("Invalid choice. Please select 1-6.");
            }
        }
    }
}