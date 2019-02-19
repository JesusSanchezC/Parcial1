/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos;
// JESUS DEL CARMEN SANCHEZ COLLADO 2807785
/**
 *
 * @author macbookretina
 */
public class Videojuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juegos Nuevos = new Juegos();
       
        System.out.println(Nuevos.Juegos);
        String G = Nuevos.Juegos;
        
            switch(G)
                   
            {
        
            case "005":
                System.out.println("Island Dead 4");
                break;
            case"004":
                System.out.println("Grand Thef Auto V");
                break;
            case"003":
                    System.out.println("Minecraft");
                      break;
            case "002":
                System.out.println("Asphalt 8");
                break;
            case "001":
                System.out.println("Euro Truck Simulator 2");
                break;    
                
            default:
                    System.out.println(" Video Juegos");
            
                
        }
        }         
             
    
}
