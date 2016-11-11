/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinal;

import java.util.Scanner;

/**
 *
 * @author Wanwan Zhang
 */
public class Solution {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         int v = sc.nextInt();
      int t = sc.nextInt();
      //int [] literallist = {1,10,12,15,4,6,9,4,15};
       Predicate p = new Predicate(t,v);
      
            p.backstrack(p,v,0);
  
    


//   p.printOut();

   }
 
      
}
