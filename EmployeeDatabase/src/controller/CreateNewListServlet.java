package controller;

import java.io.IOException;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EmployeeDetails;
import model.EmployeeList;
import model.Department;
/**
 * Servlet implementation class CreateNewListServlet
 */
@WebServlet("/createNewListServlet")
public class CreateNewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubs

		EmloyeeListHelper lih = new EmloyeeListHelper();
		String listName = request.getParameter("listName");
		System.out.println("Department Name: " + listName);
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		String deportmentName = request.getParameter("deportmentName");
		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}

		String[] selectedEmployees = request.getParameterValues("allEmpsToAdd");
		List<EmployeeList> selectedEmployeesInList = new ArrayList<EmployeeList>();
		if (selectedEmployees != null && selectedEmployees.length > 0) {
			for (int i = 0; i < selectedEmployees.length; i++) {
				System.out.println(selectedEmployees[i]);
				EmployeeList c = lih.searchForEmpById(Integer.parseInt(selectedEmployees[i]));
				selectedEmployeesInList.add(c);

			}
		}
		Department emp = new Department(deportmentName);
		EmployeeDetails sld = new EmployeeDetails(listName,ld, emp);
		sld.setListOfEmployee(selectedEmployeesInList);
		EmployeeDetailsHelper slh = new EmployeeDetailsHelper();
		slh.insertNewListDetails(sld);

		System.out.println("Success!");
		System.out.println(sld.toString());

		getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);

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
