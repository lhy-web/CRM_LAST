<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>导航栏</title>
    
    <script type="text/javascript" src="js/dtree.js"></script> 
    <link rel="StyleSheet" href="css/dtree.css" type="text/css" /> 
    <link rel="StyleSheet" href="css/leftStyle.css" type="text/css" /> 

    <!-- dwr要引用的js engine.js文件是固定的；DictionaryTypeDAO.js文件的命名是根据 dwr.xml 的javascript="?"里面的 -->
    <script type="text/javascript" src="dwr/engine.js"></script>
    <script type="text/javascript" src="dwr/interface/DictionaryTypeDAO.js"></script>
    
  </head>
  <body>

 <p> <a href="javascript:d.openAll();">打开全部</a> |  <a href="javascript:d.closeAll();">关闭全部</a></p>
  
 <script type="text/javascript">
            d=new dTree('d');
	        d.config.userCookies=false; //不使用cookies
	        d.config.useStatusText=true;//状态栏显示文本
	        d.config.closeSameLevel=true;//关闭同一层次的节点
	        //root
	        d.add(0,-1,"客户关系管理系统");
               //
		       // d.add(1,0,"客户信息管理");
		       // d.add(2,0,"数据字典管理");
		       // d.add(3,0,"联系人信息管理");
		       // d.add(4,0,"客户投诉管理");
		       // d.add(5,0,"用户信息管理");
		       // d.add(6,0,"角色信息管理");
		       // d.add(7,0,"任务管理");

		        <s:iterator value="#session.roleRelationship" id="roleRelation" status="stu" >
				 <s:if test="#roleRelation.access==1">
				      d.add(${stu.index+1 },0,"${roleRelation.menuInfo.menuInfoName}");
				 </s:if>
			    </s:iterator>

			    

		           d.add(11,1,"客户信息管理","form/loadingCustomerInfo.jsp","","main");
		           d.add(21,2,"数据字典管理","form/loadingDictionaryInfo.jsp","","main")
			       d.add(31,3,"联系人信息管理","form/loadingContactPersonInfo.jsp","","main");
                   d.add(41,4,"客户投诉管理","form/loadingComplainInfo.jsp","","main");
                   d.add(51,5,"用户信息管理","form/loadingUserInfo.jsp","","main");
                   d.add(61,6,"角色信息管理","form/loadingRoleInfo.jsp","","main");
                    d.add(71,7,"任务管理","form/loadingMissionInfo.jsp","","main");
		    document.write(d);



    </script>

 <s:if test="#session.roleRelationship == null">
     <a href="Login.jsp" target="_parent">请登录</a>
 </s:if>
 <s:else>
     <form action="userLoginOut" target="_parent" method="post">
         <input type="submit" value="注销用户">
     </form>
 </s:else>

  </body>
</html>
