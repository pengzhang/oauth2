<%--
 * 
 * @author zp
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h2>spring-oauth is work!</h2>

<p>
    <a href="${contextPath}/logout.do">Logout</a>
</p>

<div>
    操作说明:
   
    
    <p>
    方式1:基于浏览器<br><br>
获取授权码  <br><br>  
http://localhost:8080/oauth/authorize?client_id=mobile-client&redirect_uri=http%3a%2f%2flocalhost%3a8080%2fm%2fdashboard.htm&response_type=code&scope=read
<br><br>
交换授权码来获得访问令牌<br><br>
http://localhost:8080/oauth/token?grant_type=authorization_code&code=t7ol7D&redirect_uri=http%3a%2f%2flocalhost%3a8080%2fm%2fdashboard.htm&client_id=mobile-client&client_secret=mobile
<br><br>
授权请求<br><br>
http://localhost:8080/oauth/authorize?response_type=token&client_id=mobile-client&redirect_uri=http%3a%2f%2flocalhost%3a8080%2fm%2fdashboard.htm&scope=read
<br><br>
<br><br>
方式2:基于客户端<br><br>
http://localhost:8080/oauth/token?client_id=unity-client&client_secret=unity&grant_type=password&scope=read,write&username=admin&password=admin
<br><br>


返回的数据<br><br>
{"access_token":"3420d0e0-ed77-45e1-8370-2b55af0a62e8","token_type":"bearer","refresh_token":"b36f4978-a172-4aa8-af89-60f58abe3ba1","expires_in":43199,"scope":"read write"}
<br><br>

获取access_token后访问资源<br><br>
http://localhost:8080/unity/dashboard.htm?access_token=3420d0e0-ed77-45e1-8370-2b55af0a62e8

    
    </p>
     <ol>
        <li>
            菜单 User 是不需要Oauth 验证即可访问的, <br/>
            但菜单Mobile 需要Oauth 验证后才能访问.
        </li>
        <li>
            若想访问 Mobile, 则先用基于浏览器的测试URL 访问,等验证通过后即可访问.
        </li>
    </ol>
</div>
<br/>
菜单
<ul>
    <li>
        <a href="${contextPath}/user/overview.htm">User</a>
    </li>
    <li>
        <a href="${contextPath}/m/dashboard.htm">Mobile</a>
    </li>
</ul>
</body>
</html>