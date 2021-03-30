package com.senati.eti;

public class CASO6 {

	public static void main(String[] args) {
		String [ ][ ] datos = {{"Joe Castillo", "Rosa Flores" , "Ricardo Tello"},
				{"Callao", "Puente piedra","Comas"}};
		
	//Impresion de valores por filas 
		System.out.println("- - - - - - - IMPRESION POR FILAS -------");
		for (int f = 0 ; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
				
				System.out.println();
				
				}
		System.out.println();  
		
		//Impresion por valores por columna
		
		System.out.println("- - - - - - - IMPRESION POR COLUMNAS -------");
		for (int c = 0 ; c < datos[0].length;  c++) {
			for (int f = 0; f < datos.length;  f++)
		
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
				
				System.out.println(); 
				}
		}

}
