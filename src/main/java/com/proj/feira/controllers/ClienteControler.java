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
import com.proj.feira.repository.ClienteRepository;
import com.proj.feira.repository.PedidoRepository;




@RestController
@RequestMapping("/clientes")
public class ClienteControler {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente add(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}
	

	@GetMapping("/{id}")
	public Cliente buscar(@PathVariable Long id) {
		return clienteRepository.findById(id).get();
	}
	
	
	
	
	 @PutMapping("/{id}")
	  public Cliente updateTutorial(@PathVariable("id") Long id, @RequestBody Cliente cliente) {   
		 cliente.setId(id);
	      return  clienteRepository.save(cliente);
	 }
	
	
	
	
	
}//fim



