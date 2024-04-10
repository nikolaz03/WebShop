package org.apache.jsp.WEB_002dINF.jsp;

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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Dobrodosli</title>\r\n");
      out.write("        \r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("          \r\n");
      out.write("            .header {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                flex-basis: 100%;\r\n");
      out.write("                color: black;\r\n");
      out.write("                font-size: 1.2em;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .nav {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                flex-basis: 100%;\r\n");
      out.write("                flex-grow: 1;\r\n");
      out.write("                background-color: black;\r\n");
      out.write("                font-size: 1.5em;\r\n");
      out.write("                padding: 1.5em;\r\n");
      out.write("                justify-content: space-around;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .body {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                flex-flow: row wrap;\r\n");
      out.write("                text-align: center;              \r\n");
      out.write("                margin: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            a {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .main {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                flex-grow: 5;\r\n");
      out.write("                font-size: 1.2em;\r\n");
      out.write("                flex-basis: 100%;\r\n");
      out.write("                margin: 5em 0 0 0;\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"body\">\r\n");
      out.write("\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <h1>Web prodavnica</h1>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"nav\">\r\n");
      out.write("            <a href=\"index.htm\">Pocetna</a>\r\n");
      out.write("            <a href=\"proizvodi.htm\">Proizvodi</a>\r\n");
      out.write("            <a href=\"kupci.htm\">Kupci</a>\r\n");
      out.write("            <a href=\"kupovina.htm\">Kupovina</a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        \r\n");
      out.write("        <h1>Dobrodosli u Web prodavnicu!</h1>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
