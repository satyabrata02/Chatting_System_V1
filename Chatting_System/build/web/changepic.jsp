<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Update Picture</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/form.css">
        <script>
            function validation(){
                var file2 = document.getElementById('file').value;
                if(file2 == ""){
                    alert("Image not selected");
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
                            <li><a href="updatepassword.jsp">CHANGE PASSWORD</a></li>
                            <li><a href="changepic.jsp" style="color: blue">PROFILE PIC</a></li>
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
            <div class="container5">
                <header>Profile Pic</header>
                <form method="post" action="changepic_con.jsp" onsubmit="return validation()" enctype="multipart/form-data">
                    <%
                        String PHONENO=(String)session.getAttribute("phoneno");
                        String MY_PIC="";
                            
                        Connection con=null;
                        Statement st=null;
                        ResultSet rs=null;
                        
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","root");
                            
                            st=con.createStatement();
                            String query="select * from userreg WHERE phoneno='"+PHONENO+"'";
                            rs=st.executeQuery(query);
                            if(rs.next()){
                                MY_PIC=rs.getString("images");
                                
                            }
                            st.close();
                            con.close();
                        }
                        catch(Exception exp){
                            out.print("error in dsn :  "+exp.getMessage());
                        }    
                    %>
                    <div class="user-img">
                        <img src="profile_picture/<%=MY_PIC%>" id="photo">
                        <input type="file" id="file" name="name" accept="image/*">
                        <label for="file" id="uploadbtn"><img src="pictures/camera.png"></label>
                    </div>
                    <div class="cbutton">
                        <input type="submit" value="UPDATE">
                    </div>
                </form>
            </div>
        </div>
        <script>
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
            
            //Profile picture
            
            const imgDiv = document.querySelector('.user-img');
            const img = document.querySelector('#photo');
            const file = document.querySelector('#file');
            const uploadbtn = document.querySelector('#uploadbtn');
            
            file.addEventListener('change', function(){
                const chosedfile = this.files[0];
                if(chosedfile){
                    const reader = new FileReader();
                    
                    reader.addEventListener('load', function(){
                        img.setAttribute('src', reader.result);
                    });
                    reader.readAsDataURL (chosedfile);
                }
            });
        </script>
    </body>
</html>