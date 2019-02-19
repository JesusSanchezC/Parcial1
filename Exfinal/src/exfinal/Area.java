package examenfinal;

public class Area {
    double altura, base, base2, resultado;
    
    public Area(){
        altura=1;
        base=1;
        base2=2;
    }
    
    public Area(double a, double b, double b2){
        altura=a;
        base=b;
        base2=b2;
    }
    
    public void Circulo(){
        resultado=altura*3.1416*altura;
        System.out.println("Area del circulo es de: "+resultado);
    }
    
    public void Trapecio(){
        resultado= altura*((base+base2)/2);
        System.out.println("Area del trapecio es de: "+resultado);
    }
    
    public void Cuadrado(){
        resultado= altura*altura;
        System.out.println("Area del cuadrado es de: "+resultado);
    }
    
    public void Triangulo(){
        resultado = base*altura;
        System.out.println("Area del triangulo es de: "+resultado);
    }
}
