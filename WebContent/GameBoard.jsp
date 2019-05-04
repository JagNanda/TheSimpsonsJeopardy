<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Jeopardy</title>
    <link href="gbstyles.css" rel="stylesheet">
</head>
<body>
    <div class="title">
        Simpsons <span class="jeopardy-text">Jeopardy!</span>
    </div>
    <table class="playerInfo">
    	<tr>
    		<td>Player Name: ${player.name}</td> <td>Player Score: ${player.score}</td>
    	</tr>
    </table>
    <form method="post" action="PickQuestion">
	    <table class="board">
	        <thead>
	        	<tr>
	            	<th>Homer</th><th>Bart</th><th>Other Characters</th><th>Springfield</th><th>Episodes</th>
	            </tr>
	        </thead>
	        <tr>
	            <td><button type="submit" name="question" value="0" class="${questions[0].clickable ? 'btn':'disabled-button'}" ${questions[0].clickable ? '':"disabled"}>100</button></td>
	            <td><button type="submit" name="question" value="1" class="${questions[1].clickable ? 'btn':'disabled-button'}" ${questions[1].clickable ? '':"disabled"}>100</button></td>
	            <td><button type="submit" name="question" value="2" class="${questions[2].clickable ? 'btn':'disabled-button'}" ${questions[2].clickable ? '':"disabled"}>100</button></td>
	            <td><button type="submit" name="question" value="3" class="${questions[3].clickable ? 'btn':'disabled-button'}" ${questions[3].clickable ? '':"disabled"}>100</button></td>
	            <td><button type="submit" name="question" value="4" class="${questions[4].clickable ? 'btn':'disabled-button'}" ${questions[4].clickable ? '':"disabled"}>100</button></td>
	        </tr>
	        <tr>
	            <td><button type="submit" name="question" value="5" class="${questions[5].clickable ? 'btn':'disabled-button'}" ${questions[5].clickable ? '':"disabled"}>200</button></td>
	            <td><button type="submit" name="question" value="6" class="${questions[6].clickable ? 'btn':'disabled-button'}" ${questions[6].clickable ? '':"disabled"}>200</button></td>
	            <td><button type="submit" name="question" value="7" class="${questions[7].clickable ? 'btn':'disabled-button'}" ${questions[7].clickable ? '':"disabled"}>200</button></td>
	            <td><button type="submit" name="question" value="8" class="${questions[8].clickable ? 'btn':'disabled-button'}" ${questions[8].clickable ? '':"disabled"}>200</button></td>
	            <td><button type="submit" name="question" value="9" class="${questions[9].clickable ? 'btn':'disabled-button'}" ${questions[9].clickable ? '':"disabled"}>200</button></td>
	        </tr>
	        <tr>
	            <td><button type="submit" name="question" value="10" class="${questions[10].clickable ? 'btn':'disabled-button'}" ${questions[10].clickable ? '':"disabled"}>300</button></td>
	            <td><button type="submit" name="question" value="11" class="${questions[11].clickable ? 'btn':'disabled-button'}" ${questions[11].clickable ? '':"disabled"}>300</button></td>
	            <td><button type="submit" name="question" value="12" class="${questions[12].clickable ? 'btn':'disabled-button'}" ${questions[12].clickable ? '':"disabled"}>300</button></td>
	            <td><button type="submit" name="question" value="13" class="${questions[13].clickable ? 'btn':'disabled-button'}" ${questions[13].clickable ? '':"disabled"}>300</button></td>
	            <td><button type="submit" name="question" value="14" class="${questions[14].clickable ? 'btn':'disabled-button'}" ${questions[14].clickable ? '':"disabled"}>300</button></td>
	        </tr> 
	        <tr>
	            <td><button type="submit" name="question" value="15" class="${questions[15].clickable ? 'btn':'disabled-button'}" ${questions[15].clickable ? '':"disabled"}>400</button></td>
	            <td><button type="submit" name="question" value="16" class="${questions[16].clickable ? 'btn':'disabled-button'}" ${questions[16].clickable ? '':"disabled"}>400</button></td>
	            <td><button type="submit" name="question" value="17" class="${questions[17].clickable ? 'btn':'disabled-button'}" ${questions[17].clickable ? '':"disabled"}>400</button></td>
	            <td><button type="submit" name="question" value="18" class="${questions[18].clickable ? 'btn':'disabled-button'}" ${questions[18].clickable ? '':"disabled"}>400</button></td>
	            <td><button type="submit" name="question" value="19" class="${questions[19].clickable ? 'btn':'disabled-button'}" ${questions[19].clickable ? '':"disabled"}>400</button></td>
	        </tr>         
	        <tr>
	            <td><button type="submit" name="question" value="20" class="${questions[20].clickable ? 'btn':'disabled-button'}" ${questions[20].clickable ? '':"disabled"}>500</button></td>
	            <td><button type="submit" name="question" value="21" class="${questions[21].clickable ? 'btn':'disabled-button'}" ${questions[21].clickable ? '':"disabled"}>500</button></td>
	            <td><button type="submit" name="question" value="22" class="${questions[22].clickable ? 'btn':'disabled-button'}" ${questions[22].clickable ? '':"disabled"}>500</button></td>
	            <td><button type="submit" name="question" value="23" class="${questions[23].clickable ? 'btn':'disabled-button'}" ${questions[23].clickable ? '':"disabled"}>500</button></td>
	            <td><button type="submit" name="question" value="24" class="${questions[24].clickable ? 'btn':'disabled-button'}" ${questions[24].clickable ? '':"disabled"}>500</button></td>
	        </tr>                
	    </table>
    </form>
</body>
</html>