package arreglo;

import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x,par,tamañoArreglo;
        System.out.print("Ingrese el tamaño del Arreglo: ");
        x=entrada.nextInt();
        int[] arreglo=new int[x];
        par=x%2;
        if(par>0){
            tamañoArreglo=(x/2)+1;
        }else{
            tamañoArreglo=(x/2);
        }
        int[] arreglo2=new int[tamañoArreglo];
       
        System.out.println("Teclea los "+x+" valores");
        for(int cont=0;x>cont;cont++){
            System.out.print((cont+1)+": ");
            arreglo[cont]=entrada.nextInt();
        }
    
        System.out.print("Elementos del arreglo: ");
        for(int cont=0;x>cont;cont++){
            System.out.print(arreglo[cont]+" ");
        }
        System.out.println();
        System.out.print("Elementos del nuevo arreglo: ");
     
        for(int cont=0;tamañoArreglo>cont;cont++){
            if(cont!=x-(1+cont)){
                arreglo2[cont]=arreglo[cont]+arreglo[x-(1+cont)];
            }else{
                if(par>0){
                    arreglo2[cont]=arreglo[((x-1)/2)];
                }
            }
            System.out.print(arreglo2[cont]+" ");
        }
    }
    
}
