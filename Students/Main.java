package Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            System.out.println("\n\n1. Add a student");
            System.out.println("2. Display all students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by name");
            System.out.println("5. Search by position");
            System.out.println("6. Update a student");
            System.out.println("7. Delete a student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // consume the new line character

            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.displayStudents();
                    break;
                case 3:
                    studentManager.searchByPrn();
                    break;
                case 4:
                    studentManager.searchByName();
                    break;
                case 5:
                    studentManager.searchByPosition();
                    break;
                case 6:
                    studentManager.updateStudent();
                    break;
                case 7:
                    studentManager.deleteStudent();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 8);
    }

}
