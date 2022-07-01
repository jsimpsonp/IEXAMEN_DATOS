/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITicket.repository;

import com.ITicket.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jeffrey Simpson
 */
@Repository
public interface ConciertoRepository extends CrudRepository <Concierto, Long> {
    
}

