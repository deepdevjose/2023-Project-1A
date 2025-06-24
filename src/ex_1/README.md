Problema 1 (Metodología de las 6D)

1. Descripción del problema
El problema consiste en calcular la ecuación de una recta y su ángulo con el eje horizontal, dados dos puntos de la recta.

2. Definición del problema
Los datos del problema son los siguientes:
•	Los valores de las coordenadas x1 y y1 de uno de los puntos de la recta.
•	Los valores de las coordenadas x2 y y2 del otro punto de la recta.
El deseo del problema es obtener los siguientes resultados:
•	La ecuación de la recta, en la forma y = m*x + b.
•	El ángulo con el eje horizontal, en grados.

3. Diseño de la solución
La solución se puede dividir en los siguientes pasos:
1.	Calcular la pendiente de la recta, m.
2.	Calcular el ángulo de la recta, a, utilizando la fórmula a = atan(m).
3.	Convertir el ángulo a grados, a Grados = a * 180 / PI.
4.	Obtener la ecuación de la recta, y = m * x + b, donde b = y1 - m * x1.

4. Desarrollo de la solución
o	El código comienza con las importaciones necesarias y algunos comentarios que proporcionan información sobre la clase
o	La función main comienza solicitando al usuario las coordenadas de A y B  
o	Después para la ecuación de la recta para (y) se utiliza la formula (y2 - y1) / (x2 - x1) y se almacena en la variable m.
o	Después para (x) se utiliza la siguiente operación (y1 - m * x1)
o	Y para sacar el ángulo en grados se utiliza la función Math.atan(m) para calcular el ángulo en radianes y después se usa Math.toDegrees() para pasar de radianes a grados.
o	Y finaliza dándote el resultado de la Ecuación de la recta y el Ángulo con el eje horizontal.

5. Depuración y pruebas
	Prueba básica:
•	(x1, y1) = (0, 0)
•	(x2, y2) = (1, 1)

o	Ingrese el valor de x1
0
o	Ingrese el valor de x2
1
o	Ingrese el valor de y1
0
o	Ingrese el valor de y2
1
Ecuación de la recta: y = 1.0  x = 0.0
Angulo con el eje horizontal (en grados):  45.0
	Prueba con Pendiente Horizontal:
•	(x1, y1) = (3, 5)
•	(x2, y2) = (9, 5)

o	Ingrese el valor de x1
3
o	Ingrese el valor de x2
9
o	Ingrese el valor de y1
5
o	Ingrese el valor de y2
5
Ecuación de la recta: y = 0.0  x = 5.0
Angulo con el eje horizontal (en grados):  0.0
