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
