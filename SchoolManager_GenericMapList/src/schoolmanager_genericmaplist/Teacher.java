/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanager_genericmaplist;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class Teacher implements ITeachable {

    String id;
    String name;
    String subject;
    double salary;

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input ID :");
            try {
                id = sc.nextLine().trim();
                if (id.isEmpty()) {
                    throw new Exception("ID must not be empty!");
                }
                if (id.contains(" ")) {
                    throw new Exception("ID must not contain space");
                }
                if (!id.matches("[A-Za-z0-9]{3,5}")) {
                    throw new Exception("ID must be 3-10 alphanumeric characters");
                }
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            System.out.println("Input Name: ");
            try {
                name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    throw new Exception("Name must not be empty");
                }
                if (name.length() < 3) {
                    throw new Exception("Name must contain at least 3 characters");
                }
                if (name.matches(".*\\d.*")) {
                    throw new Exception("Name must not contain numbers");
                }
                if (name.contains("  ")) {
                    throw new Exception("Name must not contain consecutive spaces");
                }
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            System.out.println("Input Subject: ");
            try {
                subject = sc.nextLine().trim();
                if (subject.isEmpty()) {
                    throw new Exception("Subject must not be empty");
                }
                if (subject.length() < 3) {
                    throw new Exception("Subject must contain at least 3 characters");
                }
                if (subject.contains("  ")) {
                    throw new Exception("Subject must not contain consecutive spaces");
                }
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Input Salary: ");
            try {
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    throw new Exception("Salary must not be empty");
                }

                double salary = Double.parseDouble(input);

                if (Double.isNaN(salary) || Double.isInfinite(salary)) {
                    throw new Exception("Salary is not a valid finite number");
                }

                if (salary <= 0) {
                    throw new Exception("Salary must be greater than 0");
                }

                if (salary > 1_000_000_000) {
                    throw new Exception("Salary is too large");
                }

                this.salary = salary;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Salary must be a number");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    @Override
    public void PrintInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double CalcBonus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
