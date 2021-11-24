<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.10/angular.min.js"></script>

		<title>Drop Forge</title>
	</head>
	<body>
		<div>
			New Chargen Placeholder

			<form>
				<c:forEach items=$(playerAttributes) var="attributeName">
				<fieldset>
					<legend>${ attributeName }</legend>
					<label>
						<input type="radio" name="${ attributeName }" id="${ attributeName }-1" value="0" checked="true" /> 1
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
			</form>
		</div>
	</body>
</html>