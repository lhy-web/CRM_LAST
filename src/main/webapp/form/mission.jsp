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
<form action="findAllMission" method="post">
<table width="100%" height="23" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="2" width="100%" align="center">
            请输入查询条件：

            <select name="type">

                <option value="missionSubject" ${missionSubject }>任务主题</option>
                <option value="missionName" ${missionName }>客户名称</option>
                <option value="missionLinkman" ${missionLinkman }>联系人</option>
                <option value="completeTime" ${completeTime }>完成期限</option>
                <option value="precedence" ${precedence }>优先级</option>
                <option value="administer" ${administer }>执行人</option>
                <option value="missionDescription" ${missionDescription }>任务描述</option>
                
            </select>
            <input name="key"  type="text" class="txt_grey" size="24" value="${key}">
            <input type="submit" class="subt_grey" value="搜索">
        </td>
    </tr>
</table>
</form>



<table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
    <tr bgcolor="#eeeeee" style="padding:5px;">
        <td align="center"> <input type="checkbox" onclick="quanxuan();" id="selectAll" ></td>
        <td align="center"> 任务ID</td>
        <td align="center"> 任务主题</td>
        <td align="center"> 任务主题</td>
        <td align="center"> 联系人</td>
        <td align="center"> 完成期限</td>
        <td align="center"> 优先级</td>
        <td align="center"> 执行人</td>
        <td align="center"> 任务描述</td>
        <td align="center"> 查看详情</td>
        <td align="center"> 修改</td>
        <td align="center">删除</td>

    </tr>
    <form action="manyDeleteMission" method="post">
    <c:forEach items="${list.list}" var="MissionInfo">
        <tr  style="padding:5px;font-size: 12px;">

            <td align="center"><input type="checkbox" name="checkboxDelete" value="${MissionInfo.missionId }"> </td>
            <td align="center"> ${MissionInfo.missionId }</td>
            <td align="center"> ${MissionInfo.missionSubject }</td>
            <td align="center"> ${MissionInfo.missionName }</td>
            <td align="center"> ${MissionInfo.missionLinkman }</td>
            <td align="center"> ${MissionInfo.completeTime }</td>
            <td align="center"> ${MissionInfo.precedence }</td>
            <td align="center"> ${MissionInfo.administer }</td>
            <td align="center"> ${MissionInfo.missionDescription }</td>
            <td align="center"> <a href="${pageContext.request.contextPath}/ViewDCIMission?MissionInfoId=${MissionInfo.missionId}" >查看详情</a></td>
            <td align="center"> <a href="${pageContext.request.contextPath}/updateInfo?MissionInfoId=${MissionInfo.missionId}" >修改</a></td>
            <td align="center"> <a href="${pageContext.request.contextPath}/deleteMission?MissionInfoId=${MissionInfo.missionId}" >删除</a></td>
        </tr>
    </c:forEach>
        <tr style="padding:5px;font-size: 12px;">
            <td colspan="12" align="center">


                    <a href="findAllMission?currentPage=1">首页</a>
                    <a href="findAllMission?currentPage=${list.currentPage-1 }">上一页</a>




                    <a href="findAllMission?currentPage=${list.currentPage+1 }">下一页</a>
                    <a href="findAllMission?currentPage=${list.totalPage }">尾页</a>



                当前第${list.currentPage}页| 共${list.totalPage}页 | 共${list.totalCount}条记录。
            </td>
        </tr>

</table>
<input type="submit" value="批量删除">
</form>
<input type="button" value="添加" onclick="window.open('GetDictionaryMission');">
</body>
</html>
