<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://topjava.javawebinar.ru/functions" %>
<html>
<jsp:include page="fragments/headTag.jsp"/>
<body>
<jsp:include page="fragments/bodyHeader.jsp"/>

<section>
    <h3><spring:message code="meal.title"/></h3>

    <form method="get" action="meals/filter">
        <dl>
            <dt><spring:message code="meal.startDate"/>:</dt>
            <dd><label><input type="date" name="startDate" value="${param.startDate}"></label></dd>
        </dl>
        <dl>
            <dt><spring:message code="meal.endDate"/>:</dt>
            <dd><label><input type="date" name="endDate" value="${param.endDate}"></label></dd>
        </dl>
        <dl>
            <dt><spring:message code="meal.startTime"/>:</dt>
            <dd><label><input type="time" name="startTime" value="${param.startTime}"></label></dd>
        </dl>
        <dl>
            <dt><spring:message code="meal.endTime"/>:</dt>
            <dd><label><input type="time" name="endTime" value="${param.endTime}"></label></dd>
        </dl>
        <button type="submit"><spring:message code="meal.filter"/></button>
    </form>
    <hr>
    <a href="meals/create"><spring:message code="meal.add"/></a>
    <hr>
    <table>
        <thead>
        <tr>
            <th><spring:message code="meal.dateTime"/></th>
            <th><spring:message code="meal.description"/></th>
            <th><spring:message code="meal.calories"/></th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <%--@elvariable id="meals" type="java.util.List"--%>
        <c:forEach items="${meals}" var="meal">
            <jsp:useBean id="meal" scope="page" type="ru.javawebinar.topjava.to.MealTo"/>
            <tr data-mealExcess="${meal.excess}">
                <td>
                        <%--${meal.dateTime.toLocalDate()} ${meal.dateTime.toLocalTime()}--%>
                        <%--<%=TimeUtil.toString(meal.getDateTime())%>--%>
                        <%--${fn:replace(meal.dateTime, 'T', ' ')}--%>
                        ${fn:formatDateTime(meal.dateTime)}
                </td>
                <td>${meal.description}</td>
                <td>${meal.calories}</td>
                <td><a href="meals/update?id=${meal.id}"><spring:message code="common.update"/></a></td>
                <td><a href="meals/delete?id=${meal.id}"><spring:message code="common.delete"/></a></td>
            </tr>
        </c:forEach>
    </table>
</section>
<jsp:include page="fragments/footer.jsp"/>
</body>
</html>