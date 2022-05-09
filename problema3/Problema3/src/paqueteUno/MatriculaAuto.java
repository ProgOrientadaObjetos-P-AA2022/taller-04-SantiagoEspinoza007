/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteUno;

/**
 *
 * @author Santiago Espinoza
 */
public class MatriculaAuto {
    private String cedulaD;
    private String marcaV;
    private int anioF;
    private double valorV;
    private double valorM;
    
    public MatriculaAuto(){
        
        cedulaD = "1104358762";
        marcaV = "Toyota";
        anioF = 2005;
        valorV = 12500;
        
    }
    
    public MatriculaAuto(String dni, String marca, int anio, double valor){
        
        cedulaD = dni;
        marcaV = marca;
        anioF = anio;
        valorV = valor;
        
    }
    
    public void establecerCedulaD(String dni){
        cedulaD = dni;
    }
    
    public void establecerMarcaV(String marca){
        marcaV = marca;
    }
    
    public void establecerAnioF(int anio){
        anioF = anio;
    }
    
    public void establecerValorV(double valor){
        valorV = valor;
    }
    
    public void calcularValorM(){
        valorM = (valorV * 0.00002)* (2022 - anioF);
    }
    
    public String obtenerCedulaD(){
        return cedulaD;
    }
    
    public String obtenermarcaV(){
        return marcaV;
    }
    
    public int obtenerAnioF(){
        return anioF;
    }
    
    public double obtenerValorV(){
        return valorV;
    }
    
    public double obtenerValorMatricula(){
        return valorM;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\tValor Matricula Vehículo\n"
                + "Cecula del Dueño: %s\n"
                + "Marca del Vehículo: %s\n"
                + "Año de Fabricación del Vehículo: %d\n"
                + "Valor del Vehículo: %.2f\n"
                + "El valor de la Matricula del Vehiculo es: %.2f\n",
                obtenerCedulaD(),
                obtenermarcaV(),
                obtenerAnioF(),
                obtenerValorV(),
                obtenerValorMatricula());
        
        return cadena;
    }
}
