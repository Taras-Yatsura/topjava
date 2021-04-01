<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<header>
    <%--
    <a href="meals"><fmt:message key="app.title"/></a> | <a href="users"><fmt:message key="user.title"/></a> | <a
        href="index.jsp"><fmt:message key="app.home"/></a>
    --%>
    <%--<a href="meals"><fmt:message key="app.title"/></a> | <a href="users"><fmt:message key="user.title"/></a> | <a
        href="${pageContext.request.contextPath}"><fmt:message key="app.home"/></a>--%>
    <a href="meals"><spring:message code="app.title"/></a> | <a href="users"><spring:message code="user.title"/></a> |
    <a href="index"><spring:message code="app.home"/></a>
</header>