
package com.Tienda.service;

import com.Tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author JONA
 */
public interface ClienteService {
    
    public List<Cliente> getClientes(); 
    
    public Cliente getCliente(Cliente cliente); 
    
    public void save(Cliente cliente); // Sirve para insertar como modificar un registro en BD
    
    public void delete(Cliente cliente); 
  
}

