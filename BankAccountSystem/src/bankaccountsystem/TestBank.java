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
public class TestBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountList list = new AccountList();
        String option;
        
        while(true){
            System.out.println("\n==============================");
            System.out.println("   QUAN LY NGAN HANG");
            System.out.println("==============================");
            System.out.println("1. Them TK tiet kiem");
            System.out.println("2. Them TK thanh toan");
            System.out.println("3. Nap tien");
            System.out.println("4. Rut tien");
            System.out.println("5. Hien thi danh sach");
            System.out.println("6. Tim theo so tai khoan");
            System.out.println("7. Tong so du toan he thong");
            System.out.println("8. TK tiet kiem so du cao nhat");
            System.out.println("9. Dem TK so du bang 0");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            option = sc.nextLine();
            
            switch(option) {
                case "1": 
                    list.AddSavings();
                    break;
                case "2":
                    list.AddChecking();
                    break;
                case "3":
                    System.out.println("Nhap so tai khoan: ");
                    String numDep = sc.nextLine();
                    System.out.println("So tien muon nap: ");
                    double amtDep = sc.nextDouble();
                    sc.nextLine();
                    list.Deposit(numDep, amtDep);
                    break;
                case "4":
                    System.out.println("Nhap so tai khoan: ");
                    String numWit = sc.nextLine();
                    System.out.println("So tien muon rut: ");
                    double amtWit = sc.nextDouble();
                    sc.nextLine();
                    list.Withdraw(numWit, amtWit);
                    break;
                case "5":
                    list.Show();
                    break;
                case "6":
                    System.out.println("Nhap so tk can tim: ");
                    String findNum = sc.nextLine();
                    list.FindByNumber(findNum);
                    break;
                case "7":
                    System.out.println("Tong so du: " + list.TotalBalance());
                    break;
                case "8":
                    list.FindMaxSavings();
                    break;
                case "9":
                    list.CountZeroBalance();
                    break;
                case "0":
                    System.out.println("Tam biet");
                    break;
                default :
                    System.out.println("Lua chon khong hop le vui long chon lai");
            }
        }
    }
}
