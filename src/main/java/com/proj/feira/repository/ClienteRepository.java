package com.proj.feira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.feira.models.Cliente;





@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	// TODO Auto-generated constructor stub
}