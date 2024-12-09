# 🥋 **Juego de Judo** 🥋

**Judo Game** es un juego interactivo basado en competiciones de judo. Los jugadores deben registrarse o iniciar sesión para acceder a las diferentes competiciones, clubs, entrenadores y competidores. A medida que compiten, ganan puntos según su rendimiento, lo que los posiciona en un ranking por pesos. ¡Demuestra tu habilidad en combate y escala en el ranking!

---

## 🚀 **Funcionalidades Principales**

1. **Registro e Inicio de Sesión**  
   Los usuarios deben registrarse o iniciar sesión para acceder a la plataforma. Esto garantiza una experiencia personalizada y un seguimiento de los puntos obtenidos en las competiciones.

2. **Visualización de Competencias**  
   Una vez dentro, los jugadores pueden ver una lista de las competiciones de judo disponibles, con detalles sobre cada una.

3. **Ver Clubs, Entrenadores y Competidores**  
   - **Clubs**: Una lista de los clubs de judo disponibles en el juego.
   - **Entrenadores**: Cada club tiene entrenadores que ofrecen consejos y desafíos.
   - **Competidores**: Los jugadores pueden conocer a los competidores que participan en las competiciones.

4. **Ranking por Pesos**  
   Los jugadores pueden consultar el **ranking por pesos** para ver cómo se comparan con otros competidores en su categoría de peso.

5. **Modo Competir**  
   - El jugador puede unirse a un combate aleatorio contra otros competidores.
   - Durante la competencia, se realizarán **3 combates aleatorios**.
   - El jugador deberá utilizar **ataques estratégicos** para ganar los combates.
   - Según el resultado de la competencia (1°, 2° o 3° lugar), se asignarán puntos:
     - **1er lugar**: 100 puntos.
     - **2do lugar**: 80 puntos.
     - **3er lugar**: 60 puntos.

6. **Visualización de Usuario y Puntos**  
   Los jugadores pueden acceder a su perfil, ver su nombre de usuario y los puntos acumulados a lo largo de las competiciones.

---

## 🎮 **Cómo Jugar**

1. **Iniciar sesión o registrarse**:  
   Para empezar, crea una cuenta o inicia sesión si ya tienes una cuenta.

2. **Explorar competiciones**:  
   Una vez dentro, puedes ver las competiciones disponibles y unirte a una de ellas.

3. **Ver clubes y entrenadores**:  
   Consulta los diferentes clubs y entrenadores disponibles, y encuentra el club que mejor se adapte a tu estilo.

4. **Competir**:  
   Entra en una competencia y realiza 3 combates aleatorios. Usa tus habilidades y ataques para ganar.

5. **Ranking y puntos**:  
   Según tu desempeño, serás clasificado en el ranking por pesos. Gana puntos (100, 80 o 60) dependiendo de tu posición y consulta tu perfil para ver tu puntuación.

   
https://github.com/user-attachments/assets/e8ad3ec2-4161-4d99-8f0e-9cc3e1b1a9fa


---

## 🗂️ **Estructura del Proyecto**

El proyecto está organizado en varios paquetes que se dividen según su funcionalidad y dominio. A continuación se describe la estructura de los paquetes y las clases principales que componen el proyecto:

### **1. Paquete `com.judo.datos`**
Este paquete contiene las clases encargadas de la **gestión de datos** y la **conexión con la base de datos**. Las clases en este paquete interactúan directamente con la base de datos para almacenar y recuperar la información de los jugadores, competiciones, clubes y demás.

### **2. Paquete `com.judo.dominio`**
Este paquete define las **entidades del negocio** y las relaciones entre ellas, modelando la lógica del juego y los objetos principales.

### **3. Paquete `com.mycompany.judo`**
Este paquete contiene las clases relacionadas con la **interfaz de usuario** y la **lógica de interacción** dentro del juego. Abarca desde la pantalla de inicio hasta la lógica de combate y rankings.

### **4. Recursos Adicionales**
El proyecto también incluye **imágenes** para representar las técnicas y los movimientos durante los combates:

- **ippon**, **ippon2**, **nada**, **nada2**, **wazary**, **wazary2**: Imágenes relacionadas con los diferentes tipos de puntuaciones y movimientos de judo.

---

## 🛠️ **Tecnologías Utilizadas**

- **Java**: El lenguaje de programación principal para la lógica del juego.
- **JFrames**: Se utiliza para la creación de la interfaz gráfica de usuario (GUI) para que el jugador interactúe con el juego de forma visual.
- **MySQL**: Base de datos relacional que almacena la información de los usuarios, competiciones, puntos, clubs y entrenadores.

