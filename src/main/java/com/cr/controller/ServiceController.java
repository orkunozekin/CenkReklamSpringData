package com.cr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.model.Service;
import com.cr.repository.ServiceRepository;

@RestController
@RequestMapping("/services")
@CrossOrigin("*")
public class ServiceController {
	
	private ServiceRepository serviceRepo;
	
	
	
	
	@GetMapping("/allServices")
	public List<Service> findAllServices() {
		return serviceRepo.findAll();
	}
	
	
	@PostMapping("/addNewService")
	public String addNewService(@RequestBody Service service) {
		if(service.getServiceName() != null) {
			serviceRepo.save(service);
			return "Successfully created!";
		}
		return "Service creation has failed. Service name is null!";
	}
	
	@DeleteMapping("/deleteService")
	public String deleteService(@PathVariable Long id) {
		if(id != null) {
			serviceRepo.deleteById(id);
			return "Deleted successfully!";
		}
		return "Deletion has failed. Id is null.";
	}
	
	
	public ServiceController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	public ServiceController(ServiceRepository serviceRepo) {
		this.serviceRepo = serviceRepo;
	}


	public ServiceRepository getServiceRepo() {
		return serviceRepo;
	}


	public void setServiceRepo(ServiceRepository serviceRepo) {
		this.serviceRepo = serviceRepo;
	}
	
	
	
	
}









