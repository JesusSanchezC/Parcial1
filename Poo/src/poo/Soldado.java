
package poo;

public class Soldado {
 String nombre= "Juan";
        String rango= "razo";
        String habilidad = "correr";  
        int Edad = 23;
        int peso= 64;
        String area= "portada";
        String turno= "matutino";
   
        
        
            
        
    

                   
            public void rango()
            {
        switch(rango)
        {
            case"Sargento":
                System.out.println("Armas");
                break;
            case"Comandante":
                System.out.println("Brincar");
                break;
            case"Teniente":
                    System.out.println("Punteria");
                      break;
            case "Razo":
                System.out.println("Correr");
                break;
            default:
                    System.out.println(" Ejercito");
                    
        }   }

 
    }


            
