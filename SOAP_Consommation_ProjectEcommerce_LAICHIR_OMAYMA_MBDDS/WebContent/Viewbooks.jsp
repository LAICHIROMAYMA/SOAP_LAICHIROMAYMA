<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="DAO.Book"%>
     <%@page import="DAO.BookDAO"%>
      <%@page import="DAO.BooksLocator"%>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <% Book[] bs=new Book[]{};
      BooksLocator csd=new BooksLocator();
      BookDAO port= csd.getBookDAOPort();
      bs=port.allBooks();
  
  %>

<section class="single-product">
<% int i = 0;
while (i<bs.length){ %>
     <div class="contain" style="margin-left:130px;">
      <div class="row">
          <div class="col-md-5">
          <div id="product-slider" class="carousel slide carousel-fade" data-ride="carousel">
     
   <a href="Books.jsp?id=<%= bs[i].getBook_id() %>"><img src="img/<%= bs[i].getBook_image() %>" class="d-block w-100" style="height:450px;"></a>
 </div>
         </div>
        
        <div class="col-md-6">
      
     <h2> <%= bs[i].getBook_name() %></h2>
              <p><%=bs[i].getAutor_name()%></p>
                       <p class="price"><%=bs[i].getBook_price() %></p>
                       <p ><b >Availibility :  </b><%= bs[i].getBooks_availibility()%></p>
                       
                      <p > <b >Quantity :  </b> <%=bs[i].getBook_Quantity()%></p>
                      <p><%=bs[i].getBook_price()%><b>DH</b></p>
                      <p><%=bs[i].getBook_Summary()%></p>
                     <a  href="DeleteBook?id=<%=bs[i].getBook_id()%>">Delete Book</a>
                      
                        
        </div>
        
          </div> 
          </div>
          <br><br>
        
        <%i++;} %>
</section>

</body>
</html>