/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehanoi;

/**
 *
 * @author macbookretina
 */
public class Torrehanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                Torrehanoi objHanoi = new Torrehanoi();
        objHanoi.Torres(6, 1, 2, 3);
    }
    //Creando método para solucionar las torres Hanoi

    public void Torres(int discos, int torre1, int torre2, int torre3) {

        //caso base
        if (discos == 1) {

            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3);
        } else {

            Torres(discos - 1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3);
            Torres(discos - 1, torre2, torre1, torre3);
        }
    }

}

    
    

