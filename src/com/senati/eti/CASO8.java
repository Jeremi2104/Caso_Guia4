package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;

public class CASO8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<Integer> arrEdad = new ArrayList<Integer>();
		
		String rp= "S", nombre = "";
		int nr = 0,  edad=0;
		
		while  (rp.equals("S") || rp.equals("s")) {
			nr++ ;
			
			System.out.println("REGISTROS N. " + nr );
			System.out.println("++++++++++++++++" );
			
			System.out.println("Nombre...: "  );
			nombre = sc.nextLine( );
			
			System.out.println("Edad...: "  );
			edad  = sc.nextInt();
			
			arrNombre.add(nombre);
			arrEdad.add(edad);
			
			sc.nextLine();

			
			rp= "";
			
			while  (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
				System.out.println("¿Continuar registro [S|N]?: " ); 
				rp = sc.nextLine();
				
				if  (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
					System.out.println("Solo escriba S o N " ); 	
				}
			}
		}
		
		// IMPRESION DEL CONTEDNIDO DE LOS ARAYLIST
		
	System.out.println("======== DATOS REGISTRADOS ===========");
	System.out.println("======================================");
	
	System.out.println("Alumn(a)   \tEdad    \t\tEstado");
	System.out.println("============================");
	
	for(int i=0; i < arrNombre.size(); i++) {
		System.out.println(arrNombre.get(i) + "\t\t" + arrEdad.get(i) + "  años\t\t" + VerMensaje(arrEdad.get(i)) + "\t"  + VerEstado(arrEdad.get(i)));
		}
	}
	
	public static String VerMensaje(int edad) {
		String  mensaje = "Menor de Edad";
		
		if (edad >=18)mensaje = "Mayor de Edad";
		
		return mensaje;
	}
	
	public static String VerEstado(int edad) { 
		String mensajeb = "";
		if (edad > 0 && edad <= 10) mensajeb = "Niñez";
		if (edad > 10 && edad <= 17) mensajeb = "Adolescente";
		if (edad > 17 && edad <= 24) mensajeb = "Juventud";
		if (edad > 24 && edad <= 59) mensajeb = "Adulto";
		if (edad > 59) mensajeb = "Adulto mayor";
		
		return mensajeb;

	}
}

