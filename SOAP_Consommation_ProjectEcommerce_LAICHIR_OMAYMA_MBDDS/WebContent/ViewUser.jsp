<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="DAO.User_Type"%>
    <%@page import="DAO.User_Service"%>
    <%@page import="DAO.User_ServiceLocator"%>
    <%@page import="DAO.UserDAO"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
     <% User_Type[] bs=new User_Type[]{};
     User_Service us=new User_ServiceLocator();
     UserDAO port= us.getUserDAOPort();
     bs=port.getAllUsers();  
  %>
<section class="single-product">
<% int i = 0;
while (i<bs.length){ %>
<p><%=bs[i].getId()%></p>
          
     
           <p><%=bs[i].getRef()%></p>
			<p><%=bs[i].getNom()%></p>
			<p><%=bs[i].getEmail()%></p>
			<p><%=bs[i].getPassword()%></p>
			
			<a href="DeleteUser?id=<%=bs[i].getId()%>">delete</a>
			
        <%i++;} %>
</section>

</body>
</html>