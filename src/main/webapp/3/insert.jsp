<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,entity.Language"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/insert" method="post">
		<input type="text" name="title" value="jason"></input> 
		<input type="text" name="description" value="good"></input>  
			<select
			name="language">
			<%
			    List l=(ArrayList)request.getAttribute("languages");
			    for(int i=0;i<l.size();i++)
			    {
			    	Language lan=(Language)l.get(i);
			     out.print(" <option  value ='"+lan.getLanguage_id()+"'>"+lan.getName()+"</option></br>");
			    }
			%>
		</select>
      <input type="submit" value="插入"/>
	</form>
</body>
</html>