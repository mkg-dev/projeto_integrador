package com.proj.feira.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.feira.models.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	// TODO Auto-generated constructor stub
	
	
}
