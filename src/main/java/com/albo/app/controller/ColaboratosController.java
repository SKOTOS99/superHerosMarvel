package com.albo.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("/marvel")
public class ColaboratosController {
	
	
	
	@GetMapping("/proveedores")
	@ApiOperation(value = "Lista de los proveedores")
	@ResponseStatus(HttpStatus.OK)
	public String getColaborators() {
		return "hola";
	}

}
