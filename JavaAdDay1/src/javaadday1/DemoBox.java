/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday1;

/**
 *
 * @author tangh
 */
public class DemoBox {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("My string box");
        b.getValue();
        
        Box<Integer> b2 = new Box<>();
        b2.set(100);
        b2.getValue();
    }
}
