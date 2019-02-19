/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

/**
 *
 * @author macbookretina
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ordenamiento ordenar=new Ordenamiento();
        int vector1[]={5,6,3,44,22,1};
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo Ordenado");
        ordenar.burbuja(vector1);
        
    }
     
}
