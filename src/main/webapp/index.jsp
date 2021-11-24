<html>
	<head>
		<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

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