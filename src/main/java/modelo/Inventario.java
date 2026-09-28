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
    private Producto[][] productos = new Producto[5][5];

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

    public void Mostrar() {
        String matriz = "Indices (FILA, COLUMNA)\n";

        for (int i = 0; i < productos.length; i++) { //Recorre la fila. (i = fila).
            for (int j = 0; j < productos[i].length; j++) { //Recorre la columna. (j = columna)
                matriz += "(" + i + " , " + j + ") = " + productos[i][j]; //almacena y acumula.
            }//Fin del segundo método For.
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
        int columna = -1;

        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                if (productos[i][j] != null && productos[i][j].getCodigo() == entrada) {
                    fila = i;
                    columna = j;
                    break;
                }//Fin método if.
            }//Fin del segundo método For.
        }//Fin del tercer método For.

        if (fila != -1) {
            JOptionPane.showMessageDialog(null, "El código " + entrada + " se encontró en la posición ["
                    + fila + "][" + columna + "]");
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
            for (int j = 0; j < productos[i].length; j++) {
                if (productos[i][j] != null && productos[i][j].getCodigo() == entrada) {
                    fila = i;
                    columna = j;
                    break;
                }//Fin método if.
                if (productos[i][j].getCantidadDisponible() >= 0) {
                    int valoractual = productos[i][j].getCantidadDisponible();
                    productos[i][j].setCantidadDisponible(valoractual - compra);
                    JOptionPane.showMessageDialog(null, "Se ha comprado.");

                } else {
                    JOptionPane.showMessageDialog(null, "No se logró comprar.");
                }//Fin del segundo método For.
            }//Fin del tercer método For.

        }
    }//Fin del método Vender.

    public void Reabastecer() {
        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código a buscar:"));

        if (entrada == -1) {
            JOptionPane.showMessageDialog(null, "El código debe ser ingresado");
        }//Fin de If.
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces desea reabastecer?"));
        int fila = -1;
        int columna = -1;

        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                if (productos[i][j] != null && productos[i][j].getCodigo() == entrada) {
                    fila = i;
                    columna = j;
                    break;
                }//Fin método if.
                if (productos[i][j].getCantidadDisponible() >= 0) {
                    int valoractual = productos[i][j].getCantidadDisponible();
                    productos[i][j].setCantidadDisponible(valoractual + incremento);
                    JOptionPane.showMessageDialog(null, "Se ha rebastecido.");

                } else {
                    JOptionPane.showMessageDialog(null, "No se logró reabastecer.");
                }//Fin del segundo método For.
            }//Fin del tercer método For.

        }
    }//Fin del método Reabastecer.

    public void calcularTotal() {
        
    }//Fin del método calcularTotal.

}//Cierre de la clase Inventario.
