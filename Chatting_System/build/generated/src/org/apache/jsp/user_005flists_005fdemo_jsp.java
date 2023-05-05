package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class user_005flists_005fdemo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form4.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"pictures/logo.png\" alt=\"chat logo\" class=\"nav-logo\">\n");
      out.write("                <ul class=\"menu-list\">\n");
      out.write("                    <div class=\"icon cancel-btn\">\n");
      out.write("                        <img src=\"pictures/close.png\" height=\"40px\" width=\"40px\">\n");
      out.write("                    </div>\n");
      out.write("                    <li><a href=\"user_lists.jsp\" style=\"color: blue\">USERS</a></li>\n");
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
      out.write("                <section class=\"users\">\n");
      out.write("                    <header>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <img src=\"profile_picture/user3.png\" alt=\"\">\n");
      out.write("                            <div class=\"details\">\n");
      out.write("                                <span>Satyabrata Panda</span>\n");
      out.write("                                <p>Active now</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </header>\n");
      out.write("                    <div class=\"search\">\n");
      out.write("                        <span class=\"text\">Select an user to start chat</span>\n");
      out.write("                        <input type=\"text\" id=\"myInput\" placeholder=\"Enter name to search...\" onkeyup=\"searchbar()\">\n");
      out.write("                        <button><img class=\"img1\" src=\"pictures/search.png\" alt=\"\">\n");
      out.write("                            <img class=\"img2\" src=\"pictures/close.png\" alt=\"\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <table>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"width: 60px;\"><a href=\"user_lists_con.jsp?phoneno=USERPH_NO\"><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></a></td>\n");
      out.write("                            <td style=\"width: 275px;align-items: center;display: flex;text-align: center;\"><a href=\"user_lists_con.jsp?phoneno=USERPH_NO\">Satyabrata Panda<br>6371202542</a></td>\n");
      out.write("                            <td style=\"width: 10px;\"><a href=\"user_lists_con.jsp?phoneno=USERPH_NO\">👍</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"profile_picture/user3.png\" alt=\"\" width=\"50px\" height=\"50px\"></td>\n");
      out.write("                            <td>Satyabrata Panda<br>6371202542</td>\n");
      out.write("                            <td>👍</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
