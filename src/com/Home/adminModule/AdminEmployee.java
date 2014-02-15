//Class to specify how an Employee looks for an admin
package com.Home.adminModule;
import java.util.Date;

import com.Home.Employee;
import com.Home.EmployeeCredentials;
import com.Home.OfficialDetails;
import com.Home.PersonalDetails;
public class AdminEmployee extends Employee {

	public static boolean setAdminEmployee(int empID,String firstName,String lastName,String userName,String password,String designation,String companyEmailID,Date joiningDate,int managerID)
	{
		AdminEmployee adminEmployee=new AdminEmployee();
		boolean success;
		
		adminEmployee.setEmpID(empID);
		adminEmployee.eCredentials=new EmployeeCredentials();
		adminEmployee.oDetails=new OfficialDetails();
		adminEmployee.pDetails=new PersonalDetails();
		adminEmployee.setFirstName(firstName);
		adminEmployee.setLastName(lastName);
		adminEmployee.setUserName(userName);
		adminEmployee.setPassword(password);
		adminEmployee.setManagerID(managerID);
		adminEmployee.setDesignation(designation);
		adminEmployee.setCompanyEmailID(companyEmailID);
		adminEmployee.setJoiningDate(joiningDate);
		success=AdminHelper.addAdminEmployee(adminEmployee);
		return success;
	}
	public void getAdminEmployeeByID(int empID)
	{
		AdminEmployee adminEmployee=AdminHelper.getAdminEmployeeByID(empID);
		
	}
	
}

