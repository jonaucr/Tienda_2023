/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JONA  // es la interface es como el contrato para el CRUD CON LA BASE DE DATOS
 */
@Service  //para que reconosca los metodos
public class ClienteServiceImpl implements ClienteService {
   
    @Autowired
    ClienteDao clienteDao;
    
   // @Transactional (readOnly = true); // panara manejar transaciones de solo lectura
    public List<Cliente> getClientes(boolean readOnly) {
    return (List<Cliente>) clienteDao.findAll();

    }

   @Transactional //(readOnly = true);
    public Cliente getCliente(Cliente cliente, boolean readOnly) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
      
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
     clienteDao.save(cliente);

    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> getClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
