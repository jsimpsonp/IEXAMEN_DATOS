/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITicket.service;

import com.ITicket.entity.Artista;
import com.ITicket.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jeffrey Simpson
 */

@Service
public class ArtistaService  implements IArtistaService {

    
    @Autowired //Para la inyeccion de dependencias 
    private ArtistaRepository artistaRepository;
    
    @Override
    public List<Artista> listArtista() {
        return (List<Artista>) artistaRepository.findAll();
    }
    
}
