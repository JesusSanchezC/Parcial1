/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author macbookretina
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
     private static int fibo1;
    public static void main(String[] args) {
        // TODO code application logic here
      int fibo=0,fibo2=1,i;
      for(i=1;i<=15;i++){
          System.out.print(fibo2+ " ");
          fibo2= fibo1 + fibo2;
          fibo1 = fibo2 - fibo1;
          
      }
       
      System.out.println();
    }
    
    
}
    

