package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
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
      out.write("                    <li><a href=\"registration.jsp\">REGISTRATION</a></li>\n");
      out.write("                    <li><a href=\"recovery.jsp\">RECOVERY</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\" style=\"color: blue\">ABOUT</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"icon menu-btn\">\n");
      out.write("                    <img src=\"pictures/menu.png\" height=\"40px\" width=\"40px\">\n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"aboutp\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"imgBox\">\n");
      out.write("                    <img src=\"pictures/satya2.jpg\">\n");
      out.write("                    <img src=\"pictures/satya.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"details\">\n");
      out.write("                    <div class=\"contentp\">\n");
      out.write("                        <h2>Developed by<br><span>Satyabrata Panda</span></h2>\n");
      out.write("                        <span>( MCA Gradute )</span>\n");
      out.write("                        <p><img src=\"pictures/call.png\" height=\"15px\" width=\"15px\">(+91) 6371202542</p>\n");
      out.write("                        <p><img src=\"pictures/mail.png\" height=\"15px\" width=\"15px\">pandasatyabrata56@gmail.com</p>\n");
      out.write("                        <div class=\"social-icons\">\n");
      out.write("                            <a href=\"https://www.facebook.com/satyabrata.panda.3956690?mibextid=ZbWKwL\"><img src=\"pictures/logo-facebook.png\" height=\"35px\" width=\"35px\"></a>\n");
      out.write("                            <a href=\"https://www.instagram.com/satya.brata_panda/\"><img src=\"pictures/logo-instagram.png\" height=\"35px\" width=\"35px\"></a>\n");
      out.write("                            <a href=\"https://www.linkedin.com/in/satyabrata-panda-a462b5220\"><img src=\"pictures/logo-linkedin.png\" height=\"35px\" width=\"35px\"></a>\n");
      out.write("                            <a href=\"https://twitter.com/__satyabrata__?t=-1RO9lrjYo8ZZPWj_jmoNg&s=08\"><img src=\"pictures/logo-twitter.png\" height=\"35px\" width=\"35px\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"flip-inner-wrapper\">\n");
      out.write("                    <div class=\"flip-front\">\n");
      out.write("                        <img src=\"pictures/satya2.jpg\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flip-back\">\n");
      out.write("                        <img src=\"pictures/satya.jpg\">\n");
      out.write("                        <h2>Developed by<br><span>Satyabrata Panda</span></h2>\n");
      out.write("                        <span>( MCA Gradute )</span>\n");
      out.write("                        <p><img src=\"pictures/call.png\">(+91) 6371202542</p>\n");
      out.write("                        <p><img src=\"pictures/mail.png\">pandasatyabrata56@gmail.com</p>\n");
      out.write("                        <div class=\"social-icons\">\n");
      out.write("                            <a href=\"https://www.facebook.com/satyabrata.panda.3956690?mibextid=ZbWKwL\" target=\"_blank\"><img src=\"pictures/logo-facebook.png\" height=\"35px\" width=\"35px\"></a>\n");
      out.write("                            <a href=\"https://www.instagram.com/satya.brata_panda/\" target=\"_blank\"><img src=\"pictures/logo-instagram.png\" height=\"35px\" width=\"35px\"></a>\n");
      out.write("                            <a href=\"https://www.linkedin.com/in/satyabrata-panda-a462b5220\" target=\"_blank\"><img src=\"pictures/logo-linkedin.png\" height=\"35px\" width=\"35px\"></a>\n");
      out.write("                            <a href=\"https://twitter.com/__satyabrata__?t=-1RO9lrjYo8ZZPWj_jmoNg&s=08\" target=\"_blank\"><img src=\"pictures/logo-twitter.png\" height=\"35px\" width=\"35px\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
