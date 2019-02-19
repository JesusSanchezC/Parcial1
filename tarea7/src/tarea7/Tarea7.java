/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7;

import java.util.Scanner;

/**
 *
 * @author macbookretina
 */
public class Tarea7 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int fac;
        System.out.println("Agrega el numero natural al que quieres saber el factorial");
        fac=entrada.nextInt();
        int a=Factorial(fac);
        System.out.println(a);
    }
    public static int Factorial (int n){
        double operacion;
        {
            if(n==1 ) || n==0)
            return 1;
            else
            return n*Factorial(n-1);
        }
        return 0;
       
    
    
    
}
