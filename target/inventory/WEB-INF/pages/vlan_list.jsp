<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aleksandrs
  Date: 1/3/14
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section>
    <div class="container">
        <%--<div class="form">--%>
        <form class="form" method="post" action="/app/vlan/list">
            <div class="input-append">
                <input class="span10" id="appendedInputButtons" type="text" placeholder="Search" name="search" value="<%=com.springapp.mvc.controllers.AppController.getSearchCriteria()%>">
                <button class="btn" type="submit">Search</button>
                <button class="btn" type="button" onclick="window.location='/app/vlan/list/all';">Reset</button>
            </div>
        </form>
        <%--</div>--%>
    </div>
</section>
<section>
    <div class="container" style="min-width: 1000px;">
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <td width="35" align="center">#</td>
                <td>VLAN ID</td>
                <td>A address</td>
                <td>A device</td>
                <td>B address</td>
                <td>B device</td>
                <td>Description</td>
                <td>Status</td>
                <td>&nbsp;</td>
            </tr>
            </thead>
            <tbody>
            <c:choose>
                <c:when test="${list.size()>0}">
                    <c:forEach var="obj" items="${list}" varStatus="counter">
                        <tr>
                            <td width="35" align="center">${counter.count}</td>
                            <td>${obj.vlan}</td>
                            <td>${obj.a_address}</td>
                            <td>${obj.a_device}</td>
                            <td>${obj.b_address}</td>
                            <td>${obj.b_device}</td>
                            <td>${obj.descr}</td>
                            <td>${obj.active}</td>
                            <td><a href="/app/vlan/edit/${obj.id}"><span class="icon-edit"></span> edit</a></td>
                        </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr><td colspan="9" align="center">No records found!</td></tr>
                </c:otherwise>
            </c:choose>
            </tbody>
        </table>
        <br />
        <%--<div class="pagination">--%>
        <%--<ul>--%>
        <%--<li><a href="#">Prev</a></li>--%>
        <%--<li><a href="#">1</a></li>--%>
        <%--<li><a href="#">2</a></li>--%>
        <%--<li><a href="#">3</a></li>--%>
        <%--<li><a href="#">4</a></li>--%>
        <%--<li><a href="#">5</a></li>--%>
        <%--<li><a href="#">Next</a></li>--%>
        <%--</ul>--%>
        <%--</div>--%>
    </div>
</section>