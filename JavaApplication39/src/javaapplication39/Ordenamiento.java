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
public class Ordenamiento {
  int i,j,temporal;
public Ordenamiento(){
    this.i=0;
    this.i=0;
    this.temporal=0;
    
}  
// Metodo Burbuja 
public void burbuja (int [] arreglo ){
    for(i=0;i<arreglo.length;i++){
          for (j=i+1;j<arreglo.length;j++){
              if(arreglo [i]>arreglo[j]){
                  temporal=arreglo[i];
                  arreglo[i]=arreglo[j];
                  arreglo[j]=temporal;
              }
          }
    }
}
//Método burbuja version 2

public void burbuja2 (int []arreglo) {
    for(i=1;i<arreglo.length;i++){
          for (j=0;j<arreglo.length-1;j++){
              if(arreglo [j]>arreglo[j+1]){
                  temporal=arreglo[i];
                  arreglo[j]=arreglo[j+1];
                  arreglo[j+1]=temporal;
              }
          }
    }
}
//Mostrar los datos del vector
public void mostrarArreglo(int [] arreglo){
    int k;
    for(k=0;k<arreglo.length;k++){
        System.out.println();
    }
}
}
