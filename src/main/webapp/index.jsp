<html>
	<head>
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>

		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" />

		<title>Drop Forge</title>
	</head>
	<body>
		<%@include file="WEB-INF/jspf/nav.jspf"%>
		<div>
			<p>A <abbr title="character generation">chargen</abbr> app for Crucible, a dark-fantasy roleplaying game</p>
			<p>${name}</p>
		</div>
	</body>
</html>