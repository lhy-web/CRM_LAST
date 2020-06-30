<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/23
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center" style="font-family:华义彩云;"> 任务信息添加</h1>
<form action="addMissionInfo" method="post">
<table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 任务主题<font color="red">${error}</font> </td>
        <td><input type="text" name="missionSubject">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 客户名称<font color="red">${error}</font> </td>
        <td><input type="text" name="missionName">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 联系人<font color="red">${error}</font> </td>
        <td><input type="text" name="missionLinkman">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 完成期限<font color="red">${error}</font> </td>
        <td><input type="text" name="completeTime">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 优先级<font color="red">${error}</font> </td>
        <td><input type="text" name="precedence">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 执行人<font color="red">${error}</font> </td>
        <td><input type="text" name="administer">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 任务描述<font color="red">${error}</font> </td>
        <td><input type="text" name="missionDescription">

    </tr>

</table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </p>
</form>

</body>
</html>
