package com.modelagemsistemasjava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelagemsistemasjava.domain.Pedido;
import com.modelagemsistemasjava.repository.PedidoRepository;
import com.modelagemsistemasjava.services.exception.ObjectNotFoundException;
@Service
public class PedidoServices {

	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		java.util.Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}