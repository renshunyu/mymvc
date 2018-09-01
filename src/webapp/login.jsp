<%--
  Created by IntelliJ IDEA.
  User: rensy
  Date: 2018/8/31
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/get/1" method="get">
    <input type="submit" value="get">
</form><br>
<form action="/post" method="post">
    <input type="submit" value="post">
</form><br>
<form action="/put" method="post" >
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="put" >
</form><br>
<form action="/delete/1" method="post" >
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="delete" >
</form><br>

<form action="/body" method="get">
    id:<input type="text" name="id"><br>
    name:<input type="text" name="name"><br>
    <input type="submit" value="提交">
</form>

<form action="/body1" method="post">
    id:<input type="text" name="id"><br>
    name:<input type="text" name="name"><br>
    <input type="submit" value="对象">
</form>

<form action="/body2" method="post">
    id:<input type="text" name="id"><br>
    name:<input type="text" name="name"><br>
    city:<input type="text" name="address.city">
    street:<input type="text" name="address.street">
    <input type="submit" value="对象">
</form>

<form action="/header" method="get">
    <input type="submit" value="会话">
</form>

<form action="/cookie" method="get">
    <input type="submit" value="对象">
</form>
<form action="/servlet" method="get">
    <input type="submit" value="servlet">
</form>
<form action="/modelAndView" method="get">
    <input type="submit" value="modelAndView">
</form>
<a href="/map">map</a>
<a href="/model">model</a>
<a href="/modelmap">modelmap</a>
<a href="/lang">国际化</a>
<a href="/lang2">配置文件配置映射测试</a>

<form action="/SessionAttributes" method="post">
    id:<input type="text" name="id"><br>
    name:<input type="text" name="name"><br>
    city:<input type="text" name="address.city">
    street:<input type="text" name="address.street">
    <input type="submit" value="SessionAttributes">
</form>

<form action="/modelattribute" method="post">
    id:<input type="text" name="id">
    name:<input type="text" name="name">
    <input type="submit" value="modelattributes">
</form>
<form action="/modelattribute1" method="post">
    id:<input type="text" name="id">
    name:<input type="text" name="name">
    <input type="submit" value="modelattributes1">
</form>

</body>
</html>
