/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteDos;

import paqueteUno.MatriculaAuto;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejecutor {

    
    public static void main(String[] args) {
        //Se crea un Objeto
        //Se hace referencia al constructor sin argumentos
        MatriculaAuto auto = new MatriculaAuto();
        
        //Se llama al método que calcula el valor de la Matricula
        auto.calcularValorM();
        
        //Se imprimen los datos
        System.out.printf("%s\n", auto);
        
        System.out.println("-----------------------------------------------------");
        
        //Se crea un Objeto 2 
        //Se hace referencia al constructor con argumentos
        MatriculaAuto auto2 = new MatriculaAuto("1025468762","Mercedes Benz", 2017, 59999);
        
        //Se llama al método que calcula el valor factura
        auto2.calcularValorM();
        
        //Se imprimen los datos
        System.out.printf("%s\n", auto2);
    }
    
}
