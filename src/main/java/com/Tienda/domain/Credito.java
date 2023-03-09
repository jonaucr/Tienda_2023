
package com.Tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author JONA
 */
@Data  //crea get a set y los modifica de una
@Entity 
@Table(name="credito")
public class Credito implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito") //Permite indicar con cual campo de la base de datos se va a mapear
    
   //     private Long idCredito; //TRANSFORMA EN id_credito en MYSQL
    
    private Long idCredito;
    private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
        
        
    }
    
    
}
