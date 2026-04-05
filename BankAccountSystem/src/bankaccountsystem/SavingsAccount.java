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
public class SavingsAccount extends Account {

    double interestRate;
        
    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Lai suat (%/nam): ");
        interestRate = sc.nextDouble();
        sc.nextLine();
        
    }
    
    @Override
    public void PrintInfo(){
        System.out.println("[Tiet kiem] So TK: " + accountNumber
                + " | Chu TK: " + ownerName
                + " | So du: " + balance
                + " | Lai suat: " + interestRate + "%"
                + " | Lai du kien: " + CalcInterest());
    }

    //lãi = số dư * lã suất /100
    @Override
    public double CalcInterest() {
        return balance * interestRate / 100;
    }
    
}
