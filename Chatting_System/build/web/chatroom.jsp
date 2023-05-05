<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Chatroom</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/form3.css">
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    </head>
    <body>
        <nav class="navbar">
            <div class="content">
                <img src="pictures/logo.png" alt="chat logo" class="nav-logo">
                <ul class="menu-list">
                    <div class="icon cancel-btn">
                        <img src="pictures/close.png" height="40px" width="40px">
                    </div>
                    <li><a href="user_lists.jsp">USERS</a></li>
                    <li><a href="chatroom.jsp" style="color: blue">CHAT ROOM</a></li>
                    <li><a href="history.jsp">HISTORY</a></li>
                    <li><a>CHANGE UPDATES +</a>
                        <ul>
                            <li><a href="updatepassword.jsp">CHANGE PASSWORD</a></li>
                            <li><a href="changepic.jsp">PROFILE PIC</a></li>
                        </ul>
                    </li>
                    <li><a href="logout.jsp">LOGOUT</a></li>
                </ul>
                <div class="icon menu-btn">
                    <img src="pictures/menu.png" height="40px" width="40px">
                </div>                
            </div>
        </nav>
        <div class="about">
            <div class="container3">
                <section class="chat-area">
                    <header>
                        <%
                            String FROMUSER=(String)session.getAttribute("phoneno");
                            String TOUSER=(String)session.getAttribute("touser");                            
                            
                            Connection con=null;
                            Statement st=null;
                            ResultSet rs=null;
                            
                            Connection con2=null;
                            Statement st2=null;
                            ResultSet rs2=null;

                            String UFIRSTNAME="" ;
                            String ULASTNAME="" ;
                            String USTATUS="" ;
                            String U_PIC="";
                            
                            String MYFIRSTNAME="" ;
                            String MYLASTNAME="" ;
                            String MYSTATUS="" ;
                            String MY_PIC="";

                            try{
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");
                                con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");

                                st=con.createStatement();
                                String query="select * from userreg WHERE phoneno='"+TOUSER+"'";
                                rs=st.executeQuery(query);
                                if(rs.next()){
                                    UFIRSTNAME=rs.getString("firstname");
                                    ULASTNAME=rs.getString("lastname");
                                    USTATUS= rs.getString("status");
                                    U_PIC=rs.getString("images");
                                }
                                st.close();
                                con.close();
                                rs.close();
                            }
                            catch(Exception exp){
                                out.print("error in dsn :  "+exp.getMessage());
                            }
                            

                            
                            try{
                                st2=con2.createStatement();
                                String query2="select * from userreg WHERE phoneno='"+FROMUSER+"'";
                                rs2=st2.executeQuery(query2);
                                if(rs2.next()){
                                    MYFIRSTNAME=rs2.getString("firstname");
                                    MYLASTNAME=rs2.getString("lastname");
                                    MYSTATUS= rs2.getString("status");
                                    MY_PIC=rs2.getString("images");
                                }
                                st2.close();
                                con2.close();
                                rs2.close();
                            }
                            catch(Exception exp){
                                out.print("error in dsn :  "+exp.getMessage());
                            }
                                
                        %>
                        <a href="user_lists.jsp" class="back-icon"><img src="pictures/arrow-back.png" alt=""></a>
                        <img src="profile_picture/<%=U_PIC%>" alt="">
                        <div class="details">
                            <span><%=UFIRSTNAME%> <%=ULASTNAME%></span>
                            <p><%=USTATUS%></p>
                        </div>
                    </header>
                    <div class="chat-box">

                        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/chat_system" user="root" password="1234" var="fetch"></sql:setDataSource>
                        <sql:query dataSource="${fetch}" var="rs">select * from ocs${MYPHONENO} where fromuser=${MYPHONENO} and touser=${UPH_NO} or fromuser=${UPH_NO} and touser=${MYPHONENO} order by chatid;</sql:query>
                        
                        <c:forEach var="MESSAGE" items="${rs.rows}">
                            <c:set scope="application" var="CHATS" value="${MESSAGE.message}"></c:set>
                            <c:set scope="application" var="SENDER" value="${MESSAGE.fromuser}"></c:set>
                            <c:set scope="application" var="RECEIVER" value="${MESSAGE.touser}"></c:set>
                            
                            <c:if test="${SENDER eq MYPHONENO}">
                                <div class="chat outgoing">
                                    <div class="details">
                                        <p>${CHATS}</p>
                                    </div>
                                    <img src="profile_picture/<%=MY_PIC%>" alt="">
                                </div>
                            </c:if>
                            <c:if test="${RECEIVER eq MYPHONENO}">
                                <div class="chat incoming">
                                    <img src="profile_picture/<%=U_PIC%>" alt="">
                                    <div class="details">
                                        <p>${CHATS}</p>
                                    </div>
                                </div>
                            </c:if>
                        </c:forEach>

                    </div>
                    <form action="chatroom_con.jsp" class="typing-area">
                        <input type="text" placeholder="Type a message here..." name="sendmessage" required>
                        
                        <input type="hidden" value="<%=FROMUSER%>" name="fromuser">
                        <input type="hidden" value="<%=TOUSER%>" name="touser">
                        <input type="hidden" value="<%= (new java.util.Date()).toLocaleString()%>" name="chat_date">
                        <button><img src="pictures/send.png" alt=""></button>
                    </form>
                </section>
            </div>
        </div>
        <script>
            // Scroll to the bottom of the chat-box
            var chat_box = document.querySelector(".chat-box");
            chat_box.scrollTop = chat_box.scrollHeight;
            
            //Toggle Navbar
            const menu = document.querySelector(".menu-list");
            const menuBtn = document.querySelector(".menu-btn");
            const cancelBtn = document.querySelector(".cancel-btn");

            menuBtn.onclick = ()=>{
                menu.classList.add("active");
                menuBtn.classList.add("hide");
            };
            cancelBtn.onclick = ()=>{
                menu.classList.remove("active");
                menuBtn.classList.remove("hide");
            };

            //Sticky Navbar
            window.onscroll = function(){myFunction()};
            var navbar_header = document.querySelector(".navbar");
            var stk = navbar_header.offsetTop;

            function myFunction(){
                if(window.pageYOffset > stk){
                    navbar_header.classList.add("sticky");
                }
                else{
                    navbar_header.classList.remove("sticky");
                }
            }
        </script>
    </body>
</html>