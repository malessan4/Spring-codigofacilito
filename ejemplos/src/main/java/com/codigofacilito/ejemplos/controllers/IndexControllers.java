package com.codigofacilito.ejemplos.controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

//Es un decorador y le dice al IDE que esto del tipo controlador
@Controller
public class IndexControllers {

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("titulo", "soy el titulo");
        model.addAttribute("saludo","Hola codigo facilito");
        model.addAttribute("show", false); //con este false oculto el div
        //List<String> series =List.of("Dark", "Breaking Bad", "Walking Dead");
        //model.addAttribute("series", series);
        return "index";

}

// otra forma de crear un action y enviar informacion hacia la vista

    @GetMapping(value = "/index-mv")
    public ModelAndView indexMV(ModelAndView mv) {
        mv.addObject("titulo", "Titulo de MV");
        mv.addObject("saludo", "Saludo de MV");
        mv.addObject("show", true);
        //List<String> series = List.of("Dark", "Breaking Bad", "Walking Dead");
        //mv.addObject("series", series);

        mv.setViewName("index");

        return mv;
    }

    @ModelAttribute("series")
    public List<String> getSeries() {
        return List.of("Dark", "Breaking Bad", "Walking Dead","The Last of Us", "Fallout" );
    }
    @PostMapping(value = "/index-post")
    public String indexRequestMapping(){
        return "index";
    }


}


/*
  @RequestMapping(value="/index-req-mapping", method = RequestMethod.GET)
    public String indexRequestMapping(){
        return "index";
    }
*/




