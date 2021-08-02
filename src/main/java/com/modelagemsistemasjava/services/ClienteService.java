package com.modelagemsistemasjava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelagemsistemasjava.domain.Cliente;
import com.modelagemsistemasjava.repository.ClienteRepository;
import com.modelagemsistemasjava.services.exception.ObjectNotFoundException;
import com.sun.el.stream.Optional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		java.util.Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
