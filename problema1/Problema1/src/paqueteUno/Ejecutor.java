/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteUno;

import paqueteDos.PromedioCalificacion;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea un Objeto
        //Se hace referencia al constructor sin argumentos
        PromedioCalificacion prom = new PromedioCalificacion();
        
        //Se llama al método que calcula el valor factura
        prom.calcularPromedio();
        
        //Se imprimen los datos
        System.out.printf("%s\n", prom);
        
        System.out.println("-----------------------------------------------------");
        
        //Se crea un Objeto 2 
        //Se hace referencia al constructor con argumentos
        PromedioCalificacion prom2 = new PromedioCalificacion("Charli Grace D'Amelio", 9.75, 9.52, 7); 
        
        //Se llama al método que calcula el valor factura del objeto 2
        prom2.calcularPromedio();
        
        //Se imprimen los datos
        System.out.printf("%s\n", prom2);
        
    }
    
}







































































































































































































