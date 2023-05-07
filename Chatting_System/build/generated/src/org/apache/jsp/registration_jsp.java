package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form2.css\">\n");
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
      out.write("                    <li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("                    <li><a href=\"registration.jsp\" style=\"color: blue\">REGISTRATION</a></li>\n");
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
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"title\">Registration Form</div>\n");
      out.write("                <form method=\"post\" action=\"registration_con.jsp\">\n");
      out.write("                    <div class=\"user-details\">\n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <input type=\"text\" name=\"firstname\" required>\n");
      out.write("                            <label>First Name</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <input type=\"text\" name=\"lastname\" required>\n");
      out.write("                            <label>Last Name</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <input type=\"text\" name=\"phoneno\" required>\n");
      out.write("                            <label>Phone no</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <input type=\"text\" name=\"emailid\" required>\n");
      out.write("                            <label>Email ID</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <input class=\"pswrd\" type=\"password\" name=\"password\" required>\n");
      out.write("                            <label>Password</label>\n");
      out.write("                            <span class=\"show\">SHOW</span>                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"select-menu\">\n");
      out.write("                            <input type=\"radio\" name=\"secure_question\" id=\"ops-1\" value=\"what is your nick name ?\">\n");
      out.write("                            <input type=\"radio\" name=\"secure_question\" id=\"ops-2\" value=\"what is your pet name ?\">\n");
      out.write("                            <input type=\"radio\" name=\"secure_question\" id=\"ops-3\" value=\"what is your first school name ?\">\n");
      out.write("                            <input type=\"radio\" name=\"secure_question\" id=\"ops-4\" value=\"Who was your childhood hero ?\">\n");
      out.write("                            <input type=\"radio\" name=\"secure_question\" id=\"ops-5\" value=\"what is your favorite subject ?\">\n");
      out.write("                            <div class=\"select\">\n");
      out.write("                                <span>Select your option</span>\n");
      out.write("                                <img src=\"pictures/chevron-down.png\" class=\"chevron-down\" height=\"20px\" width=\"20px\">\n");
      out.write("                                <img src=\"pictures/chevron-up.png\" class=\"chevron-up\" height=\"20px\" width=\"20px\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"options-list\"><br>\n");
      out.write("                                <label class=\"option\" for=\"ops-1\">what is your nick name ?</label><br>\n");
      out.write("                                <label class=\"option\" for=\"ops-2\">what is your pet name ?</label><br>\n");
      out.write("                                <label class=\"option\" for=\"ops-3\">what is your first school name ?</label><br>\n");
      out.write("                                <label class=\"option\" for=\"ops-4\">Who was your childhood hero ?</label><br>\n");
      out.write("                                <label class=\"option\" for=\"ops-5\">what is your favorite subject ?</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <input class=\"pswrd2\" type=\"password\" name=\"answer\" required>\n");
      out.write("                            <label>Answer</label>\n");
      out.write("                            <span class=\"show2\">SHOW</span>                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"gender-details\">\n");
      out.write("                        <input type=\"radio\" name=\"gender\" id=\"dot-1\" value=\"male\">\n");
      out.write("                        <input type=\"radio\" name=\"gender\" id=\"dot-2\" value=\"female\">\n");
      out.write("                        <input type=\"radio\" name=\"gender\" id=\"dot-3\" value=\"other\">\n");
      out.write("                        <span class=\"gender-title\">Gender</span>\n");
      out.write("                        <div class=\"category\">\n");
      out.write("                            <label for=\"dot-1\">\n");
      out.write("                                <span class=\"dot one\"></span>\n");
      out.write("                                <span class=\"gender\">Male</span>\n");
      out.write("                            </label>\n");
      out.write("                            <label for=\"dot-2\">\n");
      out.write("                                <span class=\"dot two\"></span>\n");
      out.write("                                <span class=\"gender\">Female</span>\n");
      out.write("                            </label>\n");
      out.write("                            <label for=\"dot-3\">\n");
      out.write("                                <span class=\"dot three\"></span>\n");
      out.write("                                <span class=\"gender\">Other</span>\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button\">\n");
      out.write("                        <input type=\"submit\" value=\"Register\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <h2>\n");
      out.write("                    ");

                        String message = (String) request.getAttribute("msg");
                        if(message != null)
                        {
                            //out.println(" "+message);
                            out.println("<SCRIPT LANGUAGE='JavaScript'>alert('This phone number has already registred')</SCRIPT>");
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
