/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.entily;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author aldav
 */
@Entity
@Table(name = "peliculas")
public class Peliculas  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String NombrePelicula;
    private int CostoEntrada;
    private int fecha;
    private String salaMuestra;
    private int capacidadPersona;
    private int numeroSala;
    private String nombreSala;

    public String getNombrePelicula() {
        return NombrePelicula;
    }

    public void setNombrePelicula(String NombrePelicula) {
        this.NombrePelicula = NombrePelicula;
    }

    public int getCostoEntrada() {
        return CostoEntrada;
    }

    public void setCostoEntrada(int CostoEntrada) {
        this.CostoEntrada = CostoEntrada;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getSalaMuestra() {
        return salaMuestra;
    }

    public void setSalaMuestra(String salaMuestra) {
        this.salaMuestra = salaMuestra;
    }

    public int getCapacidadPersona() {
        return capacidadPersona;
    }

    public void setCapacidadPersona(int capacidadPersona) {
        this.capacidadPersona = capacidadPersona;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }
    
    
    
    
    

}
