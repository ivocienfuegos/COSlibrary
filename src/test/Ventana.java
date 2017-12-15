/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

/**
 *
 * @author LEARNING CENTER
 */
public class Ventana{

    private JFrame ventana;
    private JMenuBar barraMenu;
    private JMenu menuArchivo;
    private JMenuItem itemSalir;
    private JMenuItem itemAgregar;

    public Ventana() 
    {
        //Ventana Principal
        this.ventana = new JFrame();
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setBounds(0,0,500,500);
        ventana.setLocationRelativeTo(null);
        
        //Barra de menú
        this.barraMenu = new JMenuBar();
        //Archivo
        this.menuArchivo = new JMenu("Archivo");
        
        this.itemAgregar = new JMenuItem("Agregar");
        //Items Archivo
        //agregar
        this.itemAgregar = new JMenuItem("Agregar"); 
        itemAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                itemAgregarActionPerformed(evt);
            }
        });
        //salir
        this.itemSalir = new JMenuItem("Salir"); 
        itemSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        

        
        this.barraMenu.add(menuArchivo);
        this.menuArchivo.add(itemAgregar);
        this.menuArchivo.add(itemSalir);
        this.ventana.setJMenuBar(barraMenu);  
    }
    

    

    
    
    
    
    
    
    
    
    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public JMenu getMenuArchivo() {
        return menuArchivo;
    }

    public void setMenuArchivo(JMenu menuArchivo) {
        this.menuArchivo = menuArchivo;
    }
    
    public void setVisible(boolean visible)
    {
        this.ventana.setVisible(visible);
    }

    private void itemAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.out.println("agregar");
    } 
    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ventana.dispose();
    } 
    
}
