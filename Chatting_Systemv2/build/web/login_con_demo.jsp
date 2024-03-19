<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login connection</title>
    </head>
    <body>
        <!--value call from login page-->
        <%
            String PHONENO = request.getParameter("phoneno");
        %>
        <c:set scope="page" var="APHONENO" value="${param.phoneno}"></c:set>
        <c:set scope="page" var="APASSWORD" value="${param.password}"></c:set>
        
        <!--Database Connection-->
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/chat_system" user="root" password="1234" var="check"></sql:setDataSource>
        <sql:query dataSource="${check}" var="rs">select * from userreg;</sql:query>
        
        <!--Show details inside the DB-->
        <c:forEach items="${rs.rows}" var="row">
            <c:set var="CPHONENO" value="${row.phoneno}"></c:set>
            <c:set var="CPASSWORD" value="${row.password}"></c:set>
            
            <c:if test="${APHONENO == CPHONENO && APASSWORD == CPASSWORD}">
                <c:set scope="request" var="MYPHONENO" value="${APHONENO}"></c:set>
                <sql:update dataSource="${check}" var="update">update userreg set status='Active now' where phoneno=? <sql:param value="${APHONENO}"></sql:param></sql:update>
                <%
                    String message = "You are Sucessfully logedin";
                    RequestDispatcher rd = request.getRequestDispatcher("user_lists.jsp");
                    session.setAttribute("phoneno",PHONENO);
                    request.setAttribute("msg",message);
                    rd.forward(request, response);
                %>
            </c:if>
                
            <c:if test="${APHONENO != CPHONENO || APASSWORD != CPASSWORD}">
                <%
                    String message2 = "Invalid User Id or Password";
                    RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
                    request.setAttribute("msg2",message2);
                    rd2.forward(request, response);
                %>
            </c:if>
                
        </c:forEach>
    </body>
</html>