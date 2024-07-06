package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Create_005fStaff_005fInternal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <!-- Boxicons -->\n");
      out.write("    <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\"\n");
      out.write("        integrity=\"sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <!-- My CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"Manage_Staff_3.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"footer.css\">\n");
      out.write("\n");
      out.write("    <title>DN EXPRESS</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <section class=\"confiq\">\n");
      out.write("        <!-- SIDEBAR -->\n");
      out.write("        <section id=\"sidebar\">\n");
      out.write("            <a href=\"#\" class=\"brand\">\n");
      out.write("                <i class='bx bxs-package'></i>\n");
      out.write("                <span class=\"text\">DN Express</span>\n");
      out.write("                <!-- <img src=\"img/logopage1.png\"> -->\n");
      out.write("\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"side-menu top\">\n");
      out.write("                <li >\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class='bx bxs-package'></i>\n");
      out.write("                        <span class=\"text\">Track Package</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class='bx bxs-truck'></i>\n");
      out.write("                        <span class=\"text\">Track Driver</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class='bx bxs-doughnut-chart'></i>\n");
      out.write("                        <span class=\"text\">Manage Post Office</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" id=\"showDriver\">\n");
      out.write("                        <i class='bx bxs-doughnut-chart'></i>\n");
      out.write("                        <span class=\"text\">Driver</span>\n");
      out.write("                    </a>\n");
      out.write(" \n");
      out.write("                </li>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("               <li class=\"active\">\n");
      out.write("                    <a href=\"getListStaffInternal\"  id=\"showStaff\" >\n");
      out.write("                        <i class='bx bxs-doughnut-chart'></i>\n");
      out.write("                        <span class=\"text\">Staff Nội bộ</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class='bx bxs-message-dots'></i>\n");
      out.write("                        <span class=\"text\">Message</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class='bx bxs-group'></i>\n");
      out.write("                        <span class=\"text\">Team</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"side-menu\" style=\"position: absolute; bottom: 0;\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class='bx bxs-cog'></i>\n");
      out.write("                        <span class=\"text\">Settings</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"logout\">\n");
      out.write("                        <i class='bx bxs-log-out-circle'></i>\n");
      out.write("                        <span class=\"text\">Logout</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("        <!-- SIDEBAR -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- CONTENT -->\n");
      out.write("        <section id=\"content\">\n");
      out.write("            <!-- NAVBAR -->\n");
      out.write("            <nav>\n");
      out.write("                <i class='bx bx-menu'></i>\n");
      out.write("                <a href=\"#\" class=\"nav-link\"><strong>Manage Staff</strong></a>\n");
      out.write("                <form action=\"#\">\n");
      out.write("                    <div class=\"form-input\">\n");
      out.write("                        <input type=\"search\" placeholder=\"Search\">\n");
      out.write("                        <button type=\"submit\" class=\"search-btn\"><i class='bx bx-search'></i></button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"checkbox\" id=\"switch-mode\" hidden>\n");
      out.write("                <label for=\"switch-mode\" class=\"switch-mode\"></label>\n");
      out.write("                <a href=\"#\" class=\"notification\">\n");
      out.write("                    <i class='bx bxs-bell'></i>\n");
      out.write("                    <span class=\"num\">8</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"profile\">\n");
      out.write("                    <img src=\"img/img2.jpg\">\n");
      out.write("                </a>\n");
      out.write("            </nav>\n");
      out.write("            <!-- NAVBAR -->\n");
      out.write("\n");
      out.write("            <!-- MAIN -->\n");
      out.write("            <main class=\"table\" id=\"customers_table\">\n");
      out.write("\n");
      out.write("\n");
      out.write("              <!--Popup Form-->\n");
      out.write("\n");
      out.write("            <div class=\"dark_bg active\">\n");
      out.write("\n");
      out.write("                <div class=\"popup active\" >\n");
      out.write("                    <header>\n");
      out.write("                        <h2 class=\"modalTitle\">Fill the Form</h2>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <div class=\"body\">\n");
      out.write("                        <form action=\"createStaffInternal\" id=\"myForm\" method=\"get\">\n");
      out.write("                            <div class=\"imgholder\">\n");
      out.write("                                <label for=\"uploadimg\" class=\"upload\">\n");
      out.write("                                    <input type=\"file\" name=\"image\" id=\"uploadimg\" class=\"picture\">\n");
      out.write("                                    <i class=\"fa-solid fa-plus\"></i>\n");
      out.write("                                </label>\n");
      out.write("                                <img src=\"./img/pic1.png\" alt=\"\" width=\"150\" height=\"150\" class=\"img\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"inputFieldContainer\">\n");
      out.write("\n");
      out.write("                                <div class=\"nameField\">\n");
      out.write("                            <div class=\"form_control\">\n");
      out.write("                                <label for=\"fistName\">First Name:</label>\n");
      out.write("                               <input  type=\"text\" name=\"fistName\" id=\"fName\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form_control\">\n");
      out.write("                                <label for=\"lastName\">Last Name:</label>\n");
      out.write("                                <input  type=\"text\" name=\"lastName\" id=\"lName\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"identify\">\n");
      out.write("                            <div class=\"form_control\">\n");
      out.write("                                <label for=\"gender\">Gender:</label>\n");
      out.write("                                <input type=\"text\" name=\"gender\" id=\"gender\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"location\">\n");
      out.write("                                <div class=\"form_control\">\n");
      out.write("                                <label for=\"cccd_numb\">Citizen Identity:</label>\n");
      out.write("                                <input type=\"text\" name=\"cccd_numb\" id=\"cid\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form_control\">\n");
      out.write("                                <label for=\"post_OfficeID\">Post Office ID: </label>\n");
      out.write("                                <input name=\"post_OfficeID\" type=\"text\" id=\"post_OfficeID\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form_control\">\n");
      out.write("                            <label for=\"dob\">Date of Birth:</label>\n");
      out.write("                            <input type=\"date\" name=\"dob\" id=\"dob\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form_control\">\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"email\" name=\"email\" id=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form_control\">\n");
      out.write("                            <label for=\"phone_numb\">Phone:</label>\n");
      out.write("                            <input type=\"number\" name=\"phone_numb\" id=\"phone\" required>\n");
      out.write("                        </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <footer class=\"popupFooter\">\n");
      out.write("                        <button form=\"myForm\" class=\"submitBtn\">Submit</button>\n");
      out.write("                    </footer>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"overlay\" id=\"overlay\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"popup_del\" id=\"deletePopup\">\n");
      out.write("                <div class=\"popup_del-content\">\n");
      out.write("                    <h2><strong>Confirmation</strong></h2>\n");
      out.write("                    <p>Are you sure to delete?</p>\n");
      out.write("                    <button id=\"cancelDeleteBtn\">Cancel</button>\n");
      out.write("                    <button id=\"confirmDeleteBtn\">Delete</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("     <!--Popup Form-->\n");
      out.write("\n");
      out.write("            </main>\n");
      out.write("            <!-- MAIN -->\n");
      out.write("        </section>\n");
      out.write("    </section>\n");
      out.write("    <!-- CONTENT -->\n");
      out.write("\n");
      out.write("    <!-- FOOTER -->\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"waves\">\n");
      out.write("            <div class=\"wave\" id=\"wave1\"></div>\n");
      out.write("            <div class=\"wave\" id=\"wave2\"></div>\n");
      out.write("            <div class=\"wave\" id=\"wave3\"></div>\n");
      out.write("            <div class=\"wave\" id=\"wave4\"></div>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"social-icon\">\n");
      out.write("            <li class=\"social-icon__item\"><a class=\"social-icon__link\" href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-facebook\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("            <li class=\"social-icon__item\"><a class=\"social-icon__link\" href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-twitter\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("            <li class=\"social-icon__item\"><a class=\"social-icon__link\" href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-linkedin\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("            <li class=\"social-icon__item\"><a class=\"social-icon__link\" href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-instagram\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"menu\">\n");
      out.write("            <li class=\"menu__item\"><a class=\"menu__link\" href=\"#\">Home</a></li>\n");
      out.write("            <li class=\"menu__item\"><a class=\"menu__link\" href=\"#\">About</a></li>\n");
      out.write("            <li class=\"menu__item\"><a class=\"menu__link\" href=\"#\">Services</a></li>\n");
      out.write("            <li class=\"menu__item\"><a class=\"menu__link\" href=\"#\">Team</a></li>\n");
      out.write("            <li class=\"menu__item\"><a class=\"menu__link\" href=\"#\">Contact</a></li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <p>&copy;2024 D04 R02 | All Rights Reserved</p>\n");
      out.write("    </footer>\n");
      out.write("    <!-- FOOTER -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("    <script src=\"Manage_Staff.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
    _jspx_th_c_forEach_0.setVar("dr_type");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${drType}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <li>               \n");
          out.write("                    <ul>\n");
          out.write("                            <li><a href=\"listStaff?dtId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dr_type.driv_type_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dr_type.driv_type_value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                    </ul>\n");
          out.write("                     </li>\n");
          out.write("            ");
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
}
