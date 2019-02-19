package examenfinal;

public class Op {
    double numero, numero2, resultado;
    
    public Op(){
        numero=1;
        numero2=1;
    }
    
    public Op(double n, double n2){
        numero = n;
        numero2 = n2;
    }
    
    public void Exponenciacion(){
        resultado = Math.pow(numero, numero2);
        System.out.println("El resultado de elevar "+numero+" a una "+numero2+" potencia, es de: "+resultado);
    }
    
    public void Residuo(){
        resultado=numero%numero2;
        System.out.println("El resultado del residuo de "+numero+" entre "+numero2+" es de:"+resultado);
    }
    
    public void Producto(){
        resultado=numero*numero2;
        System.out.println("El resultado del producto de "+numero+" por "+numero2+" es de:"+resultado);
    }
    
    public void Division(){
        resultado=numero/numero2;
        System.out.println("El resultado de "+numero+" entre "+numero2+" es:"+resultado);
    }
    
}

