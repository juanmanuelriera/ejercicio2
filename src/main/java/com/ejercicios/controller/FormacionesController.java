package com.ejercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicios.modelo.Formacion;
import com.ejercicios.service.FormacionesService;

@RestController
public class FormacionesController {
	
	@Autowired
	FormacionesService service;
	
	@GetMapping(value = "formaciones")
	public List<Formacion> formaciones() {
		return service.formaciones();
	}
	
	@PostMapping(value = "formacion")
	public List<Formacion> altaFormacion(@RequestBody Formacion formacion) {
		return service.nuevoCurso(formacion);
	}
}
