/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author carva
 */
public class Menu {
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
            }
            
        } while (opcion != 7);
    }//Cierre método menuPrincipal.
    
}//Fin clase menú.
