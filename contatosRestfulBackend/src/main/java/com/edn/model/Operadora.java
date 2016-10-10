package com.edn.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author edneyroldao
 *
 */
@Entity
public class Operadora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	private String nome;

	private int codigo;

	private String categoria;

	private float preco;

	
	public Operadora() {
	}

	public Operadora(Integer id, String nome, int codigo, String categoria, float preco) {
		this.id = id;
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
		this.preco = preco;
	}
	

	@Override
	public String toString() {
		return "Operadora [id=" + id + ", nome=" + nome + ", codigo=" + codigo + ", categoria=" + categoria + ", preco="
				+ preco + "]";
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
