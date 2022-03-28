package com.proj.feira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.feira.models.Cliente;
import com.proj.feira.models.Produto;





@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	// TODO Auto-generated constructor stub
}