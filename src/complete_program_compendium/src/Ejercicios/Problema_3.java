/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Problema_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del centro de la circunferencia (x1, y1):");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese el radio de la circunferencia (r): ");
        double r = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del punto T (x2, y2):");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        // Calcula la distancia entre el centro (x1, y1) y el punto (x2, y2)
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distancia <= r) {
            System.out.println("El punto T está dentro del área de la circunferencia.");
        } else {
            System.out.println("El punto T está fuera del área de la circunferencia.");
        }
    }

}
