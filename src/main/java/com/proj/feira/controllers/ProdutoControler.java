package com.proj.feira.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proj.feira.models.Produto;
import com.proj.feira.repository.ProdutoRepository;



	@RestController
	@RequestMapping("/api/produtos")
	public class ProdutoControler {

		@Autowired
		private ProdutoRepository produtoRepository;
		
		@CrossOrigin(origins = "http://localhost:53419")
		@GetMapping
		public List<Produto> listar() {
			return produtoRepository.findAll();
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public Produto add(@RequestBody Produto produto) {
			return produtoRepository.save(produto);
		}

		@CrossOrigin(origins = "http://localhost:4200")
		@DeleteMapping("/{id}")
		public void deletar(@PathVariable Long id) {
			produtoRepository.deleteById(id);
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("/{id}")
		public Produto buscar(@PathVariable Long id) {
			return produtoRepository.findById(id).get();
		}
		
		
		
		 @PutMapping("/{id}")
		  public Produto updateTutorial(@PathVariable("id") Long id, @RequestBody Produto produto) {   
			 produto.setId(id);
		      return  produtoRepository.save(produto);
		 }	
		
		 
		 
		
		
		 
		
}
