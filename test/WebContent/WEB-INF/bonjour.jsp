
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello
<ul>
<c:forEach var="userss" items="${User }">
<li>  <c:out value="${User.prenom }"/>  <c:out value="${User.nom }"/></li>
</c:forEach>

</ul>
<%-- <c:if test="${ !empty sessionScope.prenom && !empty sessionScope.nom }">
        <p>Vous êtes ${ sessionScope.prenom } ${ sessionScope.nom } !</p>
    </c:if> --%>
    <!-- <form method="post" action="Test">
        <p>
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        
        <input type="submit" />
    </form> -->
    
   
   
   <%-- <c:if test="${ !empty fichier }"><p><c:out value="Le fichier ${ fichier } (${ description }) a été uploadé !" /></p></c:if>
 
 
 <form method="post" action="Test" enctype="multipart/form-data">
        <p>
            <label for="description">Description du fichier : </label>
            <input type="text" name="description" id="description" />
        </p>
        <p>
            <label for="fichier">Fichier à envoyer : </label>
            <input type="file" name="fichier" id="fichier" />
        </p>
        
        <input type="submit" />
    </form> --%>
<%-- <c:if test="${ !empty nom }"><p><c:out value="Bonjour, vous vous appelez ${ nom }" /></p></c:if>
      <form method="post" action="Test">
          
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
            
            <input type="submit" />
        </form> --%>
       <%-- <c:if test="${ !empty forms.result}"><p><c:out value=" ${ forms.result}" /></p></c:if>
        <form method="post" action="Test">
          <p>
            <label for="user">username : </label>
            <input type="text" name="user" id="user" />
           </p>
           <p>
            <label for="pass">password : </label>
            <input type="text" name="pass" id="pass" />
           
           </p>
            
            <input type="submit" />
        </form>  --%>
</body>
</html>