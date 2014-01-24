<%--
  Created by IntelliJ IDEA.
  User: aleksandrs
  Date: 1/7/14
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>CSC Telecom inventory management tool</title>
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=10">
    <link rel="stylesheet" href="/resources/css/bootstrap.css" type="text/css" />
    <link rel="stylesheet" href="/resources/css/jquery-ui-1.10.3.custom.css" type="text/css" />
    <style type="text/css">
        html, body{margin:0;padding:0;background-color: #F7F7F6;}
        a.brand: {color:#880000 !important;}
        .ui-datepicker {
            width: 250px;
            font-size:12px;
        }
        .login{padding-top: 65px;}
        .center{float: none; margin-left: auto; margin-right: auto;}
    </style>
    <script type="text/javascript" src="/resources/js/jquery.js"></script>
    <script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.min.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#date").datepicker({
                changeMonth: true,
                changeYear: true,
                firstDay: 1,
                autoSize: false
            });});

    </script>
</head>
<body>
<!--// NAV bar //-->
<div class="navbar" style="top:0px;left:0px;">
    <div class="navbar-inner">
        <a class="brand" href="?a=">CSC Telecom</a>
        <ul class="nav pull-right">
            <li class="right"><a href="#forgot" data-toggle="modal"><span class="icon-user"></span> Forgot password</a></li>
            <li class="divider-vertical"></li>
            <li class="right"><a href="#signIn" data-toggle="modal"><span class="icon-pencil"></span> Sign In</a></li>
            <li class="divider-vertical"></li>
            <li class="right"><a href="#contact" data-toggle="modal"><span class="icon-envelope"></span> Contact admin</a></li>
        </ul>
    </div>
</div>
<!--// NAV bar END //-->
<!--// Container //-->
<section>
    <div class="container login">
        <div class="row">
            <div class="center span4 well">
                <legend>Please Sign In</legend>
                <div class="alert alert-error">
                    <a class="close" data-dismiss="alert" href="#">×</a>Incorrect Username or Password!
                </div>
                <form method="POST" action="" accept-charset="UTF-8">
                    <input type="text" id="username" class="span4" name="username" placeholder="Username" />
                    <input type="password" id="password" class="span4" name="password" placeholder="Password" />
                    <label class="checkbox">
                        <input type="checkbox" name="remember" value="1" /> Private computer
                    </label>
                    <button type="submit" name="submit" class="btn btn-primary btn-block">Sign in</button>
                </form>
            </div>
        </div>
    </div>
    <p class="text-center muted ">&copy; Copyright 2013 - CSC Inventory management tool</p>
</section>
<!--// END Container //-->
<!-- Forgot Password Modal Box -->
<div id="forgot" class="modal hide fade in" style="display: none; ">
    <div class="modal-header">
        <a class="close" data-dismiss="modal">×</a>
        <h3>Forgot Password</h3>
    </div>
    <div class="modal-body">
        <p>Enter your username to reset the password</p>
        <form>
            <div class="controls controls-row">
                <input id="name" name="name" type="text" class="span3" placeholder="Name" />
            </div>
        </form>
    </div>
    <div class="modal-footer">
        <a href="#" class="btn btn-primary">Submit</a>
        <a href="#" class="btn" data-dismiss="modal">Close</a>
    </div>
</div>
<!-- END Forgot Password Model Box -->
<!-- Forgot Password Modal Box -->
<div id="signIn" class="modal hide fade in" style="display: none; ">
    <div class="modal-header">
        <a class="close" data-dismiss="modal">×</a>
        <h3>Make request for access</h3>
    </div>
    <div class="modal-body">
        <p>Please enter valid information</p>
        <form>
            <div class="controls controls-row">
                <input id="name" name="name" type="text" class="span3" placeholder="Name" />
            </div>
            <div class="controls controls-row">
                <input id="surname" name="surname" type="text" class="span3" placeholder="Surname" />
            </div>
            <div class="controls controls-row">
                <input id="email" name="email" type="email" class="span3" placeholder="Email address" />
            </div>
            <div class="controls controls-row">
                <select id="company" name="company" class="span3">
                    <option value="1">CSC Telecom SIA (Latvia)</option>
                    <option value="2">RTN SIA (Latvia)</option>
                    <option value="3">Travel SIM OU (Estonia)</option>
                    <option value="4">CSC Telecom OU (Estonia)</option>
                    <option value="5">CSC Telecom UAB (Lithuania)</option>
                </select>
            </div>
        </form>
    </div>
    <div class="modal-footer">
        <a href="#" class="btn btn-primary">Submit</a>
        <a href="#" class="btn" data-dismiss="modal">Close</a>
    </div>
</div>
<!-- END Forgot Password Model Box -->
<!-- Contact Us Model Box -->
<div id="contact" class="modal hide fade in" style="display: none; ">
    <div class="modal-header">
        <a class="close" data-dismiss="modal">×</a>
        <h3>Contact Us</h3>
    </div>
    <div class="modal-body">
        <form>
            <div class="controls controls-row">
                <input id="name" name="name" type="text" class="span3" placeholder="Name" />
            </div>
            <div class="controls controls-row">
                <input id="email" name="email" type="email" class="span3" placeholder="Email address" />
            </div>
            <div class="controls">
                <textarea id="message" name="message" class="span5" placeholder="Your Message" rows="5"></textarea>
            </div>
        </form>
    </div>
    <div class="modal-footer">
        <a href="#" class="btn btn-primary">Submit</a>
        <a href="#" class="btn" data-dismiss="modal">Close</a>
    </div>
</div>
<!-- END Contact Us Model Box -->
</body>
</html>