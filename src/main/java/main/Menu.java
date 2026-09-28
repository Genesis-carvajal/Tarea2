/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import modelo.Inventario;

/**
 *
 * @author carva
 */
public class Menu {
    Inventario iv = new Inventario();
    private int opcion;
    
    public void menuPrincipal() {
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  BIENVENIDO, INGRESE UN NÚMERO.
                                                                  1. Registrar producto. 
                                                                  2. Mostrar productos. 
                                                                  3. Buscar producto por código. 
                                                                  4. Vender unidades. 
                                                                  5. Reabastecer producto. 
                                                                  6. Calcular valor total del inventario. 
                                                                  7. Salir.
                                                                  """));
            switch(opcion){
                case 1:
                    iv.Registrar();
                    break;
                case 2:
                    iv.Mostrar();
                    break;
                case 3:
                    iv.Buscar();
                    break;
                case 4:
                    iv.Vender();
                    break;
                case 5:
                    iv.Reabastecer();
                    break;
                case 6:
                    iv.calcularTotal();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Has salido del menú...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no disponible");
            }
            
        } while (opcion != 7);
    }//Cierre método menuPrincipal.
    
}//Fin clase menú.
