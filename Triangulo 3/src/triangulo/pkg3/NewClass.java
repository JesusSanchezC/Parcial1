import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese lado");
       float a=sc.nextFloat();
       System.out.println("Ingrese lado");
       float b=sc.nextFloat();
       System.out.println("Ingrese lado");
       float c=sc.nextFloat();
       if((Math.abs(a - c) < b) && (b < (a + c))) {
            System.out.println("Si Forma un triangulo");
       }else{
        System.out.println("No Forma un triangulo");
       }
     }
}

