/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoAbstract;

/**
 *
 * @author tangh
 */
public class Laptop extends Product {
   
float weight;

 public Laptop(String name, int price, float weight){
        super(name, price);
        this.weight = weight;
    }
// đối với hàm dựng có tham số, nếu class cha có hàm dựng có tham số thì class con bắt buộc phải có hàm dựng chứa đủ tham số của class cha, và tjao object mới phải bỏ đủ tham số vào
    @Override
    void PrintInfo() {
        System.out.println("Name: " + name + ", Price: " + price+ ", Weight: " + weight + " kg");
    }
    
}
