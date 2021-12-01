/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;

/**
 *
 * @author picar
 */
public class ControlBuscar implements ActionListener{
    private BuscarProducto buscar;
    private MenuPrincipal principal;
    public ControlBuscar(BuscarProducto buscar, MenuPrincipal principal){
        this.buscar= buscar;
        this.principal= principal; 
        this.buscar.getBuscar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(buscar.getBuscar()==e.getSource()){
          String nombre = buscar.getNombre().getText();
          Float  codigo = Float.parseFloat(buscar.getCodigo().getText());
          Object fila[] = new Object[3];
          fila[0]= nombre;
          fila[1]= codigo;
          fila[2]= 0;
          
        }
    }
    
}
