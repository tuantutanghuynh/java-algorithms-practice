/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Human;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class StudentArray {
    Student[] students = new Student[10];
    int count =0;
    
    public void Add(){
        Scanner sc = new Scanner(System.in);
        
        Student stu = new Student();
        
        stu.Input(sc);
        
        students[count]=stu;
        count++;
    }
    
    public void Show(){
        for( int i = 0; i < count; i++){
            students[i].PrintInfo();
        }
}
    
    void FindMax(){       
        Student max = students[0];
        for(int i = 1; i<count; i++){
            if(students[i].GetFinalMark() > max.GetFinalMark()){
                
            }
        }
    }
}
