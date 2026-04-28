/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday5;

//design pattern
public class StudentSingleton {

    private StudentSingleton() {
    }
    
    private static class Holder{
        private static final StudentSingleton INSTANCE = new StudentSingleton();
    }
    
   public static StudentSingleton getInstance(){
       return Holder.INSTANCE;
   }
}
