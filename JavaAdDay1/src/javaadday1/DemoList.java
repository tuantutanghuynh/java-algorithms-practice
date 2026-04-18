/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tangh
 */
public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        //có thứ tự
        // chấp nhận trùng
        // truy cập được bằng index
        //thêmphần  tử
        
        list.add("A");
        list.add("B");
        list.add("A");
        
        System.out.println(list);
        
        //xóa phần tử
        list.remove(0);
        System.out.println(list);
    }
}
