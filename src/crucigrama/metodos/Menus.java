package crucigrama.metodos;

import java.util.Scanner;

public class Menus {
	static Scanner sc = new Scanner(System.in);
	//1º Menu Inicial
	public static int mostrarMenuInicial() {
	    System.out.println("================================================");
	    System.out.println("║                                              ║");
	    System.out.println("║          BIENVENIDO AL CRUCIGRAMA            ║");
	    System.out.println("║                                              ║");
	    System.out.println("================================================");
	    System.out.println();
	    System.out.println("          [1] Comenzar Juego");
	    System.out.println("          [2] Terminar");
	    System.out.println();
	    System.out.print("Seleccione una opción: ");
	    return sc.nextInt();
	}
	
	public static int mostrarMenuDificultad() {
	    System.out.println("╔══════════════════════════════════════════════╗");
	    System.out.println("║                                              ║");
	    System.out.println("║         SELECCIONE TU DIFICULTAD             ║");
	    System.out.println("║                                              ║");
	    System.out.println("╚══════════════════════════════════════════════╝");
	    System.out.println();
	    System.out.println("          [1] FÁCIL");
	    System.out.println("          [2] MEDIA");
	    System.out.println("          [3] DIFÍCIL");
	    System.out.println();
	    System.out.print("Selección: ");
	    return sc.nextInt();
	}
	
	
	public static int mostrarMenuNivel(String dificultad) {
	    System.out.println("╔══════════════════════════════════════════════╗");
	    System.out.println("║                                              ║");
	    System.out.println("║          BIENVENIDO AL CRUCIGRAMA            ║");
	    System.out.println("                                            	");
	    System.out.printf("           DIFICULTAD: %-15s        %n", dificultad.toUpperCase());
	    System.out.println("║                                              ║");
	    System.out.println("╚══════════════════════════════════════════════╝");
	    System.out.println();
	    System.out.println("          [1] Nivel 1");
	    System.out.println("          [2] Nivel 2");
	    System.out.println("          [3] Nivel 3");
	    System.out.println();
	    System.out.print("Seleccione una opción: ");
	    return sc.nextInt();
	}
}
