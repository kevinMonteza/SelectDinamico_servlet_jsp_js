package control;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practica_2.Ciudades;
import practica_2.Country;
import practica_2.Modelo;

/**
 * Servlet implementation class Control
 */
@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private Modelo m = null;
	private Connection connec;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			m = new Modelo(connec);
		} catch (Exception e) {
			throw new ServletException(e);
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String instruccion = request.getParameter("instruccion");
		if(instruccion==null){
			List<Country> lista = m.getPaises();
		request.setAttribute("lista", lista);
		RequestDispatcher dispacher = request.getRequestDispatcher("/indexPaises.jsp");
		dispacher.forward(request, response);
		}
		
		enviarCiudades(request,response,instruccion);
		
	}
		
	private void enviarCiudades(HttpServletRequest request, HttpServletResponse response,String instruccion){
		try{
		if (instruccion != null) {
			if(instruccion.equals("insertar")){
				String cod=request.getParameter("cArt");
				List<Ciudades> listaC=m.getCiudades(cod);
				request.setAttribute("lista", listaC);
				RequestDispatcher midispacher = request.getRequestDispatcher("/indexCiudades.jsp");
				midispacher.forward(request, response);
				
			}
		}
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
