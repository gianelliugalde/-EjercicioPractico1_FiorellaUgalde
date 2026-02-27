/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fugalde.demo.service;

import com.fugalde.demo.domain.Categoria;
import java.util.List;
/**
 *
 * @author giane
 */
public interface CategoriaService {
    List<Categoria> listar();
    Categoria buscarPorId(Integer id);
    Categoria guardar(Categoria categoria);
    void eliminar(Integer id);
}

