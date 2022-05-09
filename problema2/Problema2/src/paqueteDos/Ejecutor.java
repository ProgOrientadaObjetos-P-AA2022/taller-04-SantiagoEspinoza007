/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteDos;

import paqueteUno.SueldoDocentes;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea un objeto
        //Se hace referencia al constructor sin argumentos
        SueldoDocentes doc = new SueldoDocentes();
        
        //Se llama al método que calcula el valor de la factura
        doc.calcularSueldoT();
        
        //Se imprimen los datos 
        System.out.printf("%s\n", doc);
        
        System.out.println("-----------------------------------------------------");
        
        //Se crea un Objeto 2 
        //Se hace referencia al constructor con argumentos
        SueldoDocentes doc2 = new SueldoDocentes("N'Golo", "Kanté", "0756238452", 500);
        
        // se llama al método que calcula el valor de la factura
        doc2.calcularSueldoT();

        //Se imprimen los datos
        System.out.printf("%s\n", doc2);
    }
    
}
