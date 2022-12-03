/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.example1;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Example1 {
    
    public static void main(String[] args) {
        OddEvenList number=new OddEvenList();
        number.setList(new ArrayList<>());
        for(int i=0;i<10;i++){
            System.out.println(number.add(i));
        }
         System.out.println(number.remove(10));
         System.out.println(number.remove(0));
         for (Integer num : number.getOdd()) {
               System.out.print(num+"  ");
         }
          System.out.println("");
         for (Integer num : number.getEven()) {
               System.out.print(num+"  ");
         }
         
    }
}
