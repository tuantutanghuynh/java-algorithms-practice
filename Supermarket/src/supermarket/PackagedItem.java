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
public class PackagedItem extends Item {

    String brand;
    float weight;

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();

        while (true) {
            System.out.print("Input Brand:  ");
            try {
                brand = sc.nextLine().trim();
                if (brand.isEmpty()) {
                    throw new Exception("Brand must not be empty.");
                }
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        while(true){
            System.out.print("Input weight:  ");
            try{
                weight= Float.parseFloat(sc.nextLine().trim());
                if (weight <= 0){
                    throw new Exception("Weight must be >0.");
                }
                break;
                }catch(NumberFormatException e){
                        System.out.println("Error: " +e.getMessage());
               }catch(Exception e){
                   System.out.println("Error: " + e.getMessage());
            }
        }
    }

    @Override
    public String GetItemType() {
        return "PACKAGED";
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", weight=" + weight + "kg";
    }

    @Override
    public void PrintInfo(){
        System.out.println("Packaged item: ");
        super.PrintInfo();
        System.out.println(toString());
    }
    
}
