/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author tangh
 */
public class DemoQueue {
    public static void main(String[] args) {
        //FIFO: First In First Out
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        
        System.out.println(queue);
        
        System.out.println(queue.poll());
        
        System.out.println(queue);
    }
}
