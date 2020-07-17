<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.sql.*" %> 
 <% Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root","");
	Statement st=con.createStatement();
	ResultSet res=st.executeQuery("select * from user where ref=1;");
 %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% while (res.next()){ %>
 <div id="header">
<center><img src="img/user.png"  alt style="height:25px;width: 30px;"> <a ><%=res.getString(3) %> </a> 
<%} %>
<h3 style="color: orange;"><b></b>Admin Panel </h3></center>
</div>

</body>
</html>>