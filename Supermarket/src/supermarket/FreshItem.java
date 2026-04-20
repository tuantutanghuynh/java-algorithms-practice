/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class FreshItem extends Item {

    int expiryDays;

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();

        while (true) {
            System.out.print("Input Expriay Days:  ");
            try {
                expiryDays = Integer.parseInt(sc.nextLine().trim());
                if (expiryDays <= 0) {
                    throw new Exception("Expiry days must be > 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    @Override
    public String GetItemType(){
        return "FRESH";
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + "days" ;
    }
    
    @Override
   public void PrintInfo(){
        System.out.println("FRESH ITEM: ");
        super.PrintInfo();
        System.out.println(toString());
   }



}
