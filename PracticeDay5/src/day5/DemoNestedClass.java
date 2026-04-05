/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5;

/**
 *
 * @author tangh
 */
public class DemoNestedClass {
   // biến của class ngoài
    private String message =" Hello from outer";
    
//class trong
    class Inner{
        void Show(){
            System.out.println("Inner Class: " + message);
        }
    }
    //static nested class
    static class StaticNested{
        void Show(){
            System.out.println("This is static");
        }
    }
    
    //local class
    void demoLocalClass(){
        String localMsg = "Hello from local";
        class LocalClass{
            void Show(){
                System.out.println(localMsg);                
            }
        }
        LocalClass obj =  new LocalClass();
        obj.Show();
    }
    
    //anonymous class
    interface Greeting{
        void SayHello();
    }
    
    public static void main(String[] args) {
        //muốn gọi class trong 1 class phải tạo đối tượng của class ngoài sau đó từ đối tượng đó gọi class trong
        DemoNestedClass outer = new DemoNestedClass();
        DemoNestedClass.Inner inner = outer.new Inner();
        inner.Show();
        
        //gọi method trong inner static class
         DemoNestedClass.StaticNested sn = new DemoNestedClass.StaticNested();
         sn.Show();
         
         
         //gọi local
         outer.demoLocalClass();
         
         //gọi anonymous class
         Greeting g =  new Greeting(){
            @Override
            public void SayHello() {
                System.out.println("Hello from Anonymous class");
            }           
         };
           g.SayHello();
    }
}
