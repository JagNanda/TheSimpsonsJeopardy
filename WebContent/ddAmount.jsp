<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Daily Double Betting Amount</title>
    <link rel="stylesheet" href="gbstyles.css">
</head>
<body>
	<c:set var="score" value="${player.score}"/>
	<c:choose>
		<c:when test="${score > 1000}">
			<c:set var="max" value="score"/>
		</c:when>	
		<c:otherwise>
			<c:set var="max" value="1000"/>
		</c:otherwise>
	</c:choose>
	<div class="ddHeader">
        You have selected a Daily Double! Please enter an Amount.   <br>
        Maximum Bet: ${max}  
    </div>
    <form method="POST" action="ddServlet">
        <input type="number" name="ddAmount" min="1000" max="${max}" required>
        <input type="submit" value="BET">
    </form>
</body>
</html>