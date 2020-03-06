package controller;

import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeDetails;
import model.EmployeeList;

/**
 * Servlet implementation class ListNavigationServlet
 */
@WebServlet("/listNavigationServlet")
public class ListNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListNavigationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDetailsHelper ldh = new EmployeeDetailsHelper();
		String act = request.getParameter("doThisToEmployee");

		if (act == null) {
			// no button has been selected
			getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);

		} else if (act.equals("delete")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				EmployeeDetails listToDelete = ldh.searchForListById(tempId);
				ldh.deleteEmployee(listToDelete);

			} catch (NumberFormatException e) {
				System.out.println("click a button");
			} finally {
				getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
			}

		} else if (act.equals("edit")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				EmployeeDetails listToEdit = ldh.searchForListById(tempId);
				EmloyeeListHelper lih = new EmloyeeListHelper();
				List<EmployeeList> allEmps = lih.showAllEmp();
				List<EmployeeList> currentListEmps = listToEdit.getListOfEmployee();

				System.out.println("---- removing Employee-------");
				for (int i = 0; i < allEmps.size(); i++) {
					for (int j = 0; j < currentListEmps.size(); j++) {
						if (allEmps.get(i).getId() == currentListEmps.get(j).getId()) {
							allEmps.remove(i);
						}
					}
				}

				request.setAttribute("listToEdit", listToEdit);
				request.setAttribute("allEmpsToAdd", allEmps);
				getServletContext().getRequestDispatcher("/edit-list.jsp").forward(request, response);
			} catch (NumberFormatException e) {
				getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
			}

		} else if (act.equals("add")) {
			getServletContext().getRequestDispatcher("/addEmployeeForListServlet").forward(request, response);
		}

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
