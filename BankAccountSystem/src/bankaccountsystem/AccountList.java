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
public class AccountList {
    Account[] accounts = new Account[20];
    int count = 0;
    
    //thêm tài khoản
    public void AddSavings(){
        Scanner sc = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount();
        acc.Input();
        accounts[count] = acc;
        count ++;
        System.out.println("Them tk tiet kiem thanh cong.");
    }
    
    public void AddChecking(){
        Scanner sc = new Scanner(System.in);
        CheckingAccount acc= new CheckingAccount();
        acc.Input();
        accounts[count] = acc;
        count ++;
        System.out.println("Them tk thanh toan thanh cong");
    }
    
    //Hiển thị
    public void Show(){
        if (count == 0) {
            System.out.println("Chua co tai khoan nao");
            return;
        }
        System.out.println("Danh sach tai khoan");
        for (int i = 0 ; i < count ; i++){
            accounts[i].PrintInfo();
        }
    }
    
    //tìm kiếm
    public void FindByNumber( String num){
        boolean found = false;
        for( int i =0; i < count; i++){
            if(accounts[i].accountNumber.equals(num)){
                accounts[i].PrintInfo();
                found = true;
            }
        }
        if (!found){
            System.out.println("Khong tim thay tai khoan so:  " + num);
        }
    }
    
    //tính toán
    public double TotalBalance(){
        double total = 0;
        for (int i = 0; i < count; i++){
            total += accounts[i].GetBalance();
        }
        return total;
    }
    
    public void Deposit(String num, double amount){
        for(int i =0; i< count; i++){
            if(accounts[i].accountNumber.equals(num)){
                accounts[i].Deposit(amount);
                return;
            }
        }
        System.out.println("Khong tim thay tai khoan");
    }
    
    public void Withdraw(String num, double amount){
        for( int i = 0; i <count; i++){
            if(accounts[i].accountNumber.equals(num)){
                accounts[i].Withdraw(amount);
                return;
            }
        }
        System.out.println("Khong tim thay tai khoan");
    }
    
    //Tìm tk tiết kiệm(savingaccount) có số dư cao nhât
    //Kỹ thuật: lọc nhóm bằng instancof rồi so sánh max trong nhóm đó
    public void FindMaxSavings(){
        SavingsAccount max = null;
        
        for (int i = 0 ;  i < count ; i++){
            if (accounts[i] instanceof SavingsAccount){
                SavingsAccount sa = (SavingsAccount) accounts[i]; // ép kiểu
                if( max == null || sa.GetBalance() > max.GetBalance()){
                max = sa;
            }
            }
        }
    }
    
    public void CountZeroBalance(){
        int zeroCount = 0;
        for (int i =0 ; i < count ; i++){
            if ( accounts[i].GetBalance() == 0){
                zeroCount++;
            }
        }
        System.out.println("So tai khoan co so du bang 0: " + zeroCount);
    }
}
