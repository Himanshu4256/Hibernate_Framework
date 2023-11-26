<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Add Notes</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>
	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Please fill the details</h1>
		<br>

		<!-- This is form for details -->
		<form action="SaveNoteServlet" method="post">
		
			<div class="mb-3 form-group">
				<label for="title" class="form-label">Note title</label> 
				
				<input name="title" required="required" type="text" class="form-control" id="title" placeholder="Enter Title" />
				
				<div class="form-text">We'll never share your data with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				
				<textarea name="content" required id="content" placeholder="Enter content" class="form-control"></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>
		</form>


	</div>
</body>
</html>