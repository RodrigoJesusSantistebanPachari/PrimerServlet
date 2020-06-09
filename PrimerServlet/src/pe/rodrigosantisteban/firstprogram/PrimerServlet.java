package pe.rodrigosantisteban.firstprogram;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter salida = response.getWriter();
		salida.println("<html><body>");
		salida.println("<h1>Primer Servlet</h1> ");
		salida.println("Fecha actual: " + new Date ());
		int n1,n2;
		n1=8;
		n2=5;
		salida.println("<br>Ejemplo calculadora con 8 y 5 <br>");
		salida.println("<br>");
		salida.println(" Sumar " + (n1+n2) + "<br>");
		salida.println(" Restar " + (n1-n2)+ "<br>");
		salida.println(" Multiplicación " + (n1*n2)+ "<br>");

		salida.println("<body><html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
