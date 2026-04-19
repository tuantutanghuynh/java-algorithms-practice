/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager<Student> sm = new StudentManager<>();
        String option;
        
        while(true){
            System.out.println("   STUDENT MANAGEMENT");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Show all students");
            System.out.println("4. Find by name");
            System.out.println("5. Filter by score");
            System.out.println("6. Calculate average score");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            
            option = sc.nextLine();
            
            switch(option){
                case "1":
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter score: ");
                    double score = sc.nextDouble();
                    sc.nextLine();
                    Student stu = new Student(id, name, score);
                    sm.Add(stu);
                    break;
                case "2":
                    sm.Remove();
                    break;
                case "3":
                    sm.Show();
                    break;
                case "4":
                    sm.FindByName();
                    break;
                case "5":
                    sm.FilterByScore();
                    break;
                case "6":
                    System.out.println("Average score: " + sm.AvgScore());
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
