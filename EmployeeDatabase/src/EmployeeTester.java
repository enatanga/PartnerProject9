

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.EmployeeDetailsHelper;
import model.Employee;
import model.EmployeeDetails;
import model.EmployeeList;

public class EmployeeTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Shopper cameron = new Shopper("Cameron");

		ShopperHelper sh = new ShopperHelper();

		sh.insertShopper(cameron);

		List<Shopper> allShoppers = sh.showAllShoppers();
		for (Shopper a : allShoppers) {
			System.out.println(a.toString());
		}
	
		ListDetailsHelper ldh = new ListDetailsHelper();
		ListDetails cameronList = new ListDetails("Cameron's List", LocalDate.now(), cameron);

		ldh.insertNewListDetails(cameronList);
		
		List<ListDetails> allLists = ldh.getLists();
		for (ListDetails a : allLists) {
			System.out.println(a.toString());
		}
		 
		*/
		
		Employee Supervisor= new Employee();
		
		EmployeeDetailsHelper ldh = new EmployeeDetailsHelper();
		
		EmployeeList shampoo = new EmployeeList("SuperVisor", "Mike");
		EmployeeList brush = new EmployeeList("Manager", "John");
		
		List<EmployeeList> susansItems = new ArrayList<EmployeeList>();
		susansItems.add(shampoo);
		susansItems.add(brush);
		
		EmployeeDetails susansList = new EmployeeDetails();
		susansList.setListOfEmployee(susansItems);
		
		ldh.insertNewListDetails(susansList);
		
		
		List<EmployeeDetails> allLists = ldh.getLists();
		for(EmployeeDetails a: allLists) {
			System.out.println(a.toString());
		}
		
	}
}
