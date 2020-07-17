<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="sidemenu">
 <ul>
  
    <!-- <li><a  target="_blank"> Supprimer utilisateur </a></li> -->
    <li><a href="Viewbooks.jsp" target="_blank"> Afficher Books</a></li>
    <li><a href="Addbook.jsp" target="_blank"> Add Books</a></li>  
    <li><a href="Viewbooks.jsp" target="_blank"> Delete Books</a></li>
    <li><a href="AddCategory.jsp" target="_blank"> Add Category</a></li>
    <li><a href="UserView" target="_blank"> View All Users</a></li>
    <li><a href="UserView" target="_blank"> Delete User</a></li>
   
	
           <!--<li><a style="color: blue;" href="edition.php">Editer mon profil</a></li>-->
         <li><a style="color: blue;" href="logout">Se déconnecter</a></li>
	
 </ul>	
</div>
<br><br><br>

<form action='./CategoryAjout' method='post'> <table>
	   
		<tr><td>Category Type:</td><td><input type='text' name='type' /></td></tr>
		
		<tr><td><input type='submit'  value ='Ajouter'name='add'/><td/><td><input type='reset' value='Annuler' name='add'/></td></tr>
		</table><form>
		<hr/>
    

</body>
</html>