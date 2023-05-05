package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class registration_005fcon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    Connection con=null;
    Statement st = null;
    ResultSet rs;
    
    Connection con1=null;
    Statement st1 = null;
    ResultSet rs1;
    
    String PHONENO = request.getParameter("phoneno");
    
    int i=0;
    out.print(PHONENO);

    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");
    }
    catch(Exception exp){
        out.print("error in dsn :  "+exp.getMessage());
    }
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");
    }
    catch(Exception exp){
        out.print("error in dsn :  "+exp.getMessage());
    }
    
    try{
        st1=con1.createStatement();
        String query="select * from userreg where phoneno='"+PHONENO+"' ";
        rs1=st1.executeQuery(query);
        while(rs1.next())
        {
           i=1;
        }                    
        st.close();
        con.close();
    }
    catch(Exception exp){
        out.print("error in dsn :  "+exp.getMessage());
    }
    if(i==1){
        String message = "This phone number has already registred";
        RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
        request.setAttribute("msg",message);
        rd.forward(request, response);
    }else{
        try{
            String FIRSTNAME = request.getParameter("firstname");
            String LASTNAME = request.getParameter("lastname");
            String GENDER = request.getParameter("gender");
            PHONENO = request.getParameter("phoneno");
            String EMAILID = request.getParameter("emailid");
            String PASSWORD = request.getParameter("password");
            String QUESTION = request.getParameter("secure_question");
            String ANSWER = request.getParameter("answer");

            st = con.createStatement();
            String query="insert into userreg(firstname, lastname, gender, phoneno, emailid, password, secure_question, answer) values('"+FIRSTNAME+"', '"+LASTNAME+"', '"+GENDER+"', '"+PHONENO+"', '"+EMAILID+"', '"+PASSWORD+"', '"+QUESTION+"', '"+ANSWER+"','offline')";
            st.execute(query);
        }
        catch(Exception obj){
            out.print("Error in Data Storeage"+obj.getMessage());
        }
        
        String message1 = "You are Sucessfully registred";
        RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
        request.setAttribute("msg1",message1);
        rd1.forward(request, response);
    }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
