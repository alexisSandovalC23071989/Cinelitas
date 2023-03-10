/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.controller;

import com.Cinelitas.entily.Peliculas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author aldav
 */
@Controller
public class PeliculasController {
    
    @Autowired
    private IPeliculasService PeliculasService;

    @Autowired
    private IPeliculasService PeliculasService;
    
    @GetMapping("/conciertos")
    public String index(Model model) {
        List<Peliculas> listaPeliculas = PeliculasService.getAllPersona();
        model.addAttribute("titulo","Tabla Informacion de Peliculas");
        model.addAttribute("peliculas", listaPeliculas);
        return "peliculas";
        
    }
    
    @GetMapping("/peliculas")
    public String crearPersona(Model model) {
        List<Peliculas> listaPeliculas = PeliculasService.listConciertos();
      model.addAttribute("peliculas", new Peliculas());
      model.addAttribute("Peliculas", listaPeliculas);
      return "crear";
    
}
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Peliculas peliculas){
        PeliculasService.savePersona(peliculas);
        return"redirect:/peliculas";
    }
    
    
    
}
