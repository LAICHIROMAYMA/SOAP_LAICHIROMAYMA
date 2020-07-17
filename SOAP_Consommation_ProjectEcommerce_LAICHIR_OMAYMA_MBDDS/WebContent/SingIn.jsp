<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>My magicBook</title>
<link rel="stylesheet" type="text/css" href="css/inscr.css">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,700,500' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
    
<link rel="stylesheet" type="text/css" href="css/N.css">
<link rel="stylesheet"href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" >
<link rel="stylesheet" href="http://localhost:/Book_site/css/bootstrap.min.css">
<script src="http://localhost:3306/Book_site/css/slim.min.js" ></script>
<script src="http://localhost:3306/Book_site/css/bootstrap.min.js"></script>
  <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
  <link rel="shortcut icon" href="favicon.ico">

  <link href="https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700" rel="stylesheet">
  
<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
</head>
<body>
<%@ include file="Header.jsp"  %>

<%@ include file="aside.html"  %>
<section>
 
  <div>
  
     <!-- <img src="client.png"/> -->
      <div  style="border-radius: 20px/10px;box-shadow: 2px 1px 0px gold outset;margin-top:-90px;padding-left: 2px;margin-left: 324px;padding-right: 2px;" class="container" >
      <h1 style="color:orange; font-size: 25px; "> <b>Inscription</b></h1>
            <hr>
            <form action="AddClient" method="get" >
   <div class="t2" >
                  <label><i class="fa fa-user"></i><input style="height: 35px;" type="text" placeholder="Votre nom et pr�nom" id="nom" name="nom"  /></label>
                </div>

                  <div class="t2">
                   <label> <i class="fa fa-envelope-o"></i><input style="height: 35px;" type="email" placeholder="Votre mail" id="mail" name="mail"  />
                      </label></div> 
                  
                  <div class="t2">
                    <label><i class="fa fa-key" ></i><input style="height: 35px;" type="password" placeholder="Votre mot de passe" id="mdp" name="mdp" /></label>
                      </div>
                     
                     
                 
                     <br >
                  <input class="insc" type="submit" name="forminscription" value="Je m'inscris" /><i class=""></i>
                  
                  <div style="border:5px 3px 3px 3px green;"><h2>Clients enregistr�s</h2>
                    <p>Si vous avez d�j� un compte, veuillez vous identifier.</p><a href="SingUp.jsp" style="text-decoration:none;">client enregistr� ?</a></div>
               </form>
        </div>
 </div>
 </section>
 <section style="margin-top: 530px;">
 <%@ include file="footer.html"  %>
 </section>
</body>
</html>