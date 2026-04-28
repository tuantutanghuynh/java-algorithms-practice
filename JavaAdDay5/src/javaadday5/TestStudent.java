package javaadday5;

import java.util.List;
import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("STUDENT MANAGER");
            System.out.println(" 1. Add student");
            System.out.println(" 2. Show all students");
            System.out.println(" 3. Find student by ID");
            System.out.println(" 4. Update student");
            System.out.println(" 5. Delete student");
            System.out.println(" 0. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Name: ");
                    String name = sc.nextLine().trim();
                    System.out.print("Age: ");
                    int age = Integer.parseInt(sc.nextLine().trim());
                    dao.insert(new Student(0, name, age));
                    break;
                case "2":
                    List<Student> list = dao.findAll();
                    if (list.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : list) {
                            System.out.println(s.getId() + " | " + s.getName() + " | " + s.getAge());
                        }
                    }
                    break;
                case "3":
                    System.out.print("Enter ID: ");
                    int findId = Integer.parseInt(sc.nextLine().trim());
                    Student found = dao.findById(findId);
                    if (found != null) {
                        System.out.println(found.getId() + " | " + found.getName() + " | " + found.getAge());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case "4":
                    System.out.print("Enter ID to update: ");
                    int updateId = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("New name: ");
                    String newName = sc.nextLine().trim();
                    System.out.print("New age: ");
                    int newAge = Integer.parseInt(sc.nextLine().trim());
                    dao.update(new Student(updateId, newName, newAge));
                    break;
                case "5":
                    System.out.print("Enter ID to delete: ");
                    int deleteId = Integer.parseInt(sc.nextLine().trim());
                    dao.delete(deleteId);
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
