package com.PIAnalisis2.Control;

import com.PIAnalisis2.Model.EstudiantesDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    EstudiantesDAO estdao = new EstudiantesDAO();
    
    @GetMapping("/Index")
    public String ViewIndex(Model model){
        return "index";   
    }
    
    @RequestMapping("/asignar")
    public String ViewLoging(Model model){
        try{
            model.addAttribute("estudiante", estdao.GetEstudiantes());
        }catch(Exception e){
            e.printStackTrace();
        }
        return "asignar";
    }
    
    @GetMapping("/error")
    public String error(Model model){
        
        return "error";
    }
}
