
package triangulos;

import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
     
       Scanner lector = new Scanner(System.in);
       double l1,l2,l3;
       System.out.print("Introduzca el Valor del Lado 1:");
       l1 = lector.nextDouble();
       System.out.print("Introduzca el Valor del Lado 2:");
       l2 = lector.nextDouble();
       System.out.print("Introduzca el Valor del Lado 3:");
       l3 = lector.nextDouble();
       if (l1==l2 && l2==l3)
               System.out.println("El Triangulo es Equilatero");
               else
               {
                       if (l1==l2 || l1==l3 || l2==l3)
                               System.out.println("El Triangulo es Isoceles");
                               else
                               {
                                       if (l1!=l2 || l1!=l3 || l3!=l2)
                                               System.out.println("El Triangulo es Escaleno");
                               }
               }
   }
  
}
    

