<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/form3.css">
    </head>
    <body>
        <nav class="navbar">
            <div class="content">
                <img src="pictures/logo.png" alt="chat logo" class="nav-logo">
                <ul class="menu-list">
                    <div class="icon cancel-btn">
                        <img src="pictures/close.png" height="40px" width="40px">
                    </div>
                    <li><a href="user_lists.jsp" style="color: blue">USERS</a></li>
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
                <section class="users">
                    <header>
                        <!--Database Connection-->

                        <div class="content">
                            <%
                                String PHONENO=(String)session.getAttribute("phoneno");
                            
                                Connection con=null;
                                Statement st=null;
                                ResultSet rs=null;

                                String FIRSTNAME="" ;
                                String LASTNAME="" ;
                                String STATUS="" ;
                                String MY_PIC="";

                                try{
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");
                                    
                                    st=con.createStatement();
                                    String query="select * from userreg WHERE phoneno='"+PHONENO+"'";
                                    rs=st.executeQuery(query);
                                    if(rs.next()){
                                        FIRSTNAME=rs.getString("firstname");
                                        LASTNAME=rs.getString("lastname");
                                        STATUS= rs.getString("status");
                                        MY_PIC=rs.getString("images");
                                    }
                                    st.close();
                                    con.close();
                                }
                                catch(Exception exp){
                                    out.print("error in dsn :  "+exp.getMessage());
                                }
 
                            %>
                            <img src="profile_picture/<%=MY_PIC%>" alt="">
                            <div class="details">                         
                                    <span><%=FIRSTNAME%> <%=LASTNAME%></span>
                                    <p><%=STATUS%></p>
                            </div>
                            
                        </div>
                    </header>
                    <div class="search">
                        <span class="text">Select an user to start chat</span>
                        <input type="text" id="myInput" placeholder="Enter name to search..." onkeyup="searchbar()">
                        <button><img class="img1" src="pictures/search.png" alt="">
                            <img class="img2" src="pictures/close.png" alt=""></button>
                    </div>
                    <table id="myTable">
                        <%
                            Connection con1=null;
                            Statement st1=null;
                            ResultSet rs1=null;
                            
                            String UFIRSTNAME="" ;
                            String ULASTNAME="" ;
                            String UPH_NO="";
                            String USTATUS="" ;
                            String U_PIC="";
                            
                            try{
                                Class.forName("com.mysql.jdbc.Driver");
                                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");

                                st1=con1.createStatement();
                                String query1="select * from userreg WHERE not phoneno='"+PHONENO+"' order by firstname asc";
                                rs1=st1.executeQuery(query1);
                                while(rs1.next()){
                                    UFIRSTNAME=rs1.getString("firstname");
                                    ULASTNAME=rs1.getString("lastname");
                                    UPH_NO=rs1.getString("phoneno");
                                    USTATUS=rs1.getString("status");
                                    U_PIC=rs1.getString("images");
                                
                        %>
                            <tr>
                                <td style="width: 60px;"><a href="user_lists_con.jsp?phoneno=<%=UPH_NO%>"><img src="profile_picture/<%=U_PIC%>" alt="" width="50px" height="50px"></a></td>
                                <td style="width: 285px;align-items: center;display: flex;"><a href="user_lists_con.jsp?phoneno=<%=UPH_NO%>"><%=UFIRSTNAME%> <%=ULASTNAME%><br><%=UPH_NO%></a></td>
                                <td style="width: 20px;"><a href="user_lists_con.jsp?phoneno=<%=UPH_NO%>"><div class="status-dot <%=USTATUS%>"></div></a></td>
                            </tr>
                        <%
                                }
                                st1.close();
                                con1.close();
                            }
                            catch(Exception exp){
                                out.print("error in dsn :  "+exp.getMessage());
                            }
                        %>
                    </table>
                </section>
                    <h2 id="notfound">User not found</h2>
                    <%
                    String message = (String)request.getAttribute("msg");
                    if(message != null)
                    {
                        //out.println(" "+message);
                        out.println("<SCRIPT LANGUAGE='JavaScript'>alert('You are Sucessfully logedin')</SCRIPT>");
                    }
                    else
                    {

                    }
                %>
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
            
            const searchBar = document.querySelector(".users .search input"),
                    searchBtn = document.querySelector(".users .search button");

            searchBtn.onclick = ()=>{
                searchBar.classList.toggle("active");
                searchBar.focus();
                searchBtn.classList.toggle("active");
            };
            
            const searchbar = () =>{
                let filter = document.getElementById('myInput');
                let myTable = document.getElementById('myTable');
                let trow = myTable.querySelectorAll('tr');
                var notfound = document.getElementById("notfound");
                
                const searchterm = filter.value.toLowerCase();
                let nomatch = true;

                trow.forEach(function(row) {
                    if(row.textContent.toLowerCase().includes(searchterm)){
                        row.style.display = '';
                        nomatch = false;
                    }else{
                        row.style.display = 'none';
                    }
                });

                if(nomatch){
                    notfound.style.display = 'flex';
                }else{
                    notfound.style.display = 'none';
                }
            };
        </script>
    </body>
</html>