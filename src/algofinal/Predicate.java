/*int 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Wanwan Zhang
 */
public class Predicate {
  private ArrayList<Clause> clausearry;
   private Variable [] variablearry;
 private Literal [] literalarry;
 

    public ArrayList<Clause> getClausearry() {
        return clausearry;
    }

    public void setClausearry(ArrayList<Clause> clausearry) {
        this.clausearry = clausearry;
    }

    public Literal[] getLiteralarry() {
        return literalarry;
    }

    public void setLiteralarry(Literal[] literalarry) {
        this.literalarry = literalarry;
    }

 
 
 
  public Predicate(int t,int v){
      variablearry = new Variable[v];
      for(int i = 0 ; i < v; i ++){
          variablearry[i]= new Variable();
      }
      
         literalarry= new Literal[2*v]; 
         
       for(int i = 0 ; i <2*v;i++){
           literalarry[i]= new Literal();
           if(i<v){
                  literalarry[i].setVariable(variablearry[i]);
           }else{
               literalarry[i].setVariable(Inverse(variablearry[i-v]));
           }
        
       }
       int literal = 2*v;
   
      
      clausearry = new ArrayList<>(); 
      
    //  System.out.println();
      for(int i=0;i<t;i++){
          
          Clause c = new Clause(literalarry,literal);
          clausearry.add(c);
      }
    
     
  }
  public Variable Inverse(Variable var){
      
        if(var.getValue()==0){
            var.setValue(1);
        }else if(var.getValue()==1){
           var.setValue(0);
        }
        return var;
    }
  
   public void printOut(int m ){
       System.out.println("The Predicate is: ");
       for (Clause c: clausearry){
           for(Literal l : c.getLiteralbarry3()){
              System.out.print(l.getVariable().getValue()); 
              
           }
           
       }
       System.out.println("Backtrack"+m+"times");
      }
   
   
   
   
   public boolean checkPredicate(Predicate p){
       //System.out.println(clausearry.size());
       for(Clause c : p.clausearry ){
           if(!c.checkClause(c.getLiteralbarry3())){
               return false;
           }
       }
       return true;
   }
   
   public void backstrack(Predicate p,int v,int m){
       
     if(v==0){
         p.printOut(m);
     }else{
         Literal[] literalarry = p.getLiteralarry();
      for(int i = 0 ; i < v; i ++){
         
          
          if(!checkPredicate(p)){ 
              revalue(literalarry[v-i].getVariable());
          }
      }
      m++;
      backstrack(p,v-1,m);
   }
   }
   public void revalue(Variable var){
       if(var.getValue()==1||var.getValue()==-1){
           var.setValue(0);
   }else{
          var.setValue(1);
       }
   }
}
