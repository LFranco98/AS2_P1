package com.PIAnalisis2.Control;

import com.PIAnalisis2.Model.Asignaciones;
import com.PIAnalisis2.Model.EstudiantesDAO;
import com.PIAnalisis2.Model.IEstudianteDAO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class ExportController {
    IEstudianteDAO estdao = new EstudiantesDAO();
    
    @PostMapping("/exportar_estudiantes")
    public String Exportar_Estudiantes(@ModelAttribute Asignaciones asignaciones, Model model){
          estdao.ExportarEstudiante(asignaciones.getId_student(), asignaciones.getId_course());
          return "index";
    }
    
    @PostMapping("/exportar_cursos")
    public String Exportar_Cursos(@ModelAttribute Asignaciones asignaciones, Model model){
          estdao.ExportarEstudiante(asignaciones.getId_student(), asignaciones.getId_course());
          return "index";
    }
}
