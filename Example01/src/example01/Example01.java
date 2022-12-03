/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example01;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Example01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OddEvenList number=new OddEvenList();
        number.setList(new ArrayList<>());
        for(int i=0;i<10;i++){
            System.out.println(number.add(i));
        }
         System.out.println(number.remove(10));
         System.out.println(number.remove(0));
          System.out.print("Odd= ");
         for (Integer num : number.getOdd()) {
               System.out.print(num+"  ");
         }
          System.out.println("");
           System.out.print("Even= ");
         for (Integer num : number.getEven()) {
               System.out.print(num+"  ");
         }
          System.out.println("");
           System.out.print("Random= ");
         for (Integer num : number.getRandom()) {
               System.out.print(num+"  ");
         }
         System.out.println("");
    }
    
}
