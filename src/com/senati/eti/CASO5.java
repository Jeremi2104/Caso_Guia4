package com.senati.eti;

import java.util.Scanner;

public class CASO5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[ ] arrCodigo    = {"A-123" , "A-456" , "A-789" , "A-777"};
		String[ ] arrNombre = {"Joe Castillo", "Rosa Flores", "Karla Ramos" , "Jere Gonzales" };
		String estado = " ";
		int[] arrNota = {15,12,17,8};
		
		
		System.out.println("BUSQUEDA DE DATOS" );
		System.out.println("- - - - - - - - - - - - - - - - - " );
		System.out.print("Ingrese codigo..........:" );
		String codigo = sc.nextLine();
		
		int p = -1;
		
		for(int x = 0;  x < arrCodigo.length;  x++) {
			if (codigo.equals(arrCodigo[x])) {
				p = x;
				break;
			}
		}
		
		if ( arrNota[p] >= 13) {
			estado = "Aprobado";
		}
		else
			estado =  "Desaprobado";
		
		
		
		if (p == -1) {
			System.out.println("\n- - - - - - - - - - - - - - - - - ");
			System.out.println("Codigo no encontrado");
			System.out.println("- - - - - - - - - - - - - - - - - ");
		}
		else {
			System.out.println("\n- - - - - - - - - - - - -  ");
			System.out.println("Codigo registrado");
			System.out.println("- - - - - - - - - - - -- - ");
			System.out.println("Codigo........: " + arrCodigo[p]);
			System.out.println("Nombre......: " + arrNombre[p]);
			System.out.println("Nota...........: " + arrNota[p]); 
			System.out.println("Estado........: " + estado);
			
			
		}
		
		
	
	
		

	}

}
