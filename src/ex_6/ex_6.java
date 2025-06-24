package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Josee Dada una tabla de verdad de hasta 4 bits generar la expresion
 * booleana que genere de manera fidedigna la salidas de esa tabla
 */
public class Problema_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos desde la consola
        Scanner dato = new Scanner(System.in);

        // Definir un conjunto de letras para representar los bits
        char[] letras = {'A', 'B', 'C', 'D'};

        // Solicitar al usuario que ingrese la cantidad de bits
        System.out.println("Ingrese la cantidad de bits:");
        int numBits = dato.nextInt();

        // Calcular el número total de combinaciones posibles de bits
        int totalCombinations = (int) Math.pow(2, numBits);

        // Mostrar las letras que representan los bits
        for (int i = 0; i < numBits; i++) {
            System.out.print(letras[i] + "\t");
        }
        System.out.println("x");

        // Mostrar una línea separadora para los encabezados
        for (int i = 0; i < numBits + 1; i++) {
            System.out.print("--------");
        }
        System.out.println();

        // Mostrar todas las combinaciones posibles de bits y solicitar valores de salida para cada combinación
        for (int i = 0; i < totalCombinations; i++) {
            for (int j = 0; j < numBits; j++) {
                int bit = (i >> j) & 1;
                System.out.print(bit + "\t");
            }
            System.out.println();
        }

        // Solicitar valores de salida para cada combinación de bits
        int cantSalidas = (int) Math.pow(2, numBits);
        int[] salidas = new int[cantSalidas];
        for (int i = 0; i < cantSalidas; i++) {
            System.out.println("Teclea el valor de la salida " + (i + 1) + " : ");
            salidas[i] = dato.nextInt();
        }

        // Almacenar las filas que tienen el valor de salida como 1
        List<Integer> filasConUno = new ArrayList<>();
        for (int i = 0; i < cantSalidas; i++) {
            if (salidas[i] == 1) {
                filasConUno.add(i);
            }
        }

        // Mostrar las expresiones booleanas correspondientes a las filas con valor de salida 1
        if (!filasConUno.isEmpty()) {
            // Mostrar encabezados
            System.out.println();
            for (int i = 0; i < numBits; i++) {
                System.out.print(letras[i] + "\t");
            }
            System.out.println("x");

            for (int i = 0; i < numBits + 1; i++) {
                System.out.print("--------");
            }
            System.out.println();

            // Mostrar las combinaciones de bits actualizadas con los valores de salida
            for (int i = 0; i < totalCombinations; i++) {
                for (int j = 0; j < numBits; j++) {
                    int bit = (i >> j) & 1;
                    System.out.print(bit + "\t");
                }
                System.out.println(salidas[i]); // Mostrar el valor de salida actualizado
            }

            System.out.println("Las expresiones booleanas de las salidas 'x' en 1 son:");

            // Generar las expresiones booleanas para cada fila que tiene un "1" como valor de salida
            for (Integer fila : filasConUno) {
                for (int j = 0; j < numBits; j++) {
                    int bit = (fila >> j) & 1;
                    if (bit == 0) {
                        System.out.print("¬" + letras[j] + " ");
                    } else {
                        System.out.print(letras[j] + " ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("No hay filas con valor 1 para generar expresiones booleanas.");
        }
    }
}
