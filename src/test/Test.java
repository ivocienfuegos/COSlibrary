/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;

/**
 *
 * @author LEARNING CENTER
 */
public class Test {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        
        ventana.setVisible(true);
        Connection conexion = Conexion.getConnection();
    }
}
