<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix = "ak" uri = "http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>	
		<ak:form action = "adddata" method = "post" modelAttribute = "my">
			<tr>
				<td>Mobile ID</td>
				<td><ak:input path = "mobId"/></td>
			</tr>		
			<tr>
				<td>Mobile Name</td>
				<td><ak:input path = "mobName"/></td>
			</tr>		
			<tr>
				<td>Mobile Price</td>
				<td><ak:input path = "mobPrice"/></td>
			</tr>	
			<tr>
				<td>Mobile Category</td>
				<td><ak:select path = "mobCategory" items ="${cato}"/></td>
			</tr>
			<tr>
				<td>Mobile Online Availability</td>
				<td><ak:radiobutton path = "mobAvail" value = "yes"/>Yes
					<ak:radiobutton path = "mobAvail" value  = "no"/>No
				</td>
			</tr>			
			<tr>
				<td colspan = "2" align = "center">
					<input type = "submit"  value = "Add Mobile" />
				</td>
			</tr>
		</ak:form>		
	</table>

</body>
</html>