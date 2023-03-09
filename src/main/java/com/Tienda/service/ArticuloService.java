
package com.Tienda.service;

import com.Tienda.domain.Articulo;
import java.util.List;


public interface ArticuloService {
  public List<Articulo> getArticulos(boolean activos); 
    
    public Articulo getArticulo(Articulo articulo); 
    
    public void save(Articulo articulo); // Tanto para insertar como para modificar un registro
    
    public void delete(Articulo articulo); 
    
}

