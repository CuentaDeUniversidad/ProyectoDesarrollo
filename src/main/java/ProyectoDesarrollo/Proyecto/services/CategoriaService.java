/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProyectoDesarrollo.Proyecto.services;

import ProyectoDesarrollo.Proyecto.domain.Categoria;
import java.util.List;

/**
 *
 * @author lopez
 */
public interface CategoriaService {
    
    // se obtiene un arraylist
    // un listado de la tabla categoria en un arraylist
    //todos o solo los activos.
    
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);    
}
