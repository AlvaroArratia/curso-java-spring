package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Cat;
import com.codingdojo.web.models.Dog;

/**
 * Servlet implementation class CreateAnimal
 */
@WebServlet("/")
public class CreateAnimal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateAnimal() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/CreateAnimal.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		double weight = Double.parseDouble(request.getParameter("weight"));
		String animalType = request.getParameter("animalType");

		if ("dog".equals(animalType)) {
			Dog newDog = new Dog();
			newDog.setName(name);
			newDog.setBreed(breed);
			newDog.setWeight(weight);
			request.setAttribute("dog", newDog);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/Dog.jsp");
			view.forward(request, response);
		} else if ("cat".equals(animalType)) {
			Cat newCat = new Cat();
			newCat.setName(name);
			newCat.setBreed(breed);
			newCat.setWeight(weight);
			request.setAttribute("cat", newCat);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/Cat.jsp");
			view.forward(request, response);
		}
	}
}
