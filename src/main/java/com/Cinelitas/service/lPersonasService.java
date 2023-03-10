/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.service;

import java.util.List;

/**
 *
 * @author aldav
 */
public interface lPersonasService {
    
    public List<PersonasService>getAllPersonas();
    public PersonasService getPersonasById (long id);
    public void savePersonas(PersonasService personas);
    public void delete (long id);
    
}
