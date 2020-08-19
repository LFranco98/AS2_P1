package com.PIAnalisis2.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion implements IConexion{
    private static Conexion instance;
    public Connection conexion;     
    
    Conexion() {
    }
    
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
 
    public static Conexion getInstance(){
        if(instance == null){
            instance = new Conexion();
        }
        return instance;
    }
    
    @Override
    public void abrirConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            setConexion(DriverManager.getConnection("jdbc:mysql://192.185.4.65:3306/jbarilla_ingsoftware", "jbarilla_estudia", "2Ui!OssHDQGv"));
            System.out.println("Exito");
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println("Conexion fallida");
        }
    }
    
    @Override
    public void cerrarConexion(){
       try{
            getConexion().close();
        } catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en conexion",JOptionPane.ERROR_MESSAGE);
        } 
        
    }
    
}