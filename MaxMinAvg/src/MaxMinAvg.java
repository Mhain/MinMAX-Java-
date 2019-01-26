/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Random;

public class MaxMinAvg {
    public static void main(String[]args){
    Random number=new Random();
    int [] arry=new int[10];
    int temp=arry[0];
    for(int i=1;i<arry.length;i++){
        arry[i]=(int)(Math.random()*100);
        
    }
    for(int i=1;i<arry.length;i++)
    {
       System.out.println(arry[i]);
        
    }
    for(int i=1;i<arry.length;i++){
        
        if(temp<arry[i]) {
            temp=arry[i];
        }
       
   
            } 
     System.out.println("max valu:"+temp);
    
}
}