/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.service;

import com.Cinelitas.entily.Personas;
import com.Cinelitas.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aldav
 */
@Service
public class PersonasService implements IPersonasService {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    
    public List<Personas> getAllPersona() {
        return (List<Personas>)personaRepository.findAll();
    }

    
    public Personas getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    
    public void savePersona(Personas persona) {
        personaRepository.save(persona);
    }

    
    public void delete(long id) {
        personaRepository.deleteById(id);
    }
    
}
