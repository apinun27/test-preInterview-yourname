/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example01;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class OddEvenList {
    
    private ArrayList<Integer> list;
    
    public int add(int num){
        if(this.getList().indexOf(num)==-1){
              this.getList().add(num);
        }
        return this.getList().indexOf(num);
    }
     public boolean remove(int index){
         try{
             this.getList().remove(index);
             return true;
         }catch(IndexOutOfBoundsException e){
             return false;
         }
         
    }
     public ArrayList<Integer> getOdd(){
         ArrayList<Integer> datas=new ArrayList<Integer>();
         for(int i = 0;i< getList().size();i++) {
             if(i % 2 != 0){
                 datas.add(getList().get(i));
             }
         }
         return datas;
     }
      public ArrayList<Integer>  getEven(){
          
         ArrayList<Integer> datas=new ArrayList<Integer>();
         for(int i = 0;i< getList().size();i++) {
             if(i % 2 == 0){
                 datas.add(getList().get(i));
             }
         }
         return datas;
     }
        public ArrayList<Integer>  getRandom(){
          
         ArrayList<Integer> datas=new ArrayList<Integer>();
         ArrayList<Integer> dataList2=new ArrayList<Integer>();
         dataList2 = getList();
         while(dataList2.size()>0){
             Random rn=new Random();
             int index = rn.nextInt(dataList2.size());
             datas.add(dataList2.get(index));
             dataList2.remove(index);
         }
         
         return datas;
     }
         /**
     * @return the list
     */
    public ArrayList<Integer> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
}
