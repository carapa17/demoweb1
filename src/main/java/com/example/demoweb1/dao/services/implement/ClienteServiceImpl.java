/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoweb1.dao.services.implement;

import com.example.demoweb1.dao.ClienteDao;
import com.example.demoweb1.dao.services.ClienteService;
import com.example.demoweb1.model.Cliente;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Owner
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteDao clientedao;
    //Save
    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clientedao.save(cliente);
    }
    //implementación de delete
    @Override
    @Transactional
    public void delete(Integer id){
        clientedao.deleteById(id);
    }
    //implementación de findbyid
    @Override
    public Cliente findById(Integer id){
        return clientedao.findById(id).orElse(null);
    }
     //implementación de findAll
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clientedao.findAll();
    }
    //implementación de findByNombre
    @Override
    public List<Cliente> findByNombre(String nombre){
        return (List<Cliente>) clientedao.buscapornombre(nombre);
    }



}
