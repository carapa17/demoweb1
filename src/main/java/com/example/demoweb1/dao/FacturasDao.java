/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoweb1.dao;

import com.example.demoweb1.model.Facturas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Owner
 */
@Repository
public interface FacturasDao extends CrudRepository<Facturas,Integer>{
    
}
