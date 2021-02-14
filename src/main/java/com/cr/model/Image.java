package com.cr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table
@Data
public class Image {
	
	@Id
	@Column(name="image_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long imageId;
	
	
	@Column(name="image_name", nullable=false)
	private String imageName;
	
	@Column(name="image_URL", nullable=false)
	private String imageURL;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "album_id", nullable = false)
	private Service serviceId;
	
	
	//CONSTRUCTORS
	public Image() {
		// TODO Auto-generated constructor stub
	}


	public Image(long imageId, String imageName, String imageURL, Service serviceId) {
		super();
		this.imageId = imageId;
		this.imageName = imageName;
		this.imageURL = imageURL;
		this.serviceId = serviceId;
	}


	public Image(String imageName, String imageURL, Service serviceId) {
		super();
		this.imageName = imageName;
		this.imageURL = imageURL;
		this.serviceId = serviceId;
	}


	public long getImageId() {
		return imageId;
	}


	public void setImageId(long imageId) {
		this.imageId = imageId;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public Service getServiceId() {
		return serviceId;
	}


	public void setServiceId(Service serviceId) {
		this.serviceId = serviceId;
	}


	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageName=" + imageName + ", imageURL=" + imageURL + ", serviceId="
				+ serviceId + "]";
	}


	
	
	
}
