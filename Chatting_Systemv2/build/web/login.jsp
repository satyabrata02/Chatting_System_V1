<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/form.css">
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
                    <li><a href="login.jsp" style="color: blue">LOGIN</a></li>
                    <li><a href="registration.jsp">REGISTRATION</a></li>
                    <li><a href="recovery.jsp">RECOVERY</a></li>
                    <li><a href="about.jsp">ABOUT</a></li>
                </ul>
                <div class="icon menu-btn">
                    <img src="pictures/menu.png" height="40px" width="40px">
                </div>
            </div>
        </nav>
        
        <div class="about">            
            <div class="container">
                <header>Login Form</header>
                <form method="post" action="login_con.jsp">
                    <div class="input-field">
                        <input type="text" name="phoneno" autocomplete="off" required>
                        <label>Phone no.</label>
                    </div>
                    <div class="input-field">
                        <input class="pswrd" type="password" name="password" required>
                        <span class="show">SHOW</span>
                        <label>Password</label>
                    </div>
                    <div class="recovery">
                        <a href="recovery.jsp">Forgot Password ?</a>
                    </div>
                    <div class="button">
                        <div class="inner"></div>
                        <button>LOGIN</button>
                    </div>
                </form>
                <div class="signup">
                    Not a member ? <a href="registration.jsp">Signup now</a>
                </div>
                
                <h2>
                    <%
                        String message1 = (String) request.getAttribute("msg1");
                        if(message1 != null)
                        {
                            //out.println(" "+message1);
                            out.println("<SCRIPT LANGUAGE='JavaScript'>alert('You are Sucessfully registred')</SCRIPT>");
                        }
                        else
                        {
                            
                        }
                        

                        String message2 = (String) request.getAttribute("msg2");
                        if(message2 != null)
                        {
                            //out.println(" "+message2);
                            out.println("<SCRIPT LANGUAGE='JavaScript'>alert('Invalid User Id or Password')</SCRIPT>");
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
