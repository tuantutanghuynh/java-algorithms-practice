/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticeday6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tangh
 */
public class DemoThrows {
    static void ReadFile() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
    
    public static void main(String[] args) {
        try{
            ReadFile();
        }catch(IOException e) {
            System.out.println("File khong ton tai");
        }
    }
}
