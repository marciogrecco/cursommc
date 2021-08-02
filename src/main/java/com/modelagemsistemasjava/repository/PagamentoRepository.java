package com.modelagemsistemasjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modelagemsistemasjava.domain.Pagamento;
import com.modelagemsistemasjava.domain.Produto;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {

}
