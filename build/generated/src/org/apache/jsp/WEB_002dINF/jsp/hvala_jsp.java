package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hvala_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Uspesna kupovina</title>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("          \n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                flex-basis: 100%;\n");
      out.write("                color: black;\n");
      out.write("                font-size: 1.2em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav {\n");
      out.write("                display: flex;\n");
      out.write("                flex-basis: 100%;\n");
      out.write("                flex-grow: 1;\n");
      out.write("                background-color: black;\n");
      out.write("                font-size: 1.5em;\n");
      out.write("                padding: 1.5em;\n");
      out.write("                justify-content: space-around;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .body {\n");
      out.write("                display: flex;\n");
      out.write("                flex-flow: row wrap;\n");
      out.write("                text-align: center;              \n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .main {\n");
      out.write("                text-align: center;\n");
      out.write("                flex-grow: 5;\n");
      out.write("                font-size: 1.2em;\n");
      out.write("                flex-basis: 100%;\n");
      out.write("                margin: 5em 0 0 0;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("                        \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"body\">\n");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <h1>Web prodavnica</h1>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <nav class=\"nav\">\n");
      out.write("            <a href=\"index.htm\">Pocetna</a>\n");
      out.write("            <a href=\"proizvodi.htm\">Proizvodi</a>\n");
      out.write("            <a href=\"kupci.htm\">Kupci</a>\n");
      out.write("            <a href=\"kupovina.htm\">Kupovina</a>\n");
      out.write("        </nav>\n");
      out.write("    \n");
      out.write("    <div class=\"main\">\n");
      out.write("        \n");
      out.write("        <h1>Uspesno ste obavili kupovinu!<br/>Hvala Vam na poverenju.</h1>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
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
