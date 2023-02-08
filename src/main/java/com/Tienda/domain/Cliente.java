
package com.Tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author JONA
 */
@Data  //crea get a set y los modifica de una
@Entity 
@Table(name="cliente")
public class Cliente {
    private static final long serialVersionUID =1L; //es una propiedad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; //TRANSFORMA EN id_cliente  hibernate hace la consulta
    String nombre;
    String apellidos;
    String correo;
    String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
}
