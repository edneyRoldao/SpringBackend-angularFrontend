package com.edn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edn.model.Contato;
import com.edn.service.ContatoService;

/**
 * This is a simple restful controller.
 * You must realize that we are using news annotations that were included from spring framework release 4.3.1
 * 
 * @author eroldao
 *
 */
@RestController
@RequestMapping("/contatos")
public class ContatoRestController {

	@Autowired
	private ContatoService service;
	
	
	@GetMapping
	public List<Contato> list() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ResponseEntity findOne(@PathVariable("id") Integer id) {
		
		Contato contato = service.read(id);

		if(contato == null) 
			return new ResponseEntity(contato, HttpStatus.NOT_FOUND); 
		
		return new ResponseEntity(contato, HttpStatus.OK);
	}

	@PostMapping
	public void createContato(@RequestBody Contato contato) {
		service.createAndUpdate(contato);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
	
	@PutMapping
	public void updateContato(@RequestBody Contato contato) {
		service.createAndUpdate(contato);
	}
	
}
