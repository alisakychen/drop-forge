<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" />

		<title>Drop Forge</title>
	</head>
	<body>
		<div>
			Character Sheets Placeholder

			<table>
				<tr>
					<th scope="col">Game</th>
					<th scope="col">Character</th>
				</tr>
				<tr ng-repeat="(index, character) in characterList">
					<td>{{ character.gameId }}</td>
					<td><a href="${pageContext.request.contextPath}/sheet/details">{{ character.name }}</a></td>
				</tr>
			</table>
		</div>
	</body>
</html>