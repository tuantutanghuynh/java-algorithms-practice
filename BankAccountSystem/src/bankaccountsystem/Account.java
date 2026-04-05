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
public abstract class Account implements IBankable{
     protected String accountNumber;
     protected String ownerName;
     protected double balance;
     
     //Deposit(double)`, `Withdraw(double)`, `abstract double CalcInterest()
     
     public void Deposit(double amount){
         if(amount > 0){
             balance += amount;
             System.out.println("Nap tien thanh cong. So du hien tai: " + balance);
         }else{
             System.out.println("So tien nap phai lon hon 0!");             
         }
     }
     
     //Rút tiền có thể bị override o CheckingAcount (cho phép rút quua số dư)
     public void Withdraw(double amount){
         if(amount > 0 && amount<=balance){
             balance -= amount;
             System.out.println("Rut tien thanh cong. So du hien tai: " + balance);
         }else {
             System.out.println("So du khong du de rut!");
         }
     }
     
     //Absstract method: mỗi loại tài khoản tính lãi khác nhau, bắt buộc override
     public abstract double CalcInterest();
     
     //implement IBankable
     
     @Override
     public double GetBalance(){
         return balance;      
     }
    
     @Override
     public void Input(){
         Scanner sc = new Scanner(System.in);
         System.out.print("So tai khoan: ");
         accountNumber = sc.nextLine();
         System.out.println("Ten chu tai khoan: ");
         ownerName = sc.nextLine();
         System.out.println("So du ban dau: ");
         balance = sc.nextDouble();
         sc.nextLine();
     }
     
     @Override
     public void PrintInfo(){
         System.out.println("So TK: " + accountNumber + ", Chu TK: " + ownerName + ", So du: " + balance + ", Lai hang nam: " + CalcInterest());
         
     }
}
