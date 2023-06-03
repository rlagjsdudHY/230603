<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>Document</title>
		<link rel="stylesheet" href="/style/style.css">
		<style>
		
		</style>
	</head>
	<body>
		<div id="wrap">
			<h1>Log in</h1>
			
			<form action="/receive">
				<figure>
					<legend>
					<label for="userEmail">Email</label>
					</legend>
					<input type="text" name="userEmail"
						id="userEmail">
				</figure>
				<figure>
					<legend>
					<label for="userEmail">Password</label>
					</legend>
					<input type="text" name="userPw"
						id="userPw">
				</figure>
			
			<button id="button">Log in</button>
			</form>
			
		</div>	
		<!-- div#wrap -->
		<script src="/script/jquery-3.6.4.min.js"></script>
        <script src="/script/script.js"></script>	
	</body>
</html>
   
 