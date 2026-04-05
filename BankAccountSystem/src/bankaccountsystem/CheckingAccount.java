/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountsystem;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class CheckingAccount extends Account {
    
    double overdraftLimit; // hạn mức thâm chi(rút quá số dư)
    
    @Override
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Han muc tham chi: ");
        overdraftLimit =  sc.nextDouble();
        sc.nextLine();
    }
    
    @Override
    public void Withdraw(double amount){
        if( amount > 0 && amount <= balance + overdraftLimit){
            balance -= amount;
            System.out.println("Rut thanh cong, So du hien tai: " + balance + (balance < 0 ? "dang tham chi" : ""));                    
        }else {
            System.out.println("Vuot qua han muc tham chi " + overdraftLimit + "!");
        }
    }
    
    public void PrintInfo(){
        System.out.println("[Thanh toan] So TK: " + accountNumber  + ", Chu TK: " + ownerName + ", So du: " + balance + ", Han muc tham chi: " + overdraftLimit);
                
    }
 //tài khoản thanh toán lãi thấp hơn, chỉ tính lãi khi số du dương
    @Override
    public double CalcInterest() {
      return balance > 0 ? balance *0.01 : 0;
    }
    
}
