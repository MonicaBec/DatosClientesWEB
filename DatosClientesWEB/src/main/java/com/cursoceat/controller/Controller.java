package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cursoceat.model.Clientes;
import com.cursoceat.service.Validaciones;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet implements Validaciones{
	private static final long serialVersionUID = 1L;
       

	/**
	 * Hacer la coleccion global para poder ser utilizada tanto en el metodo post como en el get 
	 */

	List <Clientes> listadoCli= new ArrayList<>();
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Leer los datos que envia el formulario
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String telefono=request.getParameter("telefono");
		//variable tipo cadena que enviará mensaje al front end
		String msg=null;
		
		//validacion del telefono
		
		if(!validarTel(telefono)) {
			msg="error en el teléfono";
		  //este error hay que enviarlo a la lista  (setAtributte)
			request.setAttribute("msg", msg);
		 //ahora despacho el error a la vista
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			//creamos el objeto cliente, implemetamos el metodo capitalice ne nomnre y apellido
			Clientes miCliente=new Clientes(mayuscula(nombre),mayuscula(apellido),telefono);
			//mostramos los objetos creados con tipo cliente
			
			listadoCli.add(miCliente);
			msg="El cliente se ha creado correctamente";
			request.setAttribute("msg", msg);
			
			request.getSession().setAttribute("clientes",listadoCli);
			response.sendRedirect("index.jsp");
			
		}
	}

}
