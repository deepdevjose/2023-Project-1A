# **Problema 5:**

# **1. Descripción del problema:**
Dado un numero binario de n bits regresar su equivalente en decimal.

# **2. Definición del problema:**
•	Problema: Convertir un número binario ingresado por el usuario a su equivalente decimal.

•	Entradas: El número binario ingresado por el usuario.

•	Salidas: El equivalente decimal del número binario.

# **3. Diseño de solución:**
•	Flujo Principal:
1.	Solicitar al usuario un número binario.
2.	Verificar si el número es binario (contiene solo 0 y 1).
3.	Si no es binario, solicitar nuevamente el número binario.
4.	Convertir el número binario ingresado a su equivalente decimal.
5.	Mostrar el equivalente decimal del número binario.

 
# **4. Desarrollar:**
*Importaciones y Comentarios Iniciales:*

El código comienza con las importaciones necesarias y algunos comentarios que proporcionan información sobre la clase.

*Función main:*
•	La función main comienza declarando una variable numeroBin para almacenar el número binario ingresado por el usuario.

•	Se crea un objeto Scanner (binario) para leer la entrada del usuario.

•	Se usa un bucle do-while para pedir al usuario que ingrese un número binario. Continúa solicitando la entrada hasta que se ingrese un número binario válido (solo 0 y 1).

•	Después de obtener un número binario válido, llama a la función binarioADecimal para convertirlo a su equivalente decimal y muestra el resultado.

*Función esBinario:*
 
Esta función toma un String como argumento y verifica si el número ingresado consiste solo en caracteres '0' y '1'. Retorna true si es un número binario válido; de lo contrario, retorna false.
	
*Función binarioADecimal:*
 
•	Esta función convierte un número binario dado en un número decimal.

•	Itera sobre cada dígito del número binario, convirtiendo cada dígito a su equivalente decimal y sumándolo al resultado final.

•	Usa la fórmula de conversión de binario a decimal: suma de (dígito * 2^posición), donde la posición comienza desde 0 y se incrementa hacia la izquierda en el número binario.

# **5. Depurar:**
•	Verifiqué si hay errores, comprobé si el código se ejecuta correctamente y realicé pruebas de escritorio para asegurarme de que la conversión binario-decimal funcionara correctamente.
 
# **Sobre mi**
 *Mi perfil de github es: https://github.com/Joseecodm*

 *Mi sitio web personal es: https://joseecodm.github.io/Pagina_de_Jose/*