/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoAbstract;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public abstract class Product {
     //access modifer: public - default - protected -private
    //private: ra khỏi class cha ko còn truy cập được
    //protected: các class con kế thừa class cha xài được
    String name;
    int price;
    
    //constractor
    public Product(String name, int Price){
        this.name = name;
        this.price = price;
    }
    
    //method abstract là method không có body
    //những class nào kế thừa từ class abstract sẽ phải viết phần thân cho nó
    abstract void PrintInfo();
        
    
    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
        name = sc.nextLine();
        System.out.println("Input price:");
        price = sc.nextInt();
        
    }
}
