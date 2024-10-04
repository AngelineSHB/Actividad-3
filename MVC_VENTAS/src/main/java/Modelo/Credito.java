/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER 17
 */
public class Credito {
    
    private double x;     
    private int letras;    

    // Constructor
    public Credito(double x, int letras) {
        this.x = x;
        this.letras = letras;
    }

 
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getLetras() {
        return letras;
    }

  
    public double calcularMontoInteres(double tasaInteres) {
        return x * (tasaInteres / 100);
    }

 
    public double calcularMontoMensual(double tasaInteres) {
        double interes = calcularMontoInteres(tasaInteres);
        return (x + interes) / letras;
    }

   
    public String obtenerDetalles(double tasaInteres) {
        double interes = calcularMontoInteres(tasaInteres);
        double montoMensual = calcularMontoMensual(tasaInteres);
        return String.format("Monto del crédito: %.2f\nNúmero de cuotas: %d\nMonto de interés: %.2f\nMonto mensual: %.2f",
                x, letras, interes, montoMensual);
    }
}

    