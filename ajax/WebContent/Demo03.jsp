<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<script type="text/javascript">

	function ajaxFunction() {
		var xmlHttp;
		try { // Firefox, Opera 8.0+, Safari
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			try {// Internet Explorer
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
				}
			}
		}
		return xmlHttp;
	}
	function checkUserName() {
		//获取输入框的值
		var name = document.getElementById("name").value;
		
		//1.创建对象
		var request = ajaxFunction();
		//2.发送请求
		request.open("POST", "/ajax/CheckUserNameServlet", true);
		
		//如果使用的是post方式带数据,那么要添加头,说明提交的数据类型是一个经过url编码的form表单数据
		request.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		
		request.send("name="+name);
		
		//注册状态改变监听,获取服务器传过来的数据(接收响应)
		request.onreadystatechange = function() {
			if(request.readyState == 4 && request.status == 200) {
				//alert(request.responseText);
				var data = request.responseText;
				if(data == 1) {
					//alert("用户名已存在");
					document.getElementById("span01").innerHTML = "<font color = 'red'>用户名已存在!</font>";
				}else {
					//alert("用户名可用");
					document.getElementById("span01").innerHTML = "<font color = 'green'>用户名可用!</font>";
				}
			}
		}	
	}
</script>
</head>
<body>
	<table border="1" width="500px">
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="name" id="name" onblur = "checkUserName()"><span id="span01"></span></td>
		</tr>

		<tr>
			<td>密码:</td>
			<td><input type="password" name=""></td>
		</tr>

		<tr>
			<td>邮箱:</td>
			<td><input type="text" name=""></td>
		</tr>
		
		<tr>
			<td>简介:</td>
			<td><input type="text" name=""></td>
		</tr>

		<tr>
			<td colspan="2"><input type="submit" value="注册"></td>
		</tr>

	</table>

</body>
</html>