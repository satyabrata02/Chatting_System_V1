package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class chatroom_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Chatroom</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form3.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"pictures/logo.png\" alt=\"chat logo\" class=\"nav-logo\">\n");
      out.write("                <ul class=\"menu-list\">\n");
      out.write("                    <div class=\"icon cancel-btn\">\n");
      out.write("                        <img src=\"pictures/close.png\" height=\"40px\" width=\"40px\">\n");
      out.write("                    </div>\n");
      out.write("                    <li><a href=\"user_lists.jsp\">USERS</a></li>\n");
      out.write("                    <li><a href=\"chatroom.jsp\" style=\"color: blue\">CHAT ROOM</a></li>\n");
      out.write("                    <li><a href=\"history.jsp\">HISTORY</a></li>\n");
      out.write("                    <li><a>CHANGE UPDATES +</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"updatepassword.jsp\">CHANGE PASSWORD</a></li>\n");
      out.write("                            <li><a href=\"changepic.jsp\">PROFILE PIC</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"logout.jsp\">LOGOUT</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"icon menu-btn\">\n");
      out.write("                    <img src=\"pictures/menu.png\" height=\"40px\" width=\"40px\">\n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"about\">\n");
      out.write("            <div class=\"container3\">\n");
      out.write("                <section class=\"chat-area\">\n");
      out.write("                    <header>\n");
      out.write("                        ");

                            String FROMUSER=(String)session.getAttribute("phoneno");
                            String TOUSER=(String)session.getAttribute("touser");                            
                            
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
                                String query="select * from userreg WHERE phoneno='"+FROMUSER+"'";
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
                                
                        
      out.write("\n");
      out.write("                        <a href=\"user_lists.jsp\" class=\"back-icon\"><img src=\"pictures/arrow-back.png\" alt=\"\"></a>\n");
      out.write("                        <img src=\"profile_picture/");
      out.print(MY_PIC);
      out.write("\" alt=\"\">\n");
      out.write("                        <div class=\"details\">\n");
      out.write("                            <span>");
      out.print(FIRSTNAME);
      out.write(' ');
      out.print(LASTNAME);
      out.write("</span>\n");
      out.write("                            <p>");
      out.print(STATUS);
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                    </header>\n");
      out.write("                    <div class=\"chat-box\">\n");
      out.write("                        ");

                            
                            try{
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_system","root","1234");
                                PreparedStatement pstmt = con2.prepareStatement("select * from ocs"+FROMUSER+" where fromuser='"+FROMUSER+"' and touser='"+TOUSER+"' order by chatid");
                                ResultSet rs2=pstmt.executeQuery();
                                while(rs2.next()){
                                    String OUTGOING=rs2.getString("message");
                                
                        
      out.write("\n");
      out.write("                        <div class=\"chat outgoing\">\n");
      out.write("                            <div class=\"details\">\n");
      out.write("                                <p>");
      out.print(OUTGOING);
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <img src=\"pictures/satya.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        ");

                                }    
                            }
                            catch(Exception exp){
                                out.print("error in dsn :  "+exp.getMessage());
                            }
                        
      out.write("\n");
      out.write("                        <div class=\"chat incoming\">\n");
      out.write("                            <img src=\"pictures/satya.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"details\">\n");
      out.write("                                <p></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"chatroom_con.jsp\" class=\"typing-area\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Type a message here...\" name=\"sendmessage\" required>\n");
      out.write("                        \n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.print(FROMUSER);
      out.write("\" name=\"fromuser\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.print(TOUSER);
      out.write("\" name=\"touser\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.print( (new java.util.Date()).toLocaleString());
      out.write("\" name=\"chat_date\">\n");
      out.write("                        <button><img src=\"pictures/send.png\" alt=\"\"></button>\n");
      out.write("                    </form>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/index.js\">\n");
      out.write("            // Display a message in the chat container\n");
      out.write("            function displayMessage(message) {\n");
      out.write("              var messageRow = document.createElement(\"div\");\n");
      out.write("              messageRow.classList.add(\"chat-box\");\n");
      out.write("\n");
      out.write("              var messageContent = document.createElement(\"div\");\n");
      out.write("              messageContent.classList.add(message.sender === currentUser ? \"sender-message\" : \"receiver-message\");\n");
      out.write("              messageContent.textContent = message.message;\n");
      out.write("\n");
      out.write("              messageRow.appendChild(messageContent);\n");
      out.write("              chatContainer.appendChild(messageRow);\n");
      out.write("\n");
      out.write("              // Scroll to the bottom of the chat container\n");
      out.write("              chatContainer.scrollTop = chatContainer.scrollHeight;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
