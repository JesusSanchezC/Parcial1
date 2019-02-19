package examenfinal;

public class Conv {
    double medida, resultado;
    
    public Conv(){
        medida = 1;
    }
    
    public Conv(double m){
        medida = m;
    }
    
    public void PAC(){
        resultado = medida*2.54;
        System.out.println("El Resultado de la conversión es: "+resultado);
    }
    
    public void CAP(){
        resultado = medida*0.393701;
        System.out.println("El Resultado de la conversión es: "+resultado);
    }
    
    public void PAM(){
        resultado = medida*0.0254;
        System.out.println("El Resultado de la conversión es: "+resultado);
    }
    
    public void MAP(){
        resultado = medida*39.3701;
        System.out.println("El Resultado de la conversión es: "+resultado);
        
    }
}
