/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productmanager;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class Food extends Product {
    String expiryDate;
    
    @Override
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Expiry Date: ");
        expiryDate = sc.nextLine();
}
    
    public void ShowInfo(){
        System.out.println("Electronic -  ID: " + id +", Name: " + name + ", Price: "+ price + ", Quantity: " + quantity + ", Expiry Date: " + expiryDate);  
    }
}
