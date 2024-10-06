/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER 17
 */
public class Venta {
    private int cantidad;
    private String cliente,fecha, hora, producto,RUC;  

    public Venta() {
    }

    public Venta(int cantidad, String cliente, String fecha, String hora, String producto, String RUC) {
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.producto = producto;
        this.RUC = RUC;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
    public float asignarPrecio(){
        float precio = 0;
        return precio;
    }
    
    public float calcularSubtotal(){
        float subTotal = 0;
        return subTotal;
    }

}
