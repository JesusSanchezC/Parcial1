
package triangulo3examen;

import java.util.Scanner;

public class Triangulo3examen {

    public static void main(String[] args) {
  
     Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese lado");
       float a=sc.nextFloat();
       System.out.println("Ingrese lado");
       float b=sc.nextFloat();
       System.out.println("Ingrese lado");
       float c=sc.nextFloat();
       if((Math.abs(a - c) < b) && (b < (a + c))) {
            System.out.println("Si Forma un triangulo");
       }else{
           
       }
      
        if((a + b) > c && (a+c)>b && (b+c)>a) {
            System.out.println("Es isoceles");
            if((a+ c)>b&& (a+b)<c&& (b+c)>a){}
       else{
        System.out.println("Es escaleno");
        
        
       }
     }
    }
}



    
    

