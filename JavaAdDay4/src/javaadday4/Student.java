package javaadday4;

import java.util.Scanner;

public class Student {

    int id;
    String sname;
    int age;

    public Student() {
    }

    public Student(int id, String sname, int age) {
        this.id = id;
        this.sname = sname;
        this.age = age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter name: ");
            try {
                sname = sc.nextLine().trim();
                if (sname.isEmpty()) {
                    throw new Exception("Name must not be empty");
                }
                if (sname.length() < 2) {
                    throw new Exception("Name must have at least 2 characters");
                }
                if (sname.matches(".*\\d.*")) {
                    throw new Exception("Name must not contain numbers");
                }
                if (sname.contains("  ")) {
                    throw new Exception("Name must not contain consecutive spaces");
                }
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Enter age: ");
            try {
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    throw new Exception("Age must not be empty");
                }
                age = Integer.parseInt(input);
                if (age <= 0 || age > 70) {
                    throw new Exception("Age must be between 1 and 70");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Age must be a number");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return id + " - " + sname + " - " + age;
    }
}
