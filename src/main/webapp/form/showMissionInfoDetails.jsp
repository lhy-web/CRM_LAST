<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/24
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看任务详细信息</title>
</head>
<body>
<h1 align="center" style="font-family:华义彩云;"> 任务详细信息</h1>

<table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 任务ID：</td>
        <td>${missionInfo.missionId} </td>
        <td bgcolor="#eeeeee"> 任务主题：</td>
        <td>${missionInfo.missionSubject} </td>
    </tr>
    <tr style="padding:5px;">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 客户名称：</td>
        <td>${missionInfo.missionName} </td>
        <td bgcolor="#eeeeee"> 联系人：</td>
        <td>${missionInfo.missionLinkman} </td>
    </tr>
    <tr style="padding:5px;">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 完成期限：</td>
        <td>${missionInfo.completeTime} </td>
        <td bgcolor="#eeeeee"> 优先级：</td>
        <td>${missionInfo.precedence} </td>
    </tr>
    <tr style="padding:5px;">

    </tr>
    <tr style="padding:5px;">
        <td bgcolor="#eeeeee"> 执行人：</td>
        <td>${missionInfo.administer} </td>
        <td bgcolor="#eeeeee"> 任务描述：</td>
        <td>${missionInfo.missionDescription} </td>
    </tr>
    <tr style="padding:5px;">

    </tr>
</table>

</body>
</html>
