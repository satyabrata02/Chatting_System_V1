package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatroom_005fdemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Chat Page</title>\n");
      out.write("        <style>\n");
      out.write("        .chat-container {\n");
      out.write("          display: flex;\n");
      out.write("          flex-direction: column;\n");
      out.write("          height: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .message-row {\n");
      out.write("          display: flex;\n");
      out.write("          flex-direction: column;\n");
      out.write("          margin: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sender-message {\n");
      out.write("          align-self: flex-end;\n");
      out.write("          background-color: #00bfff;\n");
      out.write("          color: white;\n");
      out.write("          border-radius: 10px;\n");
      out.write("          padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .receiver-message {\n");
      out.write("          align-self: flex-start;\n");
      out.write("          background-color: #f2f2f2;\n");
      out.write("          border-radius: 10px;\n");
      out.write("          padding: 10px;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Chat Page</h1>\n");
      out.write("        <div class=\"chat-container\">\n");
      out.write("          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <form id=\"chat-form\">\n");
      out.write("          <input type=\"text\" id=\"message-input\" name=\"message\">\n");
      out.write("          <button type=\"submit\">Send</button>\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            var currentUser = \"");
      out.print( session.getAttribute("username") );
      out.write("\";\n");
      out.write("            var chatHistory = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chatHistoryJson}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("            var chatContainer = document.querySelector(\".chat-container\");\n");
      out.write("            var messageInput = document.getElementById(\"message-input\");\n");
      out.write("\n");
      out.write("            // Loop through the chat history and display the messages\n");
      out.write("            chatHistory.forEach(function(message) {\n");
      out.write("              displayMessage(message);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Listen for the form submit event and send the message\n");
      out.write("            document.getElementById(\"chat-form\").addEventListener(\"submit\", function(event) {\n");
      out.write("              event.preventDefault();\n");
      out.write("              var message = messageInput.value;\n");
      out.write("              messageInput.value = \"\";\n");
      out.write("              sendMessage(message);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Send the message to the server using AJAX\n");
      out.write("            function sendMessage(message) {\n");
      out.write("              var xhr = new XMLHttpRequest();\n");
      out.write("              xhr.open(\"POST\", \"ChatServlet\");\n");
      out.write("              xhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("              xhr.onload = function() {\n");
      out.write("                if (xhr.status === 200) {\n");
      out.write("                  var response = JSON.parse(xhr.responseText);\n");
      out.write("                  if (response.success) {\n");
      out.write("                    chatHistory.push(response.message);\n");
      out.write("                    displayMessage(response.message);\n");
      out.write("                  } else {\n");
      out.write("                    alert(\"Failed to send message: \" + response.error);\n");
      out.write("                  }\n");
      out.write("                } else {\n");
      out.write("                  alert(\"Failed to send message.\");\n");
      out.write("                }\n");
      out.write("              };\n");
      out.write("              xhr.send(\"sender=\" + currentUser + \"&message=\" + message);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Display a message in the chat container\n");
      out.write("            function displayMessage(message) {\n");
      out.write("              var messageRow = document.createElement(\"div\");\n");
      out.write("              messageRow.classList.add(\"message-row\");\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("message");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chatHistory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <div class=\"message-row\">\n");
          out.write("              ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("            </div>\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.sender eq currentUser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"sender-message\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.receiver eq currentUser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"receiver-message\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
