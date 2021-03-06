<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="df" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" />

		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.10/angular.min.js"></script>
  	<title>Drop Forge</title>
	</head>
	<body ng-app="dropForgeApp">
    <df:nav />
		<div>
			Character Sheets Placeholder
	    <table ng-controller="SheetListController as ctrl">
			  <caption>Visible Characters</caption>
			  <tr>
			    <th scope="col">Game</th>
			    <th scope="col">Character</th>
			  </tr>
			  <tr ng-repeat="(index, character) in ctrl.characterList">
			    <td>{{ character.gameId }}</td>
			    <td>{{ character.name }}</td>
			  </tr>
			</table>
		</div>

    <script src="${pageContext.request.contextPath}/core/app.js"></script>
    <script src="${pageContext.request.contextPath}/core/service.js"></script>
    <script src="${pageContext.request.contextPath}/core/sheet-list.controller.js"></script>
	</body>
</html>