<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="df" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" />

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.10/angular.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-messages/1.6.9/angular-messages.min.js"></script>

		<title>Drop Forge</title>
	</head>
	<body>
    <df:nav />
		<div>
			New Character
			<form:form name="characterCreate" action="${pageContext.request.contextPath}/sheet/details" method="POST" modelAttribute="playerCharacter">
				<p>
					<label for="character-name">Name: <span>(required)</span></label>
					<input type="text" id="character-name" name="name" required />
				</p>
				<p>
					<label for="character-desc">Description: </label>
					<textarea id="character-desc" name="desc"></textarea>
				</p>
				<c:forEach items="${ playerAttributes }" var="attributeName">
				<fieldset>
					<legend>${ attributeName }</legend>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-1" value="1" cost="0" checked /> 1
					</label>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-2" value="2" cost="3" /> 2
					</label>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-3" value="3" cost="6" /> 3
					</label>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-4" value="5" cost="9" /> 4
					</label>
				</fieldset>
				</c:forEach>

				<button type="submit" name="create-character" ng-disabled="characterCreate.$invalid">Create</button>
				<button type="reset"  name="reset-character">Reset</button>
			</form:form>
		</div>
	</body>
</html>