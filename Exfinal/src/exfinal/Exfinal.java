package examenfinal;

import java.util.Scanner;

public class Exfinal {

    public static void main(String[] args) {
        double medida; double base=1; double base2=1;
        int opc, opc2;
        Conversiones conv = new Conversiones();
        Areas areas = new Areas();
        Operaciones op = new Operaciones();
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("\nELIGE EL TIPO DE CALCUL0 QUE DESEES HACER: ");
            System.out.println("1.Conversiones.\n2.Areas.\n3.Operaciones.\n4.Salir\n");
            opc=entrada.nextInt();
            
            switch(opc){
                
                case 1:
                    do{
                    System.out.println("\nESCRIBE LA CONVERSION QUE DESEES HACER");
                    System.out.println("1.Pulgadas-Centimetros.\n2.Centimetros-Pulgadas\n3.Pulgadas-Metros\n4.Metros-Pulgadas\n5.Ingresar valores especificos\n6.Salir\n");
                    opc2=entrada.nextInt();
                    switch(opc2){
                        case 1:
                            conv.PAC();
                            break;
                            
                        case 2:
                            conv.CAP();
                            break;
                            
                        case 3:
                            conv.PAC();
                            break;
                            
                        case 4:
                            conv.MAP();
                            break;
                         
                        case 5:
                            System.out.println("Escribe el valor de la medida a convertir: ");
                            medida=entrada.nextDouble();
                            conv = new Conversiones(medida);
                            break;
                    }
                    }while(opc2!=6);
                    
                case 2:
                    do{
                        System.out.println("\nESCRIBE LA FIGURA DE LA CUAL DEBES SACAR EL AREA: ");
                        System.out.println("1.Circulo.\n2.Trapecio\n3.Cuadrado\n4.Triangulo\n5.Ingresar valores especificos\n6.Salir\n");
                        opc2=entrada.nextInt();
                        
                        switch(opc2){
                            case 1:
                                areas.Circulo();
                                break;
                                
                            case 2:
                                areas.Trapecio();
                                break;
                                
                            case 3:
                                areas.Cuadrado();
                                break;
                                
                            case 4:
                                areas.Triangulo();
                                
                            case 5:
                                System.out.println("Escribe la medida de la altura o el radio");
                                medida=entrada.nextDouble();
                                System.out.println("Escribe la medida de la base");
                                base=entrada.nextDouble();
                                System.out.println("Escribe la medida de la segunda base");
                                base2=entrada.nextDouble();
                                areas = new Areas(medida, base, base2);
                                break;
                        }
                    }while(opc2!=6);
                    break;
                    
                case 3:
                    do{
                        System.out.println("\nEscribe la operacion que desea realizar: ");
                        System.out.println("1.Exponenciacion.\n2.Residuo\n3.Producto\n4.Division\n5.Ingresar valores especificos\n6.Salir");
                        opc2=entrada.nextInt();
                        switch(opc2){
                            case 1:
                                op.Exponenciacion();
                                break;
                                
                            case 2:
                                op.Residuo();
                                break;
                                
                            case 3:
                                op.Producto();
                                break;
                                
                            case 4:
                                op.Division();
                                break;
                                
                            case 5:
                                System.out.println("Poner el valor del primer numero");
                                base=entrada.nextDouble();
                                System.out.println("Poner el valor del numero con el que va a operar");
                                base2=entrada.nextDouble();
                                op=new Operaciones(base,base2);
                                break;
                        }
                    }while(opc2!=6);
            }
        }while(opc!=4);
        System.out.println("SALIENDO DEL PROGRAMA....");
    }
    
}
