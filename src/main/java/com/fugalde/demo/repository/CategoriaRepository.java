/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fugalde.demo.repository;

import com.fugalde.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author giane
 */ 
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}

