package crucigrama;


import java.util.Scanner;
import crucigrama.metodos.*;
public class Esqueletos {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//DECLARAMSO VARIABLES
		String [] cadenas = new String[6];
		int [] posiciones = new int[6];
		char [][] caracteres = new char[cadenas.length][];
		
		//INICIALIZAMOS VARIABLES
		Palabras.nivelFacilFase1(cadenas,posiciones);
		boolean n = Comprobaciones.valoresRepetidos(cadenas);
		
		
		//COMPROBAMOS VALORES REPETIDOS
		if (n) {
			
			Comprobaciones.nuevoValor(0, cadenas);
			System.out.println("Hubo valores repetidos");
		}
		
		//CALCULAMOS MEDIDA DE LAS COLUMNAS DE LA  MATRIZ CHAR
		Comprobaciones.medidaCadena(cadenas,caracteres);
		
		//LLENAMOS DE DATOS LA MATRIZ DE CHAR
		Comprobaciones.llenarLetras(cadenas, caracteres);
		
		//MOSTRAR MATRIZ DE CHAR
		for (int i = 0; i < caracteres.length; i++) {
			for (int j = 0; j < caracteres[i].length; j++) {
				System.out.print(caracteres[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//PROGRAMA DE ESQUELETO BORRADOR
		
		//1. EL PROGRAMA DEBE DESAROLLAR PATRONES DE MATRICES APARTIR DE UN ESQUELETO H Y V
		
		//2. DEBE SER CAPAZ DE ENCONTRAR LA COMBINACION PERFECTA PARA QUE COMO MINIMO INERCONECTEN 1 VEZ CADA PALABRA
		
		/*MODELO A: CURVAS RECTAS
		 * - LAS CURVAS RECTAS SE DESTACAN POR POR UNA LINEA HORIZONTAL QEU SE TRAZA EN EL CETNTRO DEL TABLERO
		 * - LAS PALBRAS SIGUEINTES SIMPLEMENTE SE CONECTAN VERTICUALMENTE HASTA COMPLETAR LA SECUENCIA 
		 * - ESTE MODELO SERIVRA PARA QUITARNOS DE ENCIMA VALORES DE + 9 LETRAS*/
		
		
		//A. Programa de decision, hare yo los escqueletos pero el programa debe juzgar que esquelto se adapta mejor al esquema
		
		//B. Para ello necesitamos contar con ela array de medidas que contendra cada palabra y darle los aparametros necesarios
		
		
		
		
		

	}

}
