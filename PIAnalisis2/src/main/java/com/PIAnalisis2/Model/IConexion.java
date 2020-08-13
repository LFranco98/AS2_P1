package com.PIAnalisis2.Model;

import java.sql.Connection;

public interface IConexion {
    public Connection getConexion(); 
    public void setConexion(Connection conexion);
    public void abrirConexion();
    public void cerrarConexion();
}
