/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author macbookretina
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
 
		public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		int pila[]=new int[10]; int opcion; int fibo=0; int fibo2=1;
		int total=0;
		
		do {
		System.out.println("\nIngrese la opcion que se va a ejecutar:\n1.Suma\n2.Multiplicación\n3.Fibonnaci\n4.Salir");
		opcion = entrada.nextInt();
		switch(opcion) {
		case 1:
			for(int cont=0; cont <10;cont++) {
				System.out.print("Ingresa el "+(cont+1)+"° vector: ");
				pila[cont]=entrada.nextInt();
			}
			
			System.out.println("\nSuma");
			for(int cont=0; cont <10;cont++) {
				System.out.print(total+" + "+pila[cont]+" = ");
				total+=pila[cont];
				System.out.println(total);
			}
			break;
                }
                }while(opcion!=0);
                }
}