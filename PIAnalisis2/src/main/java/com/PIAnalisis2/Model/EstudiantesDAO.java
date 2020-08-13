package com.PIAnalisis2.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudiantesDAO {
    public List<Estudiantes> GetEstudiantes(){ 
        List<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
        Estudiantes estudiante = new Estudiantes();
        Conexion conectar = new Conexion();
        PreparedStatement stmt = null;
        
        try{
            conectar.abrirConexion();
            stmt = conectar.conexion.prepareStatement("select * from t2_student");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                estudiante.setId_estudiante(rs.getString("id_student"));
                estudiante.setName(rs.getString("name"));
                estudiante.setSurname(rs.getString("surname"));
                estudiante.setEmail(rs.getString("email"));
                estudiante.setBirthdate(rs.getString("birthdate"));
                estudiante.setStuden_id(rs.getString("studen_id"));
                estudiante.setPhone1(rs.getString("phone1"));
                estudiante.setPhone2(rs.getString("phone2"));
                estudiante.setAddress1(rs.getString("address1"));
                estudiante.setAddress2(rs.getString("address2"));
                estudiantes.add(estudiante);
            }
            
            conectar.cerrarConexion();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return (estudiantes);
    }
    
}
