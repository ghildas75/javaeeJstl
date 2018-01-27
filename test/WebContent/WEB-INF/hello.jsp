<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>page jsp</title>
</head>
<body>
<form method="post" action="Test">
        <p>
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        
        <input type="submit" />
    </form>
<ul>
<c:forEach var="user" items="${userss }">
<li>  <c:out value="${user.prenom }"/>  <c:out value="${user.nom }"/></li>
</c:forEach>

</ul>


<%-- c:forTokens var="morceau" items="Un élément/Encore un autre élément/Un dernier pour la route" delims="/">
 <p>${ morceau }</p>
</c:forTokens>
<c:forEach items="${ titres }" var="titre" varStatus="status">
    <p>N°<c:out value="${ status.count }" /> : <c:out value="${ titre }" /> !</p>
</c:forEach> --%>


<!--  test jsl attribut var correspond au resulat de la condition c'est un boolean vrai ou faux sa porte est par defaut sur la page-->

<%-- <c:if test="${50>10 }" var="varaible" scope="session" >

its always true
</c:if> --%>
<c:forEach var="i" begin="0" end="10" step="2">
    <p>Un message n°<c:out value="${ i }" /> !</p>
</c:forEach>


<%-- <c:choose>
<c:when test="${variable }"> du texte html </c:when>
<c:when test="${autrevariable }"> du texte html </c:when>
<c:when test="${othervariable }"> du texte html </c:when>
<c:otherwise> sinon c'est aucune condition n'est repecte on va excuter cette instruction</c:otherwise>
</c:choose> --%>
    <%--  <c:set target="${auteur}" proprety="prenom" >amour </c:set>
     <p><c:out value="${auteur.prenom}" /></p>
	<p> <c:out value="${variable }" escpaeXML="false"> valeur par defaut</c:out></p>
	<c:set var="pseudo" scope="page"> Sandrine</c:set>
	<p> <c:out  value="${pseudo }"/></p>
	<c:set var="pseudo" scope="page"> Samy</c:set>
	<p> <c:out  value="${pseudo }"/></p>
	<c:remove var="pseudo" scope="page" /> --%>
	<%-- %@ include file="menu.jsp" %>

<!--  Mehtode objet  avec les expression de language -->

<h1> Hello ${auteur} </h1>
 <em>  Bonjour auteur ${auteur.nom} ${auteur.prenom} ${auteur.estActif}</em><br><hr> --%>
<%--  <b>${auteur.estActif?"vous etes trés actif":"vous etes null"}</b> --%>
 <%-- hello le premier nom du tableau ${keytab[0]} <br><br>
<%
String tab[]=(String []) request.getAttribute("keytab");
for(int i=0;i<tab.length;i++){
	out.println(tab[i]+"<br>");
}

%>
<p> Hello ${empty name?'entrer votre nom' :name} from expression langage<br>
 Hello ${!empty name?name :"aucune entree"} from expression langage<br>

<%
 String nom=(String)request.getAttribute("name");
 out.println(nom);
%>

</p>

<p> hello samir ${6*5 } from jsp file<p>


<p>

<%
String myMessage =(String)request.getAttribute("variable");
out.println(myMessage);

%>
</p>
<%

String heure =(String)request.getAttribute("heure");
if(heure.equalsIgnoreCase("jour")){
	out.println("hello its moring");
}
else 
	{out.println("hola hola its evening");}
/* for (int i=0;i<10;i++){
	
	out.println("new line<br>");
} */

%> --%>
</body>
</html>