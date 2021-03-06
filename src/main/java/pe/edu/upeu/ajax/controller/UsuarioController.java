package pe.edu.upeu.ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.upeu.ajax.dao.ProductoDao;
import pe.edu.upeu.ajax.dao.UsuarioDao;
import pe.edu.upeu.ajax.daoImpl.ProductoDaoImpl;
import pe.edu.upeu.ajax.daoImpl.UsuarioDaoImpl;
import pe.edu.upeu.ajax.entity.Usuario;

/**
 * Servlet implementation class UsuarioController
 */
public class UsuarioController extends HttpServlet {
	private Gson gson = new Gson();
	private UsuarioDao udao = new UsuarioDaoImpl();
	private ProductoDao pdao = new ProductoDaoImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		switch (op) {
		case 1:
			out.println(udao.create(new Usuario(user,pass,1)));
			break;

		default:
			break;
		}
		/*
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		System.out.println(user+" / "+pass);
		if(udao.validar(user, pass)==1) {
			out.println(gson.toJson(pdao.readAll()));
		}else {
			out.println("Datos incorrectos...!");
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
