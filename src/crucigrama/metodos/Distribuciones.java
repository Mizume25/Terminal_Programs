package crucigrama.metodos;
public class Distribuciones {
    
    public int idFase;           
    public int tamañoMatriz;     
    public int cantidadPalabras; 
    public int longitudMax;      
    public String variante;      

    // El Builder Inteligente basado en tus promedios reales
    public Distribuciones(int fase, String var) {
        this.idFase = fase;
        this.variante = var;

        switch (fase) {
            // NIVEL FÁCIL: Promedio 5.3 a 9.2 letras
            case 1: this.tamañoMatriz = 10; this.cantidadPalabras = 6; this.longitudMax = 10; break;
            case 2: this.tamañoMatriz = 12; this.cantidadPalabras = 8; this.longitudMax = 12; break;
            case 3: this.tamañoMatriz = 13; this.cantidadPalabras = 9; this.longitudMax = 14; break;

            // NIVEL MEDIO: Promedio ~9.1 letras (Vocabulario Técnico)
            case 4: this.tamañoMatriz = 15; this.cantidadPalabras = 10; this.longitudMax = 13; break;
            case 5: this.tamañoMatriz = 16; this.cantidadPalabras = 11; this.longitudMax = 13; break;
            case 6: this.tamañoMatriz = 17; this.cantidadPalabras = 12; this.longitudMax = 16; break;

            // NIVEL DIFÍCIL: Promedio 9.8 a 11.4 letras (Vocabulario Complejo)
            case 7: this.tamañoMatriz = 19; this.cantidadPalabras = 13; this.longitudMax = 17; break;
            case 8: this.tamañoMatriz = 21; this.cantidadPalabras = 14; this.longitudMax = 17; break;
            case 9: this.tamañoMatriz = 22; this.cantidadPalabras = 15; this.longitudMax = 18; break;
            
            default:
                // Valor por defecto por seguridad
                this.tamañoMatriz = 10; this.cantidadPalabras = 5;
        }
    }
}
