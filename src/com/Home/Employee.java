package com.Home;

import java.util.Date;

public class Employee {

	int empId;
	protected EmployeeCredentials eCredentials;
	protected OfficialDetails oDetails;
	protected PersonalDetails pDetails;
	public void setEmpID(int empID)
	{
		this.empId=empID;
	}
	public int getEmpID()
	{
		return empId;
	}
	public void setFirstName(String firstName)
	{
		this.pDetails.firstName=firstName;
	}
	public String getFirstName()
	{
		return pDetails.firstName;
	}
	public void setLastName(String lastName)
	{
		this.pDetails.lastName=lastName;
	}
	public String getLastName()
	{
		return pDetails.lastName;
	}
	public void setUserName(String userName)
	{
		this.eCredentials.userName=userName;
	}
	public String getUserName()
	{
		return eCredentials.userName;
	}
	public void setPassword(String password)
	{
		this.eCredentials.password=password;
	}
	public String getPassword()
	{
		return eCredentials.password;
	}
	public void setManagerID(int managerID)
	{
		this.oDetails.managerID=managerID;
	}
	public int getManagerID()
	{
		return oDetails.managerID;
	}
	public void setDesignation(String designation)
	{
		this.oDetails.designation=designation;
	}
	public String getDesignation()
	{
		return oDetails.designation;
	}
	public void setCompanyEmailID(String companyEmailID)
	{
		this.oDetails.companyEmailID=companyEmailID;
	}
	public String getCompanyEmailID()
	{
		return oDetails.companyEmailID;
	}
	public void setJoiningDate(Date joiningDate)
	{
		this.oDetails.joiningDate=joiningDate;
	}
	public Date getJoiningDate()
	{
		return oDetails.joiningDate;
	}
	public void setPasswordChangeStatus(int passwordChangeStatus)
	{
		this.eCredentials.passwordStatusChange=passwordChangeStatus;
	}
	public int getPasswordChangeStatus()
	{
		return eCredentials.passwordStatusChange;
	}
	
}
