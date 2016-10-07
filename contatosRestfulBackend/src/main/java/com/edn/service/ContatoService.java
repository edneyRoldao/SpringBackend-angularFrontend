package com.edn.service;

import java.util.List;

import com.edn.model.Contato;

/**
 * 
 * @author eroldao
 *
 */
public interface ContatoService {

	void createAndUpdate(Contato contato);
	
	void delete(int id);
	
	void delete(Contato contato);
	
	Contato read(int id);
	
	List<Contato> findAll();
	
}
