package crucigrama.metodos;

public class Comprobaciones {

	// 1º Comprobar valores repetidos de un array de palabra
	public static boolean valoresRepetidos(String[] palabras) {
		// DECLARAMOS VARIABÑES
		int n;
		boolean encontrado;
		int i;
		int j;

		// INICIALIZAMOS VARIABLES
		n = palabras.length;
		encontrado = false;
		i = 0;
		j = 0;

		if (n > 1) {
			do {
				String str = palabras[i];
				j = i + 1;

				do {
					if (str.equals(palabras[j])) {

						encontrado = true; // Marcamos que encontramos un duplicado
					}
					j++;

					// Salimos del bucle interno si hay coincidencia o si no hay más palabras
				} while (j < n && !encontrado);

				i++;

				// Salimos del bucle externo si hay coincidencia o si llegamos al penúltimo
			} while (i < n - 1 && !encontrado);
		}

		return encontrado;

	}

	// 1º Comprobar valores repetidos de un array de palabra
	public static int posicionvalorRepetidos(String[] palabras) {
		// DECLARAMOS VARIABÑES
		int n;
		boolean encontrado;
		int i;
		int j;

		int valor = 0; // Valor repetido
		// INICIALIZAMOS VARIABLES
		n = palabras.length;
		encontrado = false;
		i = 0;
		j = 0;

		if (n > 1) {
			do {
				String str = palabras[i];
				j = i + 1;

				do {
					if (str.equals(palabras[j])) {
						valor = j;
						encontrado = true; // Marcamos que encontramos un duplicado

					}
					j++;

					// Salimos del bucle interno si hay coincidencia o si no hay más palabras
				} while (j < n && !encontrado);

				i++;

				// Salimos del bucle externo si hay coincidencia o si llegamos al penúltimo
			} while (i < n - 1 && !encontrado);
		}

		return valor;

	}

	// Ofrece nuevo valor ne caso de repetido

	public static void nuevoValor(int fase, String[] palabras) {

		String[][] diccionario = {
				// Nivel Facil - Fase 1
				{ "CASA", "MESA", "PERRO", "GATO", "LUNA", "FLOR", "MAR", "RIO", "NUBE", "HOJA", "ARBOL", "PAN", "LEON",
						"OSO", "RATA", "PEZ", "AVE", "RED", "SILLA", "PUERTA", "VENTANA", "COCHE", "BARCO", "AVION",
						"BICI", "MOTO", "RUEDA", "CALLE", "PLAZA", "PARQUE", "LIBRO", "LAPIZ", "PAPEL", "FOTO", "VIDEO",
						"MUSICA", "BAILE", "JUEGO", "GOL", "PELOTA", "JARDIN", "FUENTE", "CUADRO", "CANTO", "DEPORTE",
						"PASE", "TIRO", "RAQUETA", "CAMPO", "AMIGO", "FAMILIA", "HERMANO", "PADRE", "MADRE", "HIJO",
						"TIO", "TIA", "ABUELO", "NIETO", "ESCUELA", "CLASE", "ALUMNO", "PROFE", "AULA", "PATIO",
						"RECREO", "EXAMEN", "NOTA", "CURSO", "COMIDA", "AGUA", "LECHE", "CARNE", "FRUTA", "VERDURA",
						"ARROZ", "PASTA", "TIEMPO", "HORA", "DIA", "NOCHE", "SEMANA", "MES", "ANO", "FECHA", "RELOJ",
						"CALENDARIO", "INVIERNO", "VERANO", "OTOÑO", "PRIMAVERA", "ENERO", "FEBRERO", "MARZO", "ABRIL",
						"MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE" },
				// Nivel Facil - Fase 2
				{ "TELEVISION", "RADIO", "TELEFONO", "CELULAR", "TABLETA", "PORTATIL", "COCINA", "DORMITORIO", "BANIO",
						"SALON", "GARAJE", "TERRAZA", "BALCON", "ASCENSOR", "ESCALERA", "PASILLO", "HOSPITAL",
						"FARMACIA", "DOCTOR", "ENFERMERO", "MEDICINA", "PELICULA", "SERIE", "ACTOR", "ACTRIS",
						"DIRECTOR", "GUION", "ESCENA", "PUBLICO", "TEATRO", "PINTURA", "DIBUJO", "COLOR", "PINCEL",
						"LIENZO", "GALERIA", "MUSEO", "ARTE", "ARTISTA", "OBRA", "TIENDA", "MERCADO", "SUPER", "CAJA",
						"CLIENTE", "VENDEDOR", "PRECIO", "OFERTA", "COMPRA", "VENTA", "COMPUTADORA", "IMPRESORA",
						"ESCANER", "TELEVISOR", "CONSOLA", "JOYSTICK", "VOLANTE", "FRENO", "ACELERADOR", "MOTOR",
						"CARROCERIA", "NEUMATICO", "GASOLINA", "DIESEL", "ELECTRICO", "BATERIA", "CARGADOR", "ENCHUFE",
						"CORRIENTE", "VOLTAJE", "PROGRAMACION", "ALGORITMO", "VARIABLE", "FUNCION", "CLASE", "OBJETO",
						"METODO", "CODIGO", "COMPILAR", "EJECUTAR", "INTERNET", "NAVEGADOR", "PAGINA", "ENLACE",
						"BUSCAR", "RESULTADO", "DESCARGAR", "SUBIR", "ARCHIVO", "CARPETA", "DOCUMENTO", "PRESENTACION",
						"CALCULO", "FORMULA", "CELDA", "FILA", "COLUMNA", "TABLA", "GRAFICO", "DIAGRAMA" },
				// Nivel Facil - Fase 3
				{ "UNIVERSIDAD", "FACULTAD", "CARRERA", "MATERIA", "PROFESOR", "ESTUDIANTE", "EXAMENES", "APROBAR",
						"SUSPENDER", "NOTAS", "BIBLIOTECA", "LIBROS", "REVISTAS", "PERIODICO", "LECTOR", "ESCRITOR",
						"NOVELA", "POESIA", "CUENTO", "HISTORIA", "DEPORTISTA", "ENTRENADOR", "COMPETIR", "CAMPEON",
						"RECORD", "MEDALLA", "TROFEO", "ESTADIO", "PISTA", "CAMPO", "VACACIONES", "VIAJE", "HOTEL",
						"PLAYA", "MONTAÑA", "BOSQUE", "DESIERTO", "CIUDAD", "PUEBLO", "ALDEA", "RESTAURANTE",
						"COMENSAL", "MENU", "PLATO", "BEBIDA", "POSTRE", "CUENTA", "PROPINA", "CAMARERO", "COCINERO",
						"INGENIERIA", "ARQUITECTURA", "MEDICINA", "DERECHO", "ECONOMIA", "PSICOLOGIA", "FILOSOFIA",
						"HISTORIA", "GEOGRAFIA", "MATEMATICA", "QUIMICA", "FISICA", "BIOLOGIA", "GEOLOGIA",
						"ASTRONOMIA", "INFORMATICA", "ELECTRONICA", "MECANICA", "CIVIL", "INDUSTRIAL", "LABORATORIO",
						"EXPERIMENTO", "INVESTIGAR", "CIENTIFICO", "HIPOTESIS", "TEORIA", "LEY", "PRINCIPIO", "FORMULA",
						"ECUACION", "GENERACION", "EVOLUCION", "DESARROLLO", "PROGRESO", "AVANCE", "INNOVACION",
						"TECNOLOGIA", "CIENCIA", "DESCUBRIMIENTO", "INVENTO", "COMUNICACION", "INFORMACION", "MENSAJE",
						"NOTICIA", "REPORTE", "ANUNCIO", "PUBLICIDAD", "MERCADEO", "VENTAS", "CLIENTELA" },
				// Nivel Medio - Fase 1
				{ "SOFTWARE", "HARDWARE", "SISTEMA", "PROGRAMA", "INTERFAZ", "PLATAFORMA", "SERVIDOR", "CLIENTE", "RED",
						"CONEXION", "DATOS", "ARCHIVO", "CARPETA", "DISCO", "MEMORIA", "PROCESO", "HILO", "PUERTO",
						"PROTOCOLO", "PAQUETE", "ENCRIPTAR", "DECODIFICAR", "COMPRIMIR", "DESCOMPRIMIR", "FORMATEAR",
						"INSTALAR", "DESINSTALAR", "ACTUALIZAR", "PARCHE", "VERSION", "LENGUAJE", "SINTAXIS",
						"SEMANTICA", "VARIABLE", "CONSTANTE", "OPERADOR", "EXPRESION", "SENTENCIA", "BUCLE",
						"CONDICION", "FUNCION", "PROCEDIMIENTO", "PARAMETRO", "ARGUMENTO", "RETORNO", "VALOR", "TIPO",
						"CLASE", "OBJETO", "INSTANCIA", "MATERIA", "ENERGIA", "PARTICULA", "ATOMO", "MOLECULA",
						"ELEMENTO", "COMPUESTO", "MEZCLA", "SOLUCION", "REACCION", "GRAVEDAD", "FUERZA", "MOVIMIENTO",
						"VELOCIDAD", "ACELERACION", "MASA", "PESO", "VOLUMEN", "DENSIDAD", "PRESION", "TEMPERATURA",
						"CALOR", "FRIO", "TERMOMETRO", "BAROMETRO", "MICROSCOPIO", "TELESCOPIO", "ESPECTRO", "ONDAS",
						"SONIDO", "LUZ", "COLOR", "REFLEXION", "REFRACCION", "DIFRACCION", "INTERFERENCIA",
						"POLARIZACION", "LENTE", "ESPEJO", "PRISMA", "ELECTRON", "PROTON", "NEUTRON", "NUCLEO",
						"ORBITA", "NIVEL", "ESTADO", "FASE", "GAS", "LIQUIDO" },
				// Nivel Medio - Fase 2
				{ "ALGORITMO", "ESTRUCTURA", "SECUENCIA", "ITERACION", "RECURSION", "OPTIMIZAR", "EFICIENCIA",
						"COMPLEJIDAD", "ANALISIS", "DISENO", "IMPLEMENTAR", "PROBAR", "DEPURAR", "ERROR", "EXCEPCION",
						"VALIDAR", "VERIFICAR", "COMPROBAR", "ASEGURAR", "GARANTIZAR", "DOCUMENTAR", "COMENTARIO",
						"EXPLICAR", "DESCRIBIR", "DEFINIR", "ESPECIFICAR", "REQUERIR", "NECESITAR", "REQUISITO",
						"CONDICION", "VARIABLE", "CONSTANTE", "ARREGLO", "MATRIZ", "VECTOR", "LISTA", "PILA", "COLA",
						"ARBOL", "GRAFO", "BUSQUEDA", "ORDENAR", "CLASIFICAR", "FILTRAR", "SELECCIONAR", "INSERTAR",
						"ELIMINAR", "MODIFICAR", "ACTUALIZAR", "CAMBIAR", "BASE", "DATOS", "TABLA", "REGISTRO", "CAMPO",
						"COLUMNA", "FILA", "CLAVE", "PRIMARIA", "FORANEA", "INDICE", "CONSULTA", "SELECCION",
						"PROYECCION", "UNION", "INTERSECCION", "DIFERENCIA", "PRODUCTO", "JUNTAR", "DONDE", "AGRUPAR",
						"ORDENAR", "TENER", "DISTINTO", "AGREGADO", "CONTAR", "SUMA", "PROMEDIO", "MINIMO", "MAXIMO",
						"TRANSACCION", "COMPROMETER", "REVERTIR", "PUNTOGUARDADO", "BLOQUEO", "CONCURRENCIA",
						"CONSISTENCIA", "AISLAMIENTO", "DURABILIDAD", "ACIDO", "NORMALIZAR", "FORMA", "NORMAL",
						"DENORMALIZAR", "REDUNDANCIA", "INTEGRIDAD", "CONSISTENCIA", "SEGURIDAD", "AUDITORIA",
						"RESPALDO" },
				// Nivel Medio - Fase 3
				{ "PROTOCOLO", "ETHERNET", "ENRUTADOR", "CONMUTADOR", "CONCENTRADOR", "PUENTE", "PASARELA",
						"CORTFUEGOS", "PROXY", "INTERMEDIARIO", "DNS", "DHCP", "HTTP", "HTTPS", "FTP", "SMTP", "POP",
						"IMAP", "SSH", "TELNET", "LAN", "WAN", "MAN", "VPN", "VLAN", "WIFI", "BLUETOOTH", "INFRARROJO",
						"RADIOFRECUENCIA", "MICROONDA", "ANCHOBANDA", "RENDIMIENTO", "LATENCIA", "VARIACION", "PAQUETE",
						"DATAGRAMA", "SEGMENTO", "ENCABEZADO", "CONTENIDO", "SUMACOMPROBACION", "ENRUTAMIENTO",
						"REENVIO", "DIFUSION", "MULTIDIFUSION", "UNDIFUSION", "CUALQUIERDIFUSION", "BANDAANCHA",
						"BANDA", "ANCHA", "ESTRECHA", "ARQUITECTURA", "PATRON", "SINGLETON", "FABRICA", "OBSERVADOR",
						"ESTRATEGIA", "ADAPTADOR", "DECORADOR", "FACHADA", "PROXY", "MICROSERVICIO", "MONOLITO", "SOA",
						"ESB", "API", "REST", "SOAP", "GRAPHQL", "GRPC", "GANCHO", "CONTENEDOR", "DOCKER", "KUBERNETES",
						"ORQUESTAR", "ESCALAR", "REPLICAR", "BALANCEAR", "CARGA", "GRUPO", "NODO", "CONTINUO",
						"INTEGRACION", "DESPLIEGUE", "ENTREGA", "TUBERIA", "FLUJOTRABAJO", "AUTOMATIZAR", "GUION",
						"CONFIGURAR", "DESPLEGAR", "MONITOREAR", "REGISTRO", "METRICA", "ALERTA", "TABLERO", "GRAFANA",
						"PROMETHEUS", "ELASTICO", "KIBANA", "LOGSTASH" },
				// Nivel Dificil - Fase 1
				{ "INTELIGENCIA", "ARTIFICIAL", "APRENDIZAJE", "MAQUINA", "PROFUNDO", "RED", "NEURONAL", "PERCEPTRON",
						"MULTICAPA", "RETROPROPAGACION", "CONVOLUCIONAL", "RECURRENTE", "GENERATIVO", "DISCRIMINATIVO",
						"CLASIFICACION", "REGRESION", "AGRUPAMIENTO", "ASOCIACION", "SECUENCIA", "SERIE",
						"OPTIMIZACION", "GRADIENTE", "DESCENDENTE", "ESTOCASTICO", "MINILOTE", "EPOCA", "ITERACION",
						"CONVERGENCIA", "DIVERGENCIA", "SOBREAJUSTE", "REGULARIZACION", "ABANDONO", "NORMALIZACION",
						"INICIALIZACION", "HE", "XAVIER", "ACTIVACION", "RELU", "SIGMOIDE", "TANH", "ENTROPIA",
						"CRUZADA", "PERDIDA", "FUNCION", "COSTO", "PRECISION", "RECUERDO", "F1", "MATRIZ", "CONFUSION",
						"ESTADISTICA", "PROBABILIDAD", "DISTRIBUCION", "NORMAL", "UNIFORME", "BINOMIAL", "POISSON",
						"EXPONENCIAL", "GAUSSIANA", "LAPLACE", "MEDIA", "MEDIANA", "MODA", "VARIANZA", "DESVIACION",
						"ESTANDAR", "COVARIANZA", "CORRELACION", "REGRESION", "LINEAL", "MULTIPLE", "LOGISTICA",
						"POLINOMIAL", "INTERPOLACION", "EXTRAPOLACION", "INTERVALO", "CONFIANZA", "SIGNIFICANCIA",
						"HIPOTESIS", "NULA", "ALTERNATIVA", "PVALOR", "ALFA", "BETA", "POTENCIA", "PRUEBA", "TEST",
						"CHICUADRADO", "ANOVA", "MANNWHITNEY", "KRUSKALWALLIS", "WILCOXON", "FRIEDMAN", "SHAPIROWILK",
						"KOLMOGOROV", "SMIRNOV", "ANDERSONDARLING", "LILLIEFORS", "JARQUEBERA", "DAGOSTINO" },
				// Nivel Dificil - Fase 2
				{ "CARDIOLOGIA", "NEUROLOGIA", "ONCOLOGIA", "PEDIATRIA", "GERIATRIA", "TRAUMATOLOGIA", "CIRUGIA",
						"ORTOPEDIA", "ODONTOLOGIA", "ESTOMATOLOGIA", "OFTALMOLOGIA", "DERMATOLOGIA",
						"GASTROENTEROLOGIA", "NEFROLOGIA", "UROLOGIA", "GINECOLOGIA", "OBSTETRICIA", "ENDOCRINOLOGIA",
						"HEMATOLOGIA", "INMUNOLOGIA", "ANESTESIOLOGIA", "RADIOLOGIA", "PATOLOGIA", "MICROBIOLOGIA",
						"PARASITOLOGIA", "VIROLOGIA", "BACTERIOLOGIA", "MICOLOGIA", "PROTOZOOLOGIA", "HELMINTOLOGIA",
						"FARMACOLOGIA", "TOXICOLOGIA", "BIOQUIMICA", "FISIOLOGIA", "ANATOMIA", "HISTOLOGIA",
						"EMBRIOLOGIA", "GENETICA", "MOLECULAR", "CELULAR", "EPIDEMIOLOGIA", "SALUD", "PUBLICA",
						"PREVENCION", "PROMOCION", "REHABILITACION", "FISIOTERAPIA", "TERAPIA", "OCUPACIONAL",
						"LOGOPEDIA", "CONSTITUCIONAL", "ADMINISTRATIVO", "PENAL", "CIVIL", "MERCANTIL", "LABORAL",
						"FISCAL", "TRIBUTARIO", "INTERNACIONAL", "PUBLICO", "PRIVADO", "PROCESAL", "CONTRACTUAL",
						"EXTRACONTRACTUAL", "OBLIGACIONES", "CONTRATOS", "SOCIEDADES", "ASOCIACIONES", "FUNDACIONES",
						"COOPERATIVAS", "PROPIEDAD", "INTELECTUAL", "INDUSTRIAL", "AUTOR", "PATENTE", "MARCA",
						"REGISTRO", "DERECHOS", "AUTORALES", "REPRODUCCION", "DISTRIBUCION", "COMUNICACION", "PUBLICA",
						"TRANSFORMACION", "ADAPTACION", "TRADUCCION", "CITA", "PARODIA", "CARICATURA", "PASTICHE",
						"ARBITRAJE", "MEDIACION", "CONCILIACION", "NEGOCIACION", "LITIGIO", "JUICIO", "SENTENCIA",
						"APELACION", "CASACION", "RECURSO" },
				// Nivel Dificil - Fase 3
				{ "EPISTEMOLOGIA", "ONTOLOGIA", "METAFISICA", "ETICA", "ESTETICA", "LOGICA", "HERMENEUTICA",
						"FENOMENOLOGIA", "EXISTENCIALISMO", "ESTRUCTURALISMO", "POSESTRUCTURALISMO", "DECONSTRUCCION",
						"POSMODERNISMO", "CRITICA", "TEORIA", "SOCIAL", "SOCIOLOGIA", "ANTROPOLOGIA", "CULTURAL",
						"FISICA", "PSICOLOGIA", "COGNITIVA", "CONDUCTUAL", "HUMANISTA", "PSICOANALISIS", "GESTALT",
						"SISTEMICA", "TRANSPERSONAL", "POSITIVA", "EVOLUTIVA", "ECONOMIA", "POLITICA", "MICROECONOMIA",
						"MACROECONOMIA", "DESARROLLO", "SUSTENTABLE", "GLOBALIZACION", "NEOLIBERALISMO",
						"KEYNESIANISMO", "MARXISMO", "COMUNISMO", "SOCIALISMO", "CAPITALISMO", "DEMOCRACIA",
						"AUTOCRACIA", "TOTALITARISMO", "AUTORITARISMO", "PLURALISMO", "MULTICULTURALISMO",
						"INTERCULTURALIDAD", "NANOTECNOLOGIA", "BIOTECNOLOGIA", "AERONAUTICA", "ASTRONAUTICA",
						"ROBOTICA", "MECATRONICA", "AUTOMATIZACION", "INSTRUMENTACION", "CONTROL", "PROCESOS",
						"TELEMATICA", "TELECOMUNICACION", "SATELITAL", "FIBRAOPTICA", "OPTOELECTRONICA", "FOTONICA",
						"CUANTICA", "COMPUTACION", "INFORMACION", "CRIPTOGRAFIA", "HARDWARE", "DESCRIPTIVO", "VERILOG",
						"VHDL", "FPGA", "ASIC", "MICROPROCESADOR", "MICROCONTROLADOR", "DSP", "GPU", "PARALELISMO",
						"CONCURRENCIA", "DISTRIBUIDO", "ESCALABLE", "RESILIENTE", "TOLERANTE", "FALLOS", "RECUPERACION",
						"DESASTRE", "CONTINGENCIA", "SUSTENTABILIDAD", "MEDIOAMBIENTE", "ECOLOGICO", "RENOVABLE",
						"ENERGIA", "SOLAR", "EOLICA", "HIDRAULICA", "GEOTERMICA", "BIOMASA" } };

		// 0 - 2 : Fase Facil | 3 - 5 Fase Media | 6 - 8 Fase Dificl

		int i = 0; // Índice del diccionario
		boolean hayRepetidos;
		int j;
		do {
			// 1. Buscamos la posición de CUALQUIER repetido que quede
			j = posicionvalorRepetidos(palabras);

			// Si ya no hay ninguna posición repetida (-1), salimos del bucle
			if (j == -1) {
				hayRepetidos = false;
			} else {
				// 2. Si hay un repetido en 'j', le ponemos una palabra nueva del diccionario
				if (i < diccionario[fase].length) {
					palabras[j] = diccionario[fase][i];
					i++; // Avanzamos a la siguiente palabra para que no se repita la solución
				}

				// 3. Volvemos a preguntar: ¿Sigue habiendo repetidos después de este cambio?
				hayRepetidos = valoresRepetidos(palabras);
			}

			// 4. MIENTRAS existan repetidos y tengamos palabras en el diccionario, seguimos
		} while (hayRepetidos && i < diccionario[fase].length);

	}
	
	
	// Funcion que define las columnas individualmente y llena la matriz
	public static void medidaCadena(String[] palabras, char[][] caracteres) {

	    // RECORREMOS EL ARRAY DE PALABRAS
		int tamanoIndividual;
		tamanoIndividual = 0;
	    	for (int i = 0; i < palabras.length; i++) {

	        // 1. EXTRAEMOS EL TAMAÑO DE LA PALABRA ACTUAL
	        tamanoIndividual = palabras[i].length();

	        // 2. INICIALIZAMOS LAS COLUMNAS DE ESTA FILA ESPECÍFICA
	        // Esto crea el espacio exacto para cada palabra (Matriz Irregular)
	        caracteres[i] = new char[tamanoIndividual];

	        // 3. LLENAMOS LA FILA CON SUS CARACTERES
	        for (int j = 0; j < tamanoIndividual; j++) {
	            caracteres[i][j] = palabras[i].charAt(j);
	        }
	    }
	    // Nota: He cambiado el retorno a 'void' porque la matriz se modifica por referencia
	}

	// Función que SOLO llena los espacios ya inicializados con las letras
	public static void llenarLetras(String[] palabras, char[][] caracteres) {

	    for (int i = 0; i < palabras.length; i++) {
	        // Recorremos la longitud de la palabra actual
	        // (Podemos usar palabras[i].length() o caracteres[i].length)
	        for (int j = 0; j < palabras[i].length(); j++) {
	            
	            // Asignamos el carácter a la posición exacta de la matriz irregular
	            caracteres[i][j] = palabras[i].charAt(j);
	            
	        }
	    }
	}

}
