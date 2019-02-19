package pkgfinal;

 import java.util.*;
public class Final {
  
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
      int n1, n2, n3, n4, n5;
      System.out.print("escribe Numero 1: "); 
      n1 = sc.nextInt();
      
    System.out.print("escribe Numero 2: "); 
      n2 = sc.nextInt();
      
      while(n2==n1)
      {
          System.out.print("escribe otro numero  ");
      n2 = sc.nextInt();
      }
    
      System.out.print("escribe numero 3: "); 
        n3 = sc.nextInt();
        
         while(n3==n1 || n3==n2)
      {
          System.out.print("escribe algun otro: ");
      n3 = sc.nextInt();
      
      
      }
        
     
    System.out.print("escribe el numero 4: "); 
        n4 = sc.nextInt();
        
         while(n4==n1 || n4==n2 ||n4==n3)
      {
          System.out.print("Ingresa  otro numero: ");
      n4 = sc.nextInt();
      }
      
    System.out.print("agrega el numero 5: "); 
        n5 = sc.nextInt();
        
         while(n5==n1 || n5==n2 || n5==n3 || n5==n4)
      {
          System.out.print("Ingresa  otro numero: ");
      n5 = sc.nextInt();
      }
     
         //Es mayor QUE//
        if((n1 > n2)&&(n1>n3) &&(n1>n4) && (n1>n5))
              System.out.println("Es mayor que: " + n1);
        
           
        if((n2 > n1)&&(n2>n3) &&(n2>n4) && (n2>n5))
              System.out.println("Es mayor que: " + n2);
        
        if((n3 > n1)&&(n3>n2) &&(n3>n4) && (n3>n5))
              System.out.println("Es mayor que: " + n3);
        
        if((n4 > n1)&&(n4>n2) &&(n4>n3) && (n4>n5))
              System.out.println("Es mayor que: " + n4);
        
        if((n5 > n1)&&(n5>n2) &&(n5>n3) && (n5>n4))
              System.out.println("Es mayor que: " + n5);
        
        
        // Es Menor QUE//
        if((n1 < n2)&&(n1<n3) &&(n1<n4) && (n1<n5))
              System.out.println("Es menor que: " + n1);
        
           
        if((n2 < n1)&&(n2<n3) &&(n2<n4) && (n2<n5))
              System.out.println("Es menor que: " + n2);
        
        if((n3 < n1)&&(n3<n2) &&(n3<n4) && (n3<n5))
              System.out.println("Es menor que: " + n3);
        
        if((n4 < n1)&&(n4<n2) &&(n4<n3) && (n4<n5))
              System.out.println("Es menor que: " + n4);
        
        if((n5<  n1)&&(n5<n2) &&(n5<n3) && (n5<n4))
              System.out.println("Es menor que: " + n5);
        

        
    }
}