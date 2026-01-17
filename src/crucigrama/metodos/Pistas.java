package crucigrama.metodos;

/**
 * GENERADOR DE PISTAS PARA CRUCIGRAMA
 * Una pista por cada palabra del generador anterior
 * Mismo orden exacto que las matrices de palabras
 */

public class Pistas {
    
    // ==============================
    // PISTAS PARA NIVEL FÁCIL
    // ==============================
    
    public static void pistasfacil() {
        // Pistas para Nivel 1 (6-7 letras)
    	String[][] pistas = new String [3][];
        pistas[0] = new String[] {
            "Lugar hogar vivienda", "Mueble patas superficie", "Animal compañero fiel", "Felino doméstico mascota",
            "Astro noche brillante", "Planta color aroma", "Agua salada extensa", "Corriente agua dulce",
            "Vapor cielo blanco", "Parte árbol verde", "Planta tronco ramas", "Alimento harina horno",
            "Felino selva melena", "Animal oso hiberna", "Roedor cola larga", "Animal agua branquias",
            "Animal plumas vuela", "Malla pesca captura", "Asiento respaldo patas", "Entrada salida marco",
            "Cristal marco vista", "Vehículo motor ruedas", "Embarcación mar agua", "Aeronave alas motor",
            "Bicicleta pedales ruedas", "Motocicleta motor rápido", "Círculo giro automóvil", "Vía coches circulación",
            "Espacio ciudad edificios", "Área verde árboles", "Texto hojas leer", "Instrumento escribir grafito",
            "Material escribir imprimir", "Imagen captura momento", "Grabación imagen sonido", "Sonido ritmo melodía",
            "Movimiento música cuerpo", "Diversión actividad reglas", "Punto deporte anotación", "Objeto redondo jugar",
            "Espacio plantas flores", "Agua surtidor decorativo", "Marco pintura imagen", "Vocal sonido canción",
            "Actividad física competencia", "Pase balón compañero", "Disparo objetivo punto", "Raqueta tenis pelota",
            "Terreno deporte juego", "Persona cercana afecto", "Grupo padres hijos", "Hermano varón familiar",
            "Progenitor masculino familia", "Progenitor femenino familia", "Descendiente varón padres", "Familiar hermano padre",
            "Familiar hermana madre", "Anciano familia experiencia", "Nieto hijo abuelos", "Centro enseñanza aprendizaje",
            "Grupo alumnos materia", "Estudiante pupilo aprender", "Maestro docente enseñar", "Sala clases pupitres",
            "Patio colegio recreo", "Receso descanso juego", "Prueba evaluación conocimiento", "Calificación resultado examen",
            "Materia asignatura estudio", "Alimento comer nutrir", "Líquido transparente vital", "Bebida blanca láctea",
            "Alimento animal proteína", "Alimento planta dulce", "Vegetal hortaliza salud", "Grano cocido alimento",
            "Pasta italiana spaghetti", "Duración minutos horas", "Unidad tiempo sesenta", "Período luz sol",
            "Período oscuridad luna", "Período siete días", "Período treinta días", "Período doce meses",
            "Día mes año específico", "Reloj hora minutos", "Calendario meses días", "Estación frío nieve",
            "Estación calor sol", "Estación hojas caen", "Estación flores brotan", "Mes primero año",
            "Mes segundo año", "Mes tercero año", "Mes cuarto año", "Mes quinto año",
            "Mes sexto año", "Mes séptimo año", "Mes octavo año", "Mes noveno año"
        };
        
        // Pistas para Nivel 2 (7-8 letras)
        pistas[1] = new String[] {
            "Aparato imágenes noticias", "Medio comunicación sonido", "Dispositivo llamar hablar", "Teléfono móvil portátil",
            "Dispositivo pantalla táctil", "Ordenador portátil móvil", "Cuarto cocinar alimentos", "Habitación dormir cama",
            "Cuarto bañarse lavarse", "Sala reunir sentarse", "Lugar guardar automóvil", "Terraza exterior asiento",
            "Balcón ventana exterior", "Ascensor subir bajar", "Escalera peldaños subir", "Pasillo corredor conectar",
            "Centro médico enfermos", "Establecimiento medicamentos", "Profesional salud curar", "Personal enfermería asistir",
            "Ciencia curar enfermedades", "Película cine actores", "Serie televisión capítulos", "Actor interpreta personaje",
            "Actriz femenina personaje", "Director película guía", "Guion historia diálogos", "Escena parte película",
            "Espectadores teatro cine", "Teatro obra actuación", "Pintura colores lienzo", "Dibujo lápiz papel",
            "Rojo azul amarillo tonalidad", "Pincel pintar brochas", "Lienzo tela pintar", "Galería arte exposiciones",
            "Museo arte historia", "Arte creatividad expresión", "Artista creador obra", "Obra creación artística",
            "Establecimiento comprar vender", "Mercado productos puestos", "Supermercado alimentos compra", "Caja dinero cobrar",
            "Comprador cliente adquirir", "Vendedor comerciante ofrecer", "Precio valor costo", "Oferta descuento precio",
            "Comprar adquirir pagar", "Vender ofrecer cobrar", "Ordenador procesar datos", "Impresora papel documentos",
            "Escaner digitalizar imágenes", "Televisor pantalla grande", "Consola videojuegos controles", "Joystick mando jugar",
            "Volante coche dirección", "Freno detener parar", "Acelerador velocidad motor", "Motor máquina movimiento",
            "Carrocería chasis automóvil", "Neumático rueda goma", "Gasolina combustible motor", "Diesel combustible pesado",
            "Eléctrico corriente energía", "Batería acumular energía", "Cargador recargar energía", "Enchufe conexión corriente",
            "Corriente flujo eléctrico", "Voltaje tensión eléctrica", "Programación código instrucciones", "Algoritmo pasos solución",
            "Variable valor cambia", "Función cálculo resultado", "Clase objeto plantilla", "Objeto instancia clase",
            "Método función clase", "Código instrucciones programa", "Compilar traducir código", "Ejecutar correr programa",
            "Internet red mundial conexión", "Navegador web páginas", "Página web sitio", "Enlace URL dirección",
            "Buscar encontrar información", "Resultado búsqueda respuesta", "Descargar bajar archivo", "Subir cargar archivo",
            "Archivo documento datos", "Carpeta directorio archivos", "Documento texto información", "Presentación diapositivas exposición",
            "Cálculo operaciones matemáticas", "Fórmula ecuación matemática", "Celda tabla hoja", "Fila horizontal tabla",
            "Columna vertical tabla", "Tabla datos organizados", "Gráfico visual datos", "Diagrama esquema representación"
        };
        
        // Pistas para Nivel 3 (8-9 letras)
        pistas[2] = new String[] {
            "Institución superior estudios", "Facultad departamento especialidad", "Profesión estudio título", "Asignatura tema aprender",
            "Profesor docente enseñar", "Estudiante alumno aprender", "Exámenes pruebas evaluación", "Aprobar pasar satisfactorio",
            "Suspender reprobar fracasar", "Notas calificaciones resultados", "Biblioteca libros préstamo", "Libros lectura conocimiento",
            "Revistas publicación periódica", "Periódico diario noticias", "Lector persona lee", "Escritor autor textos",
            "Novela narrativa extensa", "Poesía verso rima", "Cuento relato corto", "Historia pasado eventos",
            "Deportista atleta competidor", "Entrenador prepara atletas", "Competir rivalidad ganar", "Campeón ganador primero",
            "Récord mejor marca", "Medalla premio metal", "Trofeo copa premio", "Estadio instalación deportiva",
            "Pista carrera atletismo", "Campo terreno deporte", "Vacaciones descanso viaje", "Viaje desplazamiento destino",
            "Hotel alojamiento habitaciones", "Playa arena mar", "Montaña elevación terreno", "Bosque árboles naturaleza",
            "Desierto arena seco", "Ciudad urbana edificios", "Pueblo pequeño rural", "Aldea casas pequeño",
            "Restaurante comida servir", "Comensal cliente comer", "Menú platos opciones", "Plato comida preparada",
            "Bebida líquido tomar", "Postre dulce final", "Cuenta factura pagar", "Propina agradecimiento servicio",
            "Camarero mesero servir", "Cocinero chef preparar", "Ingeniería técnica diseño", "Arquitectura edificios diseño",
            "Medicina ciencia salud", "Derecho leyes justicia", "Economía dinero recursos", "Psicología mente comportamiento",
            "Filosofía pensamiento ideas", "Historia pasado humano", "Geografía tierra lugares", "Matemáticas números cálculos",
            "Química elementos reacciones", "Física materia energía", "Biología seres vivos", "Geología rocas tierra",
            "Astronomía estrellas espacio", "Informática computadoras datos", "Electrónica circuitos componentes", "Mecánica máquinas movimiento",
            "Civil construcción edificios", "Industrial fábricas producción", "Laboratorio experimentos ciencia", "Experimento prueba hipótesis",
            "Investigar estudiar profundamente", "Científico investigación ciencia", "Hipótesis suposición verificar", "Teoría explicación principios",
            "Ley norma obligatoria", "Principio base fundamental", "Fórmula expresión matemática", "Ecuación igualdad matemática",
            "Generación grupo misma época", "Evolución cambio desarrollo", "Desarrollo crecimiento avance", "Progreso mejora avance",
            "Avance adelanto innovación", "Innovación novedad creación", "Tecnología aplicación ciencia", "Ciencia conocimiento sistemático",
            "Descubrimiento hallazgo nuevo", "Invento creación nueva", "Comunicación información intercambio", "Información datos conocimiento",
            "Mensaje comunicación texto", "Noticia información actual", "Reporte informe detallado", "Anuncio aviso publicidad",
            "Publicidad promoción productos", "Mercadeo ventas estrategia", "Ventas comercializar productos", "Clientela compradores habituales"
        };
    }
    
    // ==============================
    // PISTAS PARA NIVEL MEDIO
    // ==============================
    
    public static void pistasmedio() {
        // Pistas para Nivel 1 (8-9 letras)
    	String[][] pistas = new String [3][];
        pistas[0] = new String[] {
            "Programas computadora ejecutar", "Componentes físicos computadora", "Sistema conjunto organizado", "Programa instrucciones ejecutar",
            "Interfaz usuario pantalla", "Plataforma base aplicaciones", "Servidor provee servicios", "Cliente consume servicios",
            "Red conexión dispositivos", "Conexión enlace comunicación", "Datos información procesar", "Archivo documento almacenado",
            "Carpeta contenedor archivos", "Disco almacenamiento datos", "Memoria almacenar temporal", "Proceso programa ejecución",
            "Hilo ejecución paralela", "Puerto conexión entrada", "Protocolo reglas comunicación", "Paquete datos enviados",
            "Encriptar codificar secreto", "Decodificar descifrar mensaje", "Comprimir reducir tamaño", "Descomprimir expandir tamaño",
            "Formatear preparar disco", "Instalar poner programa", "Desinstalar quitar programa", "Actualizar mejorar versión",
            "Parche corrección error", "Versión edición software", "Lenguaje comunicación código", "Sintaxis estructura código",
            "Semántica significado código", "Variable cambia valor", "Constante fijo valor", "Operador acción cálculo",
            "Expresión cálculo valor", "Sentencia instrucción completa", "Bucle repetición código", "Condición si entonces",
            "Función subprograma retorna", "Procedimiento subprograma ejecuta", "Parámetro entrada función", "Argumento valor parámetro",
            "Retorno resultado función", "Valor dato numérico", "Tipo clase datos", "Clase plantilla objetos",
            "Objeto instancia datos", "Instancia creación objeto", "Materia sustancia física", "Energía capacidad trabajo",
            "Partícula pequeña materia", "Átomo unidad básica", "Molécula átomos unidos", "Elemento sustancia pura",
            "Compuesto elementos combinados", "Mezcla sustancias combinadas", "Solución líquido disuelto", "Reacción cambio químico",
            "Gravedad fuerza atracción", "Fuerza empuje tracción", "Movimiento cambio posición", "Velocidad rapidez movimiento",
            "Aceleración cambio velocidad", "Masa cantidad materia", "Peso fuerza gravedad", "Volumen espacio ocupa",
            "Densidad masa volumen", "Presión fuerza área", "Temperatura calor frío", "Calor energía térmica",
            "Frío baja temperatura", "Termómetro mide temperatura", "Barómetro presión aire", "Microscopio ver pequeño",
            "Telescopio ver lejos", "Espectro colores luz", "Ondas vibración propagación", "Sonido oído vibración",
            "Luz visible visión", "Color percepción visual", "Reflexión rebote luz", "Refracción desviación luz",
            "Difracción dispersión ondas", "Interferencia ondas superponen", "Polarización luz dirección", "Lente vidrio aumenta",
            "Espejo superficie refleja", "Prisma descompone luz", "Electrón partícula negativa", "Protón partícula positiva",
            "Neutrón partícula neutra", "Núcleo centro átomo", "Órbita trayectoria electrón", "Nivel energía electrón",
            "Estado sólido líquido", "Fase estado materia", "Gas fluido expande", "Líquido fluido volumen"
        };
        
        // Pistas para Nivel 2 (9-10 letras)
        pistas[1] = new String[] {
            "Algoritmo pasos solución", "Estructura organización datos", "Secuencia orden elementos", "Iteración repetición proceso",
            "Recursión función misma", "Optimizar mejorar eficiencia", "Eficiencia recursos tiempo", "Complejidad dificultad problema",
            "Análisis estudio detallado", "Diseño plan creación", "Implementar poner práctica", "Probar verificar funciona",
            "Depurar corregir errores", "Error fallo código", "Excepción situación anormal", "Validar comprobar correcto",
            "Verificar confirmar exacto", "Comprobar asegurar verdad", "Asegurar garantizar seguro", "Garantizar asegurar calidad",
            "Documentar describir código", "Comentario explicación código", "Explicar aclarar entender", "Describir detallar características",
            "Definir establecer significado", "Especificar detallar requisitos", "Requerir necesitar obligatorio", "Necesitar requerir indispensable",
            "Requisito condición necesaria", "Condición requisito cumplir", "Variable cambia valor", "Constante fijo invariable",
            "Arreglo lista elementos", "Matriz tabla bidimensional", "Vector dirección magnitud", "Lista colección elementos",
            "Pila último primero", "Cola primero primero", "Árbol estructura ramificada", "Grafo nodos conexiones",
            "Búsqueda encontrar elemento", "Ordenar organizar secuencia", "Clasificar agrupar similar", "Filtrar seleccionar criterio",
            "Seleccionar escoger opción", "Insertar agregar elemento", "Eliminar quitar elemento", "Modificar cambiar elemento",
            "Actualizar renovar datos", "Cambiar modificar diferente", "Base datos almacenamiento", "Datos información almacenada",
            "Tabla datos organizados", "Registro fila datos", "Campo columna datos", "Columna vertical tabla",
            "Fila horizontal tabla", "Clave identificador único", "Primaria clave principal", "Foránea clave referencia",
            "Índice búsqueda rápida", "Consulta pregunta datos", "Selección filtrar datos", "Proyección columnas específicas",
            "Unión combinar tablas", "Intersección común ambas", "Diferencia no común", "Producto combinación completa",
            "Juntar unir tablas", "Donde condición filtro", "Agrupar juntar similar", "Ordenar organizar secuencia",
            "Tener condición agrupación", "Distinto diferente único", "Agregado función grupo", "Contar número elementos",
            "Suma total adición", "Promedio media valores", "Mínimo valor menor", "Máximo valor mayor",
            "Transacción operación completa", "Comprometer confirmar cambios", "Revertir deshacer cambios", "Punto guardado marcador",
            "Bloqueo acceso exclusivo", "Concurrencia simultáneo acceso", "Consistencia datos coherentes", "Aislamiento independencia transacciones",
            "Durabilidad cambios permanentes", "Ácido propiedades transacciones", "Normalizar organizar datos", "Forma estructura organización",
            "Normal estándar forma", "Denormalizar optimizar consultas", "Redundancia repetición datos", "Integridad datos correctos",
            "Consistencia coherencia datos", "Seguridad protección acceso", "Auditoría revisión registros", "Respaldo copia seguridad"
        };
        
        // Pistas para Nivel 3 (10-11 letras)
        pistas[2] = new String[] {
            "Protocolo reglas comunicación", "Ethernet cable red", "Enrutador direcciona paquetes", "Conmutador conecta dispositivos",
            "Concentrador reparte señal", "Puente conecta redes", "Pasarela puente redes", "Cortafuegos seguridad red",
            "Proxy intermediario red", "Intermediario agente medio", "DNS nombres direcciones", "DHCP direcciones automáticas",
            "HTTP web páginas", "HTTPS web seguro", "FTP transferir archivos", "SMTP correo enviar",
            "POP correo recibir", "IMAP correo servidor", "SSH conexión segura", "Telnet conexión remota",
            "LAN red local", "WAN red amplia", "MAN red metropolitana", "VPN red privada",
            "VLAN red virtual", "Wifi red inalámbrica", "Bluetooth corto alcance", "Infrarrojo luz invisible",
            "Radiofrecuencia ondas radio", "Microonda onda corta", "Anchobanda capacidad transmisión", "Rendimiento eficiencia velocidad",
            "Latencia retardo tiempo", "Variación fluctuación retardo", "Paquete datos enviados", "Datagrama paquete red",
            "Segmento parte datos", "Encabezado información control", "Contenido datos útiles", "Sumacomprobación verificar integridad",
            "Enrutamiento dirigir paquetes", "Reenvío pasar adelante", "Difusión enviar todos", "Multidifusión enviar grupo",
            "Undifusión enviar uno", "Cualquierdifusión enviar cualquiera", "Bandaancha alta velocidad", "Banda frecuencia ancha",
            "Ancha amplia capacidad", "Estrecha limitada capacidad", "Arquitectura diseño estructura", "Patrón solución común",
            "Singleton única instancia", "Fábrica crear objetos", "Observador notificar cambios", "Estrategia algoritmo intercambiable",
            "Adaptador convertir interfaz", "Decorador agregar funcionalidad", "Fachada interfaz simplificada", "Proxy representante objeto",
            "Microservicio servicio pequeño", "Monolito aplicación única", "SOA servicios orientados", "ESB bus servicios",
            "API interfaz programación", "REST estilo arquitectura", "SOAP protocolo mensajes", "GraphQL consulta datos",
            "GRPC llamada remota", "Gancho enlace evento", "Contenedor empaquetar aplicación", "Docker plataforma contenedores",
            "Kubernetes orquestar contenedores", "Orquestar coordinar servicios", "Escalar aumentar capacidad", "Replicar copiar instancias",
            "Balancear distribuir carga", "Carga trabajo servidores", "Grupo conjunto nodos", "Nodo punto red",
            "Continuo sin interrupción", "Integración combinar código", "Despliegue poner producción", "Entrega entregar producto",
            "Tubería proceso automatizado", "Flujotrabajo secuencia pasos", "Automatizar hacer automático", "Guión script comandos",
            "Configurar ajustar parámetros", "Desplegar implementar sistema", "Monitorear observar sistema", "Registro eventos sistema",
            "Métrica medida rendimiento", "Alerta aviso problema", "Tablero panel indicadores", "Grafana visualizar métricas",
            "Prometheus monitor sistema", "Elástico adaptable escala", "Kibana visualizar datos", "Logstash procesar logs"
        };
    }
    
    // ==============================
    // PISTAS PARA NIVEL DIFÍCIL
    // ==============================
    
    public static void pistasdificil() {
        // Pistas para Nivel 1 (10-11 letras)
    	String[][] pistas = new String [3][];
        pistas[0] = new String[] {
            "Capacidad resolver problemas", "Hecho humano no natural", "Proceso adquirir conocimiento", "Dispositivo automatizado tareas",
            "Complejo profundo avanzado", "Red interconexión nodos", "Cerebro neuronas conexiones", "Neurona simple entrada",
            "Múltiples capas procesamiento", "Propagar error atrás", "Convolucional filtros imágenes", "Recurrente memoria secuencias",
            "Generativo crear nuevo", "Discriminativo distinguir clases", "Categorizar grupos clases", "Predecir valores continuos",
            "Agrupar similaridades datos", "Relacionar elementos conexos", "Serie ordenada elementos", "Sucesión ordenada eventos",
            "Mejorar maximizar minimizar", "Pendiente función cambio", "Descender mínimo función", "Aleatorio probabilístico proceso",
            "Lote pequeño datos", "Época ciclo entrenamiento", "Repetición proceso bucle", "Acercarse límite valor",
            "Alejarse divergir valores", "Sobreentrenar datos", "Regular evitar sobreajuste", "Desconectar neuronas aleatorio",
            "Normalizar escalar datos", "Inicial valor inicio", "Inicialización He método", "Inicialización Xavier método",
            "Función no linealidad", "RELU rectificada lineal", "Sigmoide forma S", "Tangente hiperbólica función",
            "Medida desorden información", "Cruz entropía pérdida", "Pérdida error modelo", "Función matemática cálculo",
            "Costo precio error", "Exactitud predicciones correctas", "Recordar positivos reales", "Medida F precisión recall",
            "Matriz confusión tabla", "Confusión error clasificación", "Estadística datos análisis", "Probabilidad chance posibilidad",
            "Distribución dispersión valores", "Normal campana Gauss", "Uniforme igual probabilidad", "Binomial éxitos fracasos",
            "Poisson eventos raros", "Exponencial tiempo eventos", "Gaussiana distribución normal", "Laplace doble exponencial",
            "Media promedio valores", "Mediana valor central", "Moda valor frecuente", "Varianza dispersión cuadrada",
            "Desviación dispersión media", "Estándar desviación típica", "Covarianza relación variables", "Correlación dependencia variables",
            "Regresión predecir valor", "Lineal recta relación", "Múltiple varias variables", "Logística probabilidad binaria",
            "Polinomial curva relación", "Interpolación puntos intermedios", "Extrapolar fuera rango", "Intervalo rango valores",
            "Confianza probabilidad cierto", "Significancia importancia resultado", "Hipótesis suposición probar", "Nula hipótesis cero",
            "Alternativa opción principal", "P valor probabilidad resultado", "Alfa error tipo I", "Beta error tipo II",
            "Potencia detectar efecto", "Prueba test estadístico", "Test examen evaluación", "Chi cuadrado distribución",
            "ANOVA varianza análisis", "Mann Whitney no paramétrico", "Kruskal Wallis varios grupos", "Wilcoxon rangos pareados",
            "Friedman bloques repetidos", "Shapiro Wilk normalidad", "Kolmogorov Smirnov distribución", "Anderson Darling ajuste",
            "Lilliefors normalidad muestra", "Jarque Bera normalidad", "D'Agostino normalidad test"
        };
        
        // Pistas para Nivel 2 (11-12 letras)
        pistas[1] = new String[] {
            "Corazón enfermedades cardiovasculares", "Sistema nervioso cerebro", "Cáncer tumores malignos", "Niños pediatría infantil",
            "Ancianos tercera edad", "Traumatismos accidentes lesiones", "Cirugía operación quirúrgica", "Huesos articulaciones sistema",
            "Dientes boca odontología", "Boca dientes estomatología", "Ojos visión oftalmología", "Piel dermatología cutánea",
            "Estómago intestinos digestivo", "Riñones nefrología renal", "Sistema urinario vejiga", "Mujeres ginecología femenino",
            "Embarazo parto obstetricia", "Glándulas hormonas endocrino", "Sangre hematología glóbulos", "Sistema inmune defensas",
            "Anestesia dolor cirugía", "Rayos X imágenes radiológicas", "Enfermedades tejidos patología", "Microbios bacterias pequeños",
            "Parásitos organismos huésped", "Virus infecciones microscópicas", "Bacterias microorganismos unicelulares", "Hongos levaduras mohos",
            "Protozoos organismos unicelulares", "Gusanos helmintos parásitos", "Medicamentos fármacos drogas", "Tóxicos venenos sustancias",
            "Bioquímica química vida", "Funciones cuerpo vivo", "Anatomía estructura cuerpo", "Tejidos células histología",
            "Embrión desarrollo fetal", "Genes herencia ADN", "Molecular moléculas biología", "Celular células unidad",
            "Epidemiología enfermedades población", "Salud bienestar físico", "Pública salud comunidad", "Prevención evitar enfermedades",
            "Promoción fomentar salud", "Rehabilitación recuperación función", "Fisioterapia terapia física", "Terapia tratamiento curación",
            "Ocupacional trabajo actividades", "Logopedia habla lenguaje", "Constitución ley fundamental", "Administración estado gobierno",
            "Penal delitos castigos", "Civil personas propiedades", "Mercantil comercio empresas", "Laboral trabajo empleados",
            "Fiscal impuestos hacienda", "Tributario contribuciones estado", "Internacional países relaciones", "Público estado administración",
            "Privado particulares empresas", "Procesal juicios procedimientos", "Contractual contratos acuerdos", "Extracontractual daños responsabilidad",
            "Obligaciones deberes derechos", "Contratos acuerdo partes", "Sociedades empresas asociadas", "Asociaciones grupo personas",
            "Fundaciones organización sin ánimo", "Cooperativas trabajo conjunto", "Propiedad posesión bienes", "Intelectual ideas creaciones",
            "Industrial inventos marcas", "Autor creador obra", "Patente invención exclusiva", "Marca distintivo producto",
            "Registro anotar oficialmente", "Derechos facultades legales", "Autorales creación literaria", "Reproducción copiar multiplicar",
            "Distribución repartir productos", "Comunicación transmitir información", "Pública accesible todos", "Transformación modificar obra",
            "Adaptación ajustar diferente", "Traducción idioma otro", "Cita referencia texto", "Parodia imitación burlesca",
            "Caricatura exageración rasgos", "Pastiche mezcla estilos", "Arbitraje resolver disputas", "Mediación intermediario conflicto",
            "Conciliación acuerdo partes", "Negociación diálogo acuerdo", "Litigio pleito judicial", "Juicio proceso judicial",
            "Sentencia resolución juez", "Apelación recurrir decisión", "Casación anular sentencia", "Recurso solicitar revisión"
        };
        
        // Pistas para Nivel 3 (12-13 letras)
        pistas[2] = new String[] {
            "Teoría conocimiento verdad", "Estudio ser existencia", "Más allá física realidad", "Moral valores principios",
            "Belleza arte percepción", "Razonamiento válido correcto", "Interpretación textos significado", "Estudio fenómenos conciencia",
            "Existencia libertad angustia", "Estructuras sistemas relaciones", "Post estructuralismo crítico", "Descomponer analizar críticamente",
            "Post moderno relativismo", "Crítica análisis evaluación", "Teoría explicación sistemática", "Social sociedad relaciones",
            "Sociología estudio sociedad", "Antropología humano cultura", "Cultural costumbres tradiciones", "Física materia energía",
            "Psicología mente conducta", "Cognitiva pensamiento memoria", "Conductual comportamiento observable", "Humanista persona potencial",
            "Psicoanálisis inconsciente Freud", "Gestalt forma percepción", "Sistémica sistemas interacciones", "Transpersonal espiritual conciencia",
            "Positiva felicidad bienestar", "Evolutiva desarrollo cambio", "Economía recursos escasos", "Política gobierno poder",
            "Microeconomía individuos empresas", "Macroeconomía país total", "Desarrollo crecimiento económico", "Sustentable medio ambiente",
            "Globalización mundial interdependencia", "Neoliberalismo mercado libre", "Keynesianismo intervención estado", "Marxismo lucha clases",
            "Comunismo propiedad colectiva", "Socialismo medios producción", "Capitalismo propiedad privada", "Democracia pueblo gobierno",
            "Autocracia poder absoluto", "Totalitarismo control total", "Autoritarismo obediencia autoridad", "Pluralismo diversidad ideas",
            "Multiculturalismo varias culturas", "Interculturalidad diálogo culturas", "Nanotecnología átomos moléculas", "Biotecnología organismos vivos",
            "Aeronáutica aviones vuelo", "Astronáutica espacio cohetes", "Robótica robots automatización", "Mecatrónica mecánica electrónica",
            "Automatización procesos automáticos", "Instrumentación medir controlar", "Control regular sistema", "Procesos operaciones secuencia",
            "Telemática telecomunicaciones informática", "Telecomunicación comunicación distancia", "Satelital satélites órbita", "Fibra óptica luz transmitir",
            "Optoelectrónica luz electricidad", "Fotónica partículas luz", "Cuántica física partículas", "Computación procesar información",
            "Información datos conocimiento", "Criptografía cifrar mensajes", "Hardware componentes físicos", "Descriptivo describir sistema",
            "Verilog lenguaje descripción", "VHDL hardware descripción", "FPGA programable puertas", "ASIC circuito específico",
            "Microprocesador CPU central", "Microcontrolador pequeño computador", "DSP procesamiento señal", "GPU gráficos procesamiento",
            "Paralelismo simultáneo tareas", "Concurrencia acceso simultáneo", "Distribuido varios sistemas", "Escalable crecer capacidad",
            "Resiliente recuperar fallos", "Tolerante aceptar errores", "Fallos averías errores", "Recuperación restaurar sistema",
            "Desastre catástrofe emergencia", "Contingencia plan emergencia", "Sustentabilidad mantener recursos", "Medioambiente naturaleza entorno",
            "Ecológico ambiente natural", "Renovable energía infinita", "Energía capacidad trabajo", "Solar sol radiación",
            "Eólica viento molinos", "Hidráulica agua presa", "Geotérmica calor tierra", "Biomasa materia orgánica"
        };
    }
}
