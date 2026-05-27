# DiscoveryApp - Ingeniería en Sistemas Computacionales 

Una aplicación móvil interactiva y nativa desarrollada en **Android Studio** utilizando **Jetpack Compose** y **Material Design 3**. El objetivo principal de la app es servir como una infografía dinámica e interactiva para promocionar la carrera de Ingeniería en Sistemas Computacionales (ISC) en ferias universitarias y eventos de orientación vocacional.

---

##  Características del Proyecto

La aplicación cuenta con una navegación fluida, control estricto de estados inmutables y un diseño modular estructurado en las siguientes secciones:

* ** Splash Screen:** Pantalla de bienvenida con temporizador automático que introduce la identidad de la carrera con un estilo tecnológico.
* ** Home (Infografía Principal):** Panel central con un diseño limpio que describe el perfil de egreso y distribuye el acceso a los módulos interactivos mediante tarjetas y botones dinámicos.
* ** Mapa de Especialidades:** Cuadrícula interactiva (`LazyVerticalGrid`) que permite al usuario seleccionar distintas líneas de especialización (Ciberseguridad, Ciencia de Datos/IA, Desarrollo Web/Móvil, Cloud) y ver sus detalles dinámicamente en pantalla sin recargar la ventana.
* ** Campo Laboral:** Lista optimizada (`LazyColumn`) que detalla las áreas y puestos de alta demanda en el mercado de TI para los egresados.
* ** Test Vocacional:** Módulo interactivo con preguntas de opción múltiple para evaluar la afinidad del aspirante con la carrera de una forma ágil.
* ** Contacto Directo y Código QR:** Vista que genera un código QR para que los alumnos escaneen y descarguen el Plan de Estudios en formato PDF, acompañado de un Botón de Acción Flotante (FAB) que utiliza un Intent implícito para abrir el gestor de correo electrónico directo hacia Admisiones.

---

##  Tecnologías y Arquitectura Utilizadas

* **Lenguaje:** Kotlin 2.0
* **UI Framework:** Jetpack Compose (Componentes Material Design 3)
* **Navegación:** Type-Safe Navigation con `Jetpack Navigation Compose` y `Kotlinx Serialization`.
* **Carga de Imágenes:** `Coil Compose` para el renderizado asíncrono de recursos externos (Código QR).
* **Buenas Prácticas:** * Arquitectura modular separando las vistas (`ui`) del sistema de rutas (`navegation`).
    * Cumplimiento de usabilidad (UX) mediante barras superiores (`TopAppBar`) con botones integrados de navegación hacia atrás en todas las pantallas secundarias (`popBackStack`).

---

##  Cómo Instalar la Aplicación

Si deseas probar la aplicación directamente en un dispositivo Android físico o emulador:
1. Descarga el archivo ejecutable ubicado en este repositorio dentro de la ruta: `/app/build/outputs/apk/debug/` (o adjunto en la sección de Releases).
2. Transfiere el archivo `.apk` a tu teléfono.
3. Activa los permisos de instalación de fuentes desconocidas en tu dispositivo Android y ejecuta el archivo para instalar.
