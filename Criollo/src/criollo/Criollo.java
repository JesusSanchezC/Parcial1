
package criollo;

import java.util.Scanner;

public class Criollo {
    
    

    public static void main(String[] args) {
        
    int a=10;
    int b= 3;
    int c= a+b;
    
  Scanner entrada= new Scanner(System.in);
  NombreEstandar objeto= new NombreEstandar(10,3);
        System.out.println("Ingresar el valor de A");
  a=entrada.nextInt();
        System.out.println("Ingresar el valor de B");
        b=entrada.nextInt();
   NombreEstandar objeto2 = new NombreEstandar (a,b);
        objeto.Suma();
        objeto2.Suma();
    }
    
}
