<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<script type="text/javascript">
	function post() {
		/* $.post(URL,data,callback);
		必需的 URL 参数规定您希望请求的 URL。
		可选的 data 参数规定连同请求发送的数据。
		可选的 callback 参数是请求成功后所执行的函数名。
		*/
 		$.post("/ajax/DemoServlet02",{name : "zhangsan",age : 20},function(data,status){
 			//alert("回来数据了:"+data);
 			
 			//1.想要放数据到div里面去
 			$("#div01").html(data);
 		});
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<input type="button" onclick="post()" value="使用jquery展示post方法">
	
	<div id = "div01" style="width :100; height: 100px; border: 1px solid blue;"></div>
</body>
</html>