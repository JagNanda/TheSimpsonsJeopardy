<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Question</title>
	<link rel="stylesheet" href="gbstyles.css">
</head>
<body>
<body>
    <div>
        <div id="question">${theQuestion.question}</div>
        <c:if test="${theQuestion.dailyDouble}">
        	<div id="dailyDouble">Daily Double</div>
        </c:if>
        <form method="POST" action="AnswerSelect">
	        <table class="board">
	            <tr>
	                <td id=answer1><button type="submit" value="${theQuestion.answer1}" name="answer">${theQuestion.answer1}</button></td>
	                <td id=answer2><button type="submit" value="${theQuestion.answer2}" name="answer">${theQuestion.answer2}</button></td>
	            </tr>
	            <tr>
	                <td id=answer3><button type="submit" value="${theQuestion.answer3}" name="answer">${theQuestion.answer3}</button></td>
	                <td id=answer4><button type="submit" value="${theQuestion.answer4}" name="answer">${theQuestion.answer4}</button></td>
	            </tr>
	        </table>
	    	<button type="submit" name="answer" value="skip" id="skip">SKIP</button>
        </form>
    </div>
</body>
</body>
</html>