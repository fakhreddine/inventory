<%@ page import="com.springapp.mvc.InitApp.Features" %>
<%--
  Created by IntelliJ IDEA.
  User: aleksandrs
  Date: 12/27/13
  Time: 12:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>CSC Telecom inventory management tool v.: <%=Features.CURRENT_VERSION%></title>
    <meta content="text/html" charset="UTF-8" lang="en"/>
    <meta http-equiv="X-UA-Compatible" content="IE=10">
    <link rel="stylesheet" href="/resources/css/bootstrap.css" type="text/css" />
    <link rel="stylesheet" href="/resources/css/bootstrap-datetimepicker.min.css" type="text/css" />
    <link rel="stylesheet" href="/resources/css/jquery-ui-1.10.3.custom.css" type="text/css" />
    <link rel="stylesheet" href="/resources/css/style.css" media="all">
    <script type="text/javascript" src="/resources/js/jquery.js"></script>
    <script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.min.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript">
        $(function(){$("#date").datepicker({
            changeMonth: true,
            changeYear: true,
            firstDay: 1,
            autoSize: false
        });});
    </script>
</head>
<body>
<%@include file="top.jsp"%>