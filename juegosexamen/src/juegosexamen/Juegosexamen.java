/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosexamen;

/**
 *
 * @author macbookretina
 */
public class Juegosexamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Nuevos Juegos");
    
    boolean continuar = true;
    int lecturaProducto, lecturaCantidad;
    
   
    Juego 005 = new Videojuego("Island Dead 4", 18.53, 6, true,);
    Juego 004 = new Videojuego("GTA V", 21.2, 20, true,);
    Juego 003 = new Videojuego("Minecraft", 30.2, 5, true,);
    Juego 002 = new Videojuego("Mario Bross", 35.11, 0, false,);
    
    
    Juego catalogo[] = new Juego[Juego.dimesionArray];
   
    Gestion gestion = new Gestion();
        Juego juego1;
 
    
    catalogo[0] = juego1;
    catalogo[1] = juego2;
    catalogo[2] = juego3;
    catalogo[3] = juego4;
    catalogo[4] = juego5;
    
    do {
      System.out.println("\n\nIntroduzca la opción que desea realizar:\n"
                +"1. Mostrar productos\n"
                +"2. Vender productos\n"
                +"3. Mostrar caja\n"
                +"SALIR --> Pulse cualquier otro número\n"
                );
      switch (Leer.datoInt()) {
        case 1:
          gestion.mostrarProductos(catalogo);
          break;
        case 2:
          System.out.println("¿Que producto desea comprar?");
          gestion.mostrarNombreProductos(catalogo);
          lecturaProducto=Leer.datoInt();
          System.out.println("¿Cuánta cantidad desea comprar?");
          lecturaCantidad=Leer.datoInt();
          //Se carga el producto y la cantidad solicitada por el usuario
          gestion.comprarProducto(catalogo, lecturaProducto, lecturaCantidad);
          break;
        case 3:
          System.out.println(gestion.mostrarCaja() +" €");
          break;
        default:
        
          continuar=false;
      }
      
    } while(continuar);
    
    System.out.println("---- Gracias por usar la aplicación. ----");
 
  }

    private static class Gestion {

        public Gestion() {
        }

        private void mostrarNombreProductos(Juego[] catalogo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void comprarProducto(Juego[] catalogo, int lecturaProducto, int lecturaCantidad) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String mostrarCaja() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void mostrarProductos(Juego[] catalogo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
 
}
    
    

