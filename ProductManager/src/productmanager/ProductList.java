/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productmanager;

import java.util.ArrayList;

/**
 *
 * @author tangh
 */
public class ProductList {
    ArrayList<Product> pdArr;
    
    public ProductList(){
        pdArr = new ArrayList<>();
}
    
    public void AddElectronic(){
        Electronics e = new Electronics();
        e.Input();
        pdArr.add(e);
    }
    
    public void AddClothing(){
        Clothing e = new Clothing();
        e.Input();
        pdArr.add(e);
    }
    
    public void AddFood(){
        Food e = new Food();
        e.Input();
        pdArr.add(e);
    }
    
    public void Show(){
        for(Product p : pdArr){
            p.ShowInfo();
        }
    }
    
    public void SearchByName(String name){
        for(Product p : pdArr){
            if(p.name.equalsIgnoreCase(name)){
                p.ShowInfo();
            }
        }
    }
    
    public double TotalValue(){
        double sum = 0;
        for(Product p : pdArr){
            sum += p.Calctotal();
        }return sum;
    }
}
