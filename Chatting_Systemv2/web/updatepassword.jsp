<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Change Password</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/form.css">
        <script>
            function validation(){
                var password = document.getElementById('password').value;
                var cpassword = document.getElementById('cpassword').value;

                if(password.length<8){
                    document.getElementById("error").innerHTML = "Password must be 8 to 15 characters";
                    return false;
                }
                if(password.length>=15){
                    document.getElementById("error").innerHTML = "Password must be 8 to 15 characters";
                    return false;
                }
                if(password!=cpassword){
                    alert("Password and Conform password not match");
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <nav class="navbar">
            <div class="content">
                <a href="user_lists.jsp"><img src="pictures/logo.png" alt="chat logo" class="nav-logo"></a>
                <ul class="menu-list">
                    <div class="icon cancel-btn">
                        <img src="pictures/close.png" height="40px" width="40px">
                    </div>
                    <li><a href="user_lists.jsp">USERS</a></li>
                    <li><a href="history.jsp">HISTORY</a></li>
                    <li><a style="color: blue">CHANGE UPDATES +</a>
                        <ul>
                            <li><a href="updatepassword.jsp" style="color: blue">CHANGE PASSWORD</a></li>
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
            <div class="container">
                <header>Update Password</header>
                <form method="post" action="updatepassword_con.jsp" onsubmit="return validation()">
                    <%
                        String PHONENO=(String)session.getAttribute("phoneno");
                    %>
                    <div class="input-field">
                        <h2><%=PHONENO%></h2>
                    </div>
                    <div class="input-field">
                        <input class="pswrd" type="password" id="password" name="password" maxlength="12" required>
                        <span class="show">SHOW</span>
                        <label>Password</label>
                        <span id="error" class="error"></span>
                    </div>
                    <div class="input-field">
                        <input class="pswrd2" type="password" id="cpassword" name="cpassword" maxlength="12" required>
                        <span class="show2">SHOW</span>
                        <label>Conform Password</label>
                        <span id="error1" class="error"></span>
                    </div>
                    <div class="button">
                        <div class="inner"></div>
                        <button>UPDATE</button>
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