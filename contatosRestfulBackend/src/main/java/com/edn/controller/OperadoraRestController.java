package com.edn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edn.model.Operadora;
import com.edn.service.OperadoraService;

@RestController
@RequestMapping("/operadoras")
public class OperadoraRestController {

	@Autowired
	OperadoraService service;
	
	
	@GetMapping
	public List<Operadora> list() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Operadora findOne(@PathVariable("id") Integer id) {
		return service.read(id);
	}

	@PostMapping
	public void createOperadora(@RequestBody Operadora operadora) {
		service.createAndUpdate(operadora);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
	
	@PutMapping
	public void updateOperadora(@RequestBody Operadora operadora) {
		service.createAndUpdate(operadora);
	}
	
}
