<html>
	<head>
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>

		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.10/angular.min.js"></script>

		<title>Drop Forge</title>
	</head>
	<body>
		<div>
			New Chargen Placeholder

			<form>
				<fieldset>
					<legend>{{ name | titlecase }}</legend>
					<label>
						<input type="radio" name="strength" id="strength-1" value="0" checked="true" 
						[(ngModel)]="attr.strength"> 1
					</label>
					<label>
						<input type="radio" name="strength" id="strength-2" value="3" 
						[(ngModel)]="attr.strength"> 2
					</label>
					<label>
						<input type="radio" name="strength" id="strength-3" value="6" 
						[(ngModel)]="attr.strength"> 3
					</label>
					<label>
						<input type="radio" name="strength" id="strength-4" value="9" 
						[(ngModel)]="attr.strength"> 4
					</label>
				</fieldset>
			</form>
		</div>
	</body>
</html>