<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ljx
  Date: 2020/6/22
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="70%" height="100" border="1" cellpadding="0" cellspacing="0">
    <tr bgcolor="#eeeeee" style="padding:5px;">


        <td align="center">编号</td>
        <td align="center">分类</td>
        <td align="center">操作</td>
        <td align="center">修改</td>


    </tr>

    <c:forEach items="${list}" var="DictionaryType">
        <tr  style="padding:5px;font-size: 12px;">
            <form action="update" method="post">
                <td align="center"> ${DictionaryType.dataTypeId }</td>
                <td align="center"><a href="findDictionaryType?id=${DictionaryType.dataTypeId }">${DictionaryType.dataTypeName }</a></td>
                <td align="center"><a href="deleteDictionAryType?id=${DictionaryType.dataTypeId }">删除</a></td>
                <td align="center">
                    <input type="text" name="newname" value="">
                    <input type="hidden" name="nameid" value="${DictionaryType.dataTypeId }">
                    <input type="submit" value="提交"></td>
            </form>
        </tr>
    </c:forEach>
</table>
<a href="form/addDictionaryType.jsp"><input type="button" value="添加"></a>
</body>
</html>
