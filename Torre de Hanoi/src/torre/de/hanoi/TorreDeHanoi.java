/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torre.de.hanoi;

/**
 *
 * @author macbookretina
 */
public class TorreDeHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TorreDeHanoi objHanoi=new TorreDeHanoi();
    }
    public void torreDeHanoi(int discos,int torre1,int torre2, int torre3){
        if(discos==1){
            System.out.println("Mover Disco de Torre"+torre1+"a torre"+torre3);
        }else{
            torre.de.hanoi(discos-1,torre1,torre3,torre2);
            System.out.println("Mover Discos de Torre"+torre1+"a Torre"+ torre3);
            torre.de.hanoi(discos-1,torre1,torre3,torre2);
        }
    }   
    }

 
   

