
package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import static org.apache.coyote.http11.Constants.a;
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
    @Autowired //no hay que poner new cliente a cada metodo
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
           log.info("Ahora utilizando MVC");
        //   String mensaje = "Estamos en Semana 4, Saludos!";
        //   model.addAttribute("MensajeSaludo", mensaje);
           
       // Cliente cliente= new Cliente("jonathan", "Esquivel", "jona.esquivel.g@gmail.com", "88838276");
      //  Cliente cliente2= new Cliente("Auristela", "Gomez", "auri10@gmail.com", "12345678");
       
      //  model.addAttribute("Cliente", cliente);
 
     // List<Cliente> clientes = Array.asList (a:cliente, a:cliente2);
     // model.addAttribute(clientes);
     
     var clientes = clienteDao.findAll();
        model.addAttribute("clientes", "clientes");
        return "index";
    }
    
}
