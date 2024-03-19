<%@page import="java.io.*,java.util.*,javax.servlet.*" %>
<%@page import="java.util.Enumeration" %>
<%@page import="java.sql.*" %>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@page import="org.apache.commons.fileupload.*" %>
<%@page import="org.apache.commons.fileupload.disk.*" %>
<%@page import="org.apache.commons.fileupload.servlet.*" %>
<%@page import="org.apache.commons.io.output.*" %>
<%
    String PHONENO=(String)session.getAttribute("phoneno");
    String filename = "";
    MultipartRequest m = new MultipartRequest(request,"E:/Web Project/Chatting System/Chatting_System/web/profile_picture",8*1024*1024);
    Enumeration files = m.getFileNames();
    
    while(files.hasMoreElements()){
        String name = (String)files.nextElement();
        filename = m.getFilesystemName(name);
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");

        Statement st = con.createStatement();
        int sql = st.executeUpdate("update userreg set images='"+filename+"' where phoneno='"+PHONENO+"' ");
        if(sql>0)
        {
            //String message = "Sucessfully Upload";
            //RequestDispatcher rd = request.getRequestDispatcher("changepic.jsp");
            //request.setAttribute("msg",message);
            //rd.forward(request, response);
            request.setAttribute("phoneno",PHONENO);
            response.sendRedirect("changepic.jsp");
        }
        else
        {
            //String message = "Fail to Upload";
            //RequestDispatcher rd = request.getRequestDispatcher("changepic.jsp");
            //request.setAttribute("msg",message);
            //rd.forward(request, response);
            
            response.sendRedirect("changepic.jsp");
        }
    }
%>