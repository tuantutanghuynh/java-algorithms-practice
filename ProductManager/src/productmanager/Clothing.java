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
public class Clothing extends Product {
    float size;
    String material;
    
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size: ");
        size = sc.nextFloat();
        sc.nextLine();
        System.out.println("Input material: ");
        material = sc.nextLine();
}
    
    public void ShowInfo(){
        System.out.println("Electronic -  ID: " + id +", Name: " + name + ", Price: "+ price + ", Quantity: " + quantity + ", Size:" + size + ", Material: " + material);
        
    }
    
}
