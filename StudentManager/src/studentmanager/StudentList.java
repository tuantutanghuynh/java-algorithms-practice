/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author tangh
 */
public class StudentList {
    ArrayList<Student> stList;
    
    public StudentList(){
        stList = new ArrayList<>();
}
    
    public void AddUndergraduate(){
        UndergraduateStudent s = new  UndergraduateStudent();
        s.Input();
        stList.add(s);
    }
    
    public void Addgraduate(){
        GraduateStudent s = new  GraduateStudent();
        s.Input();
        stList.add(s);
    }
    
    public void Show(){
        for(Student s : stList){
            s.ShowInfo();
        }
    }
    
     public void SortByGPA(){
        Collections.sort(stList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.gpa, o1.gpa);
            }
        });
    }

    public void FindAboveGPA(double gpa){
        for(Student s : stList){
            if(s.gpa > gpa){
                s.ShowInfo();
            } 
    }
        
}
}