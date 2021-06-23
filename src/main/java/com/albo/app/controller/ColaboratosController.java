package com.albo.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.albo.app.entity.HeroesEntity;
import com.albo.app.model.HttpClient;
import com.albo.app.service.GetHeroes;

import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("/marvel")
public class ColaboratosController {
	
	@Autowired
	private GetHeroes http;
	
	@Autowired 
	private HttpClient http2;
	
	
	
	
	@GetMapping("/collaborators")
	@ApiOperation(value = "Lista de los heroes")
	@ResponseStatus(HttpStatus.OK)
	public Map<String,?> getColaborators() {
		 //http.Request();
	     
		//http2.Request();
		return http.getHeroes();
	}

}
