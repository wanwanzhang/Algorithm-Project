/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wanwan Zhang
 */
public class Clause {
   
 ///ramdom 3 variables into clause
   private Literal [] literalbarry3;
   ///all varibales

    public Literal[] getLiteralbarry3() {
        return literalbarry3;
    }

    public void setLiteralbarry3(Literal[] literalbarry3) {
        this.literalbarry3 = literalbarry3;
    }

   
   public Clause(Literal [] literalarry,int literal){
       //new varibles and get value of all variables

        literalbarry3= new Literal[3]; 

        List mylist = new ArrayList();
        
       for(int i = 0; i < 3; i++){
           int num=(int) (Math.random()*literal);
          if(!mylist.contains(num)){
             mylist.add(num); 
           // JOptionPane.showMessageDialog(null, num + " and " + i,  "title", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(literalarry.length);
             literalbarry3[i]= literalarry[num]; 
             //varialblearry3[i].Value(varialblearry, num);
          }else{
               i--;
           }  
       }
   }
   
   public boolean checkClause(Literal [] literalbarry3){
      // System.out.println( varialblearry3.length);
     
       for(int i = 0; i < literalbarry3.length; i ++){
           
           
           if(literalbarry3[i].getVariable().getValue()==1){
               return true;
           }
       }
       return false;
   }
   
   //
  


   
}
  



    
 
     

