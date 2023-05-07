<%@ page import="java.sql.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<html>
    <head></head>
    <body>
        <c:set scope="page" var="APHONENO" value="${param.phoneno}"></c:set>
        
        <%
            Connection con=null;
            Statement st=null;
            ResultSet rs=null;

            String PHONENO = request.getParameter("phoneno");
            String PASSWORD = request.getParameter("password");

            String s1="",s2=""; 
            int i=1;

            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");
            }
            catch(Exception exp){
                out.print("error in dsn :  "+exp.getMessage());
            }

            try{
                st=con.createStatement();
                String query="select * from userreg";
                rs=st.executeQuery(query);

                while(rs.next()){
                    s1=rs.getString("phoneno");
                    s2=rs.getString("password");
                    if(s1.equals(PHONENO) && s2.equals(PASSWORD)){

                        i=0;

                        String query2="update userreg set status='Active now' where phoneno='"+PHONENO+"' ";
                        st.execute(query2);

                        String message = "You are Sucessfully logedin";
                        RequestDispatcher rd = request.getRequestDispatcher("user_lists.jsp");
                        session.setAttribute("phoneno", PHONENO);
                        request.setAttribute("msg",message);
                        rd.forward(request, response);
                        %>
                        <c:set scope="session" var="MYPHONENO" value="${APHONENO}"></c:set>
                        <c:out value="${MYPHONENO}" />
                        <%
                    }
                }
                st.close();
                con.close();
            }
            catch(Exception exp){
                out.print("error in storing"+exp.getMessage());
            }
            if(i==1){
                //out.println("<SCRIPT LANGUAGE='JavaScript'>alert('Invalid User Id or Password')</SCRIPT>");
                String message2 = "Invalid User Id or Password";
                RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
                request.setAttribute("msg2",message2);
                rd2.forward(request, response);
            }
        %>
    </body>
</html>