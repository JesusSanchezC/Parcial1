
        import java.util.Arrays; 
import java.util.Scanner; 
public class act5 { 

public static void main(String[] args) { 
ManagerVector mc; 
mc=new ManagerVector(); 
int tam =0; 
Scanner sc = new Scanner(System.in); 
System.out.print("Digite el tamaño del vector: "); 
tam=sc.nextInt(); 
int[] v =mc.crearArreglo(tam);

System.out.println(Arrays.toString(mc.su... 

} 

}//fin clase vectores 


class ManagerVector{ 
private final Scanner teclado=new Scanner(System.in); 
    long[] su;
public ManagerVector() {} 


int[] crearArreglo(int tam){ 
int elementos=0; 
int vector[]= new int[tam]; 
for (int i = 0; i < tam; i++) { 
System.out.print("Digite un numero: "); 
elementos = teclado.nextInt(); 
vector[i]=elementos; 

} 
return vector; 
}//fin metodo crearArreglo 
void mostrar(int[] c){ 
System.out.println("Vector original "+Arrays.toString(c)); 

}//fin clase ManagerVector 
int[] sumar(int[] c){ 
int tamo=0; 
int i=0; 
if (c.length%2==0) { 
tamo=c.length/2; 
}else{ 
tamo=(c.length/2)+1; 
} 
int r[]=new int [tamo]; 
int ultimo=c[c.length-1]; 

while (ultimo!=c[i]&& i<r.length) { 
int suma = c[i]+ultimo; 
r[i]=suma; 
i++; 
ultimo=ultimo-1; 
} 
return r; 

}//fin metodo mostrar 
}
    
    

