<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section>
    <div class="container">
        <h4>Add new VLAN</h4>
        <div class="form">
            <form:form method="post" action="/app/vlan/add" class="form-horizontal" commandName="vlan">
                <form:hidden path="id"/>
                <div class="control-group">
                    <label class="control-label" for="number">VLAN ID:</label>
                    <div class="controls">
                        <form:input id="number" placeholder="ID" path="vlan"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="a_device">A point</label>
                    <div class="controls">
                        <form:input id="a_device" placeholder="A device" path="a_device"/>
                        <form:input id="a_address" placeholder="A address" path="a_address"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="b_device">B point</label>
                    <div class="controls">
                        <form:input id="b_device" placeholder="B device" path="b_device"/>
                        <form:input id="b_address" placeholder="B address" path="b_address"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="descr">Description</label>
                    <div class="controls">
                        <form:input id="descr" placeholder="Text here" path="descr"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="comment">Comment</label>
                    <div class="controls">
                        <form:textarea path="comment" placeholder="Other info" id="comment" rows="3"/>
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