/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteDos;

import paqueteUno.ComisionBanco;

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
        ComisionBanco cheque = new ComisionBanco();
        
        //Se llama al método que calcula la comisión del banco 
        cheque.calcularComisionBanco();
        
        //Se imprimen los datos
        System.out.printf("%s\n",cheque);

        
        System.out.println("-----------------------------------------------------");
        
        //Se crea un Objeto 2 
        //Se hace referencia al constructor con argumentos
        ComisionBanco cheque2 = new ComisionBanco("Piero Martín Hincapié Reyna", 
                "Banco del Pacífico", 1150.80);
        
        //Se llamar al método que calcula la comisión del banco
        cheque2.calcularComisionBanco();
        
        //Se imprimen los datos
        System.out.printf("%s\n",cheque2);  
    }
    
}
