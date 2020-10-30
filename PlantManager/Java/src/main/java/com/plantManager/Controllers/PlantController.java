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

	@RequestMapping(path = "{id}/plant", method = RequestMethod.GET)
	public List <Plant> getAllPlantsByUser(@PathVariable long id) {
		return dao.getAllPlantsByUserId(id);
	}
	
}
