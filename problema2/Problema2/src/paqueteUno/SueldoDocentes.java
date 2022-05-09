/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteUno;

/**
 *
 * @author Santiago Espinoza
 */
public class SueldoDocentes {
    private String nombreD;
    private String apellidoD;
    private String cedula;
    private double sueldoB;
    private double sueldoT;
    
    public SueldoDocentes(){
        
        nombreD = "Georgina";
        apellidoD = "Rodríguez Hernández";
        cedula = "1106042189";
        sueldoB = 500; 
    
    }
    
    public SueldoDocentes(String nomD, String apeD, String dni,   
            double basico){
        
        nombreD = nomD;
        apellidoD = apeD;
        cedula = dni;
        sueldoB = basico;
        
    }
    
    public void establecerNombreD(String nomD){
        nombreD = nomD;
    }
    
    public void establecerApellidoD(String apeD){
        apellidoD = apeD;
    }
    
    public void establecerCedula(String dni){
        cedula = dni;
    }
    
    public void establecerSueldoB(double basico){
        sueldoB = basico;
    }
    
    public void calcularSueldoT(){
        sueldoT = sueldoB + (sueldoB * 0.20);
    }
    
    public String obtenerNombreD(){
        return nombreD;
    }
    
    public String obtenerApellidoD(){
        return apellidoD;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public double obtenerSueldoB(){
        return sueldoB;
    }
    
    public double obtenerSueldoT(){
        return sueldoT;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\tSueldo Docentes\n"
                + "Nombre del Docente: %s\n "
                + "Apellido del Docente: %s\n "
                + "Cédula del Docente: %s\n "
                + "Sueldo Básico: %.2f\n "
                + "Sueldo Total: %.2f\n ",   
                obtenerNombreD(),
                obtenerApellidoD(),
                obtenerCedula(),  
                obtenerSueldoB(),
                obtenerSueldoT());
        
        return cadena;
    }
}
