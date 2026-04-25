package javaadday4;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("    STUDENT MANAGER - Day 4   ");
            System.out.println(" 1. Add");
            System.out.println(" 2. Show");
            System.out.println(" 3. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Add Student ");
                    Student s = new Student();
                    s.input();
                    try {
                        dao.Insert(s);
                    } catch (SQLException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "2":
                    System.out.println(" All Students ");
                    try {
                        ArrayList<Student> list = dao.GetAll();
                        if (list.isEmpty()) {
                            System.out.println("No students found.");
                        } else {
                            for (Student st : list) {
                                System.out.println(st);
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
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
