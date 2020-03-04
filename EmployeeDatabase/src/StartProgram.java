import java.util.List;
import java.util.Scanner;

import controller.EmloyeeListHelper;
import model.EmployeeList;

public class StartProgram {
	static Scanner in = new Scanner(System.in);
	static EmloyeeListHelper lih = new EmloyeeListHelper();

	private static void addEmp() {
		// TODO Auto-generated method stub
		System.out.print("Enter a deprotment: ");
		String deportment = in.nextLine();
		System.out.print("Enter an employee: ");
		String employee = in.nextLine();

		EmployeeList toAdd = new EmployeeList(deportment, employee);
		lih.insertEmployee(toAdd);
	}

	private static void deleteEmp() {
		// TODO Auto-generated method stub
		System.out.print("Enter the deportment to delete: ");
		String deportment = in.nextLine();
		System.out.print("Enter the employee to delete: ");
		String employee = in.nextLine();

		EmployeeList toDelete = new EmployeeList(deportment, employee);
		lih.deleteEmp(toDelete);
	}

	private static void editEmp() {
		// TODO Auto-generated method stub
		System.out.println("How would you like to search? ");
		System.out.println("1 : Search by Deportment");
		System.out.println("2 : Search by Employee");
		int searchBy = in.nextInt();
		in.nextLine();
		List<EmployeeList> foundEmps;
		if (searchBy == 1) {
			System.out.print("Enter the deportnamet name: ");
			String depName = in.nextLine();
			foundEmps = lih.searchForEmpByDep(depName);
		} else {
			System.out.print("Enter the employee: ");
			String empName = in.nextLine();
			foundEmps = lih.searchForEmpByEmp(empName);
		}

		if (!foundEmps.isEmpty()) {
			System.out.println("Found Results.");
			for (EmployeeList l : foundEmps) {
				System.out.println(l.getId() + " : " + l.EmployeeDetails());
			}
			System.out.print("Which ID to edit: ");
			int idToEdit = in.nextInt();

			EmployeeList toEdit = lih.searchForEmpById(idToEdit);
			System.out.println("Retrieved " + toEdit.getEmployee() + " from " + toEdit.getDeportment());
			System.out.println("1 : Update Deportment");
			System.out.println("2 : Update Employee");
			int update = in.nextInt();
			in.nextLine();

			if (update == 1) {
				System.out.print("New Deportment: ");
				String newDep = in.nextLine();
				toEdit.setDeportment(newDep);
			} else if (update == 2) {
				System.out.print("New Employee: ");
				String newEmp = in.nextLine();
				toEdit.setEmployee(newEmp);
			}

			lih.update(toEdit);

		} else {
			System.out.println("---- No results found");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runMenu();

	}

	public static void runMenu() {
		boolean goAgain = true;
		System.out.println("--- Welcome to Employee Database! ---");
		while (goAgain) {
			System.out.println("*  Select an employee:");
			System.out.println("*  1 -- Add an employee");
			System.out.println("*  2 -- Edit an employee");
			System.out.println("*  3 -- Delete an employee");
			System.out.println("*  4 -- View the list");
			System.out.println("*  5 -- Exit the program");
			System.out.print("*  Your selection: ");
			int selection = in.nextInt();
			in.nextLine();

			if (selection == 1) {
				addEmp();
			} else if (selection == 2) {
				editEmp();
			} else if (selection == 3) {
				deleteEmp();
			} else if (selection == 4) {
				viewTheList();
			} else {
				lih.cleanUp();
				System.out.println(" Bye!   ");
				goAgain = false;
			}

		}

	}

	private static void viewTheList() {
		List<EmployeeList> allEmps = lih.showAllEmp();
		for(EmployeeList singleItem : allEmps){
			System.out.println(singleItem.EmployeeDetails());
		}

	}

}


