package com.PIAnalisis2.Model;

import java.util.List;

/**
*
*
*@author Evelyn
*/

public interface IEstudianteDAO {
    public List<Estudiantes> GetEstudiantes();
    public void InsertAsign(String id_estudiante, String id_curso);
    public void DeleteAsign(String id_estudiante, String id_curso);
}