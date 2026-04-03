/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanager;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class StudentManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();

        String option;

        while(true){
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Undergraduate");
            System.out.println("2. Add Graduate");
            System.out.println("3. Show");
            System.out.println("4. Sort by GPA");
            System.out.println("5. Find GPA > X");
            System.out.println("6. Exit");
            System.out.print("Chon: ");

            option = sc.nextLine();

            switch(option){
                case "1":
                    list.AddUndergraduate();
                    break;

                case "2":
                    list.Addgraduate();
                    break;

                case "3":
                    list.Show();
                    break;

                case "4":
                    list.SortByGPA();
                    System.out.println("Da sap xep!");
                    break;

                case "5":
                    System.out.print("Nhap GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    list.FindAboveGPA(gpa);
                    break;

                case "6":
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Sai lua chon!");
            }
        }
    }
    
}
