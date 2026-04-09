/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceday7;

/**
 *
 * @author tangh
 */
public class DemoSwitchExpression {
    public static void main(String[] args) {
        int day = 2;
        
        String result = switch (day){
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            default -> "Other";
        };
        System.out.println(result);
    }
}
