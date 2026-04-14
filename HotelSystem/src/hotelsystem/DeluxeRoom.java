/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelsystem;

import java.util.Scanner;

/**
 *
 * @author tangh
 */
public class DeluxeRoom extends Room{
    boolean hasSeaView;
    
    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();

        while (true) {
            System.out.print("  Sea view? (yes/no): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("yes") || input.equals("true"))  { hasSeaView = true;  break; }
            if (input.equals("no")  || input.equals("false")) { hasSeaView = false; break; }
            System.out.println("  Error: Please enter 'yes' or 'no'.");
        }
    }

    @Override
    public void PrintInfo() {
        System.out.println("[DELUXE]");
        super.PrintInfo();
        System.out.println("  Sea view: " + (hasSeaView ? "Yes" : "No"));
    }
        
    

    @Override
    public String GetRoomType() {
        return "Deluxe";
    }
    
    public double CalcCost(int nights){
        return pricePerNight * nights *1.5;
    }
}
