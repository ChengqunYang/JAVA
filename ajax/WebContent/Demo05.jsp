<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<script type="text/javascript">

	function get() {
		/* $.get(URL,callback);

		必需的 URL 参数规定您希望请求的 URL。
		可选的 callback 参数是请求成功后所执行的函数名。
		 */
		$.get("/ajax/DemoServlet02",{name : "zhangsan",age : 20},function(data, status){
			//alert("结果是:"+data);
			//$("#div01").val();//val用于设置元素里面有values 的属性值
			$("#div01").html(data); //设置或返回所选元素的内容（包括 HTML 标记）
			//$("#div01").text(data);//设置或返回所选元素的文本内容
		});
	}

</script>
<title>Insert title here</title>
</head>
<body>
	<input type="button" onclick="get()" value="使用jquery展示get方法">
	
	<div id = "div01" style="width :100; height: 100px; border: 1px solid blue;"></div>
</body>
</html>