package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form.css\">\n");
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
      out.write("                    <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\" style=\"color: blue\">LOGIN</a></li>\n");
      out.write("                    <li><a href=\"registration.jsp\">REGISTRATION</a></li>\n");
      out.write("                    <li><a href=\"recovery.jsp\">RECOVERY</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">ABOUT</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"icon menu-btn\">\n");
      out.write("                    <img src=\"pictures/menu.png\" height=\"40px\" width=\"40px\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"about\">            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <header>Login Form</header>\n");
      out.write("                <form method=\"post\" action=\"login_con_demo.jsp\">\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <input type=\"text\" name=\"phoneno\" autocomplete=\"off\" required>\n");
      out.write("                        <label>Phone no.</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <input class=\"pswrd\" type=\"password\" name=\"password\" required>\n");
      out.write("                        <span class=\"show\">SHOW</span>\n");
      out.write("                        <label>Password</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"recovery\">\n");
      out.write("                        <a href=\"recovery.jsp\">Forgot Password ?</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button\">\n");
      out.write("                        <div class=\"inner\"></div>\n");
      out.write("                        <button>LOGIN</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"signup\">\n");
      out.write("                    Not a member ? <a href=\"registration.jsp\">Signup now</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <h2>\n");
      out.write("                    ");

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
                    
      out.write("\n");
      out.write("                </h2><br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
