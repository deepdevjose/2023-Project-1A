# **Problema 4:**

# **1. Descripción del problema**
El problema que se pretende resolver con este código es la conversión de un número decimal entero a binario. El número binario se representa como una cadena de bits, donde cada bit tiene un valor de 0 o 1.

# **2. Definición del problema**
Para definir el problema de manera más precisa, se deben especificar los siguientes elementos:
•	El tipo de datos del número decimal. En este caso, el número decimal es un número entero.
•	El rango de valores del número decimal. En este caso, el número decimal puede tomar cualquier valor entero, desde -2^32 hasta 2^32 - 1.
•	El formato del número binario. En este caso, el número binario se representa como una cadena de bits, donde cada bit tiene un valor de 0 o 1.



# **3. Diseño de la solución**
La solución al problema se basa en los siguientes pasos:
1.	Comprobar si el número es positivo o negativo.
2.	Convertir el número decimal a binario.
3.	Si el número es negativo, aplicar el método de complemento a2.


# **4.- Desarrollo de la solución**
Desarrollo de la solución:
1. Comprobar si el número es positivo o negativo.
Este paso es sencillo. Se puede utilizar el operador de comparación >= para comprobar si el número es mayor o igual que cero.
2. Convertir el número decimal a binario, si es positivo o negativo.
Si el número es positivo, se puede utilizar el método toBinaryString() de la clase Integer para convertir el número decimal a binario.
Si el número es negativo, se aplica el método de complemento a2.
El método de complemento a2 consiste en los siguientes pasos:
•	Invertir el orden de los bits del binario del número negativo.
•	Añadir un 1 al principio.
Ejemplo:
El número decimal -1 se convierte a binario en 11111111111111111111111111111110 (en complemento a2).

 



# **5. Depuración**

Pruebas de escritorio
Introduzca un número decimal: 10
El número binario es: 1010
Introduzca un número decimal: -1
El número binario es: 11111111111111111111111111111110
Introduzca un número decimal: 0
El número binario es: 0
# **Sobre mi**
 *Mi perfil de github es: https://github.com/diegoantoniobm*
