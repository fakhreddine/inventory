<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp"%>
    <c:choose>
    <c:when test="${include!=null}">
        <jsp:include page="${include}.jsp"/>
    </c:when>
    <c:otherwise>
        No selected templates!
    </c:otherwise>
    </c:choose>
<%@include file="footer.jsp"%>