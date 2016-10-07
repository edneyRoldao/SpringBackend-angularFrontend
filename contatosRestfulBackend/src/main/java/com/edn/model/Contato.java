package com.edn.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	
	private String telefone;
	
	private String serial;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	@ManyToOne
	private Operadora operadora;

	
	public Contato() {
	}

	public Contato(Integer id, String name, String serial, Calendar data, Operadora operadora) {
		this.id = id;
		this.nome = name;
		this.serial = serial;
		this.data = data;
		this.operadora = operadora;
	}

	
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", serial=" + serial
				+ ", dataLancamento=" + data + ", operadora=" + operadora + "]";
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Calendar getData() {
		return data;
	}

	public void setDataLancamento(Calendar data) {
		this.data = data;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	
}
