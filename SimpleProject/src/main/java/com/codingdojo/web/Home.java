package com.codingdojo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName") != null ? request.getParameter("firstName") : "Unknown";
		String lastName = request.getParameter("lastName") != null ? request.getParameter("lastName") : "Unknown";
		String favoriteLanguage = request.getParameter("favoriteLanguage") != null ? request.getParameter("favoriteLanguage") : "Unknown";
		String homeTown = request.getParameter("homeTown") != null ? request.getParameter("homeTown") : "Unknown";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write(
			"<div>"
				+ "<h1>Bienvenido, " + firstName + " " + lastName + "</h1>"
				+ "<h2>Your favorite language is: " + favoriteLanguage + "</h2>"
				+ "<h2>Your hometown is: " + homeTown + "</h2>"
			+ "<div>"
		);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
