package com.cursoceat.model;

public class Clientes {

	private static int idGeneral;
	private int idCliente;
	private String nombreC;
	private String apellidoC;
	private String telefonoC;
	
	
	public Clientes( String nombreC, String apellidoC, String telefonoC) {
		this.idCliente = idCliente;
		this.nombreC = nombreC;
		this.apellidoC = apellidoC;
		this.telefonoC = telefonoC;
		this.idCliente=++idGeneral;
	}

	
//----------getters and setters--------------------------------
	
	public Clientes() {
		this.idCliente=++idGeneral;
	}


	public String getNombreC() {
		return nombreC;
	}


	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}


	public String getApellidoC() {
		return apellidoC;
	}


	public void setApellidoC(String apellidoC) {
		this.apellidoC = apellidoC;
	}


	public String getTelefonoC() {
		return telefonoC;
	}


	public void setTelefonoC(String telefonoC) {
		this.telefonoC = telefonoC;
	}


	public int getIdCliente() {
		return idCliente;
	}
	

	
	
	
}
