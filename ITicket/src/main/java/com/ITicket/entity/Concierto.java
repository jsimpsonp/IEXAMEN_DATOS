/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITicket.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jeffrey Simpson
 */
@Entity
@Table(name = "conciertos")
public class Concierto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // aca le decimos como deberia comportase nuestro Id

    private long id;
    private String costoEvento;
    private String fecha;
    private String capacidadPersonas;
    private String lugar;

    @ManyToOne
    @JoinColumn(name = "artistas_id")
    private Artista artista;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCostoEvento() {
        return costoEvento;
    }

    public void setCostoEvento(String costoEvento) {
        this.costoEvento = costoEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(String capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

}
