/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productmanager;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class ProductManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductList list = new ProductList();
        String option;
        
        while(true){
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Electronic");
            System.out.println("2. Add Cloth");
            System.out.println("3. Add Food");
            System.out.println("4. Show");
            System.out.println("5. Search by name");
            System.out.println("6. Total value");
            System.out.println("7. Exit");
            System.out.println("Chon: ");
            option = sc.nextLine();
            
            switch(option){
                case "1":
                    list.AddElectronic();
                    break;
                case "2":
                    list.AddClothing();
                    break;
                case "3":
                    list.AddFood();
                    break;
                case "4":
                    list. Show();
                    break;
                case "5":
                    System.out.println("Nhap ten: ");
                    String name = sc.nextLine();
                    list.SearchByName(name);
                    break;
                case "6":
                    System.out.println("Total value:" +list.TotalValue());
                    break;
                case "7":
                    System.out.println("Bye!");
                    break;
                case "8":
                    System.out.println("Wrong option");
                                                                                       
            }
            
        }
    }
    
}
