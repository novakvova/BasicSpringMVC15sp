<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRUD</title>
<jsp:include page="../container/_link-css.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="../container/_header.jsp"></jsp:include>

	<div class="main">
		<div class="container">
			<h1>Login page</h1>
			<h2>${credentials.email}</h2>
		</div>
	</div>

	<jsp:include page="../container/_scripts.jsp"></jsp:include>
</body>
</html>