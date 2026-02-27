/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fugalde.demo.service.impl;

import com.fugalde.demo.domain.Categoria;
import com.fugalde.demo.repository.CategoriaRepository;
import com.fugalde.demo.service.CategoriaService;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author giane
 */

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository repo;

    public CategoriaServiceImpl(CategoriaRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Categoria> listar() {
        return repo.findAll();
    }

    @Override
    public Categoria buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return repo.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
} 

