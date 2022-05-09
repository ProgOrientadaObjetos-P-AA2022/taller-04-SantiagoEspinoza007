/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;

/**
 *
 * @author Santiago Espinoza
 */
public class PromedioCalificacion {
    private String nombreE;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;
    
    public PromedioCalificacion(){ //Constructor sin argumentos
        nombreE = "Federico Santiago Valverde Dipetta";
        materia1 = 9.68;
        materia2 = 8.52;
        materia3 = 9;
        
    }
    
    public PromedioCalificacion(String nom, double mat1, double mat2,   
            double mat3){ //Constructor con argumentos
        
        nombreE = nom;
        materia1 = mat1;
        materia2 = mat2;
        materia3 = mat3;
        
    }
    
    public void establecerNombreE (String nom){
        nombreE = nom;
    }
    
    public void establecerMateria1 (double mat1){
        materia1 = mat1;
    }
    
    public void establecerMateria2 (double mat2){
        materia2 = mat2;
    }
    
    public void establecerMateria3 (double mat3){
        materia3 = mat3;
    }
    
    public void calcularPromedio (){
        promedio = (materia1 + materia2 + materia3)/3; 
    }
    
    public String obtenerNombreE (){
        return nombreE;
    }
    
    public double obtenerMateria1 (){
        return materia1;
    }
    
    public double obtenerMateria2 (){
        return materia2;
    }
    
    public double obtenerMateria3 (){
        return materia3;
    }
    
    public double obtenerPromedio (){
        return promedio;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\tPromedio de Estudiante\n"
                + "Nombre: %s\n"
                + "Calificación de Materia 1: %.2f\n"
                + "Calificación de Materia 2: %.2f\n"
                + "Calificación de Materia 3: %.2f\n"  
                + "El promedio de sus calificaciones es: %.2f\n",
                obtenerNombreE(),   
                obtenerMateria1(),
                obtenerMateria2(),  
                obtenerMateria3(),
                obtenerPromedio());
                
        return cadena;
    
    }
}
