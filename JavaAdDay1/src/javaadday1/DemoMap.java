/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tangh
 */
public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        //tự định nghĩa index (key , value)
        //key không được trùng, nếu trùng sẽ ghi đè value mới
        
        map.put("A", 1);
        map.put("B", 2);
        map.put("A", 100); // ghi đè
        
        System.out.println(map);
        
        System.out.println(map.get("A"));
    }
}
