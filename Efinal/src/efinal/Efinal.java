import java.util.Scanner;


public class Efinal {
	static Scanner scanner = new Scanner(System.in); 
	static int select = -1; //opción que eligira el usuario

	
	public static void main(String[] args) {
		
		
		
				System.out.println("Elige opción:\n1.- CONVERSIONES" +
						"\n2.- AREAS\n" +
						"3.- OPERACIONES\n" +
						"0.- SALIR");
				select = Integer.parseInt(scanner.nextLine()); 
	
				switch(select){
                                    
				case 1: 
                                    System.out.println("Elige opción:\n1.- Pulgadas-Centimetros" +
						"\n2.- Centimetros-Pulgadas\n" +
						"3.- Pulgadas-Metros\n" +
                                                "4.- Metros-Pulgadas\n"+
						"0.- SALIR"); 
                                    select = Integer.parseInt(scanner.nextLine());
					switch(select){
                                            case 1:
                                                System.out.println("1 pulgada= 2.54 centimetros");
                                                break;
                                            case 2:
                                                System.out.println("2.54 centimetros = 1 pulgada");
                                                break;
                                            case 3:
                                                System.out.println("1 ulgada = 0.0254 metros");
                                                break;
                                            case 4:
                                                    System.out.println("0.0254 metros = 1 pulgada");
                                                    break;
                                            case 0:
                                                    System.out.println("Adios!");
                                                    break;
                                        }
				case 2: 
                                    System.out.println("Elige opción:\n1.- Circulo" +
						"\n2.- Trapecio\n" +
						"3.- Cuadrado\n" +
                                                "4.- Triangulo\n"+
						"0.- SALIR"); 
                                    select = Integer.parseInt(scanner.nextLine());
					switch(select){
                                            case 1:
                                                System.out.println("El área de un círculo es igual al producto de π por el radio (r) al cuadrado");
                                                break;
                                            case 2:
                                                System.out.println("El área del trapecio se calcula a partir de su altura y los dos lados paralelos (a y b) o bases del trapecio. Es el resultado de multiplicar su altura (h) y la mediana del trapecio, que se obtiene como la media de las dos bases a y b: M=(a+b)/2.");
                                                break;
                                            case 3:
                                                System.out.println("un cuadrado es 3 cm, eleva 3 cm al cuadrado para calcular su área. Es decir, 3 cm x 3 cm = 9 cm2");
                                                break;
                                            case 4:
                                                    System.out.println("Un triangulo = bxh/2");
                                                    break;
                                            case 0:
                                                    System.out.println("Adios!");
                                                    break;
                                        }
				case 3: 
					System.out.println("Elige opción:\n1.- Exponenciacion" +
						"\n2.- Residuo\n" +
						"3.- Producto\n" +
                                                "4.- Division\n"+
						"0.- SALIR"); 
                                    select = Integer.parseInt(scanner.nextLine());
					switch(select){
                                            case 1:
                                                System.out.println("la división es una operación parcialmente definida en el conjunto de los números naturales y los números enteros");
                                                break;
                                            case 2:
                                                System.out.println("Parte o porción que queda de un todo después de quitar otra parte");
                                                break;
                                            case 3:
                                                System.out.println("En matemáticas, producto es sinónimo de multiplicación.");
                                                break;
                                            case 4:
                                                    System.out.println("la división es una operación parcialmente definida en el conjunto de los números naturales y los números enteros");
                                                    break;
                                            case 0:
                                                    System.out.println("Adios!");
                                                    break;
                                        }
				case 0:
                                    System.out.println("Adios!");
                                     break;
				
			}
		}
            }
        
    
                

	
	
	




    
 
