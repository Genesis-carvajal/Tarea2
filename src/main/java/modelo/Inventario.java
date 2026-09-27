/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author carva
 */
public class Inventario {
    Producto producto = new Producto();
    private Producto[][] productos = new Producto[10][10];
    
    public void Registrar() {
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                //Meteremos las variables de los datos a ingresar 
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código"));
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su precio"));
                int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de carnet"));

                productos[i][j] = new Producto(codigo, nombre, precio, cantidadDisponible);//Registro de variables
                productos[i][j].informacionProducto();//Esto llama al método que muestra lo ingresado
            }//Fin del segundo método For.
        }//Fin del primer método For.
        
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                JOptionPane.showMessageDialog(null, "Nombres: " + productos[i][j].getCodigo());
            }//Fin del segundo método For.
        }//Fin del primer método For.
        
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                JOptionPane.showMessageDialog(null, "Correo: " + productos[i][j].getNombre());
            }//Fin del segundo método For.
        }//Fin del primer método For.
        
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                JOptionPane.showMessageDialog(null, "Edad: " + productos[i][j].getPrecio());
            }//Fin del segundo método For.
        }//Fin del primer método For.
        
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                JOptionPane.showMessageDialog(null, "Edad: " + productos[i][j].getCantidadDisponible());
            }//Fin del segundo método For.
        }//Fin del primer método For  

    }//Fin del método Registrar.
}//Cierre de la clase Inventario.
