<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Recovery Password</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/form2.css">
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    </head>
    <body>
        <nav class="navbar">
            <div class="content">
                <a href="index.jsp"><img src="pictures/logo.png" alt="chat logo" class="nav-logo"></a>
                <ul class="menu-list">
                    <div class="icon cancel-btn">
                        <img src="pictures/close.png" height="40px" width="40px">
                    </div>
                    <li><a href="index.jsp">HOME</a></li>
                    <li><a href="login.jsp">LOGIN</a></li>
                    <li><a href="registration.jsp">REGISTRATION</a></li>
                    <li><a href="recovery.jsp" style="color: blue">RECOVERY</a></li>
                    <li><a href="about.jsp">ABOUT</a></li>
                </ul>
                <div class="icon menu-btn">
                    <img src="pictures/menu.png" height="40px" width="40px">
                </div>                
            </div>
        </nav>
        
        <div class="about">
            <div class="container2">
                <div class="title">Recovery Form</div>
                <form method="post" action="recovery_con.jsp">
                    <div class="user-details">
                        <div class="input-box2">
                            <input type="text" name="phone_email" autocomplete="off" required>
                            <label>Email or Phone no.</label>
                        </div>
                        <div class="select-menu2">
                            <input type="radio" name="secure_question" id="ops-1" value="what is your nick name ?">
                            <input type="radio" name="secure_question" id="ops-2" value="what is your pet name ?">
                            <input type="radio" name="secure_question" id="ops-3" value="what is your first school name ?">
                            <input type="radio" name="secure_question" id="ops-4" value="Who was your childhood hero ?">
                            <input type="radio" name="secure_question" id="ops-5" value="what is your favorite subject ?">
                            <div class="select">
                                <span>Select your option</span>
                                <img src="pictures/chevron-down.png" class="chevron-down" height="20px" width="20px">
                                <img src="pictures/chevron-up.png" class="chevron-up" height="20px" width="20px">
                            </div>
                            <div class="options-list2"><br>
                                <label class="option" for="ops-1">what is your nick name ?</label><br>
                                <label class="option" for="ops-2">what is your pet name ?</label><br>
                                <label class="option" for="ops-3">what is your first school name ?</label><br>
                                <label class="option" for="ops-4">Who was your childhood hero ?</label><br>
                                <label class="option" for="ops-5">what is your favorite subject ?</label>
                            </div>
                        </div>
                        <div class="input-box2">
                            <input class="pswrd2" type="password" name="answer" required>
                            <label>Answer</label>
                            <span class="show2">SHOW</span>                            
                        </div>
                    </div>
                    <div class="button">
                        <input type="submit" value="Find">
                    </div>
                </form>
                <h2>
                    <%
                        String message = (String) request.getAttribute("msg");
                        if(message != null)
                        {
                            //out.println(" "+message);
                            out.println("<SCRIPT LANGUAGE='JavaScript'>alert('Check below 👇')</SCRIPT>");
                        }
                        else
                        {
                            
                        }
                        
                        String message1 = (String) request.getAttribute("msg1");
                        if(message1 != null)
                        {
                            //out.println(" "+message);
                            out.println("<SCRIPT LANGUAGE='JavaScript'>alert('Invalid Data')</SCRIPT>");
                        }
                        else
                        {
                            
                        }
                        
                        
                        Connection con=null;
                        Statement st=null;
                        ResultSet rs=null;
                        
                        String PHONENO_EMAILID = (String) request.getAttribute("phone_email");
                        String QUESTION = (String) request.getAttribute("secure_question");
                        String ANSWER = (String) request.getAttribute("answer");
                        
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","root");
                        }
                        catch(Exception exp){
                            out.print("error in dsn :  "+exp.getMessage());
                        }
                        try{
                            st=con.createStatement();
                            String query="select * from userreg where phoneno='"+PHONENO_EMAILID+"' or emailid='"+PHONENO_EMAILID+"' and secure_question='"+QUESTION+"' and answer='"+ANSWER+"' ";
                            rs=st.executeQuery(query);
                            if(rs.next()){
                                String s1=rs.getString("password");                          
                                out.println("Your Password is "+s1+" ");       
                            }
                            else{

                            }

                        }
                        catch(Exception exp)
                        {
                            out.print("error in checking"+exp.getMessage());
                        }
                    %>
                </h2><br>
            </div>
        </div>
        <script src="js/index2.js"></script>
    </body>
</html>