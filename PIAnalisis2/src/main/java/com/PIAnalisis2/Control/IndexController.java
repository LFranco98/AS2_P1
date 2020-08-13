package com.PIAnalisis2.Control;

import com.PIAnalisis2.Model.Asignaciones;
import com.PIAnalisis2.Model.EstudiantesDAO;
import com.PIAnalisis2.Model.IEstudianteDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    IEstudianteDAO estdao = new EstudiantesDAO();
    
    @GetMapping("/index")
    public String ViewIndex(Model model){
        return "index";   
    }
    
    @RequestMapping("/asignar")
    public String ViewAsignar(Model model){
        model.addAttribute("asignar_estudent", new Asignaciones());
        try{
            model.addAttribute("estudiante", estdao.GetEstudiantes());
        }catch(Exception e){
            e.printStackTrace();
        }
        return "asignar";
    }
    
    @RequestMapping("/desasignar")
    public String ViewDesasignar(Model model){
        model.addAttribute("desasignar_estudent", new Asignaciones());
        try{
            model.addAttribute("estudiante", estdao.GetEstudiantes());
        }catch(Exception e){
            e.printStackTrace();
        }
        return "desasignar";
    }
    
    @GetMapping("/error")
    public String error(Model model){
        
        return "error";
    }
}
