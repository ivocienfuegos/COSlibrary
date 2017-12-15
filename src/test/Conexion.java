/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mario.gonzalez
 */
public class Conexion {
     private static Connection  con=null;
   public static Connection  getConnection(){
      try{
         if( con == null ){
            String driver="oracle.jdbc.driver.OracleDriver"; //el driver varia segun la DB que usemos
            String url="jdbc:oracle:thin:@MSP-PM-04-01.aws.smartcloud.cl:1521:XE";
            String pwd="usuario05";
            String usr="usuario05";
            Class.forName(driver);
            con = DriverManager.getConnection(url,usr,pwd);
            System.out.println("Conectionesfull");
         }
     }
     catch(ClassNotFoundException | SQLException ex){
        ex.printStackTrace();
     }
     return con;
   }
}
