package com.cr.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table
public class Service {
	
	@Id
	@Column(name="service_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long serviceId;
	
	
	@Column(name="service_name", nullable=false)
	private String serviceName;
	
	@OneToMany(mappedBy = "serviceId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Image> images;
	
	
	//CONSTRUCTORS
	public Service() {
		// TODO Auto-generated constructor stub
	}



	public Service(long serviceId, String serviceName, Set<Image> images) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.images = images;
	}


	public Service(String serviceName, Set<Image> images) {
		super();
		this.serviceName = serviceName;
		this.images = images;
	}



	public long getServiceId() {
		return serviceId;
	}



	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}



	public String getServiceName() {
		return serviceName;
	}



	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}



	public Set<Image> getImages() {
		return images;
	}



	public void setImages(Set<Image> images) {
		this.images = images;
	}



	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", serviceName=" + serviceName + ", images=" + images + "]";
	}
	
	

	
	
}
