
package ordenador;


class Ordenador
{
    String marca;
    String procesador;
    int peso;
    String apagado;
    boolean encendido= false;
    boolean pantalla= false;
        
    public void encenderOrdenador()
    {
        if(encendido==true)
        {
            
            System.out.println("El ordenador ya esta encendido");
            
        }
        
        else{
            encendido=true;
            pantalla=true;
            System.out.println("El ordenador ha sido encendido");
        }
    }
    
    public void estadoordenador(){
        System.out.println("El estado del oredenador es el siguiente");
        System.out.println("Marca:"+marca);
        System.out.println("Procesador"+procesador);
        System.out.println("Peso:"+peso+"kg.");
        
        if (encendido == true)
        {
            System.out.println("El ordenador esta encendido");
        }
        else
        {
            System.out.println("El ordenador esta apagado");
        }
        if(pantalla== true)
        {
            System.out.println("La pantalla esta activada");
        }
        else
        {
            System.out.println("La pantalla esta desactivada");
            
        }
    }
    public String obtenerMarca()
    {
        return marca;
    }
    
    public void establecerMarca(String pepe)
    {
        marca= pepe;
    }
   
    public void apagarOrdendor()
    {
        if(encendido==true)
        {
            
            System.out.println("El ordenador ya esta apagado");
            
        }
        
        else{
            encendido=true;
            pantalla=true;
            System.out.println("El ordenador se ha apagado");
        }
    }

 public void establecerPeso(int pe)
    {
        peso= pe;
    }
 public void establecerProcesador(String pe)
    {
        procesador= pe;
    }
 public void apagadoordenador(String pe)
    {
        apagado= pe;
    }

   
    }


