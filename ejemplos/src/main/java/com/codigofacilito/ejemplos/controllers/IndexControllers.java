package com.codigofacilito.ejemplos.controllers;

import org.springframework.ui.Model
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//Es un decorador y le dice al IDE que esto del tipo controlador
@Controller
public class IndexControllers {

    @GetMapping(value = "/")
    public String index(Model model) {
        return "index";

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

