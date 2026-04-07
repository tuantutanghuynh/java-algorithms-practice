/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticeday6;

/**
 *
 * @author tangh
 */
public class DemoPrintStack {
    public static void main(String[] args) {
        try{
            int x = 10/0;
        }catch(Exception e){
            e.printStackTrace();//in chi tiết lỗi
        }
    }
}
