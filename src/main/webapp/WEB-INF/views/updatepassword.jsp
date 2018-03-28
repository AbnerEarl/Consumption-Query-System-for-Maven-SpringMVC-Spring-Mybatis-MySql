<%@ page pageEncoding="UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>修改密码</title>
</head>
<body>
<strong>${message}</strong>

<form action="updatepassword.do" method="post">
    <p>
        <label>旧密码：<input name="oldPassword"></label>

    </p>
    <br>

    <p>
        <label>新密码：<input name="newPassword"></label>
    </p>
    <br>

    <p>
        <label>新密码确认：<input name="newPasswordConfirm"></label>
    </p>
    <br>
    <p>
        <button type="submit">确定</button>
        <a href="index.do">返回</a>
    </p>
</form>


</body>
</html>
