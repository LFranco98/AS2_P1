package com.PIAnalisis2.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private static Conexion instance;
    public Connection conexion;
    private final String urlConexion = "jdbc:mysql://192.185.4.65:3306/jbarilla_ingsoftware";
    private final String jdbc = "com.mysql.cj.jdbc.Driver";
    private final String usuario = "jbarilla_estudia";
    private final String contra = "2Ui!OssHDQGv";
    
   
    
    Conexion() {
    }

    public static Conexion getInstance(){
        if(instance == null){
            instance = new Conexion();
        }
        return instance;
    }
    
    public void abrirConexion(){
        try{
            Class.forName(jdbc);
            conexion = DriverManager.getConnection(urlConexion, usuario, contra);
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println("Conexion fallida");
        }
    }
    
    public void cerrarConexion(){
       try{
            conexion.close();
        } catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en conetion",JOptionPane.ERROR_MESSAGE);
        } 
        
    }
    /**
     * Default constructor
     */
    
}