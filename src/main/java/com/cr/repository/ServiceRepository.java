package com.cr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cr.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long>{
	
	//Get
	public List<Service> findAll();
	public Service findByServiceId(Long id);
	
}
