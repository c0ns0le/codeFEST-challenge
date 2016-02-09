Solución del reto 1 del codeFEST 2015 y prueba de concepto de TDD con Spock.

Probado en Windows pero debe ser muy similar en otros sistemas.

# Instalación con eclipse
Puedes usar Eclipse con los plugins para Spring IDE, Groovy, Gradle y Spock.

Si quieres ahorrarte la instalación de plugins puedes decargarte una versión ya preparada aquí: ;-)

https://github.com/jmfvarela/eclipse-with-plugins

Pasos para importar el proyecto:
* Descargar y descomprimir este proyecto en tu ordenador (carpeta 'codeFEST-challenge').
* Abrir eclipse, seleccionar en el menú 'File' > 'Import' > 'Gradle Project', y pulsar botón 'Next'.
* Buscar el proyecto 'codeFEST-challenge' mediante el botón 'Browse' en la carpeta donde lo hayas ubicado.
* Pulsar botón 'Build Model' en esa misma ventana.
* Marcar el check del proyecto encontrado 'codeFEST-challenge'.
* Pulsar el botón 'Finish' y esperar a que finalice la importación.

Puedes ver el código fuente Java en `src/main/java`.

El código de los tests Spock (Specifications) en `src/test/groovy`. 

Incluye tests unitarios y un test de integración de prueba sobre la página de Wikipedia.

Para ejecutar los tests desde eclipse: `ALT+SHIFT+X, T`.

Si quieres ejecutar el test de integración de prueba necesitarás instalarte previamente ChromeDriver (https://sites.google.com/a/chromium.org/chromedriver/downloads), configurando la ruta de instalación en `src/test/resources/GebConfig.groovy`

# Ejecución de tests con gradle
Estando en la carpeta del proyecto ejecutar `gradlew-test.bat`.

Ver los resultados en `build\reports\tests\index.html`.
