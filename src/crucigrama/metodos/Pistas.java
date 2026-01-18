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
    
    public static void pistasFacilFase1(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 1 (6-7 letras)
    	String[] pistas;
        pistas = new String[] {
            "Lugar hogar vivienda", "Mueble patas superficie", "Animal compañero fiel", "Felino doméstico mascota",
            "Astro noche brillante", "Planta color aroma", "Agua salada extensa", "Corriente agua dulce",
            "Vapor cielo blanco", "Parte vegetal verde", "Planta tronco ramas", "Alimento harina horno",
            "Felino selva melena", "Plantígrado grande hiberna", "Roedor cola larga", "Animal agua branquias",
            "Animal plumas vuela", "Malla pesca captura", "Asiento respaldo patas", "Entrada salida marco",
            "Cristal marco vista", "Vehículo motor ruedas", "Embarcación mar agua", "Aeronave alas motor",
            "Vehículo pedales ruedas", "Vehículo dos ruedas rápido", "Círculo giro automóvil", "Vía coches circulación",
            "Espacio ciudad edificios", "Área verde árboles", "Texto hojas leer", "Instrumento escribir grafito",
            "Material escribir imprimir", "Imagen captura momento", "Grabación imagen sonido", "Sonido ritmo melodía",
            "Movimiento música cuerpo", "Diversión actividad reglas", "Punto deporte anotación", "Objeto redondo jugar",
            "Espacio plantas flores", "Agua surtidor decorativo", "Marco tela imagen", "Vocal sonido canción",
            "Actividad física competencia", "Entrega balón compañero", "Disparo objetivo punto", "Instrumento tenis malla",
            "Terreno deporte juego", "Persona cercana afecto", "Grupo padres hijos", "Varón mismo progenitor",
            "Progenitor masculino familia", "Progenitor femenino familia", "Descendiente varón padres", "Familiar hermano padre",
            "Familiar hermana madre", "Anciano familia experiencia", "Hijo de los hijos", "Centro enseñanza aprendizaje",
            "Grupo alumnos materia", "Estudiante pupilo aprender", "Maestro docente enseñar", "Sala clases pupitres",
            "Patio colegio descanso", "Receso descanso juego", "Prueba evaluación conocimiento", "Calificación resultado examen",
            "Materia asignatura estudio", "Nutriente comer sustento", "Líquido transparente vital", "Bebida blanca nutritiva",
            "Alimento animal proteína", "Alimento planta dulce", "Hortaliza colorada o verde", "Grano blanco cocido",
            "Harina italiana cocida", "Duración minutos horas", "Unidad sesenta minutos", "Período luz sol",
            "Período oscuridad nocturna", "Período siete días", "Período treinta días", "Período doce meses",
            "Día mes año específico", "Aparato mide minutos", "Lista meses días", "Estación frío nieve",
            "Estación calor sol", "Estación hojas caen", "Estación flores brotan", "Mes primero año",
            "Mes segundo año", "Mes tercero año", "Mes cuarto año", "Mes quinto año",
            "Mes sexto año", "Mes séptimo año", "Mes octavo año", "Mes noveno año"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }
    
    public static void pistasFacilFase2(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 2 (7-8 letras)
    	String[] pistas;
        pistas = new String[] {
            "Aparato imágenes noticias", "Medio comunicación sonido", "Dispositivo llamar hablar", "Dispositivo móvil portátil",
            "Dispositivo pantalla táctil", "Ordenador plegable móvil", "Cuarto cocinar alimentos", "Habitación descanso cama",
            "Cuarto aseo lavarse", "Sala reunir sentarse", "Lugar guardar automóvil", "Espacio exterior asiento",
            "Saliente ventana exterior", "Cabina subir bajar", "Gradas peldaños subir", "Corredor conecta habitaciones",
            "Centro médico enfermos", "Establecimiento medicinas", "Profesional salud curar", "Personal médico asistir",
            "Ciencia curar enfermedades", "Obra cine actores", "Relato visual capítulos", "Persona interpreta personaje",
            "Mujer interpreta personaje", "Responsable película guía", "Escrito historia diálogos", "Parte mínima película",
            "Espectadores obra cine", "Lugar obra actuación", "Arte colores lienzo", "Arte lápiz papel",
            "Rojo azul amarillo tonalidad", "Herramienta pintar cerdas", "Tela para pintar", "Lugar arte exposiciones",
            "Recinto arte historia", "Creatividad expresión humana", "Creador obra estética", "Creación artística final",
            "Establecimiento comprar vender", "Puestos productos variados", "Grandes estantes compra", "Lugar dinero cobrar",
            "Comprador adquiere bienes", "Comerciante ofrece productos", "Valor numérico costo", "Tentación descuento costo",
            "Adquirir productos pagar", "Ofrecer productos cobrar", "Máquina procesar datos", "Periférico papel documentos",
            "Digitalizar imágenes papel", "Monitor pantalla grande", "Sistema videojuegos controles", "Mando para jugar",
            "Dirección coche circular", "Pedal detener parar", "Pedal velocidad motor", "Máquina genera movimiento",
            "Exterior chasis automóvil", "Goma circular rueda", "Líquido combustible motor", "Combustible pesado ruidoso",
            "Energía corriente limpia", "Acumulador energía portátil", "Accesorio recargar energía", "Toma corriente pared",
            "Flujo electrones cables", "Tensión fuerza eléctrica", "Escritura código instrucciones", "Pasos solución lógica",
            "Espacio valor cambia", "Bloque cálculo resultado", "Molde objeto plantilla", "Instancia concreta datos",
            "Acción función interna", "Instrucciones escritas programa", "Traducir código fuente", "Iniciar correr programa",
            "Red mundial conexión", "Aplicación web páginas", "Sitio digital informativo", "Dirección salto URL",
            "Localizar información respuesta", "Respuesta lista hallazgos", "Bajar archivos red", "Cargar archivos red",
            "Contenedor digital datos", "Directorio agrupa archivos", "Texto digital información", "Láminas exposición visual",
            "Operaciones lógicas números", "Igualdad lógica matemática", "Espacio tabla hoja", "Línea horizontal tabla",
            "Eje vertical tabla", "Estructura datos organizados", "Imagen visual datos", "Esquema representación lógica"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }
    public static void pistasFacilFase3(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 3 (8-9 letras)
    	String[] pistas;
        pistas = new String[] {
            "Institución superior estudios", "Departamento especialidad grado", "Camino estudio título", "Tema específico aprender",
            "Docente guía enseñar", "Alumno joven aprender", "Pruebas evaluación conocimiento", "Superar filtro satisfactorio",
            "Reprobar fracasar examen", "Calificaciones resultados finales", "Recinto textos préstamo", "Papeles lectura conocimiento",
            "Publicación interés periódica", "Papel diario noticias", "Persona lee textos", "Autor textos literarios",
            "Narrativa escrita extensa", "Género verso rima", "Relato ficción corto", "Sucesos pasado eventos",
            "Atleta competidor físico", "Persona prepara atletas", "Rivalidad ganar trofeo", "Ganador puesto primero",
            "Mejor marca histórica", "Premio metal cuello", "Copa estatuilla premio", "Recinto deportivo grande",
            "Camino carrera atletismo", "Terreno césped deporte", "Días descanso viaje", "Desplazamiento destino nuevo",
            "Alojamiento habitaciones pagado", "Zona arena mar", "Gran elevación terreno", "Zona árboles naturaleza",
            "Zona arena seco", "Núcleo urbano edificios", "Asentamiento pequeño rural", "Casas pequeño rural",
            "Lugar comida servir", "Persona cliente comer", "Lista platos opciones", "Alimento preparado servido",
            "Líquido para tomar", "Final dulce comida", "Papel factura pagar", "Gratificación servicio voluntaria",
            "Mesero servir mesas", "Chef preparar alimentos", "Técnica diseño aplicada", "Diseño edificios planos",
            "Ciencia salud cuerpo", "Leyes justicia normas", "Gestión dinero recursos", "Estudio mente comportamiento",
            "Pensamiento ideas profundas", "Sucesos pasado humano", "Ciencia tierra lugares", "Cálculos números ciencia",
            "Ciencia elementos reacciones", "Ciencia materia energía", "Estudio seres vivos", "Estudio rocas tierra",
            "Estudio estrellas espacio", "Ciencia computadoras datos", "Circuitos componentes energía", "Ciencia máquinas movimiento",
            "Construcción estructuras edificios", "Fábricas producción masa", "Recinto experimentos ciencia", "Prueba verificación hipótesis",
            "Estudiar profundamente verdad", "Persona investigación ciencia", "Suposición verificar científica", "Explicación principios aceptada",
            "Norma obligatoria naturaleza", "Base fundamental inicio", "Expresión matemática cálculo", "Igualdad valores incógnita",
            "Grupo nacidos época", "Cambio desarrollo especies", "Crecimiento avance complejidad", "Mejora avance positivo",
            "Adelanto novedad técnica", "Novedad creación original", "Aplicación ciencia práctica", "Conocimiento sistemático método",
            "Hallazgo algo nuevo", "Creación algo inexistente", "Intercambio información emisor", "Datos procesados conocimiento",
            "Texto comunicación enviado", "Información evento actual", "Informe detallado datos", "Aviso promoción público",
            "Promoción productos medios", "Estrategia ventas mercado", "Comercializar productos cambio", "Grupo compradores habituales"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }

    // ==============================
    // PISTAS PARA NIVEL MEDIO
    // ==============================
    
    public static void pistasMedioFase1(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 1 (8-9 letras)
    	String[] pistas;
        pistas = new String[] {
            "Parte lógica máquina", "Componentes físicos electrónicos", "Conjunto partes organizado", "Instrucciones ejecutar ordenador",
            "Capa usuario pantalla", "Base ejecución aplicaciones", "Equipo provee servicios", "Entidad consume servicios",
            "Conexión nodos dispositivos", "Enlace comunicación puntos", "Materia prima procesar", "Documento digital almacenado",
            "Contenedor virtual archivos", "Soporte almacenamiento circular", "Almacenamiento datos temporal", "Tarea programa ejecución",
            "Unidad ejecución paralela", "Punto conexión entrada", "Reglas estándar comunicación", "Unidad datos enviados",
            "Codificar mensaje secreto", "Descifrar mensaje oculto", "Reducir tamaño bits", "Expandir tamaño original",
            "Limpiar preparar soporte", "Colocar nuevo programa", "Quitar programa instalado", "Mejorar versión software",
            "Corrección rápida error", "Edición específica software", "Idioma comunicación máquinas", "Reglas gramática código",
            "Significado sentencias código", "Símbolo cambia valor", "Valor fijo invariable", "Símbolo acción cálculo",
            "Cálculo valor final", "Orden completa ordenador", "Repetición código controlada", "Decisión lógica programa",
            "Subprograma retorna valor", "Subprograma pasos ejecuta", "Dato entrada bloque", "Valor pasado parámetro",
            "Salida resultado bloque", "Dato concreto numérico", "Categoría clase datos", "Plantilla creación objetos",
            "Entidad concreta datos", "Creación única molde", "Sustancia física realidad", "Capacidad realizar trabajo",
            "Mínima porción materia", "Unidad básica química", "Unión varios núcleos", "Sustancia pura tabla",
            "Unión química elementos", "Sustancias juntas físicas", "Mezcla homogénea líquida", "Transformación molecular química",
            "Fuerza atracción planetaria", "Empuje tracción física", "Variación posición tiempo", "Rapidez desplazamiento dirección",
            "Variación rapidez tiempo", "Cantidad materia cuerpo", "Atracción masa tierra", "Espacio tridimensional ocupa",
            "Relación masa volumen", "Fuerza unidad área", "Grado calor frío", "Energía flujo térmico",
            "Baja sensación térmica", "Instrumento mide grados", "Instrumento presión atmosférica", "Lente ver diminuto",
            "Instrumento ver astros", "Gama colores luz", "Vibración transporte energía", "Vibración aire oído",
            "Energía electromagnética ojos", "Percepción visual matiz", "Rebote haz superficie", "Desviación haz medio",
            "Dispersión ondas bordes", "Superposición ondas efectos", "Orientación ondas dirección", "Cristal aumenta imagen",
            "Cristal refleja imagen", "Cristal divide luz", "Carga negativa átomo", "Carga positiva núcleo",
            "Carga neutra núcleo", "Parte central átomo", "Camino electrones núcleo", "Capa energía electrones",
            "Forma materia física", "Etapa agregación materia", "Fluido volátil expande", "Fluido volumen constante"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }
    public static void pistasMedioFase2(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 2 (9-10 letras)
    	String[] pistas;
        pistas = new String[] {
            "Serie pasos solución", "Organización interna datos", "Orden elementos sucesivo", "Repetición ciclo proceso",
            "Llamada función misma", "Mejorar uso recursos", "Relación logro recursos", "Grado enredo problema",
            "Estudio piezas detallado", "Plano previo creación", "Llevar práctica idea", "Testear funcionamiento real",
            "Limpiar código fallos", "Acción inesperada fallo", "Anomalía lógica programa", "Asegurar dato correcto",
            "Confirmar exactitud prueba", "Verificar certeza datos", "Garantizar estado seguro", "Asegurar calidad producto",
            "Manual escrito código", "Nota aclaratoria código", "Aclarar concepto entender", "Pintar palabras rasgos",
            "Fijar significado exacto", "Detallar requisitos precisión", "Solicitar condición obligatoria", "Tener falta algo",
            "Condición obligatoria sistema", "Requisito cumplir lógico", "Nombre guarda valor", "Valor nunca cambia",
            "Colección fija elementos", "Grilla bidimensional datos", "Magnitud dirección sentido", "Colección dinámica elementos",
            "Estructura LIFO datos", "Estructura FIFO datos", "Nodos jerarquía ramas", "Red puntos aristas",
            "Localizar elemento específico", "Secuenciar criterio lógico", "Agrupar tipos similares", "Tamizar bajo criterio",
            "Elegir opción conjunto", "Añadir elemento nuevo", "Suprimir elemento existente", "Editar campos existentes",
            "Renovar valores antiguos", "Hacer algo distinto", "Almacén masivo información", "Hechos procesados guardados",
            "Estructura filas columnas", "Entrada única datos", "Atributo columna datos", "Eje vertical rejilla",
            "Eje horizontal rejilla", "Identificador único acceso", "ID principal tabla", "ID referencia externa",
            "Acceso rápido búsqueda", "Pregunta formal datos", "Filtrar filas específicas", "Elegir campos específicos",
            "Combinar conjuntos resultados", "Elementos comunes conjuntos", "Elementos no comunes", "Combinación cartesiana completa",
            "Vincular tablas relacionadas", "Cláusula filtro lógica", "Reunir rasgos similares", "Secuenciar resultados lista",
            "Filtro grupos resultados", "Valor único diferente", "Cálculo resumen grupo", "Enumerar cantidad elementos",
            "Adición total valores", "Punto medio valores", "Menor valor hallado", "Mayor valor hallado",
            "Unidad trabajo atómica", "Fijar cambios disco", "Deshacer cambios temporales", "Hito volver atrás",
            "Privar acceso compartido", "Acceso múltiples usuarios", "Datos coherentes lógicos", "Separación procesos simultáneos",
            "Persistencia cambios tiempo", "Siglas transacciones seguras", "Estructurar evitar repetición", "Nivel organización datos",
            "Estandarizado según reglas", "Romper estructura rendimiento", "Datos duplicados innecesarios", "Veracidad completitud datos",
            "Estado lógico inalterado", "Protección intrusos datos", "Revisión historial acciones", "Copia seguridad externa"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }
    public static void pistasMedioFase3(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 3 (10-11 letras)
    	String[] pistas;
        pistas = new String[] {
            "Reglas comunicación red", "Estándar cableado local", "Encaminador paquetes datos", "Conecta equipos local",
            "Repetidor señal pasivo", "Vínculo segmentos red", "Pasarela acceso exterior", "Barrera defensa red",
            "Intermediario peticiones web", "Persona medio gestión", "Nombres a IP", "Servidor IP dinámicas",
            "Protocolo transferencia hipertexto", "Versión cifrada web", "Transferencia archivos protocolo", "Correo salida protocolo",
            "Correo entrada local", "Correo entrada servidor", "Acceso remoto cifrado", "Acceso remoto plano",
            "Red área local", "Red área extendida", "Red área ciudad", "Túnel privado internet",
            "Segmento lógico LAN", "Conexión ondas radio", "Vínculo inalámbrico corto", "Luz frecuencia baja",
            "Señales electromagnéticas aire", "Onda alta frecuencia", "Capacidad caudal datos", "Eficacia trabajo sistema",
            "Retardo tiempo respuesta", "Fluctuación tiempo llegada", "Unidad mínima envío", "Unidad red independiente",
            "Trozo datos transporte", "Datos control inicio", "Información útil interna", "Código error verificación",
            "Elegir camino paquetes", "Pasar salto siguiente", "Mensaje todos nodos", "Mensaje grupo específico",
            "Mensaje nodo único", "Mensaje nodo cercano", "Conexión mucha capacidad", "Rango frecuencias uso",
            "Extensa capacidad flujo", "Pequeña capacidad flujo", "Esquema diseño lógico", "Solución reutilizable diseño",
            "Instancia única global", "Clase creadora objetos", "Suscripción eventos cambios", "Algoritmo dinámico seleccionable",
            "Conversor interfaces distintas", "Añadir capas objeto", "Simplificar acceso complejo", "Suplente acceso objeto",
            "Módulo pequeño aislado", "Aplicación única grande", "Arquitectura servicios orquestados", "Bus comunicación mensajes",
            "Interfaz servicios externa", "Estilo recursos URL", "Protocolo pesado XML", "Consultas datos precisas",
            "Llamada remota binaria", "Punto captura eventos", "Aislamiento software ligero", "Plataforma contenedores famosa",
            "Gestión flota contenedores", "Coordinar servicios juntos", "Crecimiento demanda recursos", "Copiar nodos iguales",
            "Repartir trabajo servidores", "Peso tareas sistema", "Conjunto máquinas unidas", "Punto interconexión red",
            "Flujo sin pausas", "Unir código ramas", "Poner producción sistema", "Dar producto final",
            "Conducto automatizado tareas", "Pasos lógicos trabajo", "Eliminar intervención humana", "Archivo comandos órdenes",
            "Ajustar opciones sistema", "Instalar sistema vivo", "Observar estado sistema", "Bitácora eventos guardados",
            "Valor medida rendimiento", "Aviso ante fallo", "Panel control métricas", "Visualizador datos series",
            "Recolector métricas sistema", "Capacidad ajuste escala", "Visualizador logs datos", "Ingesta procesado logs"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }

    // ==============================
    // PISTAS PARA NIVEL DIFÍCIL
    // ==============================
    
    public static void pistasDificilFase1(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 1 (10-11 letras)
    	String[] pistas;
        pistas = new String[] {
            "Capacidad máquinas lógica", "Producto ingenio humano", "Adquirir conocimiento nuevo", "Máquina tareas autónomas",
            "Nivel elevado dificultad", "Malla nodos unidos", "Centro control biológico", "Célula base pensamiento",
            "Niveles ocultos proceso", "Error hacia atrás", "Filtros visión máquinas", "Memoria datos pasados",
            "Capacidad crear contenido", "Separar tipos etiquetas", "Organizar grupos etiquetas", "Estimar valores numéricos",
            "Reunir datos parecidos", "Vincular nodos red", "Sucesión datos tiempo", "Eventos uno tras otro",
            "Buscar mejor valor", "Inclinación curva error", "Bajar hacia mínimo", "Azar procesos probables",
            "Grupo pequeño entrenamiento", "Ciclo completo datos", "Volver hacer bucle", "Tender valor límite",
            "Separarse valor esperado", "Aprender memoria ruido", "Evitar ajuste excesivo", "Apagar nodos azar",
            "Escalar rango datos", "Punto arranque valores", "Método inicio pesos", "Técnica inicio gradiente",
            "Cambio salida neurona", "Rectificada lineal activa", "Función curva logística", "Función rango -1 a 1",
            "Grado caos sistema", "Pérdida error clasificación", "Fallo predicción real", "Cálculo relación números",
            "Penalización error modelo", "Porcentaje aciertos totales", "Hallar positivos reales", "Equilibrio precisión sensibilidad",
            "Tabla aciertos fallos", "Error asignar clase", "Ciencia análisis datos", "Cálculo opción ocurrir",
            "Forma datos azar", "Curva campana conocida", "Igualdad azar todos", "Éxitos ensayos fijos",
            "Eventos intervalo tiempo", "Caída tiempo sucesos", "Curva estándar probabilidad", "Doble caída exponencial",
            "Punto central promedio", "Valor mitad lista", "Dato más repetido", "Dispersión datos cuadrado",
            "Raíz dispersión datos", "Patrón medida común", "Relación mutua variables", "Grado unión variables",
            "Ajustar línea puntos", "Relación proporcional recta", "Uso muchas variables", "Probabilidad clase binaria",
            "Curva grados superiores", "Estimar entre puntos", "Estimar fuera límites", "Rango valores posibles",
            "Seguridad valor real", "Importancia azar resultado", "Premisa probar científica", "Premisa ausencia efecto",
            "Segunda opción hipótesis", "Probabilidad bajo nula", "Falso positivo error", "Falso negativo error",
            "Capacidad hallar efecto", "Evaluación datos muestra", "Examen rigor científico", "Prueba independencia categorías",
            "Comparar medias grupos", "Comparación no paramétrica", "Medias varios grupos", "Rangos grupos pareados",
            "Bloques medidas repetidas", "Test forma normal", "Diferencia distribuciones test", "Ajuste colas datos",
            "Normalidad muestras pequeñas", "Normalidad basada sesgo", "Normalidad distribución test"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }
    public static void pistasDificlFase2(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 2 (11-12 letras)
    	String [] pistas;
        pistas = new String[] {
            "Estudio motor sangre", "Ciencia mente nervios", "Tumores masa maligna", "Salud pequeños humanos",
            "Salud adultos mayores", "Golpes roturas cuerpo", "Intervención quirófano herida", "Estructura soporte cuerpo",
            "Salud piezas bucales", "Estudio cavidad oral", "Ciencia órgano visión", "Estudio capa externa",
            "Procesado alimentos cuerpo", "Filtros sangre cuerpo", "Vías salida líquidos", "Salud sistema femenino",
            "Gestación nacimiento bebés", "Control químico hormonas", "Estudio fluido vital", "Defensas contra invasores",
            "Dormir evitar dolor", "Radiografías placas huesos", "Estudio muestras tejidos", "Seres vivos diminutos",
            "Vivir costa ajena", "Agentes infección celular", "Células sin núcleo", "Reino esporas moho",
            "Unicelulares agua vida", "Lombrices parásitas largas", "Sustancias curar farmacia", "Sustancias dañinas veneno",
            "Química procesos vivos", "Mecánica cuerpo vivo", "Forma interna cuerpo", "Microscopía capas células",
            "Crecimiento antes nacer", "Código herencia ADN", "Estudio nivel átomos", "Unidad vida mínima",
            "Rastreo brotes población", "Estado ausencia enfermedad", "Bienestar común sociedad", "Acción antes enfermar",
            "Fomento hábitos sanos", "Recuperar movilidad perdida", "Tratamiento físico lesiones", "Curación métodos variados",
            "Terapia entorno laboral", "Corrección vicios habla", "Carta magna nación", "Gestión entes públicos",
            "Castigo actos ilegales", "Acuerdos particulares bienes", "Intercambio bienes lucro", "Relación jefe empleado",
            "Pagos caja estado", "Aportes obligatorios tesoro", "Tratos entre naciones", "Relativo estado general",
            "Relativo individuos solos", "Pasos juicio legal", "Acuerdos papel firmados", "Daño fuera contrato",
            "Cargas frente derechos", "Pacto entre partes", "Entes comerciales unión", "Agrupación fines comunes",
            "Entidad fines sociales", "Unión trabajo socios", "Tener algo propio", "Patrimonio ideas mente",
            "Novedades técnicas marcas", "Persona madre obra", "Título invento nuevo", "Nombre distintivo venta",
            "Inscripción archivos oficiales", "Poderes ordenamiento legal", "Relativos firma creador", "Hacer copias iguales",
            "Poner alcance público", "Difusión datos ideas", "Abierto toda gente", "Cambio forma obra",
            "Ajustar medio distinto", "Pasar texto idioma", "Mencionar fuente texto", "Burla estilo original",
            "Dibujo rasgos exagerados", "Copia estilos variados", "Tercero decide disputa", "Tercero ayuda acuerdo",
            "Punto unión partes", "Trato buscar acuerdo", "Pleito ante juez", "Veredicto final corte",
            "Decisión escrita juez", "Pedir revisar fallo", "Anulación máxima instancia", "Medio impugnar decisión"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }
    public static void pistasDificilFase3(String [] comodines,int [] posiciones) {
        // Pistas para Nivel 3 (12-13 letras)
    	String[] pistas;
        pistas = new String[] {
            "Origen saber verdad", "Pregunta por existencia", "Fundamentos realidad última", "Ciencia bien mal",
            "Teoría juicio gusto", "Leyes pensar correcto", "Entender textos antiguos", "Estudio vivencia propia",
            "Dilema ser nada", "Lógica partes unidas", "Crítica formas fijas", "Partir entender piezas",
            "Época fin verdades", "Examen juicio ideas", "Conjunto ideas mundo", "Relativo gente grupo",
            "Estudio grupos humanos", "Evolución hombre cultura", "Tradiciones grupo humano", "Leyes energía mundo",
            "Procesos mente interna", "Procesos saber memoria", "Acción externa medida", "Enfoque valor humano",
            "Diván mente oculta", "Ley cierre percepción", "Conjunto partes unidas", "Más allá ego",
            "Ciencia vivir bien", "Fases cambio vida", "Ciencia bienes escasos", "Gestión poder estado",
            "Trato agentes solos", "Trato nación entera", "Aumento riqueza país", "Equilibrio entorno futuro",
            "Mundo unido redes", "Libertad total tratos", "Estado motor demanda", "Poder manos obreras",
            "Todo de todos", "Bienes manos estado", "Dueño medios lucro", "Voto mando pueblo",
            "Mando uno solo", "Dominio mente cuerpo", "Mando sin réplica", "Muchas ideas juntas",
            "Respeto varios grupos", "Trato entre grupos", "Manejo nivel átomos", "Uso vida industria",
            "Ingeniería naves aire", "Ingeniería naves espacio", "Máquinas tareas solas", "Mecánica mandos cables",
            "Hacer solo máquinas", "Aparatos medir datos", "Dominio sistema orden", "Pasos ordenados fábrica",
            "Redes datos distancia", "Enviar datos lejos", "Vía espacio orbital", "Hilos vidrio luz",
            "Luz señales eléctricas", "Ciencia luz láser", "Partículas nivel mínimo", "Máquina procesar bits",
            "Datos ordenados saber", "Ocultar mensajes clave", "Piezas tacto máquina", "Narrar rasgos sistema",
            "Código diseña chips", "Código diseña circuitos", "Chip puertas abiertas", "Chip funciones fijas",
            "Cerebro placa base", "Chip todo incluido", "Procesador audio voz", "Procesador video juegos",
            "Tareas muchas tiempo", "Acceso varios puntos", "Repartido varios nodos", "Crecer según demanda",
            "Aguante ante fallos", "Permite errores leves", "Errores roturas bugs", "Volver punto sano",
            "Gran daño sistema", "Plan caso error", "Cuidado recursos hoy", "Naturaleza aire tierra",
            "Amigo mundo sano", "Fuente nunca acaba", "Capacidad hacer algo", "Luz calor estrella",
            "Fuerza aire palas", "Fuerza agua caída", "Calor centro tierra", "Restos plantas energía"
        };
        int temp = 0;
        for (int i = 0; i < posiciones.length; i++) {
        	temp = posiciones[i];
            comodines[i] = pistas[temp];
		}
    }
}