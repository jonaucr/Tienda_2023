
package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author JONA
 */
@Slf4j
@Controller
public class IndexController {
    @Autowired 
    ClienteDao clienteDao; //no hay que poner new cliente a cada metodo
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        //   String mensaje = "Estamos en Semana 4, Saludos!";
        //  model.addAttribute("MensajeSaludo", mensaje);

        //  Cliente cliente = new Cliente("jonathan", "Esquivel", "jona.esquivel.g@gmail.com", "88838276");
        //  Cliente cliente2 = new Cliente("Auristela", "Gomez", "auri10@gmail.com", "12345678");
        // model.addAttribute("Cliente", cliente);
        // List<Cliente> clientes = Array.asList(cliente, cliente2);
        //   model.addAttribute("clientes", clientes);
        var clientes = clienteDao.findAll();//trae los registro de db de la tabla clientes
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
    
}
