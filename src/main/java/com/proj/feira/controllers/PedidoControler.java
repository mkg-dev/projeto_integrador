package com.proj.feira.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proj.feira.models.Cliente;
import com.proj.feira.models.Pedido;
import com.proj.feira.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoControler {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public List<Pedido> listar() {
		return pedidoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pedido add(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		pedidoRepository.deleteById(id);
	}
	

	@GetMapping("/{id}")
	public Pedido buscar(@PathVariable Long id) {
		return pedidoRepository.findById(id).get();
	}
	
	
	
	 @PutMapping("/{id}")
	  public Pedido updateTutorial(@PathVariable("id") Long id, @RequestBody Pedido pedido) {   
		 pedido.setId(id);
	      return  pedidoRepository.save(pedido);
	 }	
	
	
}//fim
