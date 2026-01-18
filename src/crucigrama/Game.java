package crucigrama;
import java.util.Scanner;
import crucigrama.metodos.*;

public class Game {
	//DECLARAMOS SCANNER
	static Scanner sc = new Scanner(System.in);
	
	public static String traductorFases (int fase) {
		String dificultad = "";
		if(fase == 1) dificultad = "FACIL";
		if(fase == 2) dificultad = "MEDIA";
		if(fase == 3) dificultad = "DIFICIL";
		
		return dificultad;
	}
	
	public static void imprimirTablero(Distribuciones config, char[][] matriz) {
	    // 1. Imprimir números de columna (Eje X)
	    System.out.print("   "); // Espacio para el margen izquierdo
	    for (int c = 0; c < config.tamañoMatriz; c++) {
	        System.out.printf("%2d ", c); 
	    }
	    System.out.println();

	    // 2. Imprimir filas con su número (Eje Y)
	    for (int f = 0; f < config.tamañoMatriz; f++) {
	        System.out.printf("%2d ", f); // Número de fila
	        
	        for (int c = 0; c < config.tamañoMatriz; c++) {
	            // Si la celda está vacía, ponemos un bloque sólido o vacío
	            // Si hay una letra o marca, la mostramos
	            char celda = matriz[f][c];
	            if (celda == '\0') { 
	                System.out.print(" ■ "); // Espacio donde NO se puede escribir
	            } else {
	                System.out.print(" " + celda + " "); // Espacio de escritura
	            }
	        }
	        System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		
		//DECLARAMOS VARIABLES
		int inicio;
		int nv;
		int fase;
		String dificultad = "";
		//Inicializamos variables
		inicio = 0;
		
		//1º Menu Inicial - Configuracion Inicial
		inicio = Menus.mostrarMenuInicial();
		switch (inicio) {
		case 1:
			fase = Menus.mostrarMenuDificultad();
			dificultad = traductorFases(fase);
			nv = Menus.mostrarMenuNivel(dificultad);
			
			System.out.println("\nConfiguracion Aceptada!");
			System.out.println("Curcigrama modo " + dificultad.toLowerCase() + " de nivel " + nv);
			break;
		default:
			System.out.println("¡Gracias por Jugar!");
			break;
		}
		
		
		
		
	}
	
	
	
	
	

}
