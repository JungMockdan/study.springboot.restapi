<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <script type="text/javascript">
function callFunc(){
    var frm = document.frm;
    frm.action = "/t/job1"
    frm.submit();
}
    </script>
</head>
<body onload="callFunc()">
<form:form method="post" name="frm" id="frm" modelAttribute="testModel">
<input type="hidden" name="xxx" value="111">
</form:form>
</body>
</html>
