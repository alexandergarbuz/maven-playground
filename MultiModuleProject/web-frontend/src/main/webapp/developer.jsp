<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.garbuz.model.Developer" %>
<%

Developer developer = (Developer)request.getAttribute("currentDeveloper");

%>
<html>
<body>
<h2><%= developer.getFirstName() %> <%= developer.getLastName() %></h2>
<p><%= developer.getEmail() %></p>
<p><%= developer.getTitle() %></p>
</body>
</html>
