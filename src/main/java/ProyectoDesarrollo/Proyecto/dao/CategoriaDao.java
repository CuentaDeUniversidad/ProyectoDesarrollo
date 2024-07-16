/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProyectoDesarrollo.Proyecto.dao;

import ProyectoDesarrollo.Proyecto.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lopez
 */
public interface CategoriaDao extends  JpaRepository<Categoria, Long>{
    
}
