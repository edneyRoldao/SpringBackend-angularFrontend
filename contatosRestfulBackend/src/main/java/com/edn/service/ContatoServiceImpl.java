package com.edn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edn.model.Contato;
import com.edn.repository.ContatoRepository;

@Service
@Transactional
public class ContatoServiceImpl implements ContatoService {

	@Autowired
	private ContatoRepository repository;
	
	
	@Override
	public void createAndUpdate(Contato contato) {
		repository.save(contato);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
	}

	@Override
	public void delete(Contato contato) {
		repository.delete(contato);
	}

	@Override
	public Contato read(int id) {
		return repository.findOne(id);
	}

	@Override
	public List<Contato> findAll() {
		return repository.findAll();
	}

}
