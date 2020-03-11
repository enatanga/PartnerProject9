package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;


/**
 * Servlet implementation class editItemServlet
 */
@WebServlet("/editEmployeeServlet")
public class EditEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeHelper dao = new EmployeeHelper();
		
		String department = request.getParameter("department");
		String employee = request.getParameter("employee");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
				
		Employee employeeToUpdate = dao.searchForEmployeeById(tempId);
		employeeToUpdate.setEmployee(employee);
		employeeToUpdate.setDepartment(department);
				
		dao.deleteEmployee(employeeToUpdate);

		getServletContext().getRequestDispatcher("/viewAllEmployeeServlet").forward(request, response);


	}

}
