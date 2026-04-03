/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanager;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class Student {
    String id;
    String name;
    Float gpa;
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input Student Id: ");
        id = sc.nextLine();
        
        System.out.println("Input Student name: ");
        name = sc.nextLine();
        
        System.out.println("Input Student's gpa: ");
        gpa = sc.nextFloat();
        sc.nextLine();
    }
    
    public void ShowInfo(){
        
    }
    
    public String GetRank(){
        if(gpa >= 8){
            return "Excellent";
        }else if (gpa >= 6.5){
            return "Good";
        }else if (gpa >=5){
            return "Average";
        }else { return "Bad";}
    }
}
