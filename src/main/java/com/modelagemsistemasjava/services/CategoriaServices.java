package com.modelagemsistemasjava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelagemsistemasjava.domain.Categoria;
import com.modelagemsistemasjava.repository.CategoriaRepository;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		java.util.Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
