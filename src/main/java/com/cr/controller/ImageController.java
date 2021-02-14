package com.cr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.model.Image;
import com.cr.repository.ImageRepository;

@RestController
@RequestMapping("/images")
@CrossOrigin("*")
public class ImageController {
	
	
	private ImageRepository imageRepo;
	
	
	@GetMapping("/allImages")
	public List<Image> getAllImages() {
		return imageRepo.findAll();
	}
	
	
	@PostMapping("/addNewImage")
	public String addNewImage(@RequestBody Image image) {
		System.out.println("in image controller post method");
		if(image.getImageName() != null) {
			System.out.println("yo");
			imageRepo.save(image);
			return "Image has successfully been added!";
		}
		return "Image creation has failed!";
	}
	

	public ImageController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	public ImageController(ImageRepository imageRepo) {
		this.imageRepo = imageRepo;
	}
	
	


	public ImageRepository getImageRepo() {
		return imageRepo;
	}



	public void setImageRepo(ImageRepository imageRepo) {
		this.imageRepo = imageRepo;
	}
	
	
	
	
	
}
