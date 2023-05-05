package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

    // Get the current user from the session
    String currentUser = (String) session.getAttribute("username");

    // Get the chat history from the database
    List<Map<String, String>> chatHistory = new ArrayList<Map<String, String>>();
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat", "root", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM messages ORDER BY timestamp ASC");
        while (rs.next()) {
            Map<String, String> message = new HashMap<String, String>();
            message.put("sender", rs.getString("sender"));
            message.put("message", rs.getString("message"));
            message.put("timestamp", rs.getString("timestamp"));
            chatHistory.add(message);
        }
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    // Convert the chat history to a JSON array
    JSONArray chatHistoryJson = new JSONArray();
    for (Map<String, String> message : chatHistory) {
        JSONObject messageJson = new JSONObject(message);
        chatHistoryJson.put(messageJson);
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Chat</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"chat-container\">\n");
      out.write("        ");
 for (int i = 0; i < chatHistoryJson.length(); i++) { 
      out.write("\n");
      out.write("            ");
 JSONObject message = chatHistoryJson.getJSONObject(i); 
      out.write("\n");
      out.write("            <div class=\"message-row\">\n");
      out.write("                <div class=\"");
      out.print( message.getString("sender").equals(currentUser) ? "sender-message" : "receiver-message" );
      out.write("\">\n");
      out.write("                    ");
      out.print( message.getString("message") );
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <form id=\"chat-form\">\n");
      out.write("        <input type=\"text\" id=\"message-input\" placeholder=\"Type your message...\">\n");
      out.write("        <button type=\"submit\">Send</button>\n");
      out.write("    </form>\n");
      out.write("    <script>\n");
      out.write("        var currentUser = \"");
      out.print( currentUser );
      out.write("\";\n");
      out.write("        var chatHistory = ");
      out.print( chatHistoryJson );
      out.write(";\n");
      out.write("        var chatContainer = document.querySelector(\".chat-container\");\n");
      out.write("        var messageInput = document.getElementById(\"message-input\");\n");
      out.write("\n");
      out.write("        chatHistory.forEach(function(message) {\n");
      out.write("            displayMessage(message);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        document.getElementById(\"chat-form\").addEventListener(\"submit\", function(event) {\n");
      out.write("            event.preventDefault();\n");
      out.write("            var message = messageInput.value;\n");
      out.write("            messageInput.value = \"\";\n");
      out.write("            sendMessage(message);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        function sendMessage(message) {\n");
      out.write("            var xhr = new XMLHttpRequest();\n");
      out.write("            xhr.open(\"POST\", \"ChatServlet\");\n");
      out.write("            xhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("            xhr.onload = function() {\n");
      out.write("                if (xhr.status === 200) {\n");
      out.write("                    var response = JSON.parse(xhr.responseText);\n");
      out.write("                    if (response.success) {\n");
      out.write("                        chatHistory.push(response.message);\n");
      out.write("                        displayMessage(response.message);\n");
      out.write("                    } else {\n");
      out.write("                        alert(\"Failed to send message: \" + response.error);\n");
      out.write("                    }\n");
      out.write("                } else {\n");
      out.write("                    alert(\"Failed to send message.\");\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            xhr.send(\"sender=\" + currentUser + \"&message=\" + message);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function displayMessage(message) {\n");
      out.write("        var messageRow = document.createElement(\"div\");\n");
      out.write("        messageRow.classList.add(\"message-row\");\n");
      out.write("\n");
      out.write("        var messageContent = document.createElement(\"div\");\n");
      out.write("        messageContent.classList.add(message.sender === currentUser ? \"sender-message\" : \"receiver-message\");\n");
      out.write("        messageContent.textContent = message.message;\n");
      out.write("\n");
      out.write("        messageRow.appendChild(messageContent);\n");
      out.write("        chatContainer.appendChild(messageRow);\n");
      out.write("\n");
      out.write("        chatContainer.scrollTop = chatContainer.scrollHeight;\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
