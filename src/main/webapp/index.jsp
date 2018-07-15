<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form method="post">
  <span>user name:${param.username==null?"":param.username}</span>
  <input type="text" name="username" size="50"/>
  <input type="password" name="password" size="50"/>
  <input type="submit" value="submit"/>
</form>
</body>
</head>
</html>
