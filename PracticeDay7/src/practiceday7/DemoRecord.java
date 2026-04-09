/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceday7;

//class nhắn
record User(String name, int age){}

public class DemoRecord {
    public static void main(String[] args) {
        User ul = new User("Van A", 20);
        System.out.println(ul.name());
    }
}
