package com.PIAnalisis2.Model;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EstudiantesDAO implements IEstudianteDAO{
    
    IConexion conectar = new Conexion();
    
    @Override
    public List<Estudiantes> GetEstudiantes(){ 
        List<Estudiantes> estudiantes = new ArrayList<>();
        Estudiantes estudiante = new Estudiantes();
        
        try{
            conectar.abrirConexion();
            Statement stmt = conectar.getConexion().createStatement();
            ResultSet rs = stmt.executeQuery("select * from t2_student");
            
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

    @Override
    public void InsertAsign(String id_estudiante, String id_curso) {
        try{
            conectar.abrirConexion();
            PreparedStatement statement = conectar.getConexion().prepareStatement("insert into t2_student_rel_course (id_student, id_course) values(?,?);");
            statement.setString(1, id_estudiante);
            statement.setString(2, id_curso);
            conectar.cerrarConexion();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void DeleteAsign(String id_estudiante, String id_curso) {
        try{
            conectar.abrirConexion();
            PreparedStatement statement = conectar.getConexion().prepareStatement("delete from t2_student_rel_course where id_student = ? AND id_course = ?;");
            statement.setString(1, id_estudiante);
            statement.setString(2, id_curso);
            conectar.cerrarConexion();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void ExportarEstudiante(String id_estudiante, String id_curso) {
        try{
            conectar.abrirConexion();
            PreparedStatement statement = conectar.getConexion().prepareStatement("select s.name sname, s.surname, c.name cname from t2_student s, t2_course c, t2_student_rel_course z\n" +
                                                                                    "where s.id_student = z.id_student AND c.id_course = c.id_course AND c.id_course = ?;");
            statement.setString(1, id_curso);
            ResultSet rs = statement.executeQuery();
            PrintWriter archivo = new PrintWriter("Estudiantes.csv", "URF-8");
            while(rs.next()){
                archivo.println("\""+rs.getString("sname")+"\",\""+rs.getString("surname")+"\",\""+rs.getString("cname")+"\"");
            }
            conectar.cerrarConexion();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void ExportarCursos(String id_estudiante, String id_curso) {
        try{
            conectar.abrirConexion();
            PreparedStatement statement = conectar.getConexion().prepareStatement("select s.name sname, s.surname, c.name cname from t2_student s, t2_course c, t2_student_rel_course z\n" +
                                                                                    "where s.id_student = z.id_student AND c.id_course = c.id_course AND s.id_student = ?;");
            statement.setString(1, id_estudiante);
            ResultSet rs = statement.executeQuery();
            PrintWriter archivo = new PrintWriter("Estudiantes.csv", "URF-8");
            while(rs.next()){
                archivo.println("\""+rs.getString("sname")+"\",\""+rs.getString("surname")+"\",\""+rs.getString("cname")+"\"");
            }
            conectar.cerrarConexion();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
