
package evidencia;


public class Evidencia {

    
    public static void main(String[] args) {
 
        int lado;
        int area;
        
        lado=4;
        
        area=lado*lado;
        
        NewClass newclass= new NewClass(lado); 
        newclass.Determinarelarea();
        System.out.println(area);
        
        
    }
    
}
