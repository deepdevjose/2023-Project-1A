# PROBLEMA 3: 
# **1. Descripción del problema:**

•	Problema: Dada una circunferencia con centro en el punto C con coordenadas (X1, X2) y el radio R, evaluar si un punto T con coordenadas (X2, Y2) está dentro del área de la circunferencia.

# **2. Definición del problema:**

•	Problema: Saber si un punto se encuentra dentro o fuera de un circulo.

•	Entradas: El punto que se desea encontrar.

•	Salidas: Saber si el punto se encuentra dentro o fuera de circulo 


# **3. Diseñar de solución:**

•	Flujo Principal:

•	Solicitar al usuario que ingrese las coordenadas del centro del círculo, el radio y las coordenadas del punto a encontrar. 

•	Leer los datos ingresados por el usuario.

•	Realizamos las operaciones, restaremos las coordenadas del centro del circulo y las del punto a encontrar las elevaremos al cuadrado y sumaremos, para posteriormente sacar raíz cuadrada.

•	Después compararemos el resultado con el radio del círculo, si el resultado de nuestra operación es mayor al radio el punto se encontrará fuera, de lo contrario se encontrará dentro del círculo.


# **4. Desarrollar:**
Importaciones y Comentarios Iniciales:
 
El código comienza con las importaciones necesarias y algunos comentarios que proporcionan información sobre la clase.

Función main:
 
•	La función main comienza solicitando al usuario que ingrese las coordenadas de del centro del círculo. 

•	Se crean dos objetos Scanner (x1, x2) para leer la entrada del usuario. 

•	Se solicita que ingrese el radio del círculo.

•	Se crea un objeto Scanner (r) para leer la entrada del usuario. 

•	Se solicita que ingrese las coordenadas del punto a buscar.

•	Se crea dos objetos Scanner (x2, y2) para leer la entrada del usuario.

•	Se realiza una operación matemática en donde se restan las coordenadas y se elevan al cuadrado, después se suman ambos resultados y sacas raíz cuadrado.

•	Usamos un if para saber si el punto esta fuera o dentro del círculo, si la distancia es menor al radio el punto se encontrara dentro del círculo, de lo contrario el punto se encontraría fuera del círculo.


# **5. Depuración**

 Verifiqué si hay errores, comprobé si el código se ejecuta correctamente y realicé pruebas de escritorio para asegurarme de que la forma de encontrar el punto es correcta.

