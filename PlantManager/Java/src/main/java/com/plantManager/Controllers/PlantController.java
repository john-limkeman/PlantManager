package com.plantManager.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plantManager.Models.Plant;

import DAOs.PlantDAO;

@CrossOrigin
@RestController
public class PlantController {
	
	@Autowired
	PlantDAO dao;

	//controller to get all plants by a user
	@RequestMapping(path = "{id}/plants", method = RequestMethod.GET)
	public List <Plant> getAllPlantsByUser(@PathVariable long id) {
		return dao.getAllPlantsByUserId(id);
	}
	
	//controller to get a plant by its id
	@RequestMapping(path = "/plant/{id}", method = RequestMethod.GET)
	public Plant getAllPlantById(@PathVariable long id) {
		return dao.getPlantById(id);
	}
	
}
