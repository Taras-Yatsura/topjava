<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
hr      - horizontal line
footer  - bootom of page (copirights, etc)
--%>
<%--https://getbootstrap.com/docs/4.0/examples/sticky-footer/--%>
<footer class="footer">
    <div class="container">
        <span class="text-muted"><spring:message code="app.footer"/></span>
    </div>
</footer>