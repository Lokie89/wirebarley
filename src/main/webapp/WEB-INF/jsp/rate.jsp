<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<div><h1>환율 계산</h1></div>
<div><h3>송금국가: 미국(USD)</h3></div>
<div><h3>수취국가: <select name="country">
    <option value="KRW" selected>한국(KRW)</option>
    <option value="JPY">일본(JPY)</option>
    <option value="PHP">필리핀(PHP)</option>
</select></h3></div>
<div><h3>환율 : <span id="rate"></span></h3></div>
<div><h3>송금액: <input type="text" id="sendMoney"> USD</h3></div>
<div><button type="submit">submit</button></div>
</body>
</html>