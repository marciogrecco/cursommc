package com.modelagemsistemasjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modelagemsistemasjava.domain.Estado;
@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer>{

}
