package com.edn.service;

import java.util.List;

import com.edn.model.Operadora;

/**
 * 
 * @author eroldao
 *
 */
public interface OperadoraService {

	void createAndUpdate(Operadora operadora);
	
	void delete(int id);
	
	void delete(Operadora operadora);
	
	Operadora read(int id);
	
	List<Operadora> findAll();

}
