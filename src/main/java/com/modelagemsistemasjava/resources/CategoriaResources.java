package com.modelagemsistemasjava.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {

	@RequestMapping(method = RequestMethod.GET)
	public String list() {

		return "Olá Spring boot";
	}

}
