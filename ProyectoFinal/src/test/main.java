/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import view.*;
import control.*;
/**
 *
 * @author picar
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ControlLook l = new ControlLook(); 
      
      MenuPrincipal p = new MenuPrincipal();
      CrearCategoria crearCategoria = new CrearCategoria();
      CrearProducto crearProducto = new CrearProducto();
      
      
      
      ControlCrearCategoria ccc = new ControlCrearCategoria(crearCategoria);
      ControlCrearProducto ccp = new ControlCrearProducto(crearProducto);
      ControlPrincipal menuPrincipal = new ControlPrincipal(p, ccc, ccp);
      
      p.setVisible(true);
       
        
        
    }
    
}
