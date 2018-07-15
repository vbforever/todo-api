<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form>
  <span>user name:${param.username==null?"":param.username}</span>
  <input type="username" size="50"/>
  <input type="password" size="50"/>
  <input type="submit" value="submit"/>
</form>
</body>
</head>
</html>