/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author macbookretina
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fibonacci objfibo= new Fibonacci();
        System.out.println("La sucesion Fibonacci de 12 mediante recursividad es" + objfibo.fibonacci(12
        ));
    }
    public int fibonacci(int n) {
        if(n==1 || n==2){
        
        return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
}
