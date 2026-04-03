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
public class UndergraduateStudent extends Student {
    int year;
    
    @Override
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input year: ");
        year = sc.nextInt();
}
    @Override
    public void ShowInfo(){
        System.out.println("St. ID: " + id + ", Name: " + name + ", GPA: " + gpa + ", Rank: " + GetRank() + ", Year" + year);
    }
}