<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.bundle.min.js"></script>
    <script language="javascript">

            function doRegist() {
                console.log(123);
                window.open("http://www.baidu.com")
            }
    </script>

    <style>
        .zc {
            margin-left: 66%;
            margin-top: -7%;
        }

        .dl {
            margin: 20px;
        }

        .bt {
            color: #80bdff;
            margin-left: 40%;
            margin-right: auto;
            margin-top: 1%;
        }

        .loginForm {
            height: 45%;
            width: 25%;
            margin-top: 10%;
            margin-left: 55%;
            border: 0px solid #eee;
        }

        .zh {
            color: #8fd19e;
        }

        .logo {
            height: 48%;
            width: 35%;
            margin-top: -26%;
            margin-left: 10%;
            border-radius: 50%;
        }

        body {
            height: 100%;
            width: 100%;
            background-image: url('/image/login.png');
            background-repeat: no-repeat;
        / / 设置图片不重复 background-size: 100 % 100 %;
            background-attachment: fixed;
        }
    </style>
</head>
<body>
<form action="doLogin" method="post" class="loginForm">
    <h1 class="fixed-top bt">实 训 管 理 系 统</h1>
    <div class="form-group">
        <label for="exampleInputEmail1" class="zh">账号</label>
        <input type="text" class="form-control" name="num" id="exampleInputEmail1" required>
        <#--        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>-->
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1" class="zh">密码</label>
        <input type="password" class="form-control" name="pwd" id="exampleInputPassword1" required>
    </div>
    <div>
        <p class="zh">选择身份：</p>
    </div>
    <div class="btn-group btn-group-toggle" data-toggle="buttons">
        <label class="btn btn-secondary active">
            <input type="radio" name="identity" value="option1"> 管理员
        </label>
        <label class="btn btn-secondary">
            <input type="radio" name="identity" value="option2"> 实训负责人
        </label>
        <label class="btn btn-secondary">
            <input type="radio" name="identity" value="option3"> 教师
        </label>
        <label class="btn btn-secondary">
            <input type="radio" name="identity" value="option4" checked> 学生
        </label>
    </div>
    <div class="dl">
        <button type="submit" class="btn btn-primary">登录</button>
    </div>

</form>
<button class="btn btn-primary zc" onclick="doRegist()">注册</button>
<img border="0" src="/image/logo.png" alt="picture" width="160" height="100" class="logo">

</body>
</html>
