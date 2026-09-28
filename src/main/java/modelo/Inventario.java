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
    private Producto[] productos = new Producto[10];

    public void Registrar() {
        for (int i = 0; i < productos.length; i++) {
                //Meteremos las variables de los datos a ingresar 
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código"));
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su precio"));
                int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de carnet"));

                productos[i] = new Producto(codigo, nombre, precio, cantidadDisponible);//Registro de variables
                productos[i].informacionProducto();//Esto llama al método que muestra lo ingresado
            
        }//Fin del primer método For.

        for (int i = 0; i < productos.length; i++) {
                JOptionPane.showMessageDialog(null, "Codigo: " + productos[i].getCodigo());
        }//Fin del primer método For.

        for (int i = 0; i < productos.length; i++) {
            JOptionPane.showMessageDialog(null, "Nombre: " + productos[i].getNombre());   
        }//Fin del primer método For.

        for (int i = 0; i < productos.length; i++) {
                JOptionPane.showMessageDialog(null, "Precio: " + productos[i].getPrecio());
        }//Fin del primer método For.

        for (int i = 0; i < productos.length; i++) {
                JOptionPane.showMessageDialog(null, "Cantidad: " + productos[i].getCantidadDisponible());
        }//Fin del primer método For  

    }//Fin del método Registrar.  

    public void Mostrar() {
        String matriz = "Indices (FILA, COLUMNA)\n";

        for (int i = 0; i < productos.length; i++) { //Recorre la fila. (i = fila).
                matriz += "(" + i + " ,) = " + productos[i]; //almacena y acumula.
            matriz += "\n";
        }//Fin del primer método For.
        JOptionPane.showMessageDialog(null, matriz);
    }//Fin del método Buscar.

    public void Buscar() {
        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código a buscar:"));

        if (entrada == -1) {
            JOptionPane.showMessageDialog(null, "El código debe ser ingresado");
        }//Fin de If.

        int fila = -1;

        for (int i = 0; i < productos.length; i++) {
                if (productos[i] != null && productos[i].getCodigo() == entrada) {
                    fila = i;
                    break;
                }//Fin método if.
        }//Fin del tercer método For.

        if (fila != -1) {
            JOptionPane.showMessageDialog(null, "El código " + entrada + " se encontró en la posición ["
                    + fila);
        } else {
            JOptionPane.showMessageDialog(null, "El código " + entrada + " no existe en el arreglo.");
        }
    }//Fin del método Buscar.

    public void Vender() {
        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código a buscar:"));

        if (entrada == -1) {
            JOptionPane.showMessageDialog(null, "El código debe ser ingresado");
        }//Fin de If.
        int compra = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces desea comprar?"));
        int fila = -1;
        int columna = -1;

        for (int i = 0; i < productos.length; i++) {
                if (productos[i] != null && productos[i].getCodigo() == entrada) {
                    fila = i;
                    break;
                    
                }//Fin método if.
                if (productos[i].getCantidadDisponible() >= 0) {
                    int valorActual = productos[i].getCantidadDisponible();
                    productos[i].setCantidadDisponible(valorActual - compra);
                    JOptionPane.showMessageDialog(null, "Se ha comprado.");

                } else {
                    JOptionPane.showMessageDialog(null, "No se logró comprar.");
                    
                }//Fin del else.
        }//Fin del primer método For.
        
    }//Fin del método Vender.

    public void Reabastecer() {
        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código a buscar:"));

        if (entrada == -1) {
            JOptionPane.showMessageDialog(null, "El código debe ser ingresado");
        }//Fin de If.
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces desea reabastecer?"));
        int fila = -1;

        for (int i = 0; i < productos.length; i++) {
                if (productos[i] != null && productos[i].getCodigo() == entrada) {
                    fila = i;
                    break;
                }//Fin método if.
                if (productos[i].getCantidadDisponible() >= 0) {
                    int valorActual = productos[i].getCantidadDisponible();
                    productos[i].setCantidadDisponible(valorActual + incremento);
                    JOptionPane.showMessageDialog(null, "Se ha rebastecido.");

                } else {
                    JOptionPane.showMessageDialog(null, "No se logró reabastecer.");
                    
                }//Fin del else.
        }//Fin del primer método For.
        
    }//Fin del método Reabastecer.

    public void calcularTotal() {
        for (int i = 0; i < productos.length; i++) {
                if (productos[i].getCantidadDisponible() >= 0) {
                    double sumaDeTodo = productos[i].getPrecio();
                    int valorActual = productos[i].getCantidadDisponible();
                    double total = sumaDeTodo * valorActual;
                    JOptionPane.showMessageDialog(null,"Esta es la suma total de todos los productos:%.2f%n"+total);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se logró obtener el total.");

                }//Fin del else.
        }//Fin del primer método For.

    }//Fin del método calcularTotal.

}//Cierre de la clase Inventario.
