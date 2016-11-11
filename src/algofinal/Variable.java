/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algofinal;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Wanwan Zhang
 */
public class Variable {
   private int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

 
   public Variable(){
       
    value = -1;
    
  }

    
//     public int Value(Variable [] varialblearry,int l){
//       int a =2;
//       //for(int i = 0 ; i < varialblearry.length;i++){
//           int v = varialblearry.length/2;
//           if(varialblearry[l].getValue()==-1){
//               a=1;
//           }else if (l <=v){
//               a =varialblearry[l].getValue();
//           }else{
//               a = Inverse(varialblearry[l].getValue());
//           }
//           
//       //}
//       return a;
//   }
//      public int Inverse(int a){
//        if(a==0){
//            a=1;
//        }else if(a==1){
//            a=0;
//        }
//        return a;
//    }
//   public int sValue(int l){
//        for(int i = 0; i <3; i++){
//            int v =varialblearry.length;
//            if(l<v){
//                =varialblearry[l-1];
//            }
//            if(vlist[i]==-1){
//                return 1;
//            }else if(i<l){
//                return vlist[i];
//            }else{
//                return Inverse(vlist[i]);
//            }
//        }
//       
//    }
    
}
