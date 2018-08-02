package br.com.senai.servelet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraServlet extends HttpServlet {

	private static final long serialVersionUID = 1l;

	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		
		String op = req.getParameter("operacao");
		Integer n1 = null;
		Integer n2 = null;
		if (req.getParameter("n1").isEmpty() || req.getParameter("n2").isEmpty()) {
			op = "erro";
		} else {
			n1 = Integer.parseInt(req.getParameter("n1"));
			n2 = Integer.parseInt(req.getParameter("n2"));
		}
		

		//Integer n1 = Integer.parseInt(req.getParameter("n1"));
		//Integer n2 = Integer.parseInt(req.getParameter("n2"));
		//String op = req.getParameter("operacao");
		
		
		try {
			switch (op) {
			case "soma":
				System.out.println(n1 + n2);

				res.getWriter().println("Resultado da soma: " + (n1 + n2));

				break;

			default:

				System.out.println("Não foi possivel realizar a poeração");
				break;

			}

			switch (op) {
			case "sub":
				System.out.println(n1 - n2);

				res.getWriter().println("Resultado da subtração: " + (n1 - n2));

				break;

			default:

				System.out.println("Não foi possivel realizar a poeração");
				break;

			}

			switch (op) {
			case "mult":
				System.out.println(n1 * n2);

				res.getWriter().println("Resultado da multiplicação é: " + (n1 * n2));

				break;

			default:

				System.out.println("Não foi possivel realizar a poeração");
				break;

			}

			switch (op) {
			case "div":
				System.out.println(n1 / n2);

				res.getWriter().println("Resultado da divisão é: " + (n1 / n2));

				break;

			default:

				System.out.println("Não foi possivel realizar a poeração");
				break;

			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
