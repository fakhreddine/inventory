<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="navbar" style="top:0px;left:0px;">
    <div class="navbar-inner">
        <a class="brand" href="/">CSC Telecom</a>
        <ul class="nav">
            <li class="<c:if test="${act == 'devices'}">active</c:if> dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Devices <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-submenu">
                        <a tabindex="-1" href="#">PC</a>
                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="/app/pc/list">List / Find</a></li>
                            <li><a tabindex="-1" href="/app/pc/add">Add new</a></li>
                        </ul>
                    </li>
                    <li class="dropdown-submenu">
                        <a tabindex="-1" href="#">Monitors and TV</a>
                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">List / Find</a></li>
                            <li><a tabindex="-1" href="#">Add new</a></li>
                        </ul>
                    </li>
                    <li class="dropdown-submenu">
                        <a tabindex="-1" href="#">Printers and faxes</a>
                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">List / Find</a></li>
                            <li><a tabindex="-1" href="#">Add new</a></li>
                        </ul>
                    </li>
                    <li class="divider"></li>
                    <li class="dropdown-submenu">
                        <a tabindex="-1" href="#">Other</a>
                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">List / Find</a></li>
                            <li><a tabindex="-1" href="#">Add new</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Servers and Enterprise <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a tabindex="-1" href="#">List / Find</a></li>
                    <li><a tabindex="-1" href="#">Add new</a></li>
                </ul>
            </li>
            <li class="<c:if test="${act == 'vlans'}">active</c:if> dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">VLANs <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a tabindex="-1" href="/app/vlan/list">List / Find</a></li>
                    <li><a tabindex="-1" href="/app/vlan/add">Add new</a></li>
                </ul>
            </li>
            <li><a href="#">Waranty <span class="badge">0</span></a></li>
            <li><a href="#">Companies</a></li>
            <li><a href="#">Users</a></li>
        </ul>
        <ul class="nav pull-right">
            <li class="right">${pageContext.request.remoteUser}</li></li>
            <li class="right"><a href="<c:url value="/j_spring_security_logout"/>">Sign out</a></li>
        </ul>
    </div>
</div>