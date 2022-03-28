package com.proj.feira.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	

	@Column
   private long  id_cliente;

	@Column
   private long  id_produto;

	@Column
   private String data;

	@Column
   private Float preco;
	
	
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getId_cliente() {
	return id_cliente;
}
public void setId_cliente(long id_cliente) {
	this.id_cliente = id_cliente;
}
public long getId_produto() {
	return id_produto;
}
public void setId_produto(long id_produto) {
	this.id_produto = id_produto;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public Float getPreco() {
	return preco;
}
public void setPreco(Float preco) {
	this.preco = preco;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
   
	
   
   
	
	
}
