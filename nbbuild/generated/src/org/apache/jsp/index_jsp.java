package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>The Shop</title>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\" />\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("function clearText(field) {\n");
      out.write("    if (field.defaultValue == field.value) field.value = '';\n");
      out.write("    else if (field.value == '') field.value = field.defaultValue;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"js/mootools-1.2.1-core.js\"></script>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"js/mootools-1.2-more.js\"></script>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"js/slideitmoo-1.1.js\"></script>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("window.addEvents({\n");
      out.write("    'domready': function () { /* gallery slider top of page */\n");
      out.write("        new SlideItMoo({\n");
      out.write("            overallContainer: 'SlideItMoo_outer',\n");
      out.write("            elementScrolled: 'SlideItMoo_inner',\n");
      out.write("            thumbsContainer: 'SlideItMoo_items',\n");
      out.write("            itemsVisible: 5,\n");
      out.write("            elemsSlide: 3,\n");
      out.write("            duration: 200,\n");
      out.write("            itemsSelector: '.SlideItMoo_element',\n");
      out.write("            itemWidth: 140,\n");
      out.write("            showControls: 1\n");
      out.write("        });\n");
      out.write("    },\n");
      out.write("\n");
      out.write("});\n");
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
      out.write("    <div class=\"header_right\" style=\"float:right; padding-top:15px;font-weight: bold; font-size: 15px;\">\n");
      out.write("\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t<a href=\"checkout.html\">\n");
      out.write("\t\t\t\t<div class=\"total\" style=\"color:white; font-size:15px;\">\n");
      out.write("\t\t\t\t\t<span class=\"simpleCart_total\">$00.0</span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\">0</span> items)</div>\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon\" style=\"float:right;\"> <img src=\"images/shopping_trolley.png\" width=\"30px\" height=\"30px\"/></i></a>\n");
      out.write("\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\" style=\"color:white; font-size:15px;\">Empty Cart</a></p>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\t\t\t\t \n");
      out.write("\t\t</div>\n");
      out.write("  </div>\n");
      out.write("  <!-- end of menu -->\n");
      out.write("\n");
      out.write("  <!--start of header bar-->\n");
      out.write("  <div id=\"header_bar\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("      <div class=\"right\"></div>\n");
      out.write("      <h1><a href=\"#\"> <img src=\"images/logo.png\" alt=\"\" /> <span>Online Store </span> </a></h1>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"search_box\">\n");
      out.write("      <form action=\"#\" method=\"get\">\n");
      out.write("        <input type=\"text\" value=\"Enter keyword here...\" name=\"q\" size=\"10\" id=\"searchfield\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" />\n");
      out.write("        <input type=\"submit\" name=\"Search\" value=\"\" alt=\"Search\" id=\"searchbutton\" />\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- end of header_bar -->\n");
      out.write("  <div class=\"cleaner\"></div>\n");
      out.write("  <div id=\"sidebar\">\n");
      out.write("    <div class=\"sidebar_top\"></div>\n");
      out.write("    <div class=\"sidebar_bottom\"></div>\n");
      out.write("    <!-- left sidebar_section-->\n");
      out.write("    <div class=\"sidebar_section\">\n");
      out.write("     ");

            
           
     if(request.getSession().getAttribute("attr")== null){
     
      out.write("\n");
      out.write("                <h2>Members</h2>\n");
      out.write("      <form action=\"login.jsp\" method=\"get\">\n");
      out.write("        <label>E-mail</label>\n");
      out.write("        <input type=\"text\" value=\"\" name=\"e_mail\" size=\"10\" class=\"input_field\" />\n");
      out.write("        <label>Password</label>\n");
      out.write("        <input type=\"password\" value=\"\" name=\"pass\" class=\"input_field\" />\n");
      out.write("        <a href=\"SignUp.jsp\">Register</a><!-- go sign up page-->\n");
      out.write("\n");
      out.write("        <input type=\"submit\" name=\"login\" value=\"Login\" alt=\"Login\" id=\"submit_btn\" />\n");
      out.write("        \n");
      out.write("      </form>\n");
      out.write("                ");

            }else{
    
      out.write("\n");
      out.write("      \n");
      out.write("    <div><h1> welcome <h1><h4>");
      out.print(request.getSession().getAttribute("attr"));
      out.write("<h4></div>\n");
      out.write("    <a href=\"LogOut\">LogOut</a><br>\n");
      out.write("     <a href=\"#\">View Profile</a>\n");
      out.write("                ");

    }

        
        
        
      out.write("\n");
      out.write("        \n");
      out.write("      <div class=\"cleaner\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!--categories-->\n");
      out.write("    <div class=\"sidebar_section\">\n");
      out.write("      <h2>Categories</h2>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("     \t");
      model.DbConnector objConnect = null;
      synchronized (session) {
        objConnect = (model.DbConnector) _jspx_page_context.getAttribute("objConnect", PageContext.SESSION_SCOPE);
        if (objConnect == null){
          objConnect = new model.DbConnector();
          _jspx_page_context.setAttribute("objConnect", objConnect, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("      <ul class=\"categories_list\">\n");
      out.write("      ");

      ArrayList <String> allCategory=new ArrayList<>();
      ArrayList <String> allIds=new ArrayList<>();
      	allCategory=objConnect.getCategories();
        allIds=objConnect.getIdOfCategories();
      	
      	
        
      for(int i=0;i<allCategory.size();i++){
    	  
      out.write("\n");
      out.write("    \t   \n");
      out.write("    \n");
      out.write("        <li><a href=\"GoCategory?value=");
out.println(allIds.get(i));
      out.write("\" name=\"");
 out.println(allCategory.get(i));
        
      out.write("\"> ");
 out.println(allCategory.get(i));
      out.write("</a></li>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("      ");
 
    	   
      }
      
      
      out.write("\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- end of sidebar -->\n");
      out.write("  <div id=\"content\">\n");
      out.write("    <div id=\"latest_product_gallery\">\n");
      out.write("     <!-- <h2>Featured Products</h2>-->\n");
      out.write("     <!-- image slider top-->\n");
      out.write("      <div id=\"SlideItMoo_outer\">\n");
      out.write("        <div id=\"SlideItMoo_inner\">\n");
      out.write("          <div id=\"SlideItMoo_items\">\n");
      out.write("            <div class=\"SlideItMoo_element\"> <a href=\"#\"> <img src=\"images/product_01.png\" alt=\"\" /></a> </div>\n");
      out.write("            <div class=\"SlideItMoo_element\"> <a href=\"#\"> <img src=\"images/product_02.png\" alt=\"\" /></a> </div>\n");
      out.write("            <div class=\"SlideItMoo_element\"> <a href=\"#\"> <img src=\"images/product_03.png\" alt=\"\" /></a> </div>\n");
      out.write("            <div class=\"SlideItMoo_element\"> <a href=\"#\"> <img src=\"images/product_04.png\" alt=\"\" /></a> </div>\n");
      out.write("            <div class=\"SlideItMoo_element\"> <a href=\"#\"> <img src=\"images/product_05.png\" alt=\"\" /></a> </div>\n");
      out.write("            <div class=\"SlideItMoo_element\"> <a href=\"#\"> <img src=\"images/product_06.png\" alt=\"\" /></a> </div>\n");
      out.write("            <div class=\"SlideItMoo_element\"> <a href=\"#\"> <img src=\"images/product_07.png\" alt=\"\" /></a> </div>\n");
      out.write("            <div class=\"SlideItMoo_element\"> <a href=\"#\"> <img src=\"images/product_08.png\" alt=\"\" /></a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end of latest_content_gallery -->\n");
      out.write("    <!-- content section-->\n");
      out.write("    <div class=\"content_section\">\n");
      out.write("      <h2>Welcome to Shop</h2>\n");
      out.write("      <p>Free CSS Templates are provided by TemplateMo.com for everyone. Feel free to use this template for your websites. Credit goes to <a href=\"#\">Free Photos</a> for photos used in this template. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et quam vitae ipsum vulputate varius vitae semper nunc. Quisque eget elit quis augue pharetra feugiat.</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("  <!-- end of content -->\n");
      out.write("</div>\n");
      out.write("<!-- end of wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--start footer-->\n");
      out.write("<div id=\"footer_wrapper\">\n");
      out.write("  <div id=\"footer\">\n");
      out.write("    <ul class=\"footer_menu\">\n");
      out.write("      <li><a href=\"#\">Home</a></li>\n");
      out.write("      \n");
      out.write("      <li class=\"last_menu\"><a href=\"#\">Contact</a></li>\n");
      out.write("    </ul>\n");
      out.write("    Copyright &copy;  <a href=\"#\">ITI</a> | Designed by <a target=\"_blank\" rel=\"nofollow\" href=\"#\">Web And mobile Development</a></div>\n");
      out.write("  <!-- end of footer -->\n");
      out.write("</div>\n");
      out.write("<!-- end of footer_wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
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
