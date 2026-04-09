/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceday7;

/**
 *
 * @author tangh
 */
interface MathOp{
    int operate(int a, int b);
}
public class DemoLambda {
    public static void main(String[] args) {
        MathOp add = (a,b) -> a + b;
        MathOp mul = (a,b) -> a*b;
        
        System.out.println(add.operate(2, 3));
        System.out.println(mul.operate(2, 3));
    }
}
