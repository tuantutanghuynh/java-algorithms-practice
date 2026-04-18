/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tangh
 */
public class DemoSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        // không cho trùng
        //không có index
        //không có thứ tự ("HashSet")
        
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("G");
        set.add("H");
        set.add("I");
        set.add("J");
        
        System.out.println(set);
        
        set.remove("A");
        System.out.println(set);
        
    }
}
