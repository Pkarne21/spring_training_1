package com.zensar;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController  extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");
	
		if(requestAction.equalsIgnoreCase("login")) {
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			
			LoginRepository loginRepository = new LoginRepository();
			boolean loginResult=loginRepository.checkLogin(userName, password);
			if(loginResult) {
				try {
					response.sendRedirect("index.jsp");
				}catch(Exception e) {
					System.out.println("Exception Occured"+e);
				}
			}else {
				
				System.out.println("login Failed");
				request.setAttribute("errorMessage", "Invalid user or password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				try {
					rd.forward(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Exception Occured:"+e);
				} 
			}
		}
}
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		
		doGet(request, response);
	
	
	
	

	}
}