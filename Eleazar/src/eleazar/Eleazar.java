/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleazar;

import java.util.Scanner;

/**
 *
 * @author macbookretina
 */
public class Eleazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese la edad del cliente");
        edad = entrada.nextInt();
        if(edad < 10){
            System.out.println("A continuación se presenta el menú para niños:");
            System.out.println("Hot dogs\nBanderillas\nGalletas");
        }else{
            if(edad>9 && edad<17){
                System.out.println("A continuacion se muestra el menu de adolescentes:");
                System.out.println("Desayunos\nHamburguesa");
            }else{
                System.out.println("A continuacion se muestra el menu de adultos");
                System.out.println("Bistec\nMariscos\nCaldo");
            }
        }
    }
    
}
