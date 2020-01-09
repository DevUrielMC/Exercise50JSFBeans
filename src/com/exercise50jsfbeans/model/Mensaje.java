package com.exercise50jsfbeans.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mimensajitu1")
@RequestScoped
public class Mensaje {

	public String diHola()
	{
		return "Hola Prro";
	}
	
	
	
	public String mensajeTuneado(String nombre) {
		return " hola "+ nombre;
	}
	
	public String sumaNumeros(int numero1, int numero2) {
		int respInt= numero1+numero2;
		String respString=Integer.toString(respInt);
		return respString;
	}
}
