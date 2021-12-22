<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="df" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<df:head title="Drop Forge" />
	<body>
    <df:nav />
		<div>
			Sheet Details
      <c:choose>
	      <c:when test="${ error }"> 
  	      <p>${ error }</p>
	      </c:when>
      </c:choose>
			
			<p>Name: ${ character.name }</p>
      <p>Description: <br>${ character.desc }</p>
      <c:forEach items="${ playerAttributes }" var="attributeName"> 
      <p>${ attributeName }: ${ character.getAttr(attributeName.toUpperCase()) }</p>
      </c:forEach>

			<p><a href="${pageContext.request.contextPath}/sheet/list">Back</a></p>
		</div>
	</body>
</html>