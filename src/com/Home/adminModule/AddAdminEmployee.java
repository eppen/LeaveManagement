package com.Home.adminModule;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddAdminEmployee
 */
@WebServlet(description = "AddAdminEmployee", urlPatterns = { "/AddAdminEmployee" })
public class AddAdminEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAdminEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empID=(int)request.getAttribute("EmpID");
		String firstName=(String)request.getAttribute("UserName");
		String lastName=(String)request.getAttribute("LastName");
		String userName=(String)request.getAttribute("UserName");
		String password=(String)request.getAttribute("Password");
		String designation=(String)request.getAttribute("Designation");
		String companyEmailID=(String)request.getAttribute("CompanyEmailID");
		Date joiningDate=(Date)request.getAttribute("JoiningDate");
		int managerID=(int)request.getAttribute("ManagerID");		
	}

}
