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
@Table(name="personas")
public class Personas implements Serializable {
    
     @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     
     private String nombreCliente;
     private String email;
     private int CostoBoleto;
     private int numeroBoleto;
     private String nombrepelicula;
     private int fecha;
     private int numerosala;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCostoBoleto() {
        return CostoBoleto;
    }

    public void setCostoBoleto(int CostoBoleto) {
        this.CostoBoleto = CostoBoleto;
    }

    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getNombrepelicula() {
        return nombrepelicula;
    }

    public void setNombrepelicula(String nombrepelicula) {
        this.nombrepelicula = nombrepelicula;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getNumerosala() {
        return numerosala;
    }

    public void setNumerosala(int numerosala) {
        this.numerosala = numerosala;
    }
     
     
    
}
