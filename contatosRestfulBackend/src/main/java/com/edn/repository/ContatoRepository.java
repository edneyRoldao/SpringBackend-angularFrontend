package com.edn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edn.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
