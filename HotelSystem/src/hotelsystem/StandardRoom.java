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
public class StandardRoom extends Room {
    String bedType;

    @Override
    public String GetRoomType() {
        return "Standard";
    }
    
    @Override
   public void Input(){
       Scanner sc = new Scanner(System.in);
       super.Input();
       while(true){
           System.out.println("Input Bed Type (Single/Double):");
           try{
               bedType = sc.nextLine().trim();
               if( bedType.isEmpty()){
                   throw new Exception("Bed Type must not be empty");
                   }
               if(bedType.equalsIgnoreCase("Single") ||bedType.equalsIgnoreCase("Double")){
                   break;
               }
               throw new Exception("Please enter 'Single' or 'Double' ");
           }catch (Exception e){
               System.out.println("Error: " + e.getMessage());
           }
           
       }
   }
   
    @Override
   public void PrintInfo(){
        System.out.println("STANDARD: ");
        super.PrintInfo();
        System.out.println("Bed Type: " + bedType);
   }
}
