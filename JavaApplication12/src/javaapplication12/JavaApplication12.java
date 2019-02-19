
package javaapplication12;

import java.util.Scanner;


public class JavaApplication12 {

   
    public static void main(String[] args) {
     
       
     Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese un numero");
       float a=sc.nextFloat();
       System.out.println("Ingrese un numero");
       float b=sc.nextFloat();
       System.out.println("Ingrese un numero");
       float c=sc.nextFloat();
       System.out.println("Ingrese un numero");
       float d=sc.nextFloat();
       System.out.println("Ingrese un numero");
       float e = sc.nextFloat();
       
       if((Math.abs(a - c) < b) && (b < (a + c) )) {
            System.out.println("Es mayor que");
       }else{
           
        System.out.println("Es menor que");
       }
     }
}

    
    

