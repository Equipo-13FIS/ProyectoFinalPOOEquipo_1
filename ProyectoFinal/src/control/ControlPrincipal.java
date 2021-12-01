/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.table.TableColumn;
import control.*;


/**
 *
 * @author picar
 */
public class ControlPrincipal implements ActionListener{
     private MenuPrincipal principal;
     private ControlCrearCategoria ccc;
     private ControlCrearProducto ccp;
     Dimension pantalla= Toolkit.getDefaultToolkit().getScreenSize();
    public ControlPrincipal(MenuPrincipal menuPrincipal, ControlCrearCategoria ccc, ControlCrearProducto ccp){
        principal= menuPrincipal;
        this.ccc= ccc;
        this.ccp= ccp;
        
        principal.getAgregar().addActionListener(this);
        principal.getCrearCategoria().addActionListener(this);
        principal.getCrearProducto().addActionListener(this);
        
        
        //Estilo
        principal.setLocation(pantalla.width/2-principal.getWidth()/2, pantalla.height/2-principal.getHeight()/2);
        principal.setResizable(false);
        
    }
    
    public MenuPrincipal getVentana(){
        return principal;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(principal.getAgregar()== e.getSource()){
            BuscarProducto buscar= new BuscarProducto();
            buscar.setLocation(principal.getX()+principal.getWidth(), principal.getY());
            buscar.setVisible(true);
        }
        if(principal.getCrearCategoria()==e.getSource()){
          ccc.getVentana().setLocation(principal.getX()-ccc.getVentana().getWidth(),principal.getY());
          ccc.getVentana().setVisible(true);
        }
        if(principal.getCrearProducto()==e.getSource()){
          ccp.getVentana().setLocation(principal.getX()-ccp.getVentana().getWidth(),principal.getY()+ccc.getVentana().getHeight());
          ccp.getVentana().setVisible(true);
        }
        
        
    }
  
    
    
 
}
