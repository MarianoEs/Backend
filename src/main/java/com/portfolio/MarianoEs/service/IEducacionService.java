
package com.portfolio.MarianoEs.service;

import com.portfolio.MarianoEs.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> obtenerEducacion();
    
    public Educacion crearEducacion(Educacion educacion);
    
    public void borrarEducacion(Long id);
    
    public Educacion obtenerEducacion(Long id);
    
    public void modificarEducacion(Educacion educacion);
    
}
