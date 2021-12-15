<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" />

		<title>Drop Forge</title>
	</head>
	<body>
		<div>
			New Character
			<form:form method="POST" modelAttribute="playerCharacter">
				<p>
				<label for="character-name">Name: </label>
				<input type="text" id="character-name" />
				</p>
				<p>
				<label for="character-desc">Description: </label>
				<textarea id="character-desc"></textarea>
				</p>
				<c:forEach items=$(playerAttributes) var="attributeName">
				<fieldset>
					<legend>${ attributeName }</legend>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-1" value="0" checked /> 1
					</label>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-2" value="3" /> 2
					</label>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-3" value="6" /> 3
					</label>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-4" value="9" /> 4
					</label>
				</fieldset>
				</c:forEach>

				<button type="submit">Create</button>
				<button type="reset">Cancel</button>
			</form:form>
		</div>
	</body>
</html>