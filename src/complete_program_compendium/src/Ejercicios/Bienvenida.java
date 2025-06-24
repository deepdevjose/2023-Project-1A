/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Josee
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //**Proyecto integrador de Primer Semestre**
        //**Software de resolución de problemas de Ingeniería*
        //**Carpetas con los codigos de los problemas propuestos**
        
        String[] nombres = {
            "José Manuel Cortes Cerón",
            "Diego Antonio Badillo Morales",
            "Sebastian Hernandez Ángeles",
            "Carmen Anahi Cornejo Lopez",
            "Oswaldo Gabriel Villaverde Mendoza"
        };

        System.out.println("******************************");
        System.out.println("* Proyecto integrador de Primer Semestre *");
        System.out.println("* Software de resolución de problemas de Ingeniería *");
        System.out.println("* Carpetas con los códigos de los problemas propuestos *");
        System.out.println("******************************");

        System.out.println("\n Integrantes del equipo:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }
}