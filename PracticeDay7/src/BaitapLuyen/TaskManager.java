/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapLuyen;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class TaskManager {
    User user = new User();
    int nextTaskId = 1;
    
    //add new task:
    void addTask(){
        Task task = new Task();
        task.id = String.valueOf(nextTaskId++);
        task.Input();
        user.tasks.add(task);
    }
  
    public void markDone(){
        System.out.println("Input task's Id: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (Task task : user.tasks){
            if(task.id.equals(id)){
                task.isDone = true;
                return;
            }
        }
          System.out.println("Id not found");
    }
    
    public void getAllTask(){
        for(Task task : user.tasks){
            System.out.println(task);
        }
    }
    
    public void getTaskToday(){
        System.out.println(
                user
                .tasks
                .stream()
                .filter(t -> t.deadline.isEqual(LocalDate.now()))
                .count());

       user.tasks.stream()
                .filter(t -> t.deadline.isEqual(LocalDate.now()))
                .forEach(System.out::println);
    }
    
    public void getCompleteTask(){
        System.out.println(user.tasks.stream().filter(t -> t.isDone).count());
        
        user.tasks.stream()
                .filter( t-> t.isDone)
                .forEach(System.out::println);
    }
    
    public void getOverDueTask(){
        System.out.println(
                user.tasks
                            .stream()
                            .filter(t -> !t.isDone && t.deadline.isBefore(LocalDate.now()))
                            .count());
        
          user.tasks.stream()
                .filter(t -> !t.isDone && t.deadline.isBefore(LocalDate.now()))
                .forEach(System.out::println);
    }
}
