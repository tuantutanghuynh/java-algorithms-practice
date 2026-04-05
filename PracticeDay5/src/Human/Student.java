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
public class Student extends Educator implements Human{
int objMark;
int asmMark;

   

    @Override
    public void Input(Scanner sc) {
        System.out.println("Input name:");
        name = sc.nextLine();
        System.out.println("Input Obj Mark:");
        objMark = sc.nextInt();
        sc.nextLine();
        asmMark = sc.nextInt();
    }
     
    public int GetFinalMark(){
        return (objMark + asmMark)/2;
    }

     @Override
    public void PrintInfo() {
         SayHello();
         System.out.println("Final Mark: " +  GetFinalMark() + "\n");      
    }
    
    @Override
    public void SayHello() {
        System.out.print("Hi My Name Is Hello "+ name );
    }
    
}
