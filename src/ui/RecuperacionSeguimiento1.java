package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() 

	{   
        System.out.println ("ejercicio 1");

		int num1, num2, num3 ;
        
	    // Pedir info al usuario 
        System.out.println("Cual es el primer numero que ingresaras?");
        num1 = escaner.nextInt();
		escaner.nextLine();
		System.out.println("Cual es el segundo numero que ingresaras?");
        num2 = escaner.nextInt();
		escaner.nextLine();
		System.out.println("Cual es el tercer numero que ingresaras?");
        num3 = escaner.nextInt();
		escaner.nextLine();
		 int repetidos = CantRepetidos( num1, num2, num3 );
		 System.out.println("La cantidad de numeros repetidos es " + repetidos);
	   
        System.out.println ("ejercicio 2");
		System.out.println("Saludo o Despedida:");
		String nombre, saludoDespedida, mensaje;
		int unocero;
		System.out.println("Introduzca su nombre:");
		nombre = escaner.nextLine();
		System.out.println("Escriba 1 para saludo y 0 para despedida:");		
		unocero = escaner.nextInt();
	    escaner.nextLine();
        mensaje = escaner.nextLine();
		mensaje = saludoDespedida(nombre, unocero);
        System.out.println(mensaje);

		

        System.out.println ("ejercicio 3");
		System.out.println("Longitud de palabras:");
		 String palabra1, palabra2, palabra3;
		 int palabralongitud;
		 System.out.println("Introduzca la primera palabra:");
			palabra1 = escaner.nextLine();
			System.out.println("Introduzca la segunda palabra:");
			palabra2 = escaner.nextLine();
		System.out.println("Introduzca la tercera palabra:");
		palabra3 = escaner.nextLine();
				
		palabralongitud = longitud(palabra1, palabra2, palabra3);
		System.out.println("Las palabras con cuatro o más carácteres son: " + palabralongitud);

		


        
	}

	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}
    public int CantRepetidos (int num1, int num2, int num3){ 
	if(num1 == num2 && num2 == num3 && num1 == num3){
		return 3;
		} else if(num1 == num2 ||num2 == num3 || num1 == num3) {
    
	      return 2;
    } else {

	return 0;}

	}
	
	public static String saludoDespedida(String nombre, int unocero){
       String mensaje;
       String holaChao ="";
	   if (unocero == 1){
	     return mensaje = ("Hola " + nombre);
	    }else if (unocero == 0){
		  return mensaje = ("Chao " + nombre);
	    }else {
			return mensaje = ("Error, seleccione 1 para Hola y 0 para Chao");
		}
    }



    /**
	 * Descripción: El método ... permite ...
	 * @param 
	 * @return 
	 */
	
   
  
	public static int longitud(String palabra1, String palabra2, String palabra3){
		int count = 0;
		if (palabra1.length() >=3){
			count ++;
		}
		if (palabra2.length() >=3){
			count ++;
		}
		return count;
	}
}	
    
 
