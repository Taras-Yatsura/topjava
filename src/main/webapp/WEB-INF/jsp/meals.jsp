<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://topjava.javawebinar.ru/functions" %>
<html>
<head>
    <title>Meals</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<section>
    <h3><a href="index.jsp">Home</a></h3>
    <hr/>
    <h2>Meals</h2>
    <form method="get" action="meals">
        <input type="hidden" name="action" value="filter">
        <dl>
            <dt>From Date (inclusive):</dt>
            <dd><label><input type="date" name="startDate" value="${param.startDate}"></label></dd>
        </dl>
        <dl>
            <dt>To Date (inclusive):</dt>
            <dd><label><input type="date" name="endDate" value="${param.endDate}"></label></dd>
        </dl>
        <dl>
            <dt>From Time (inclusive):</dt>
            <dd><label><input type="time" name="startTime" value="${param.startTime}"></label></dd>
        </dl>
        <dl>
            <dt>To Time (exclusive):</dt>
            <dd><label><input type="time" name="endTime" value="${param.endTime}"></label></dd>
        </dl>
        <button type="submit">Filter</button>
    </form>
    <hr/>
    <a href="meals?action=create">Add Meal</a>
    <br><br>
    <table>
        <thead>
        <tr>
            <th>Date</th>
            <th>Description</th>
            <th>Calories</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <%--@elvariable id="meals" type="java.util.List"--%>
        <c:forEach items="${meals}" var="meal">
            <jsp:useBean id="meal" type="ru.javawebinar.topjava.to.MealTo"/>
            <tr data-mealExcess="${meal.excess}">
                <td>
                        <%--${meal.dateTime.toLocalDate()} ${meal.dateTime.toLocalTime()}--%>
                        <%--<%=TimeUtil.toString(meal.getDateTime())%>--%>
                        <%--${fn:replace(meal.dateTime, 'T', ' ')}--%>
                        ${fn:formatDateTime(meal.dateTime)}
                </td>
                <td>${meal.description}</td>
                <td>${meal.calories}</td>
                <td><a href="meals?action=update&id=${meal.id}">Update</a></td>
                <td><a href="meals?action=delete&id=${meal.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>