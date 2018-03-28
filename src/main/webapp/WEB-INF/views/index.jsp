<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>主页</title>

    <style>
        menu,h1,ul{
            margin: 0;
        }
        html,body{
            margin: 0;
            height: 100%;
            font-size: 14px;
        }
        body>header{
            line-height: 80px;
            text-align: center;
            background: #999;
        }
        body>header>h1{
            display: inline;
            text-align: center;
        }
        .bodys{
            position: absolute;
            top:80px;
            bottom:0px;
            width:100%;
        }
        .bodys>menu{
            position: absolute;
            float: left;
            left: 0;
            width: 230px;
            height: 100%;
            background: #eee;
            box-sizing: border-box;

        }
        .bodys>main{
            margin-left: 230px;
            height: 100%;
            display: block;
            width: 100%;
        }
        main>iframe{
           height:100%;
            width:100%;
            border:0;
            display: block;
        }
    </style>
</head>
<body>

<header>
    <h1>佳佳乐VIP消费查询系统</h1>
    <span>
        Hello ${sessionScope.currentUser.nickname}!
        <a href="logout.do">退出登录</a>
    </span>

</header>

<section class="bodys">
    <menu>
        <ul>
            <li><a>VIP客户查询</a></li>
            <li><a>录入VIP客户</a></li>
            <li><a>VIP客户管理</a></li>
            <li><a>查看VIP客户消费记录</a></li>
            <li><a>录入VIP客户消费记录</a></li>
            <li><a>VIP客户消费记录管理</a></li>
            <li><a href="updatepasswordview.do" target="mainFrame">修改密码</a></li>
        </ul>
    </menu>


    <main>
        <iframe nickname="mainFrame" src="welcome.do"></iframe>
    </main>
</section>


</body>
</html>
