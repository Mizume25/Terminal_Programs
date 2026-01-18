package crucigrama.metodos;

import java.util.Random;
import java.util.Scanner;

public class Palabras {
	/**
	 * GENERADOR DE PALABRAS PARA CRUCIGRAMA Palabras en español SIN acentos, sin
	 * extranjerismos Métodos void que trabajan con matrices internas
	 */
	// ==============================
	// MÉTODO NIVEL FÁCIL
	// ==============================
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

	// 1º Funcion Nivel Facil - Fase 1
	public static void nivelFacilFase1(String[] cadena, int [] posiciones) {
		// Matriz 0: Nivel 1 (6-7 letras)

		// DECLARAMOS VARIABLES

		String[] palabras;
		int i = 0;
		int p = 0;

		// Incializamos variables
		palabras = new String[] { "CASA", "MESA", "PERRO", "GATO", "LUNA", "FLOR", "MAR", "RIO", "NUBE", "HOJA",
				"ARBOL", "PAN", "LEON", "OSO", "RATA", "PEZ", "AVE", "RED", "SILLA", "PUERTA", "VENTANA", "COCHE",
				"BARCO", "AVION", "BICI", "MOTO", "RUEDA", "CALLE", "PLAZA", "PARQUE", "LIBRO", "LAPIZ", "PAPEL",
				"FOTO", "VIDEO", "MUSICA", "BAILE", "JUEGO", "GOL", "PELOTA", "JARDIN", "FUENTE", "CUADRO", "CANTO",
				"DEPORTE", "PASE", "TIRO", "RAQUETA", "CAMPO", "AMIGO", "FAMILIA", "HERMANO", "PADRE", "MADRE", "HIJO",
				"TIO", "TIA", "ABUELO", "NIETO", "ESCUELA", "CLASE", "ALUMNO", "PROFE", "AULA", "PATIO", "RECREO",
				"EXAMEN", "NOTA", "CURSO", "COMIDA", "AGUA", "LECHE", "CARNE", "FRUTA", "VERDURA", "ARROZ", "PASTA",
				"TIEMPO", "HORA", "DIA", "NOCHE", "SEMANA", "MES", "ANO", "FECHA", "RELOJ", "CALENDARIO", "INVIERNO",
				"VERANO", "OTOÑO", "PRIMAVERA", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO",
				"AGOSTO", "SEPTIEMBRE" };

		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

		} while (i < 6);

	}

	public static void nivelFacilFase2(String[] cadena, int [] posiciones) {
		// Matriz 1: Nivel 2 (7-8 letras)
		String[] palabras;
		int i = 0;
		int p = 0;

		palabras = new String[] { "TELEVISION", "RADIO", "TELEFONO", "CELULAR", "TABLETA", "PORTATIL", "COCINA",
				"DORMITORIO", "BANIO", "SALON", "GARAJE", "TERRAZA", "BALCON", "ASCENSOR", "ESCALERA", "PASILLO",
				"HOSPITAL", "FARMACIA", "DOCTOR", "ENFERMERO", "MEDICINA", "PELICULA", "SERIE", "ACTOR", "ACTRIS",
				"DIRECTOR", "GUION", "ESCENA", "PUBLICO", "TEATRO", "PINTURA", "DIBUJO", "COLOR", "PINCEL", "LIENZO",
				"GALERIA", "MUSEO", "ARTE", "ARTISTA", "OBRA", "TIENDA", "MERCADO", "SUPER", "CAJA", "CLIENTE",
				"VENDEDOR", "PRECIO", "OFERTA", "COMPRA", "VENTA", "COMPUTADORA", "IMPRESORA", "ESCANER", "TELEVISOR",
				"CONSOLA", "JOYSTICK", "VOLANTE", "FRENO", "ACELERADOR", "MOTOR", "CARROCERIA", "NEUMATICO", "GASOLINA",
				"DIESEL", "ELECTRICO", "BATERIA", "CARGADOR", "ENCHUFE", "CORRIENTE", "VOLTAJE", "PROGRAMACION",
				"ALGORITMO", "VARIABLE", "FUNCION", "CLASE", "OBJETO", "METODO", "CODIGO", "COMPILAR", "EJECUTAR",
				"INTERNET", "NAVEGADOR", "PAGINA", "ENLACE", "BUSCAR", "RESULTADO", "DESCARGAR", "SUBIR", "ARCHIVO",
				"CARPETA", "DOCUMENTO", "PRESENTACION", "CALCULO", "FORMULA", "CELDA", "FILA", "COLUMNA", "TABLA",
				"GRAFICO", "DIAGRAMA" };
		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

		} while (i < 8);
	}

	public static void nivelFacilFase3(String[] cadena, int [] posiciones) {
		// Matriz 2: Nivel 3 (8-9 letras)
		String[] palabras;
		int i = 0;
		int p = 0;

		palabras = new String[] { "UNIVERSIDAD", "FACULTAD", "CARRERA", "MATERIA", "PROFESOR", "ESTUDIANTE", "EXAMENES",
				"APROBAR", "SUSPENDER", "NOTAS", "BIBLIOTECA", "LIBROS", "REVISTAS", "PERIODICO", "LECTOR", "ESCRITOR",
				"NOVELA", "POESIA", "CUENTO", "HISTORIA", "DEPORTISTA", "ENTRENADOR", "COMPETIR", "CAMPEON", "RECORD",
				"MEDALLA", "TROFEO", "ESTADIO", "PISTA", "CAMPO", "VACACIONES", "VIAJE", "HOTEL", "PLAYA", "MONTAÑA",
				"BOSQUE", "DESIERTO", "CIUDAD", "PUEBLO", "ALDEA", "RESTAURANTE", "COMENSAL", "MENU", "PLATO", "BEBIDA",
				"POSTRE", "CUENTA", "PROPINA", "CAMARERO", "COCINERO", "INGENIERIA", "ARQUITECTURA", "MEDICINA",
				"DERECHO", "ECONOMIA", "PSICOLOGIA", "FILOSOFIA", "HISTORIA", "GEOGRAFIA", "MATEMATICA", "QUIMICA",
				"FISICA", "BIOLOGIA", "GEOLOGIA", "ASTRONOMIA", "INFORMATICA", "ELECTRONICA", "MECANICA", "CIVIL",
				"INDUSTRIAL", "LABORATORIO", "EXPERIMENTO", "INVESTIGAR", "CIENTIFICO", "HIPOTESIS", "TEORIA", "LEY",
				"PRINCIPIO", "FORMULA", "ECUACION", "GENERACION", "EVOLUCION", "DESARROLLO", "PROGRESO", "AVANCE",
				"INNOVACION", "TECNOLOGIA", "CIENCIA", "DESCUBRIMIENTO", "INVENTO", "COMUNICACION", "INFORMACION",
				"MENSAJE", "NOTICIA", "REPORTE", "ANUNCIO", "PUBLICIDAD", "MERCADEO", "VENTAS", "CLIENTELA" };

		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

		} while (i < 9);

	}

	// ==============================
	// MÉTODO NIVEL MEDIO
	// ==============================

	public static void nivelMedioFase1(String[] cadena,int [] posiciones) {
		// Matriz 0: Nivel 1 (8-9 letras)
		String[] palabras = new String[1];
		int i = 0;
		int p = 0;
		palabras = new String[] { "SOFTWARE", "HARDWARE", "SISTEMA", "PROGRAMA", "INTERFAZ", "PLATAFORMA", "SERVIDOR",
				"CLIENTE", "RED", "CONEXION", "DATOS", "ARCHIVO", "CARPETA", "DISCO", "MEMORIA", "PROCESO", "HILO",
				"PUERTO", "PROTOCOLO", "PAQUETE", "ENCRIPTAR", "DECODIFICAR", "COMPRIMIR", "DESCOMPRIMIR", "FORMATEAR",
				"INSTALAR", "DESINSTALAR", "ACTUALIZAR", "PARCHE", "VERSION", "LENGUAJE", "SINTAXIS", "SEMANTICA",
				"VARIABLE", "CONSTANTE", "OPERADOR", "EXPRESION", "SENTENCIA", "BUCLE", "CONDICION", "FUNCION",
				"PROCEDIMIENTO", "PARAMETRO", "ARGUMENTO", "RETORNO", "VALOR", "TIPO", "CLASE", "OBJETO", "INSTANCIA",
				"MATERIA", "ENERGIA", "PARTICULA", "ATOMO", "MOLECULA", "ELEMENTO", "COMPUESTO", "MEZCLA", "SOLUCION",
				"REACCION", "GRAVEDAD", "FUERZA", "MOVIMIENTO", "VELOCIDAD", "ACELERACION", "MASA", "PESO", "VOLUMEN",
				"DENSIDAD", "PRESION", "TEMPERATURA", "CALOR", "FRIO", "TERMOMETRO", "BAROMETRO", "MICROSCOPIO",
				"TELESCOPIO", "ESPECTRO", "ONDAS", "SONIDO", "LUZ", "COLOR", "REFLEXION", "REFRACCION", "DIFRACCION",
				"INTERFERENCIA", "POLARIZACION", "LENTE", "ESPEJO", "PRISMA", "ELECTRON", "PROTON", "NEUTRON", "NUCLEO",
				"ORBITA", "NIVEL", "ESTADO", "FASE", "GAS", "LIQUIDO" };

		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

		} while (i < 10);
	}

	public static void nivelMedioFase2(String[] cadena, int [] posiciones) {
		// Matriz 1: Nivel 2 (9-10 letras)
		String[] palabras;
		int i = 0;
		int p = 0;
		palabras = new String[] { "ALGORITMO", "ESTRUCTURA", "SECUENCIA", "ITERACION", "RECURSION", "OPTIMIZAR",
				"EFICIENCIA", "COMPLEJIDAD", "ANALISIS", "DISENO", "IMPLEMENTAR", "PROBAR", "DEPURAR", "ERROR",
				"EXCEPCION", "VALIDAR", "VERIFICAR", "COMPROBAR", "ASEGURAR", "GARANTIZAR", "DOCUMENTAR", "COMENTARIO",
				"EXPLICAR", "DESCRIBIR", "DEFINIR", "ESPECIFICAR", "REQUERIR", "NECESITAR", "REQUISITO", "CONDICION",
				"VARIABLE", "CONSTANTE", "ARREGLO", "MATRIZ", "VECTOR", "LISTA", "PILA", "COLA", "ARBOL", "GRAFO",
				"BUSQUEDA", "ORDENAR", "CLASIFICAR", "FILTRAR", "SELECCIONAR", "INSERTAR", "ELIMINAR", "MODIFICAR",
				"ACTUALIZAR", "CAMBIAR", "BASE", "DATOS", "TABLA", "REGISTRO", "CAMPO", "COLUMNA", "FILA", "CLAVE",
				"PRIMARIA", "FORANEA", "INDICE", "CONSULTA", "SELECCION", "PROYECCION", "UNION", "INTERSECCION",
				"DIFERENCIA", "PRODUCTO", "JUNTAR", "DONDE", "AGRUPAR", "ORDENAR", "TENER", "DISTINTO", "AGREGADO",
				"CONTAR", "SUMA", "PROMEDIO", "MINIMO", "MAXIMO", "TRANSACCION", "COMPROMETER", "REVERTIR",
				"PUNTOGUARDADO", "BLOQUEO", "CONCURRENCIA", "CONSISTENCIA", "AISLAMIENTO", "DURABILIDAD", "ACIDO",
				"NORMALIZAR", "FORMA", "NORMAL", "DENORMALIZAR", "REDUNDANCIA", "INTEGRIDAD", "CONSISTENCIA",
				"SEGURIDAD", "AUDITORIA", "RESPALDO" };
		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

		} while (i < 11);

	}

	

	public static void nivelMedioFase3(String[] cadena, int [] posiciones) {
		// Matriz 2: Nivel 3 (10-11 letras)
		String[] palabras;
		int i = 0;
		int p = 0;
		palabras = new String[] { "PROTOCOLO", "ETHERNET", "ENRUTADOR", "CONMUTADOR", "CONCENTRADOR", "PUENTE",
				"PASARELA", "CORTFUEGOS", "PROXY", "INTERMEDIARIO", "DNS", "DHCP", "HTTP", "HTTPS", "FTP", "SMTP",
				"POP", "IMAP", "SSH", "TELNET", "LAN", "WAN", "MAN", "VPN", "VLAN", "WIFI", "BLUETOOTH", "INFRARROJO",
				"RADIOFRECUENCIA", "MICROONDA", "ANCHOBANDA", "RENDIMIENTO", "LATENCIA", "VARIACION", "PAQUETE",
				"DATAGRAMA", "SEGMENTO", "ENCABEZADO", "CONTENIDO", "SUMACOMPROBACION", "ENRUTAMIENTO", "REENVIO",
				"DIFUSION", "MULTIDIFUSION", "UNDIFUSION", "CUALQUIERDIFUSION", "BANDAANCHA", "BANDA", "ANCHA",
				"ESTRECHA", "ARQUITECTURA", "PATRON", "SINGLETON", "FABRICA", "OBSERVADOR", "ESTRATEGIA", "ADAPTADOR",
				"DECORADOR", "FACHADA", "PROXY", "MICROSERVICIO", "MONOLITO", "SOA", "ESB", "API", "REST", "SOAP",
				"GRAPHQL", "GRPC", "GANCHO", "CONTENEDOR", "DOCKER", "KUBERNETES", "ORQUESTAR", "ESCALAR", "REPLICAR",
				"BALANCEAR", "CARGA", "GRUPO", "NODO", "CONTINUO", "INTEGRACION", "DESPLIEGUE", "ENTREGA", "TUBERIA",
				"FLUJOTRABAJO", "AUTOMATIZAR", "GUION", "CONFIGURAR", "DESPLEGAR", "MONITOREAR", "REGISTRO", "METRICA",
				"ALERTA", "TABLERO", "GRAFANA", "PROMETHEUS", "ELASTICO", "KIBANA", "LOGSTASH" };
		
		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

		} while (i < 12);
	}
	

	// ==============================
	// MÉTODO NIVEL DIFÍCIL
	// ==============================

	public static void niveldificilFase1(String[] cadena, int [] posiciones) {
		// Matriz 0: Nivel 1 (10-11 letras)
		String[] palabras;
		int i = 0;
		int p = 0;
		palabras = new String[] { "INTELIGENCIA", "ARTIFICIAL", "APRENDIZAJE", "MAQUINA", "PROFUNDO", "RED",
				"NEURONAL", "PERCEPTRON", "MULTICAPA", "RETROPROPAGACION", "CONVOLUCIONAL", "RECURRENTE", "GENERATIVO",
				"DISCRIMINATIVO", "CLASIFICACION", "REGRESION", "AGRUPAMIENTO", "ASOCIACION", "SECUENCIA", "SERIE",
				"OPTIMIZACION", "GRADIENTE", "DESCENDENTE", "ESTOCASTICO", "MINILOTE", "EPOCA", "ITERACION",
				"CONVERGENCIA", "DIVERGENCIA", "SOBREAJUSTE", "REGULARIZACION", "ABANDONO", "NORMALIZACION",
				"INICIALIZACION", "HE", "XAVIER", "ACTIVACION", "RELU", "SIGMOIDE", "TANH", "ENTROPIA", "CRUZADA",
				"PERDIDA", "FUNCION", "COSTO", "PRECISION", "RECUERDO", "F1", "MATRIZ", "CONFUSION", "ESTADISTICA",
				"PROBABILIDAD", "DISTRIBUCION", "NORMAL", "UNIFORME", "BINOMIAL", "POISSON", "EXPONENCIAL", "GAUSSIANA",
				"LAPLACE", "MEDIA", "MEDIANA", "MODA", "VARIANZA", "DESVIACION", "ESTANDAR", "COVARIANZA",
				"CORRELACION", "REGRESION", "LINEAL", "MULTIPLE", "LOGISTICA", "POLINOMIAL", "INTERPOLACION",
				"EXTRAPOLACION", "INTERVALO", "CONFIANZA", "SIGNIFICANCIA", "HIPOTESIS", "NULA", "ALTERNATIVA",
				"PVALOR", "ALFA", "BETA", "POTENCIA", "PRUEBA", "TEST", "CHICUADRADO", "ANOVA", "MANNWHITNEY",
				"KRUSKALWALLIS", "WILCOXON", "FRIEDMAN", "SHAPIROWILK", "KOLMOGOROV", "SMIRNOV", "ANDERSONDARLING",
				"LILLIEFORS", "JARQUEBERA", "DAGOSTINO" };
		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

			} while (i < 13);
	  }	
	public static void niveldificilFase2(String[] cadena, int [] posiciones) {
		String[] palabras;
		int i = 0;
		int p = 0;
		// Matriz 1: Nivel 2 (11-12 letras)
		palabras = new String[] { "CARDIOLOGIA", "NEUROLOGIA", "ONCOLOGIA", "PEDIATRIA", "GERIATRIA",
				"TRAUMATOLOGIA", "CIRUGIA", "ORTOPEDIA", "ODONTOLOGIA", "ESTOMATOLOGIA", "OFTALMOLOGIA", "DERMATOLOGIA",
				"GASTROENTEROLOGIA", "NEFROLOGIA", "UROLOGIA", "GINECOLOGIA", "OBSTETRICIA", "ENDOCRINOLOGIA",
				"HEMATOLOGIA", "INMUNOLOGIA", "ANESTESIOLOGIA", "RADIOLOGIA", "PATOLOGIA", "MICROBIOLOGIA",
				"PARASITOLOGIA", "VIROLOGIA", "BACTERIOLOGIA", "MICOLOGIA", "PROTOZOOLOGIA", "HELMINTOLOGIA",
				"FARMACOLOGIA", "TOXICOLOGIA", "BIOQUIMICA", "FISIOLOGIA", "ANATOMIA", "HISTOLOGIA", "EMBRIOLOGIA",
				"GENETICA", "MOLECULAR", "CELULAR", "EPIDEMIOLOGIA", "SALUD", "PUBLICA", "PREVENCION", "PROMOCION",
				"REHABILITACION", "FISIOTERAPIA", "TERAPIA", "OCUPACIONAL", "LOGOPEDIA", "CONSTITUCIONAL",
				"ADMINISTRATIVO", "PENAL", "CIVIL", "MERCANTIL", "LABORAL", "FISCAL", "TRIBUTARIO", "INTERNACIONAL",
				"PUBLICO", "PRIVADO", "PROCESAL", "CONTRACTUAL", "EXTRACONTRACTUAL", "OBLIGACIONES", "CONTRATOS",
				"SOCIEDADES", "ASOCIACIONES", "FUNDACIONES", "COOPERATIVAS", "PROPIEDAD", "INTELECTUAL", "INDUSTRIAL",
				"AUTOR", "PATENTE", "MARCA", "REGISTRO", "DERECHOS", "AUTORALES", "REPRODUCCION", "DISTRIBUCION",
				"COMUNICACION", "PUBLICA", "TRANSFORMACION", "ADAPTACION", "TRADUCCION", "CITA", "PARODIA",
				"CARICATURA", "PASTICHE", "ARBITRAJE", "MEDIACION", "CONCILIACION", "NEGOCIACION", "LITIGIO", "JUICIO",
				"SENTENCIA", "APELACION", "CASACION", "RECURSO" };
		
		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

		} while (i < 14);
	}
	public static void niveldificilFase3(String[] cadena, int [] posiciones) {
		String[] palabras;
		int i = 0;
		int p = 0;
		// Matriz 2: Nivel 3 (12-13 letras)
		palabras = new String[] { "EPISTEMOLOGIA", "ONTOLOGIA", "METAFISICA", "ETICA", "ESTETICA", "LOGICA",
				"HERMENEUTICA", "FENOMENOLOGIA", "EXISTENCIALISMO", "ESTRUCTURALISMO", "POSESTRUCTURALISMO",
				"DECONSTRUCCION", "POSMODERNISMO", "CRITICA", "TEORIA", "SOCIAL", "SOCIOLOGIA", "ANTROPOLOGIA",
				"CULTURAL", "FISICA", "PSICOLOGIA", "COGNITIVA", "CONDUCTUAL", "HUMANISTA", "PSICOANALISIS", "GESTALT",
				"SISTEMICA", "TRANSPERSONAL", "POSITIVA", "EVOLUTIVA", "ECONOMIA", "POLITICA", "MICROECONOMIA",
				"MACROECONOMIA", "DESARROLLO", "SUSTENTABLE", "GLOBALIZACION", "NEOLIBERALISMO", "KEYNESIANISMO",
				"MARXISMO", "COMUNISMO", "SOCIALISMO", "CAPITALISMO", "DEMOCRACIA", "AUTOCRACIA", "TOTALITARISMO",
				"AUTORITARISMO", "PLURALISMO", "MULTICULTURALISMO", "INTERCULTURALIDAD", "NANOTECNOLOGIA",
				"BIOTECNOLOGIA", "AERONAUTICA", "ASTRONAUTICA", "ROBOTICA", "MECATRONICA", "AUTOMATIZACION",
				"INSTRUMENTACION", "CONTROL", "PROCESOS", "TELEMATICA", "TELECOMUNICACION", "SATELITAL", "FIBRAOPTICA",
				"OPTOELECTRONICA", "FOTONICA", "CUANTICA", "COMPUTACION", "INFORMACION", "CRIPTOGRAFIA", "HARDWARE",
				"DESCRIPTIVO", "VERILOG", "VHDL", "FPGA", "ASIC", "MICROPROCESADOR", "MICROCONTROLADOR", "DSP", "GPU",
				"PARALELISMO", "CONCURRENCIA", "DISTRIBUIDO", "ESCALABLE", "RESILIENTE", "TOLERANTE", "FALLOS",
				"RECUPERACION", "DESASTRE", "CONTINGENCIA", "SUSTENTABILIDAD", "MEDIOAMBIENTE", "ECOLOGICO",
				"RENOVABLE", "ENERGIA", "SOLAR", "EOLICA", "HIDRAULICA", "GEOTERMICA", "BIOMASA" };
		
		
		do {

			// Posicion aleatoria entre el tamaño maximo de personas[0].length - 0
			p = rand.nextInt(palabras.length);

			// Guardamos la palbra en una cadena de Strings
			cadena[i] = palabras[p];
			posiciones[i] = p;
			// incrementamos indice
			i++;

		} while (i < 15);
		
	}
	
	
}

