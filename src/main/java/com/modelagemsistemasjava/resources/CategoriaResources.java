package com.modelagemsistemasjava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.modelagemsistemasjava.domain.Categoria;
import com.modelagemsistemasjava.services.CategoriaServices;

import javassist.tools.rmi.ObjectNotFoundException;


@RestController
@RequestMapping("/categorias")
public class CategoriaResources {

	@Autowired
	private CategoriaServices service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);

	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findALL() throws ObjectNotFoundException {
		ResponseEntity<List<Categoria>> obj = service.findALL();
		return ResponseEntity.ok().body(obj);

}
}