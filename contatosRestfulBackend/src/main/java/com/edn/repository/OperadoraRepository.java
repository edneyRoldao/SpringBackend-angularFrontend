package com.edn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edn.model.Operadora;

/**
 * As we know, SpringData implements basic CRUD automatically even 
 * we have no concrete class.
 *  
 * @author eroldao
 *
 */
public interface OperadoraRepository extends JpaRepository<Operadora, Integer>{

}
