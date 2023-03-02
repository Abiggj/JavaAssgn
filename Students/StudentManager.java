package Students;

import java.util.Scanner;

public class StudentManager{
    private static Student[] students = new Student[100];
    private static int count = 0;
    private static Scanner input = new Scanner(System.in);

   
    public void addStudent() {
        System.out.print("Enter PRN: ");
        String prn = input.nextLine();
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter date of birth (dd/mm/yyyy): ");
        String dob = input.nextLine();
        System.out.print("Enter marks: ");
        int marks = input.nextInt();
        input.nextLine(); // consume the new line character

        Student s = new Student(prn, name, dob, marks);
        students[count++] = s;
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (count == 0) {
            System.out.println("No students to display!");
            return;
        }

        System.out.println("List of students:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public void searchByPrn() {
        if (count == 0) {
            System.out.println("No students to search!");
            return;
        }

        System.out.print("Enter PRN to search: ");
        String prn = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getPrn().equalsIgnoreCase(prn)) {
                System.out.println("Student found at position " + (i + 1) + ":");
                System.out.println(students[i]);
                return;
            }
        }

        System.out.println("Student with PRN " + prn + " not found!");
    }

    public void searchByName() {
        if (count == 0) {
            System.out.println("No students to search!");
            return;
        }

        System.out.print("Enter name to search: ");
        String name = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Student found at position " + (i + 1) + ":");
                System.out.println(students[i]);
            }
        }

        System.out.println("Student(s) with name " + name + " not found!");
    }

    public void searchByPosition() {
        if (count == 0) {
            System.out.println("No students to search!");
            return;
        }

        System.out.print("Enter position to search: ");
        int pos = input.nextInt();
        input.nextLine(); // consume the new line character

        if (pos >= 1 && pos <= count) {
            System.out.println("Student found at position " + pos + ":");
            System.out.println(students[pos - 1]);
        } else {
            System.out.println("Invalid position!");
        }
    }

    public void updateStudent() {
        if (count == 0) {
            System.out.println("No students to update!");
            return;
        }

        System.out.print("Enter PRN to update: ");
        String prn = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getPrn().equalsIgnoreCase(prn)) {
                System.out.println("Enter new marks for " + students[i].getName() + ":");
                int marks = input.nextInt();
                input.nextLine(); // consume the new line character

                students[i].setMarks(marks);
                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student with PRN " + prn + " not found!");
    }

    public void deleteStudent() {
        if (count == 0) {
            System.out.println("No students to delete!");
            return;
        }

        System.out.print("Enter PRN to delete: ");
        String prn = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getPrn().equalsIgnoreCase(prn)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null;
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student with PRN " + prn + " not found!");
    }
}
