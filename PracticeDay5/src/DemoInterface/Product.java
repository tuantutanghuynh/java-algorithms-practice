/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoInterface;

//interface không phải là 1 class
interface Product {
    //Biến trong interface phải có giá trị, thông thường là hằng số.
    final String SHOP_NAME = "van a";
    
    //tất cả các method trong interface đều phải là absrtract method
    void Input();
    void PrintInfo();
    
}
