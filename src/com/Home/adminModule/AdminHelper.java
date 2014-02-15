package com.Home.adminModule;

import com.Home.EmployeeCredentials;
import com.Home.OfficialDetails;
import com.Home.PersonalDetails;
import com.Home.SqlSelection;
import com.Home.Employee;
import java.sql.ResultSet;

public class AdminHelper {

	public static boolean addAdminEmployee(AdminEmployee aEmp)
	{
		String userName="SYSTEM";
		String password="1234";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driverClassName="oracle.jdbc.OracleDriver";
		boolean successStatus;
		String insertQuery="INSERT INTO EMPLOYEECREDENTIALS VALUES("+aEmp.getEmpID()+",'"+aEmp.getUserName()+"',"+aEmp.getPassword()+"',0)";
		successStatus=SqlSelection.Inserting(userName, password, url, driverClassName, insertQuery);
		if(successStatus==false)
		{
			String deleteQuery="DELETE FROM EMPLOYEECREDENTIALS WHERE empid="+aEmp.getEmpID();
			SqlSelection.Deleting(userName, password, url, driverClassName, deleteQuery);
			return false;
		}
		insertQuery="INSERT INTO OFFICEDETAILS VALUES("+aEmp.getEmpID()+","+aEmp.getJoiningDate()+",'"+aEmp.getDesignation()+",'"+aEmp.getCompanyEmailID()+","+aEmp.getManagerID()+")";
		successStatus=SqlSelection.Inserting(userName, password, url, driverClassName, insertQuery);
		if(successStatus==false)
		{
			String deleteQuery="DELETE FROM OFFICEDETAILS WHERE empid="+aEmp.getEmpID();
			SqlSelection.Deleting(userName, password, url, driverClassName, deleteQuery);
			deleteQuery="DELETE FROM EMPLOYEECREDENTIALS WHERE empid="+aEmp.getEmpID();
			SqlSelection.Deleting(userName, password, url, driverClassName, deleteQuery);
			return false;
		}
		insertQuery="INSERT INTO PERSONALDETAILS VALUES("+aEmp.getEmpID()+",,,,,'"+aEmp.getFirstName()+",'"+aEmp.getLastName()+")";
		successStatus=SqlSelection.Inserting(userName, password, url, driverClassName, insertQuery);
		if(successStatus==false)
		{
			String deleteQuery="DELETE FROM PERSONALDETAILS WHERE empid="+aEmp.getEmpID();
			SqlSelection.Deleting(userName, password, url, driverClassName, deleteQuery);
			deleteQuery="DELETE FROM EMPLOYEECREDENTIALS WHERE empid="+aEmp.getEmpID();
			SqlSelection.Deleting(userName, password, url, driverClassName, deleteQuery);
			return false;
		}
		return true;
	}
	public static AdminEmployee getAdminEmployeeByID(int empID)
	{
		ResultSet rs=null;
		AdminEmployee adminEmployee=new AdminEmployee();
		String userName="SYSTEM";
		String password="1234";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driverClassName="oracle.jdbc.OracleDriver";
		String selectQuery="SELECT USERNAME,PASSWORD,PASSWORDCHANGESTATUS from EMPLOYEECREDENTIALS";
		rs=SqlSelection.selecting(userName,password,url,driverClassName,selectQuery);
		
		try
		{
			while(rs.next())
		{
			
				adminEmployee.setUserName(rs.getString(1));
				adminEmployee.setPassword(rs.getString(2));
				adminEmployee.setPasswordChangeStatus(rs.getInt(3));
			
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return adminEmployee;
	}
	
}
