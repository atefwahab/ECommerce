package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>SignUp</title>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"css/SignUp.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\" />\n");
      out.write("\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"js/mootools-1.2.1-core.js\"></script>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"js/mootools-1.2-more.js\"></script>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"js/slideitmoo-1.1.js\"></script>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- start of menu-->\n");
      out.write("  <div id=\"menu\">\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"#\" class=\"current\">Home</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <!-- end of menu -->\n");
      out.write("\n");
      out.write("  <!--start of header bar-->\n");
      out.write("  <div id=\"header_bar\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("      <div class=\"right\"></div>\n");
      out.write("      <h1><a href=\"#\"> <img src=\"images/logo.png\" alt=\"\" /> <span>Online Store </span> </a></h1>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"cleaner\"></div>\n");
      out.write("  \n");
      out.write("  <form action=\"submit.jsp\" method=\"get\" >\n");
      out.write("  <br>\n");
      out.write("  \n");
      out.write("  <div id=\"title\">\n");
      out.write("   Name:<br><br><br>\n");
      out.write("   Birthday:<br><br><br>\n");
      out.write("   Password:<br><br><br>\n");
      out.write("   Job:<br><br><br>\n");
      out.write("   E-mail:<br><br><br>\n");
      out.write("   Credit Limit:<br><br><br>\n");
      out.write("   Address:<br><br><br>\n");
      out.write("   Interest:<br><br><br>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  <div id=\"between\"></div>\n");
      out.write("  <div id=\"input\">\n");
      out.write("  \n");
      out.write("  <input name=\"name\" type=\"text\"/><br><br><br>\n");
      out.write("  <input type=\"text\" name=\"date\" /><br><br><br>\n");
      out.write("  <input type=\"password\" name=\"pass\" /> <br><br><br>\n");
      out.write("   <input type=\"text\" name=\"job\" /><br><br><br>\n");
      out.write("   <input type=\"text\" name=\"e_mail\" /><br><br><br>\n");
      out.write("   <input type=\"text\" name=\"credit_Limit\" /><br><br>\n");
      out.write("  <input type=\"text\" name=\"address\"/><br><br><br>\n");
      out.write("  <textarea name=\"interest\" rows=\"20\" cols=\"30\"></textarea><br><br><br>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  <input type=\"submit\" value=\"Register\" id=\"submit\">\n");
      out.write("  \n");
      out.write("  </form>\n");
      out.write("  \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("</div>\n");
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
