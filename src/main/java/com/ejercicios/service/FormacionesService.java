package com.ejercicios.service;

import java.util.List;

import com.ejercicios.modelo.Formacion;

public interface FormacionesService {
	
	List<Formacion> formaciones();
	
	List<Formacion> nuevoCurso(Formacion formacion);
}
