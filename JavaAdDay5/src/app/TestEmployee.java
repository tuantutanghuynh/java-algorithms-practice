package app;

import dao.EmployeeDAO;
import model.Employee;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println(" Test Employee");
            System.out.println(" 1. Create new Employee");
            System.out.println(" 2. Delete Employee");
            System.out.println(" 3. Show All Employee");
            System.out.println(" 4. Search By Name");
            System.out.println(" 5. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    try {
                        System.out.print("ID (max 5 chars): ");
                        String id = sc.nextLine().trim();
                        if (id.isEmpty() || id.length() > 5)
                            throw new Exception("ID must be 1-5 characters.");
                        if (dao.findByID(id) != null)
                            throw new Exception("ID already exists.");

                        System.out.print("Name: ");
                        String name = sc.nextLine().trim();
                        if (name.isEmpty())
                            throw new Exception("Name must not be empty.");

                        System.out.print("Salary: ");
                        float salary = Float.parseFloat(sc.nextLine().trim());
                        if (salary <= 1)
                            throw new Exception("Salary must be greater than 1.");

                        System.out.print("Department (HR/DEV/SALE): ");
                        String dep = sc.nextLine().trim().toUpperCase();
                        if (!dep.equals("HR") && !dep.equals("DEV") && !dep.equals("SALE"))
                            throw new Exception("Department must be HR, DEV or SALE.");

                        if (!dao.insert(new Employee(id, name, salary, dep))) {
                            System.out.println("Error: Failed to create employee.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "2":
                    try {
                        System.out.print("Enter ID to delete: ");
                        String deleteId = sc.nextLine().trim();
                        if (!dao.delete(deleteId)) {
                            System.out.println("Error: Employee not found or delete failed.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "3":
                    try {
                        List<Employee> list = dao.findAll();
                        if (list.isEmpty()) {
                            System.out.println("Error: No employees found.");
                        } else {
                            for (Employee e : list) {
                                System.out.println(e);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "4":
                    try {
                        System.out.print("Enter name to search: ");
                        String searchName = sc.nextLine().trim();
                        List<Employee> result = dao.findByName(searchName);
                        if (result.isEmpty()) {
                            System.out.println("Error: No employees found.");
                        } else {
                            for (Employee e : result) {
                                System.out.println(e);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
