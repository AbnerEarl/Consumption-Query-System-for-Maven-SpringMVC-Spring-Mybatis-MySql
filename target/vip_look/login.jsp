<%@ page pageEncoding="UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>登录界面</title>
</head>
<%--<script>
    if(window.top!==Window) {
        window.top.location.href = window.location.href;
    }
</script>--%>

<body>

<strong>${message}</strong>
<form action="login.do" method="post">
    <p>
        <label>账号：<input name="account"></label>

    </p>
    <br>

    <p>
        <label>密码：<input name="password"></label>
    </p>
    <br>
    <p>
        <button type="submit">登录</button>
    </p>
</form>
<%
    session.removeAttribute("message");
%>
</body>
</html>
