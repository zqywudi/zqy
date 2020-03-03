<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="entity.Student"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <table>
			<tr>
				<th>学生姓名</th>
				<th>年龄</th>
			</tr>
			<%
				// 获得保存在作用域中的数据
				List<Student> list = (List<Student>)request.getAttribute("list");
				// 判断这个集合是否有数据
				if(list != null){
					// 将list中的数据展示到页面上
					for(Student s : list){
						%>
						<tr>
							<td><%=s.getId() %></td>
							<td><%=s.getAge() %></td>
						</tr>
						<%
					}
				}//你是小天才
			%>
			
		</table>
		
</body>
</html>