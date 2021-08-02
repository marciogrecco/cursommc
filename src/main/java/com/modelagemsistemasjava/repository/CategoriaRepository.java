package com.modelagemsistemasjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modelagemsistemasjava.domain.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
