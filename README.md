**CALCULADORA LOCA**


**REPOSITORIO:** (https://github.com/VeraValverde/CALCULADORA_VERA.git)

**DESCRIPCIÓN:**
Este proyecto es una calculadora loca, ya que no funciona como una calculadora normal.
Presenta una serie de reglas y comportamientos poco normales:
   -No incluye el número 5 en sus botones.
   -Si el resultado de una operación contiene el número 5, este se reemplaza automáticamente por un 6.
   -Los botones numéricos están desordenados: cada botón muestra un número, pero al presionarlo introduce el número mostrado +2 
   (por ejemplo, el botón “1” inserta un “3”).
   -Los botones de operaciones también están desordenados: muestran símbolos que no corresponden a su función real (por ejemplo, “&” realiza una suma).
   -No se permiten divisiones entre 0 ni entre 1, para evitar resultados no válidos o indefinidos.

**INSTRUCCIONES DE EJECUCIÓN:**
   1.Abrir el proyecto en Android Studio.
      (Se recomienda usar Android Studio Ladybug o superior (compatible con SDK 36)).
   2.Verificar la configuración del SDK:
      -Min SDK: 25 (Android 7.1 Nougat)
      -Compile SDK: 36 (Android 15)
   3.Sincronizar el proyecto con Gradle si Android Studio lo solicita.
      Dale al botón “Sync Now”, para sincronizar las dependencias.
   4.Configurar el entorno de ejecución:
      Puedes ejecutar la app en un emulador Android.
   5.Ejecutar la aplicación:
      Pulsa el botón “Run App” en la barra superior de Android Studio.
      Espera a que se compile y se instale la aplicación.
   6.Probar la calculadora:
      La interfaz de la Calculadora Loca se abrirá mostrando sus botones desordenados y podrás comenzar a usarla.

**MAPA DE DESORDEN:**
Botón mostrado	   Número insertado
      0	                 2
      1	                 3
      2	                 4
      3	                 5
      4	                 6
      5                   No existe
      6	                 8
      7	                 9
      8	                 0
      9	                 1

Símbolo mostrado	Operación real
      &	            Suma (+)
      %	            Resta (-)
      $	            Multiplicación (*)
      #	            División (/)



**ENLACE VIDEO:**

