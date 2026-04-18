/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday1;

/**
 *
 * @author tangh
 */

//generic cấp độ class
public class Box<T> { //<T> là biển kiểu T, đượic định nghĩa sau
    T value;
    
    void set(T value){
        this.value = value;
    }
    void getValue(){
        System.out.println("this is: " + value);
    }
}
