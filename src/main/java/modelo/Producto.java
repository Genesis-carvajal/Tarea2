/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carva
 */
public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    //CONSTRUCTOR VACÍO.
    public Producto() {
    }

    //CONSTRUCTOR CON PARÁMETROS.
    public Producto(int codigo, String nombre, double precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    //SET.
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    //GET.
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}
