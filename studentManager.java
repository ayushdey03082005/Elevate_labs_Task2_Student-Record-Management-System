import java.util.ArrayList;

public class studentManager {
     private ArrayList<student> students = new ArrayList<>();
    private int nextId = 1;
 
    // ADD
    public void addStudent(String name, double marks) {
        students.add(new student(nextId++, name, marks));
        System.out.println("\n✅ student added successfully!");
    }
 
    // VIEW ALL
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\n⚠️  No student records found.");
            return;
        }
        printHeader();
        for (student s : students) {
            System.out.println(s);
        }
        printFooter();
    }
 
    // UPDATE
    public void updateStudent(int id, String newName, double newMarks) {
        student s = findById(id);
        if (s != null) {
            s.setName(newName);
            s.setMarks(newMarks);
            System.out.println("\n✅ student updated successfully!");
        } else {
            System.out.println("\n❌ student with ID " + id + " not found.");
        }
    }
 
    // DELETE
    public void deleteStudent(int id) {
        student s = findById(id);
        if (s != null) {
            students.remove(s);
            System.out.println("\n✅ student deleted successfully!");
        } else {
            System.out.println("\n❌ student with ID " + id + " not found.");
        }
    }
 
    // SEARCH
    public void searchStudent(int id) {
        student s = findById(id);
        if (s != null) {
            printHeader();
            System.out.println(s);
            printFooter();
        } else {
            System.out.println("\n❌ student with ID " + id + " not found.");
        }
    }
 
    // Helper: find by ID
    private student findById(int id) {
        for (student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
 
    // Helper: print table header
    private void printHeader() {
        System.out.println("\n+-------+----------------------+--------+");
        System.out.println("| ID    | Name                 | Marks  |");
        System.out.println("+-------+----------------------+--------+");
    }
 
    // Helper: print table footer
    private void printFooter() {
        System.out.println("+-------+----------------------+--------+");
    }
}
