/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticeday6;

/**
 *
 * @author tangh
 */
public class DemoCustomException extends Exception {
    public DemoCustomException (String message){
        super(message);
    }
}
class Test{
    static void checkAge(int age) throws DemoCustomException{
        if(age <18){
            throw new DemoCustomException("Khong du tuoi");
        }
        }
   
    public static void main(String[] args){
        try{
            checkAge(15);
        }catch(DemoCustomException e){
            System.out.println(e.getMessage());
        };
    }
        }