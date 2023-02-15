/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author JONA
 */
public interface ClienteService {
    public List<Cliente> getClientes(); //devuelve lista
    
    public Cliente getCliente(Cliente cliente); //devuelve cliente
    
    public void save (Cliente cliente); // Sirve para insertar como modificar un registro en BD
    
    public void delete (Cliente cliente); 
    
    
}

