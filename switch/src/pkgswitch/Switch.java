
package pkgswitch;


public class Switch {

  
    public static void main(String[] args) 
        {
            char departamento ='B';
            
            switch (departamento)
            {
            
            case 'A':
                System.out.println("Desarollo");
                break;
            case'B':
                System.out.println("Recursos Humanos");
                break;
            case'C':
                    System.out.println("Finanzas");
                      break;
            case 'D':
                System.out.println("Mercadeo");
            default ;
                    System.out.println("Departamento Invalido");
            }
                System.out.println("Codigo para el departamento es"+ departamento);
        }  
              
             
    
}
