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
public class Product {
    String id;
    String name;
    float price;
    int quantity;
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id: ");
        id = sc.nextLine();
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input price: ");
        price = sc.nextFloat();
        sc.nextLine();
        System.out.println("Input quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();
    }
    
    public void ShowInfo(){
        
    }
    
    public double Calctotal(){
        return price * quantity;
        
    }
            
}
