
package com.Tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author JONA
 */
@Data  //crea get a set y los modifica de una
@Entity 
@Table(name="cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID =1L; //es una propiedad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; //TRANSFORMA EN id_cliente  hibernate hace la consulta
    String nombre;
    String apellidos;
    String correo;
    String telefono;
    
    @JoinColumn(name="id_credito", referencedColumnName = "id_credito")
    @ManyToOne
    private Credito credito;
    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
}
