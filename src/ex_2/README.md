	 Definir:
	Problema: Dada la ecuación que ingrese se regresara los valores de las raíces en caso de que estén sobre el conjunto de los números reales, en el caso de que no indicara la solución esta en el conjunto de los números complejos.
	 Descomponer:
	-Se solicita al usuario que ingrese a, b y c.
	-Se calcula el discriminante de la ecuación cuadrática, dado por la formula b^2-4ac.
	-Te arrojará como resultado: los valores de (x1, x2) y escribirá si las raíces son reales, idéntica o si no tiene

     Diseño:
	Diagrama de flujo.
    La solución del problema se basa en los siguientes pasos:
	Ingresar los datos de a, b y c.
	Modificar los datos de la ecuación.
	Dado el resultado se darán dos respuestas que serán x1 y x2.
	Y te arrojara un mensaje que siga si hay dos raíces, solo una o ninguna.

	 Desarrollar:
    Desarrollo de la solución:

	-Antes que nada, tenemos que tener claro que la ecuación cuadrática siempre será  〖ax〗^2+bx+c=0 siempre que la ecuación esta ordenada podemos ver cuál es el valor de a, b y c.
	-El código comienza import Scanner y algunos comentarios que nos proporcionan información sobre la clase.
	Definimos a, b, c, x1, x2 como double para que pueda ver resultados decimales.
	-Se crea un objeto como Scanner para poder leer a, b y c. 
	-Al ya tener ingresado los valores de a, b y c los remplazaremos en la ecuación  (-b±√(b²-4ac))/(2a) que es de tipo double.
	-Para la siguiente parte tuvimos que tener claro que:
    Si el discriminante > cero, hay dos raíces reales distintas.
    Si el discriminante = cero, existe una sola raíz real idéntica. 
    Si el discriminante < cero, no tiene raíces reales, pertenecen a números complejos.
	-Después de eso utilice un if  (discriminante > 0) para poder sacar los dos resultados los cuales son x1 que es positivo y x2 que es negativo.
	-Seguido con un else if (disciminante==0) que ejecutara la ecuación  x1= (-b) / ( 2 * a )
	-Finalizamos con un else que solo ejecutara un texto diciendo “No tiene raíces reales, pertenece a números completos.
     Depuración:
	Teclea el valor de a:
	3
	Teclea el valor de b:
	-9
	Teclea el valor de c:
	10
	Disciminate: -39.0
	No tiene raíces reales, pertenece a números completos.
	Teclea el valor de a:
	4
	Teclea el valor de b:
	8
	Teclea el valor de c:
	-32
	Disciminate: 576.0
	Existen dos raíces reales.
	x1: 2.0
	x2: -4.0
	Teclea el valor de a:
	0
	Teclea el valor de b:
	0
	Teclea el valor de c:
	0
	Disciminate: 0.0
	Existen una sola raíz.
	
     Documentar.
