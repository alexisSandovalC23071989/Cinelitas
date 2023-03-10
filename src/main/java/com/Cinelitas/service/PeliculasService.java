/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aldav
 */
@Service
public class PeliculasService implements IPeliculasService{
    
    @Autowired
    private PeliculasService Peliculas;
    
    
    public List<PeliculasService> listpeliculas(){
        return (List<PeliculasService>)Peliculas.findAll(); }    
    }

