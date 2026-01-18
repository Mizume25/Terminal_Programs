package crucigrama.metodos;

/**
 * GENERADOR DE TABLAS CRUCIGRAMA
 * Una tabla por nivel con formato cartesiano
 */

public class Tablas {
    
    // ===========================================
    // TABLA NIVEL FÁCIL - 10x10
    // ===========================================
    
    public static void tablanivelfacil() {
        System.out.println("\n┌──────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│                            NIVEL FÁCIL - 10x10                                │");
        System.out.println("├─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┤");
        System.out.println("│     │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │ 10  │ 11  │");
        System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        
        for(int fila = 0; fila < 10; fila++) {
            System.out.printf("│ %2d  │", fila);
            for(int col = 0; col < 10; col++) {
                System.out.print("  □  │");
            }
            System.out.println();
            if(fila < 9) {
                System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
            }
        }
        
        System.out.println("├─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┤");
        System.out.println("│ Palabras: 3-5 | Letras: 6-8 | Casillas: 100                                 │");
        System.out.println("└──────────────────────────────────────────────────────────────────────────────┘");
    }
    
    // ===========================================
    // TABLA NIVEL MEDIO - 14x14
    // ===========================================
    
    public static void tablanivelmedio() {
        System.out.println("\n┌──────────────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│                              NIVEL MEDIO - 14x14                                                  │");
        System.out.println("├─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┤");
        System.out.println("│     │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │ 10  │ 11  │ 12  │ 13  │ 14  │");
        System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        
        for(int fila = 0; fila < 14; fila++) {
            System.out.printf("│ %2d  │", fila);
            for(int col = 0; col < 14; col++) {
                System.out.print("  □  │");
            }
            System.out.println();
            if(fila < 13) {
                System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
            }
        }
        
        System.out.println("├─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┤");
        System.out.println("│ Palabras: 6-9 | Letras: 8-10 | Casillas: 196                                                 │");
        System.out.println("└──────────────────────────────────────────────────────────────────────────────────────────────────┘");
    }
    
    // ===========================================
    // TABLA NIVEL DIFÍCIL - 18x18
    // ===========================================
    
    public static void tablaniveldificil() {
        System.out.println("\n┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│                                      NIVEL DIFÍCIL - 18x18                                                                 │");
        System.out.println("├─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┤");
        System.out.println("│     │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │ 10  │ 11  │ 12  │ 13  │ 14  │ 15  │ 16  │ 17  │ 18  │");
        System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        
        for(int fila = 0; fila < 18; fila++) {
            System.out.printf("│ %2d  │", fila);
            for(int col = 0; col < 18; col++) {
                System.out.print("  □  │");
            }
            System.out.println();
            if(fila < 17) {
                System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
            }
        }
        
        System.out.println("├─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┤");
        System.out.println("│ Palabras: 10-12 | Letras: 10-12 | Casillas: 324                                                                        │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘");
    }
    
    // ===========================================
    // MÉTODO PARA MOSTRAR TODAS LAS TABLAS
    // ===========================================
    
    public static void mostrartodastablas() {
        System.out.println("\n╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                      TABLAS DE CRUCIGRAMA - VISUALIZACIÓN                     ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
        
        tablanivelfacil();
        System.out.println("\n");
        tablanivelmedio();
        System.out.println("\n");
        tablaniveldificil();
        
        System.out.println("\n╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                            LEYENDA DE SÍMBOLOS                                ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║   □  = Casilla vacía (espera letra)                                         ║");
        System.out.println("║   █  = Casilla negra (no se escribe)                                        ║");
        System.out.println("║   A  = Letra revelada (horizontal)                                          ║");
        System.out.println("║   B  = Letra revelada (vertical)                                            ║");
        System.out.println("║   1  = Número de pista (inicio palabra)                                     ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
    }
} 