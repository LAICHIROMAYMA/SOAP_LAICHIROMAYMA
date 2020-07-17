<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %> 
    <% 
 
   Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root","");
	Statement st=con.createStatement();
	ResultSet res=st.executeQuery("select * from book where Book_id="+request.getParameter("id"));
	if(res.next()){
		st.executeUpdate("insert into cart(id_Cart,Image_book,Name_book	,Price_book) value('"+res.getInt(1)+"','"+res.getString(2)+"','"+res.getString(3)+"','"+res.getString(8)+"')");
		
	}
	ResultSet resultats=st.executeQuery("select * from cart");
	
 %>   
<!DOCTYPE html>
<html>
<head>
<title>MyMagicBook</title>
</head>
<body>

<%@ include file="Header.jsp"  %>
<%@ include file="aside.html"  %>


  <section style="margin-left:310px;">
  <a href="ViewAllbook.jsp" id="cont" style="margin-left:320px;"> Continue Shopping</a>
  <br><br>
  <table>
  <tr style="margin-left:310px;" ><td style="width: 100px;margin-left:350px;padding-left: 35px;color:orange; "><h2>Cart</h2></td><td  style="margin-left: 35px;width: 71px;margin-left: 500px;padding-left: 90px;color:orange;font-size:20px;" ><h2>Title </h2></td>
  <td style="border-left-width: 35px;width: 73px;border-right-width: 35px;padding-left: 50;color:orange;font-size:20px;"><h2> Price</h2></td> </tr>
<% while (resultats.next()){ %>
     <tr >
   <td ><img src="img/<%= resultats.getString(3) %>" class="d-block w-100" style="height: 188px;width: 35px;margin-left:10px;"><a  href="deletecart?id=<%=resultats.getInt(6) %>" style="margin-left: 35px;"><b> Remove </b></td>
 
   <td ><p id="p" style="width: 189px;margin-left:60px;font-size:20px;"><%= resultats.getString(4) %></p></td>
   <td ><p id="p"><%= resultats.getInt(5) %> DH</p></td>
    <td ><input type="number" id="qte" name="qte" style="width:65px;height:40px;margin-left:60px;font-size:20px;font-family: Goudy Bookletter 1911, sans-serif; 
	text-align:center;border-radius:12px/7px;
	box-shadow:6px 6px 0px orange;"></td>
	<td id="td21"><p id="p"style="width:100px;margin-left:60px;font-size:20px;" ><%= resultats.getInt(5)*2 %>DH</p></td>                 
    <%if (nom==null){%>
       
      <td><a href="SingIn.jsp">Buy Now</a></td>
      <%}else{ %> 
       <td><a href="Formulaire_buy_books.jsp">Buy Now</a></td>
       <%} %>
       </tr>
        
        
        
        <%} %>
        </table>
</section>

    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@ include file="footer.html"  %>
      
</body>
</html>