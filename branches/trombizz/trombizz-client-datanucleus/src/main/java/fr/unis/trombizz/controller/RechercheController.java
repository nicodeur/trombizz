package fr.unis.trombizz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.unis.trombizz.service.PersonneService;
import fr.unis.trombizz.shared.dto.RecherchePersonneDto;
import fr.unis.trombizz.shared.dto.SimplePersonneDto;

public class RechercheController extends HttpServlet {

	private PersonneService personneService = new PersonneService();// test
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)              
			throws ServletException, IOException {
		
		RecherchePersonneDto criteria = new RecherchePersonneDto();
		criteria.setNom("Deblock");
		List<SimplePersonneDto> personnes = personneService.rechercherCollaborateur(criteria);
		// TODO le build path ne copie pas encore bien les source des autr projet dans classes
		for (SimplePersonneDto p : personnes) {
			System.out.println("result : " + p.getNom() + " " + p.getPrenom());
			System.out.println("testxsxsere");
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			RequestDispatcher rd = null;
			rd = getServletContext().getRequestDispatcher("/jsp/detailRecherche.jsp");
			rd.forward(request, response);
		} finally {
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
