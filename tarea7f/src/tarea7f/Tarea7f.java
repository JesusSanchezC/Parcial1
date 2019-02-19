package tarea7f;

/**
 *
 * @author macbookretina
 */
import java.math.*;
import java.util.*;
public class Tarea7f {

   
    public static void main(String[] args) {
        // TODO code application logic here
    int num=0;
    Scanner objeto=new Scanner(System.in);
        System.out.println("ingrese el numero que se quiere saber");
        num=objeto.nextInt();
        BigInteger factorial=new BigInteger("1");
        for(int i=1; i <= num; i++){
            factorial=factorial.multiply(new BigInteger(i + ""));
        }
        System.out.println("El factorial es: "+factorial);
    }
}
