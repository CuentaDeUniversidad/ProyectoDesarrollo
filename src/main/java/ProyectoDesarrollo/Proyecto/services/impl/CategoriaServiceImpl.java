/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoDesarrollo.Proyecto.services.impl;

import ProyectoDesarrollo.Proyecto.dao.CategoriaDao;
import ProyectoDesarrollo.Proyecto.domain.Categoria;
import ProyectoDesarrollo.Proyecto.services.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {
// 
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategoria(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }
}
