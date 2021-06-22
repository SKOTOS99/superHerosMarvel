package com.albo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.albo.app.model.HttpClient;

import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("/marvel")
public class ColaboratosController {
	
	@Autowired
	private HttpClient http;
	
	
	@GetMapping("/proveedores")
	@ApiOperation(value = "Lista de los proveedores")
	@ResponseStatus(HttpStatus.OK)
	public String getColaborators() {
		 String url = "/v1/public/characters";
		 http.Request();
	     
		 
		return "hola";
	}

}
