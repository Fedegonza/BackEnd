package com.portfolio.demo.Interface;

import com.portfolio.demo.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List <Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona (Persona persona);
    
    //Eliminar un objeto pero la buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una Persona por ID
    public Persona findPersona (Long id);
}
