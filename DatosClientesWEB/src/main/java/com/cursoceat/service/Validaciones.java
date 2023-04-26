package com.cursoceat.service;

public interface Validaciones {
	
	
	
	public default boolean validarTel(String tele) {
		if((!tele.startsWith("9") && !tele.startsWith("6") && tele.startsWith("7") )|| tele.length()!=9){
			return false;
		}else {
			return true;
		}
	}
	
	
	/**
	 * 
	 * @param texto
	 * @return texto con la primera letra en mayus 
	 * @description Metodo para pasar la primera letra de cualquier texto a mayus
	 */
	public default String mayuscula(String texto) {
		
		texto=texto.toLowerCase(); //paso todo el texto a minuscula
		
		String[] arrayTexto=texto.split(" "); //si es nas de una palabra lo separamos en un array
		
		String temp=" ";//creo la variable que se formará por cada interaccion del bcle que recorre el array;
		for(int i=0; i<arrayTexto.length;i++) {//recorro el array 
			arrayTexto[i]=arrayTexto[i].substring(0,1).toUpperCase()+arrayTexto[i].substring(1);//pasamos la primera letra de cada palabra a mayus
			temp+=arrayTexto[i]+" ";//lo acumulamos en temp;
		}
			return temp.trim();//enviamos le temp ya formateado y quitando espacios del pricipio y final(.trim) 
	}

}
