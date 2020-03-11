package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;

/**
 * Servlet implementation class AddEmployeeToListServlet
 */
@WebServlet("/addEmployeeToListServlet")
public class AddEmployeeToListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeToListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String department = request.getParameter("department");
		String employee = request.getParameter("employee");
		if (department.isEmpty() || employee.isEmpty() || department == null || employee == null) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		} else {
			Employee li = new Employee(department, employee);
			EmployeeHelper dao = new EmployeeHelper();
			dao.insertEmployee(li);

			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}
