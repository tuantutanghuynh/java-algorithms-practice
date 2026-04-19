/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author tangh
 */
public class DemoArrayDeque {
    public static void main(String[] args) {
        //Queue + Stack ( 2 đầu)
        // không cho  null
        
        Deque<String> dq = new ArrayDeque<>();
        
        dq.addFirst("A");
        dq.addLast("B");
        
        
        System.out.println(dq);
        
    }
}
