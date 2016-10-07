package com.edn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edn.model.Operadora;
import com.edn.repository.OperadoraRepository;

@Service
@Transactional
public class OperadoraServiceImpl implements OperadoraService {

	@Autowired
	private OperadoraRepository repository;
	
	
	@Override
	public void createAndUpdate(Operadora operadora) {
		repository.save(operadora);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
	}

	@Override
	public void delete(Operadora operadora) {
		repository.delete(operadora);
	}

	@Override
	public Operadora read(int id) {
		return repository.findOne(id);
	}

	@Override
	public List<Operadora> findAll() {
		return repository.findAll();
	}

}
