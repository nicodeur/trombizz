<!DOCTYPE html>
<?xml version="1.0" encoding="UTF-8"?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.page contentType="text/html; charset=UTF-8"
	language="java" isELIgnored="false" />
<jsp:directive.page import="java.util.List" />
<jsp:directive.page import="javax.jdo.PersistenceManager" />
<jsp:directive.page import="com.google.appengine.api.users.User" />
<jsp:directive.page import="com.google.appengine.api.users.UserService" />
<jsp:directive.page
	import="com.google.appengine.api.users.UserServiceFactory" />
<jsp:directive.page import="com.astrea.Greeting" />
<jsp:directive.page import="com.astrea.PMF" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Guestbook with angular</title>

</head>
<body>
	<div class="container">

		<%
			UserService userService = UserServiceFactory.getUserService();
			User user = userService.getCurrentUser();
			request.setAttribute("user", user);
		%>
		<c:if test="${user != null}">
			<p>
				Hello,
				<c:out value="${user.nickname}" />
				! (You can <a
					href="<%=userService.createLogoutURL(request.getRequestURI())%>">sign
					out</a>.)
			</p>
		</c:if>
		<c:if test="${user == null}">
			<p>
				Hello! <a
					href="<%=userService.createLoginURL(request.getRequestURI())%>">Sign
					in</a> to include your name with greetings you post.
			</p>
		</c:if>

		<%
			PersistenceManager pm = PMF.get().getPersistenceManager();
			String query = "select from " + Greeting.class.getName();
			List<Greeting> greetings = (List<Greeting>) pm.newQuery(query)
			.execute();
			request.setAttribute("greetings", greetings);
		%>
		<c:if test="${empty greetings}">
			<p>The guestbook has no messages.</p>
		</c:if>
		<c:if test="${not empty greetings}">
			<c:forEach items="${greetings}" var="g">
				<c:if test="${g.author == null}">
					<p>An anonymous person wrote:</p>
				</c:if>
				<c:if test="${g.author != null}">
					<p>
						<b><c:out value="${g.author.nickname}" /></b> wrote:
					</p>
				</c:if>
				<blockquote>
					<c:out value="${g.content}" />
				</blockquote>
			</c:forEach>
		</c:if>
		<%
			pm.close();
		%>
		<form  ng-submit="submit()" ng-controller="signCtrl">
			<div>
				<textarea name="content" ng-model="content" rows="3" cols="60"></textarea>
				 <span class="error" ng-show="myForm.input.$error.required">Required!</span>
			</div>
			<div>
				<input type="submit" id="submit" value="Post Greeting" />
			</div>
		</form>

	</div>

</body>
</html>