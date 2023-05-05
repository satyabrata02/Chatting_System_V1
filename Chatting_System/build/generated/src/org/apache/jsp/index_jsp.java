package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form.css\">\n");
      out.write("        <script>\n");
      out.write("            function togglePopup(){\n");
      out.write("                document.getElementById(\"popup-1\").classList.toggle(\"active\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"pictures/logo.png\" alt=\"chat logo\" class=\"nav-logo\">\n");
      out.write("                <ul class=\"menu-list\">\n");
      out.write("                    <div class=\"icon cancel-btn\">\n");
      out.write("                        <img src=\"pictures/close.png\" height=\"40px\" width=\"40px\">\n");
      out.write("                    </div>\n");
      out.write("                    <li><a href=\"index.jsp\" style=\"color: blue\">HOME</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("                    <li><a href=\"registration.jsp\">REGISTRATION</a></li>\n");
      out.write("                    <li><a href=\"recovery.jsp\">RECOVERY</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">ABOUT</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"icon menu-btn\">\n");
      out.write("                    <img src=\"pictures/menu.png\" height=\"40px\" width=\"40px\">\n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"about\">\n");
      out.write("            <div class=\"icontainer\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-1\">\n");
      out.write("                        <h1>About this website</h1>\n");
      out.write("                        <p>For providing a chat facility in this application used in a particular organization :\n");
      out.write("                            Online chat is a form of communication that allows for two-way conversations.</p>\n");
      out.write("                        <a class=\"btn\" onclick=\"togglePopup()\">More details</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"popup\" id=\"popup-1\">\n");
      out.write("                        <div class=\"overlay\"></div>\n");
      out.write("                        <div class=\"contentd\">\n");
      out.write("                            <div class=\"close-btn\" onclick=\"togglePopup()\">\n");
      out.write("                                <img src=\"pictures/close.png\">\n");
      out.write("                            </div>\n");
      out.write("                            <h1>More details</h1>\n");
      out.write("                            <p>This chat system project has the option to chat with friends.\n");
      out.write("                                Chat application works for multiple users but each user must register with this application. \n");
      out.write("                                After login user can enter into a particular any friend chatroom for a chat.</p>\n");
      out.write("                            <p>Manage the details of Chat Application,Online Chat,Smiles Chat,Users,Chat History.\n");
      out.write("                                It manages all the information about Chat Application, Chat Profile, Chat History, Chat Application.\n");
      out.write("                                The project is totally built at administrative end and thus only the administrator is guaranteed the access.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2\">\n");
      out.write("                        <img src=\"pictures/chatting.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <h2>\n");
      out.write("                ");

                    String message = (String) request.getAttribute("msg");
                    if(message != null)
                    {
                        //out.println(" "+message);
                        out.println("<SCRIPT LANGUAGE='JavaScript'>alert('You are Sucessfully logged out...')</SCRIPT>");
                    }
                    else
                    {

                    }
                
      out.write("\n");
      out.write("            </h2><br>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
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
