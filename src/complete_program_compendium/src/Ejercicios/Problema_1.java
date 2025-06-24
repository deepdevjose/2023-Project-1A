/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Oswaldo
 */
public class Problema_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        double x1, y1;

        do {
            // Obtener las coordenadas del punto A (x1)
            System.out.println("Ingrese las coordenadas del punto A (x1): ");
            while (!datos.hasNextDouble()) {
                System.out.println("Por favor, ingrese valores numéricos para x1.");
                datos.next(); // Limpiar el búfer de entrada
            }
            x1 = datos.nextDouble();

            // Obtener las coordenadas del punto A (y1)
            System.out.println("Ingrese las coordenadas del punto A (y1): ");
            while (!datos.hasNextDouble()) {
                System.out.println("Por favor, ingrese valores numéricos para y1.");
                datos.next(); // Limpiar el búfer de entrada
            }
            y1 = datos.nextDouble();

        } while (Double.isNaN(x1) || Double.isNaN(y1));

        double x2, y2;

        do {
            // Obtener las coordenadas del punto B (x2)
            System.out.println("Ingrese las coordenadas del punto B (x2): ");
            while (!datos.hasNextDouble()) {
                System.out.println("Por favor, ingrese valores numéricos para x2.");
                datos.next(); // Limpiar el búfer de entrada
            }
            x2 = datos.nextDouble();

            // Obtener las coordenadas del punto B (x2)
            System.out.println("Ingrese las coordenadas del punto B (y2): ");
            while (!datos.hasNextDouble()) {
                System.out.println("Por favor, i  ngrese valores numéricos para y2.");
                datos.next(); // Limpiar el búfer de entrada
            }
            y2 = datos.nextDouble();

        } while (Double.isNaN(x2) || Double.isNaN(y2));

        // Calcular la pendiente (la declaré como su verdadera: "m")
        double m = (y2 - y1) / (x2 - x1);

        // Calcular la ecuación de la recta en forma general (Ax + By + C = 0)
        double A = m;
        double B = -1;
        double C = -m * x1 + y1;

        // Calcular el ángulo interno α en grados
        double anguloRad = Math.atan(m);
        double anguloGrados = Math.toDegrees(anguloRad);

        // Mostrar la ecuación de la recta y el ángulo interno
        System.out.println("Ecuación de la recta: y = " + A + "x " + C);
        System.out.println("El ángulo interno α es: " + anguloGrados + " grados");
    }

}
