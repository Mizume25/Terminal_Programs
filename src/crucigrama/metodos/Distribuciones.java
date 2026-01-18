package crucigrama.metodos;

public class Distribuciones {
    
    public int idFase;           
    public int tamañoMatriz;     
    public int cantidadPalabras; 
    public int longitudMax;      
    public String variante;      
    public String nombreEstilo;
    public char[][] matriz; 
    public int filaInicio;
    public int colInicio;
    public boolean esHorizontal; // Declarada correctamente

    // El Constructor
    public Distribuciones(int fase, String var) {
        this.idFase = fase;
        this.variante = var;

        // 1. Definir parámetros de la fase
        switch (fase) {
            case 1: this.tamañoMatriz = 10; this.cantidadPalabras = 6; this.longitudMax = 10; break;
            case 2: this.tamañoMatriz = 12; this.cantidadPalabras = 8; this.longitudMax = 12; break;
            case 3: this.tamañoMatriz = 13; this.cantidadPalabras = 9; this.longitudMax = 14; break;
            case 4: this.tamañoMatriz = 15; this.cantidadPalabras = 10; this.longitudMax = 13; break;
            case 5: this.tamañoMatriz = 16; this.cantidadPalabras = 11; this.longitudMax = 13; break;
            case 6: this.tamañoMatriz = 17; this.cantidadPalabras = 12; this.longitudMax = 16; break;
            case 7: this.tamañoMatriz = 19; this.cantidadPalabras = 13; this.longitudMax = 17; break;
            case 8: this.tamañoMatriz = 21; this.cantidadPalabras = 14; this.longitudMax = 17; break;
            case 9: this.tamañoMatriz = 22; this.cantidadPalabras = 15; this.longitudMax = 18; break;
            default:
                this.tamañoMatriz = 10; this.cantidadPalabras = 5;
        }
        
        // 2. INICIALIZAR LA MATRIZ (Ahora que sabemos el tamaño)
        this.matriz = new char[this.tamañoMatriz][this.tamañoMatriz];
        
        // 3. LLAMAR AL MÉTODO de los planos
        configurarMapaEspecifico();
    }
    
    private void configurarMapaEspecifico() {
        switch (this.idFase) {
            case 1:
                if (variante.equals("A")) {
                    this.filaInicio = 5; this.colInicio = 2; this.esHorizontal = true;
                    this.nombreEstilo = "Cruz Central";
                } else if (variante.equals("B")) {
                    this.filaInicio = 1; this.colInicio = 1; this.esHorizontal = true;
                    this.nombreEstilo = "Marco Perimetral";
                } else {
                    this.filaInicio = 2; this.colInicio = 2; this.esHorizontal = false;
                    this.nombreEstilo = "Columnas Paralelas";
                }
                break;

            case 2:
                if (variante.equals("A")) { 
                    this.filaInicio = 0; this.colInicio = 0; this.esHorizontal = true;
                    this.nombreEstilo = "Escalera";
                }
                // Aquí irán las variantes B y C de la fase 2...
                break;
                
            case 9:
                if (variante.equals("C")) {
                    this.filaInicio = 11; this.colInicio = 2; this.esHorizontal = true;
                    this.nombreEstilo = "El Abismo";
                }
                break;
        }
    }
}