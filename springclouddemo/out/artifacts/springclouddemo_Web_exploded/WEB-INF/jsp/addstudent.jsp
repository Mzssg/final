<%--
  Created by IntelliJ IDEA.
  User: mazhe
  Date: 2020/3/13
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>教师</title>
    <style>
        #mz a:hover {
            color: aliceblue !Important;
            background-color: #005bac;
        }
    </style>
</head>
<body>
<div style="height:100px;background-color:#005bac;"><br>
    <h2 style="color: #f0f0f0;">&emsp;&emsp;作业管理系统</h2>
</div>
<div>
    <div style="position:absolute;width:300px;height:1000px;background-color:#f0f0f0;">
        <div id="mz"style="position:absolute;width:300px;top:40px;">
            <ul style="list-style-type:none;margin: 0;padding: 0;text-align:left;"><br />
                <li><a style="font-size:25px;text-decoration:none;color:#005bac;width:300px;display:inline-block;padding:0.5em 0 0.5em 0;" href="<%=request.getContextPath()%>main/webapp/WEB-INF/jsp/addhomework.jsp"> &emsp;&emsp;&emsp;&emsp;添加作业 </a></li>
                <li><a style="font-size:25px;text-decoration:none;color:#005bac;width:300px;display:inline-block;padding:0.5em 0 0.5em 0;" href="<%=request.getContextPath()%>main/webapp/WEB-INF/jsp/addstudent.jsp"> &emsp;&emsp;&emsp;&emsp;添加学生 </a></li>
                <li><a style="font-size:25px;text-decoration:none;color:#005bac;width:300px;display:inline-block;padding:0.5em 0 0.5em 0;" href="<%=request.getContextPath()%>main/webapp/WEB-INF/jsp/checkhomework.jsp"> &emsp;&emsp;&emsp;&emsp;查看学生作业 </a></li>
            </ul>
        </div>
    </div>
    <div style="position:absolute;left:300px;width:1120px;height:1000px;text-align:center;">
        <form action="<%=request.getContextPath()%>/addstudent" method="post"  style="left: 100px;">
            <div id="username">
                <label>学生：</label>
                <input type="text" style="width:160px;height: 30px;" id="name" name="username" placeholder="输入学生"/>
            </div>
            <br>
            <div id="login">
                <button type="submit"style="height: 30px;width: 90px;">添加</button>&emsp;
            </div>
        </form>
    </div>
</div>
</body>
</html>