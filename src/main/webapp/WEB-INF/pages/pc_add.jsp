<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: aleksandrs
  Date: 12/28/13
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section>
    <div class="container">
        <h4>Add new PC or Laptop</h4>
        <div class="form">
            <form:form method="post" action="/app/pc/add" class="form-horizontal" commandName="pc">
                <form:hidden path="id"/>
                <div class="control-group">
                    <label class="control-label" for="number">PC Number</label>
                    <div class="controls">
                        <form:input id="number" placeholder="Number" path="number"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="cpu">CPU</label>
                    <div class="controls">
                        <form:input id="cpu" placeholder="CPU" path="cpu"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="ram">RAM (Gb)</label>
                    <div class="controls">
                        <form:input id="ram" placeholder="RAM" path="ram"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="hdd">HDD size (Gb)</label>
                    <div class="controls">
                        <form:input id="hdd" placeholder="HDD size" path="hdd"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="os">OS</label>
                    <div class="controls">
                        <form:select id="os" path="os">
                            <c:forEach items="<%=com.springapp.mvc.entities.OpSystem.values()%>" var="value">
                                <option value="${value}">${value}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="office">Office</label>
                    <div class="controls">
                        <form:input id="office" placeholder="Office version" path="office"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="user">User</label>
                    <div class="controls">
                        <form:input id="user" placeholder="User" path="user"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="datetimepicker1">Buy date</label>
                    <div class="controls">
                        <%--<div class="well">--%>
                            <div id="datetimepicker1" class="input-append date">
                                <form:input data-format="yyyy-MM-dd" path="buyDate"/>
                                <span class="add-on">
                                  <i data-time-icon="icon-time" data-date-icon="icon-calendar">
                                  </i>
                                </span>
                            </div>
                        <%--</div>--%>
                        <script type="text/javascript">
                            $(function() {
                                $('#datetimepicker1').datetimepicker({
                                    pickTime: false
                                });
                            });
                        </script>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="other">Other info</label>
                    <div class="controls">
                        <form:textarea path="other" placeholder="Other info" id="other" rows="3"/>
                        <%--<form:input id="other" placeholder="Other info" path="other"/>--%>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <form:button type="submit" class="btn">Save</form:button>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</section>