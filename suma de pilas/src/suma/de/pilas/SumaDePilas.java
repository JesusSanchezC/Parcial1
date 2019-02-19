/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.pilas;

/**
 *
 * @author macbookretina
 */
public class SumaDePilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pila[]={1,2,3,4,5,6,7,8,9,10};
        int total=0;
                //sumar el valor de cada elemento al total
                for (int contador=0; contador<pila.length; contador++){
        total+=pila[contador];
        System.out.println(pila[contador]+"-->"+total);
    }
                
    }
    
}
