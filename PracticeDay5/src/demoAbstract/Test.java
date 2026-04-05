/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoAbstract;

/**
 *
 * @author tangh
 */
public class Test {
    public static void main(String[] args) {
        // tạo đối tượng từ class con
        Laptop lap = new Laptop("ASUS", 1000, 3);
        
        //tạo đối tượng từ class cha (abtract class) --> lỗi, ko tạo được đối tượng từ abstract class
        //Product pro = new Product();
    }
}
