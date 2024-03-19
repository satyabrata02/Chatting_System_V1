package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class user_005flists_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form3.css\">\n");
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
      out.write("                        <!--Database Connection-->\n");
      out.write("\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            ");

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
 
                            
      out.write("\n");
      out.write("                            <img src=\"profile_picture/");
      out.print(MY_PIC);
      out.write("\" alt=\"\">\n");
      out.write("                            <div class=\"details\">                         \n");
      out.write("                                    <span>");
      out.print(FIRSTNAME);
      out.write(' ');
      out.print(LASTNAME);
      out.write("</span>\n");
      out.write("                                    <p>");
      out.print(STATUS);
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </header>\n");
      out.write("                    <div class=\"search\">\n");
      out.write("                        <span class=\"text\">Select an user to start chat</span>\n");
      out.write("                        <input type=\"text\" id=\"myInput\" placeholder=\"Enter name to search...\" onkeyup=\"searchbar()\">\n");
      out.write("                        <button><img class=\"img1\" src=\"pictures/search.png\" alt=\"\">\n");
      out.write("                            <img class=\"img2\" src=\"pictures/close.png\" alt=\"\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <table id=\"myTable\">\n");
      out.write("                        ");

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
                                
                        
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td style=\"width: 60px;\"><a href=\"user_lists_con.jsp?phoneno=");
      out.print(UPH_NO);
      out.write("\"><img src=\"profile_picture/");
      out.print(U_PIC);
      out.write("\" alt=\"\" width=\"50px\" height=\"50px\"></a></td>\n");
      out.write("                                <td style=\"width: 285px;align-items: center;display: flex;\"><a href=\"user_lists_con.jsp?phoneno=");
      out.print(UPH_NO);
      out.write('"');
      out.write('>');
      out.print(UFIRSTNAME);
      out.write(' ');
      out.print(ULASTNAME);
      out.write("<br>");
      out.print(UPH_NO);
      out.write("</a></td>\n");
      out.write("                                <td style=\"width: 20px;\"><a href=\"user_lists_con.jsp?phoneno=");
      out.print(UPH_NO);
      out.write("\"><div class=\"status-dot ");
      out.print(USTATUS);
      out.write("\"></div></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                        ");

                                }
                                st1.close();
                                con1.close();
                            }
                            catch(Exception exp){
                                out.print("error in dsn :  "+exp.getMessage());
                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </section>\n");
      out.write("                    <h2 id=\"notfound\">User not found</h2>\n");
      out.write("                    ");

                    String message = (String)request.getAttribute("msg");
                    if(message != null)
                    {
                        //out.println(" "+message);
                        out.println("<SCRIPT LANGUAGE='JavaScript'>alert('You are Sucessfully logedin')</SCRIPT>");
                    }
                    else
                    {

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("          \n");
      out.write("            //Toggle Navbar\n");
      out.write("            const menu = document.querySelector(\".menu-list\");\n");
      out.write("            const menuBtn = document.querySelector(\".menu-btn\");\n");
      out.write("            const cancelBtn = document.querySelector(\".cancel-btn\");\n");
      out.write("\n");
      out.write("            menuBtn.onclick = ()=>{\n");
      out.write("                menu.classList.add(\"active\");\n");
      out.write("                menuBtn.classList.add(\"hide\");\n");
      out.write("            };\n");
      out.write("            cancelBtn.onclick = ()=>{\n");
      out.write("                menu.classList.remove(\"active\");\n");
      out.write("                menuBtn.classList.remove(\"hide\");\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            //Sticky Navbar\n");
      out.write("            window.onscroll = function(){myFunction()};\n");
      out.write("            var navbar_header = document.querySelector(\".navbar\");\n");
      out.write("            var stk = navbar_header.offsetTop;\n");
      out.write("\n");
      out.write("            function myFunction(){\n");
      out.write("                if(window.pageYOffset > stk){\n");
      out.write("                    navbar_header.classList.add(\"sticky\");\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    navbar_header.classList.remove(\"sticky\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            const searchBar = document.querySelector(\".users .search input\"),\n");
      out.write("                    searchBtn = document.querySelector(\".users .search button\");\n");
      out.write("\n");
      out.write("            searchBtn.onclick = ()=>{\n");
      out.write("                searchBar.classList.toggle(\"active\");\n");
      out.write("                searchBar.focus();\n");
      out.write("                searchBtn.classList.toggle(\"active\");\n");
      out.write("            };\n");
      out.write("            \n");
      out.write("            const searchbar = () =>{\n");
      out.write("                let filter = document.getElementById('myInput');\n");
      out.write("                let myTable = document.getElementById('myTable');\n");
      out.write("                let trow = myTable.querySelectorAll('tr');\n");
      out.write("                var notfound = document.getElementById(\"notfound\");\n");
      out.write("                \n");
      out.write("                const searchterm = filter.value.toLowerCase();\n");
      out.write("                let nomatch = true;\n");
      out.write("\n");
      out.write("                trow.forEach(function(row) {\n");
      out.write("                    if(row.textContent.toLowerCase().includes(searchterm)){\n");
      out.write("                        row.style.display = '';\n");
      out.write("                        nomatch = false;\n");
      out.write("                    }else{\n");
      out.write("                        row.style.display = 'none';\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                if(nomatch){\n");
      out.write("                    notfound.style.display = 'flex';\n");
      out.write("                }else{\n");
      out.write("                    notfound.style.display = 'none';\n");
      out.write("                }\n");
      out.write("            };\n");
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
