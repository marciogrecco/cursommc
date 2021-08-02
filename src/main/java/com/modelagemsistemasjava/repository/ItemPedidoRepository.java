package com.modelagemsistemasjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modelagemsistemasjava.domain.Estado;
import com.modelagemsistemasjava.domain.ItemPedido;
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Integer>{

}
