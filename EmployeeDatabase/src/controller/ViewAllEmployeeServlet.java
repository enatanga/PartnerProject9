package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewAllEmployeeServlet
 */
@WebServlet("/viewAllEmployeeServlet")
public class ViewAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewAllEmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeHelper dao = new EmployeeHelper();

		request.setAttribute("allEmployee", dao.showAllEmployee());

		String path = "/employee-list.jsp";

		if (dao.showAllEmployee().isEmpty()) {
			// if there's nothing in the list, redirect the user to the index to add an item
			path = "/index.html";

		}

		getServletContext().getRequestDispatcher(path).forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
