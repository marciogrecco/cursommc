package com.modelagemsistemasjava;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.modelagemsistemasjava.domain.Categoria;
import com.modelagemsistemasjava.domain.Cidade;
import com.modelagemsistemasjava.domain.Estado;
import com.modelagemsistemasjava.domain.Produto;
import com.modelagemsistemasjava.repository.CategoriaRepository;
import com.modelagemsistemasjava.repository.CidadeRepository;
import com.modelagemsistemasjava.repository.EstadoRepository;
import com.modelagemsistemasjava.repository.ProdutoRepository;

@SpringBootApplication
public class ModelagemSistemasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ModelagemSistemasApplication.class, args);
	}

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Override
	public void run(String... args) throws Exception {

		
				
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		
		
		Produto p1 = new Produto(null,"Computador", 2000.0);
		Produto p2 = new Produto(null,"Impressora", 850.0);
		Produto p3 = new Produto(null,"Mouse",150.0);
		
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

	}

}