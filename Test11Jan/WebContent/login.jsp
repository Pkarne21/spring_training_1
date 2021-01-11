<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body >
<h2>Login Page</h2>
<form action="login" >
<input type="hidden" name="requestAction" value="login">
  
  
    <h2 style="color:red">
  <%
      if(null!=request.getAttribute("errorMessage")){
    	  %>
    	  <%=request.getAttribute("errorMessage") %>
    	  <% }%>
  </h2>
    <table>
      <tr>
         <td> User Name:</td>
         <td><input type="text" name="userName"></td>
      </tr>
    </table>
    <table>
      <tr>
         <td> Password:</td>
         <td><input type="password" name="password"></td>
      </tr>
      </tr>
          <td> &nbsp; </td>
           <td> <input type="submit" value="login" /></td>
           </tr>
    </table>
</body>
</html>
