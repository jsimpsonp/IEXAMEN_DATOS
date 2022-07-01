/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITicket.service;

import com.ITicket.entity.Concierto;
import java.util.List;

/**
 *
 * @author Jeffrey Simpson
 */
public interface IConciertoService {
    
   public List <Concierto> getAllConcierto();
    public Concierto getConciertoById (long id);
    public void saveConcierto (Concierto concierto);
    public void delete (long id);

}

