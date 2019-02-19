
package jesus;

import java.util.Scanner;

public class Jesus {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        
        System.out.println("Edad del Jugador");
       edad = entrada.nextInt();
       if(edad < 10){
           System.out.println("PUEDES JUGAR:");
           System.out.println("Minecraft ");
           System.out.println("Mario Kart");
           System.out.println("Fifa 17");
           System.out.println("Angry birds");
           }else{
           if(edad>12 && edad<18){
               System.out.println("PUEDES JUGAR:");
                System.out.println("Grand thef auto V");
                System.out.println("Fifa 17");
                System.out.println("Halo");
                System.out.println("Call of Duty");
                }else{
               if(edad>19 && edad<30){
                   System.out.println("PUEDES JUGAR:");
                 System.out.println("Grand thef auto V");
                System.out.println("Fifa 17");
                System.out.println("baldfishied");
                System.out.println("Call of Duty"); 
                   System.out.println("Grand thef auto San Andreas");
                   System.out.println("Gears of Wars");
               }
           }
       }
    }
    
}
