/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteUno;

/**
 *
 * @author Santiago Espinoza
 */
public class ComisionBanco {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public ComisionBanco(){
        nombreCliente = "Gonzalo Jordy Plata Jiménez";
        nombreBanco = "Banco de Guayaquil";
        valorCheque = 800.50;
    }
    
    public ComisionBanco(String nomC, String ban, double valorC){
        nombreCliente = nomC;
        nombreBanco = ban;
        valorCheque = valorC;
    }
    
    public void establecerNombreCliente(String nomC){
        nombreCliente = nomC;
    }
    
    public void establecerNombreBanco(String ban){
        nombreBanco = ban;
    }
    
    public void establecerValorCheque(double valorC){
        valorCheque = valorC;
    }
    
    public void calcularComisionBanco(){
        comisionBanco = (valorCheque * 0.00003);
    }
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    
    public double obtenerValorCheque(){
        return valorCheque;
    }
    
    public double obtenerComisionBanco(){
        return comisionBanco;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\tComision por Cheque\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "La comisión del banco es: %.2f\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionBanco());
        return cadena;
    }
}
