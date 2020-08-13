package com.PIAnalisis2.Control;

import com.PIAnalisis2.Model.Asignaciones;
import com.PIAnalisis2.Model.EstudiantesDAO;
import com.PIAnalisis2.Model.IEstudianteDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AsignacionesController {
    
    IEstudianteDAO estdao = new EstudiantesDAO();
    
    @PostMapping("/asignar_estudiante")
    public String Asignar(@ModelAttribute Asignaciones asignaciones, Model model){
          estdao.InsertAsign(asignaciones.getId_student(), asignaciones.getId_course());
          return "index";
    }
    
    @PostMapping("/desasignar_estudiante")
    public String Desasignar(@ModelAttribute Asignaciones asignaciones, Model model){
          estdao.DeleteAsign(asignaciones.getId_student(), asignaciones.getId_course());
          return "index";
    }
    
}
