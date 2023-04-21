/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoweb1.dao;

import com.example.demoweb1.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Owner
 */
@Repository
public interface ClienteDao extends CrudRepository<Cliente,Integer>{
    //Agregar un query nativo
    @Query(value="Select * from cliente where nombre=?",nativeQuery=true)
    public List<Cliente> buscapornombre(String nombre);
}
