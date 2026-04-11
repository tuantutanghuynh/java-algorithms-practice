/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelsystem;

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
       
   }
}
