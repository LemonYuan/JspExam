<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,entity.Film"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
        <form action="<%=request.getContextPath() %>/GetAllFilmsServlet" method="post">
                <input type="submit" value="显示所有电影"></input>
        </form>
        <%
        ArrayList list=(ArrayList)request.getAttribute("films");
        if(list!=null)
        {
          for(int i=0;i<list.size();i++) {  
        	  Film film=(Film)list.get(i);
        	  out.print("id："+film.getFilm_id()+"名称: "+film.getTitle()+"简介："+film.getDescription()+"语言："+film.getLanguage()+"</br></br>");
          }
        }
        %>
        	  
        	  
          
</body>
</html>