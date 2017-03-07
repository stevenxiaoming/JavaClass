<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ShuCourse 自助选课系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    ShuCourse 自助选课系统<br>
    <%=session.getId() %>
    <s:form action="course_info" method="post" namespace="/">
        <h4>course_info查询单个条目，详细查询，精确查找</h4>
        <div>前端做好数据验证</div>
        <table>
            <tr>
                <td>课程号-cId [8位 数字字母组合]：</td>
                <td><input type="text" name="cId" /></td>
            </tr>
            <tr>
                <td>教师号-tId [4位 数字]：</td>
                <td><input type="text" name="tId" /></td>
            </tr>
            <tr>
                <td colspan="2" ><input type="submit" value="提交"></td>
            </tr>
        </table>
    </s:form>
    <div><hr></div>
    <s:form action="course_list" method="post" namespace="/">
        <h4>course_list查询多项目</h4>
        <div>支持模糊查询，但速度会收到影响</div>
        <table>
            <tr>
                <td>课程号-cId [8位 数字字母组合]：</td>
                <td><input type="text" name="cId" /></td>
            </tr>
            <tr>
                <td>课程名-cName：</td>
                <td><input type="text" name="cName" /></td>
            </tr>
            <tr>
                <td>学分-cCredit [可为小数]：</td>
                <td><input type="text" name="cCredit" /></td>
            </tr>
            <tr>
                <td>教师号-tId [4位 数字]：</td>
                <td><input type="text" name="tId" /></td>
            </tr>
            <tr>
                <td>教师名-tName：</td>
                <td><input type="text" name="tName" /></td>
            </tr>
            <tr>
                <td>上课时间-cTime：</td>
                <td><input type="text" name="cTime" /></td>
            </tr>
            <tr>
                <td>上课地点-cLocation：</td>
                <td><input type="text" name="cLocation" /></td>
            </tr>
            <tr>
                <td>课程容量-cSize：</td>
                <td><input type="text" name="cSize" /></td>
            </tr>
            <tr>
                <td>已选课人数-cNumber：</td>
                <td><input type="text" name="cNumber" /></td>
            </tr>
            <tr>
                <td>校区-cCampus：</td>
                <td><input type="text" name="cCampus" /></td>
            </tr>
            <tr>
                <td>选课限制-cLimit：</td>
                <td><input type="text" name="cLimit" /></td>
            </tr>
            <tr>
                <td>答疑时间-qaTime：</td>
                <td><input type="text" name="qaTime" /></td>
            </tr>
            <tr>
                <td>答疑地点-qaLocation：</td>
                <td><input type="text" name="qaLocation" /></td>
            </tr>
            <tr>
                <td>页码-page：</td>
                <td><input type="text" name="page" /></td>
            </tr>
            <tr>
                <td colspan="2" ><input type="submit" value="提交"></td>
            </tr>
        </table>
    </s:form>
  </body>
</html>
