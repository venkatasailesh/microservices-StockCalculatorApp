<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
	<title>Home page</title>
</head>
<body>
	<h3>Get Stock Price</h3>
	${msg }
	<form method="get" action="getTotalCost">
		<table>
			<tr>
			<td>Company name </td>
				<td>
					<input type='text' name='companyName'/>
				</td>
		
			</tr>
		
			<tr>
			<td>Quantity </td>
				<td>
					<input type='text' name='quantity'/>
				</td>
		
			</tr>
		
			<tr>
				<td>
					<input type="submit" name='GetCost'/>
				</td>
		
			</tr>
		</table>

	</form>

</body>
</html>