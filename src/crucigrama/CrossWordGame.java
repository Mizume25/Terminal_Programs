package crucigrama;

//PRUEBAS Y TEST DE METODOS
import java.util.Scanner;
import crucigrama.metodos.*;
public class CrossWordGame {
	//DECLARAREMOS VARIABLES
	static Scanner sc = new Scanner(System.in);
/*NOTAS DE PROGRAMA Y DEFINICIONES GENERALES
* 
* Programa simple para poder realizar un crucigrama en java por terminal.
* Especificaciones y objetivos:
* 
* 	1. Menu interactivo que establezca: start o exit
* 	2. Sub Menu interactivo que establezca: Niveles de curcigramas 
* 
 * CONFIGURACIÓN DE DISTRIBUCIONES CALCULADA POR DENSIDAD Y PROMEDIO
 * ----------------------------------------------------------------
 * Basado en el análisis de promedios de caracteres por diccionario:
 * * NIVEL FÁCIL (Promedio letras: 5.3 a 9.2)
 * - Fase 1: Matriz 10x10 | 6 Palabras  (Ocupación baja: ~32%)
 * - Fase 2: Matriz 12x12 | 8 Palabras  (Ocupación media: ~43%)
 * - Fase 3: Matriz 13x13 | 9 Palabras  (Ocupación media: ~49%)
 * * NIVEL MEDIO (Promedio letras: 8.1 a 9.6)
 * - Fase 4: Matriz 15x15 | 10 Palabras (Espacio para términos técnicos)
 * - Fase 5: Matriz 16x16 | 11 Palabras (Incremento de densidad)
 * - Fase 6: Matriz 17x17 | 12 Palabras (Máximo control de cruces)
 * * NIVEL DIFÍCIL (Promedio letras: 9.8 a 11.4)
 * - Fase 7: Matriz 19x19 | 13 Palabras (Necesario para palabras de 17 letras)
 * - Fase 8: Matriz 21x21 | 14 Palabras (Espacio extra por vocabulario complejo)
 * - Fase 9: Matriz 22x22 | 15 Palabras (Máxima dificultad, palabras de 18 letras)
  * 
* * 
* 3. Mini Interfaz que permita: controles y opciones del usuario
* 
* - Que pueda enviar la respuesta (Elegir cual y escrbirla)
* - Que pueda pedir una pista sobre una linea en concreto y pierda una vida
* - Que cada intento le repercuta una vida 
* - Que pueda usar al menos 1 comodin para tener mas pistas (a cambio de vidas)
* - Que pueda finalizar el juego cuando quiera
* 
* 4. Tabla de resultados
* - Numero de intentos de envio de respuestas (correctos e incorrectos)
* - Palabras acertadas 
* - Palabras que faltaban por acertar (o no)
* - y vidas restantes
* 
* 
* 5. Vidas y comodines
* - Nivel Facil: 4 vidas => Pistas a cambio de 1 vida
* * - Palabras: 8 | 7 | 6 palabras
* - Nivel Medio: 6 vidas => Pistas a cambio de 2 vidas 
* * - Palabras: 10 | 9 | 8 palabras
* - Nivel Dificl: 10 vidas => Pistas a cambio de 2 vidas
* Palabras: 13 | 12 | 11 palabras
* */
	
	
	public static void main(String[] args) {
	
	
	
	
	
		
		
	
	String [] cadenas = new String[15];
	int [] posiciones = new int[15];
	char [][] caracteres = new char[cadenas.length][];
	Palabras.niveldificilFase3(cadenas,posiciones);
	boolean n = Comprobaciones.valoresRepetidos(cadenas);
	if (n) {
		ArrayLib.mostrarArray(cadenas);
		Comprobaciones.nuevoValor(8, cadenas);
		System.out.println("Hubo valores repetidos");
	}
	
	int [] suma = new int [cadenas.length];
	Comprobaciones.medidaCadena(cadenas,caracteres);
	
	
	Comprobaciones.llenarLetras(cadenas, caracteres);
	
	Matriceslib.sumaFilasMatriz(suma, caracteres, 0);
	
	
	ArrayLib.mostrarArray(suma);
	System.out.println();
	System.out.println();
	ArrayLib.mostrarArray(cadenas);
	System.out.println();
	for (int i = 0; i < caracteres.length; i++) {
		for (int j = 0; j < caracteres[i].length; j++) {
			System.out.print(caracteres[i][j] + " ");
		}
		System.out.println();
	}
	/*
	String [][] palabras = new String[9][2];
	
	String [] comodines = new String[9];
	*/
	
	
	
	/*
	
	for (int i = 0; i < cadenas.length; i++) {
		palabras[i][0] = cadenas[i];
	}
	
	for (int i = 0; i < palabras.length; i++) {
		System.out.println(palabras[i][0] + " ");
	}
	
	
	Enunciados.enunciados(palabras);
	
	
	System.out.println();
	for (int i = 0; i < palabras.length; i++) {
		System.out.println(palabras[i][1] + " ");
	}
	
	
	Pistas.pistasMedioFase2(comodines, posiciones);
	System.out.println();
	System.out.println();
	
	
	
	String [] temp;
	
	temp = new String[] {"HOLA","HOLA","HOLA","HOLA","HOLA","HOLA","HOLA","HOLA","HOLA","HOLA"};
	ArrayLib.mostrarArray(temp);

	
	System.out.println();
	Comprobaciones.nuevoValor(4, temp);
	ArrayLib.mostrarArray(temp);
	
	*/
	}

}
