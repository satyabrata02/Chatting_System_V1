<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>History</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/form.css">
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
                    <li><a href="history.jsp" style="color: blue">HISTORY</a></li>
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
            <div class="container4">
                <header>Chat history</header>
                <form method="post" action="history_con.jsp">
                    <div class="contents">
                        <table>
                            <tr>
                                <th width="15%">SENDER</th>
                                <th width="15%">RECEIVER</th>
                                <th width="35%">MESSAGES</th>
                                <th width="25%">DATE & TIME</th>
                            </tr>
                            <%
                                String PHONENO=(String)session.getAttribute("phoneno");
                                
                                Connection con=null;
                                Statement st=null;
                                ResultSet rs=null;
                                
                                String s1="",s2="",s3="",s4="";
                                
                                try{
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");
                                }
                                catch(Exception exp){
                                    out.print("error in dsn :  "+exp.getMessage());
                                }
                                
                                try{
                                    st=con.createStatement();
                                    String query="select * from ocs"+PHONENO+" order by chatid ";
                                    rs=st.executeQuery(query);
                                    while(rs.next()){
                                        s1=rs.getString("fromuser");
                                        s2=rs.getString("touser");  
                                        s3=rs.getString("message");
                                        s4=rs.getString("chat_date");
                                    
                            %>
                            <tr>
                                <td><%=s1%></td>
                                <td><%=s2%></td>
                                <td><%=s3%></td>
                                <td><%=s4%></td>
                            </tr>
                            <%
                                }
                                    st.close();
                                    con.close();
                                }catch(Exception exp){
                                 out.print("error in reading"+exp.getMessage());
                                } 
                            %>
                        </table>
                    </div>
                    
                    <div class="hbutton">
                        <input type="submit" value="CLEAR">
                    </div>
                </form>
                <h2>
                    <%
                        String message = (String) request.getAttribute("msg");
                        if(message != null)
                        {
                            //out.println(" "+message);
                            out.println("<SCRIPT LANGUAGE='JavaScript'>alert('Sucessfully changed your password')</SCRIPT>");
                        }
                        else
                        {
                            
                        }
                    %>
                </h2><br>
            </div>
        </div>
        <script src="js/index.js"></script>
    </body>
</html>