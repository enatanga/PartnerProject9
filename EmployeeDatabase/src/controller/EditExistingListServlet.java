package controller;

import java.io.IOException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EmployeeDetails;
import model.EmployeeList;
import model.Department;

/**
 * Servlet implementation class EditExistingListServlet
 */
@WebServlet("/editExistingListServlet")
public class EditExistingListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditExistingListServlet() {
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
		// import all helpers
		EmployeeDetailsHelper slh = new EmployeeDetailsHelper();
		EmloyeeListHelper lih = new EmloyeeListHelper ();
		EmployeeHelper sh = new EmployeeHelper();

		// search for object to make changes to
		int idToEdit = Integer.parseInt(request.getParameter("id"));
		EmployeeDetails toEdit = slh.searchForListById(idToEdit);

		// update the listName first
		String listName = request.getParameter("listName");
		System.out.println("List Name: " + listName);
		toEdit.setListName(listName);

		// update the date
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");

		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}
		toEdit.setHiredDate(ld);
		String deportmentName = request.getParameter("deportmentName");
		Department deportment;
		try {
			deportment = sh.searchForEmployeeByName(deportmentName);
		} catch (NoResultException ex) {
			deportment = new Department(deportmentName);
		} catch (Exception ex) {
			deportment = new Department(deportmentName);
		}

		toEdit.setDeportment(deportment);
		List<EmployeeList> previousListOfEmps = toEdit.getListOfEmployee();

		String[] selectedEmps = request.getParameterValues("empsToAdd");
		List<EmployeeList> selectedItemsInList = new ArrayList<EmployeeList>();

		if (selectedEmps != null && selectedEmps.length > 0 ) {
			for (int i = 0; i < selectedEmps.length; i++) {
				System.out.println(selectedEmps[i]);
				EmployeeList c = lih.searchForEmpById(Integer.parseInt(selectedEmps[i]));
				selectedItemsInList.add(c);

			}

			previousListOfEmps.addAll(selectedItemsInList);
		}

		toEdit.setListOfEmployee(previousListOfEmps);

		slh.updateList(toEdit);

		System.out.println("Success!");
		System.out.println(toEdit.toString());

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
