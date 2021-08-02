package com.modelagemsistemasjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelagemsistemasjava.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
