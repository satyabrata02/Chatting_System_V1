<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/form2.css">
        <script src="js/validation.js"></script>
    </head>
    <body>
        <nav class="navbar">
            <div class="content">
                <img src="pictures/logo.png" alt="chat logo" class="nav-logo">
                <ul class="menu-list">
                    <div class="icon cancel-btn">
                        <img src="pictures/close.png" height="40px" width="40px">
                    </div>
                    <li><a href="index.jsp">HOME</a></li>
                    <li><a href="login.jsp">LOGIN</a></li>
                    <li><a href="registration.jsp" style="color: blue">REGISTRATION</a></li>
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
                <div class="title">Registration Form</div>
                <form method="post" action="registration_con.jsp">
                    <div class="user-details">
                        <div class="input-box">
                            <input type="text" name="firstname" id="firstname" maxlength="25" autocomplete="off" required>
                            <label>First Name</label>
                            <span id="error" class="error"></span>
                        </div>
                        <div class="input-box">
                            <input type="text" name="lastname" id="lastname" maxlength="25" autocomplete="off" required>
                            <label>Last Name</label>
                            <span id="error2" class="error"></span>
                        </div>
                        <div class="input-box">
                            <input type="text" name="phoneno" maxlength="10" onKeyPress="return numbersonly(event)" autocomplete="off" id="phoneno" pattern="[1-9]{1}[0-9]{9}" required>
                            <label>Phone no</label>
                            <span id="error3" class="error"></span>
                        </div>
                        <div class="input-box">
                            <input type="text" name="emailid" id="emailid" maxlength="35" autocomplete="off" required>
                            <label>Email ID</label>
                            <span id="error4" class="error"></span>
                        </div>
                        <div class="input-box">
                            <input class="pswrd" type="password" name="password" maxlength="12" required>
                            <label>Password</label>
                            <span class="show">SHOW</span> 
                            <span id="error5" class="error"></span>
                        </div>
                        <div class="select-menu">
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
                            <div class="options-list"><br>
                                <label class="option" for="ops-1">what is your nick name ?</label><br>
                                <label class="option" for="ops-2">what is your pet name ?</label><br>
                                <label class="option" for="ops-3">what is your first school name ?</label><br>
                                <label class="option" for="ops-4">Who was your childhood hero ?</label><br>
                                <label class="option" for="ops-5">what is your favorite subject ?</label>
                            </div>
                            <span id="error6" class="error"></span>
                        </div>
                        <div class="input-box">
                            <input class="pswrd2" type="password" name="answer" maxlength="25" required>
                            <label>Answer</label>
                            <span class="show2">SHOW</span>  
                            <span id="error7" class="error"></span>
                        </div>
                    </div>
                    <div class="gender-details">
                        <input type="radio" name="gender" id="dot-1" value="male">
                        <input type="radio" name="gender" id="dot-2" value="female">
                        <input type="radio" name="gender" id="dot-3" value="other">
                        <span class="gender-title">Gender</span>
                        <div class="category">
                            <label for="dot-1">
                                <span class="dot one"></span>
                                <span class="gender">Male</span>
                            </label>
                            <label for="dot-2">
                                <span class="dot two"></span>
                                <span class="gender">Female</span>
                            </label>
                            <label for="dot-3">
                                <span class="dot three"></span>
                                <span class="gender">Other</span>
                            </label>
                        </div>
                        <span id="error8" class="error"></span>
                    </div>
                    <div class="button">
                        <input type="submit" value="Register" onclick="validation()">
                    </div>
                </form>
                <h2>
                    <%
                        String message = (String) request.getAttribute("msg");
                        if(message != null)
                        {
                            //out.println(" "+message);
                            out.println("<SCRIPT LANGUAGE='JavaScript'>alert('This phone number has already registred')</SCRIPT>");
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