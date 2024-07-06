package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Manage_005fService_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <!-- Boxicons -->\n");
      out.write("    <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\"\n");
      out.write("        integrity=\"sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <!-- My CSS -->\n");
      out.write("    <link href=\"Manage Service/Manage_Service.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <link href=\"Manage Service/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <title>DN EXPRESS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"confiq\">\n");
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
      out.write("                 <li class=\"active\">\n");
      out.write("                    <a href=\"listService\">\n");
      out.write("                        <i class='bx bxs-doughnut-chart'></i>\n");
      out.write("                        <span class=\"text\">Manage Services</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class='bx bxs-doughnut-chart'></i>\n");
      out.write("                        <span class=\"text\">Manage Post Office</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
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
      out.write("                <a href=\"listService\" class=\"nav-link\"><strong>Manage Services</strong></a>\n");
      out.write("                <form action=\"#\">\n");
      out.write("                    <div class=\"form-input\" >\n");
      out.write("                         <input type=\"text\" id=\"searchInput\" placeholder=\"Search\" onkeypress=\"handleKeyPress(event)\">\n");
      out.write("                          <button type=\"button\" class=\"search-btn\" onclick=\"search()\">Search</button>\n");
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
      out.write("                <section class=\"table__body\">\n");
      out.write("                    <table>\n");
      out.write("                        <header>\n");
      out.write("                            <div class=\"filterEntries\">\n");
      out.write("                                <div class=\"addMemberBtn\">\n");
      out.write("                                    <button onclick=\"window.location.href='Add_Service_Details.jsp'\">New Service</button>\n");
      out.write("                                </div>\n");
      out.write("                                <form action=\"searchService\" method=\"post\">\n");
      out.write("                                  <div class=\"filter\" >\n");
      out.write("                                        <label for=\"searchInput\" style=\"color: #083c3e;\"><strong>Search:</strong></label>\n");
      out.write("                                        <input name=\"searchCriteria\" type=\"text\" id=\"searchInput\" placeholder=\"Enter Here\" onkeypress=\"handleKeyPress(event)\">\n");
      out.write("                                        <input class=\"searchButton\" type=\"submit\" name=\"btnGo\" value=\"Search\">\n");
      out.write("                                 </div>\n");
      out.write("                                </form>\n");
      out.write("                               \n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </header>\n");
      out.write("                        <thead>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th> STT <span class=\"icon-arrow\"></span></th>\n");
      out.write("                                <th> Service <span class=\"icon-arrow\"></span></th>\n");
      out.write("                                <th> Service ID <span class=\"icon-arrow\"></span></th>\n");
      out.write("                                <th> Price <span class=\"icon-arrow\"></span></th>\n");
      out.write("                                <th> Status <span class=\"icon-arrow\"></span></th>\n");
      out.write("                                <th> Action <span class=\"icon-arrow\"></span></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <!-- <tr><td class=\"empty\" colspan=\"11\" align=\"center\">No data available in table</td></tr> -->\n");
      out.write("                             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </section>\n");
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
      out.write("    <!--Popup Form-->\n");
      out.write("\n");
      out.write("<!--    <div class=\"dark_bg\">\n");
      out.write("\n");
      out.write("        <div class=\"popup\">\n");
      out.write("            <header>\n");
      out.write("                <h2 class=\"modalTitle\">Fill the Form</h2>\n");
      out.write("                <button class=\"closeBtn\">&times;</button>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div class=\"body\">\n");
      out.write("                <form action=\"#\" id=\"myForm\">\n");
      out.write("\n");
      out.write("                    <div class=\"inputFieldContainer\">\n");
      out.write("\n");
      out.write("                        <div class=\"nameField\">\n");
      out.write("                            <div class=\"form_control\">\n");
      out.write("                                <label for=\"serName\">Service Name:</label>\n");
      out.write("                                <input type=\"text\" name=\"\" id=\"serName\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form_control\">\n");
      out.write("                                <label for=\"serPrice\">Service price</label>\n");
      out.write("                                <input type=\"text\" name=\"\" id=\"serPrice\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form_control\">\n");
      out.write("                            <label for=\"description\">Description</label>\n");
      out.write("                            <textarea id=\"description\" rows=\"10\" cols=\"50\" required></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <footer class=\"popupFooter\">\n");
      out.write("                <button form=\"myForm\" class=\"submitBtn\">Submit</button>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>-->\n");
      out.write("\n");
      out.write("    <div class=\"overlay\" id=\"overlay\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"popup_del\" id=\"deletePopup\">\n");
      out.write("        <div class=\"popup_del-content\">\n");
      out.write("            <h2><strong>Confirmation</strong></h2>\n");
      out.write("            <p>Are you sure to delete?</p>\n");
      out.write("            <button id=\"cancelDeleteBtn\">Cancel</button>\n");
      out.write("            <button id=\"confirmDeleteBtn\">Delete</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     <!--Popup Form-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("        <script src=\"Manage Service/Manage_Service.js\" type=\"text/javascript\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function showDeletePopup(accountId) {\n");
      out.write("        const deletePopup = document.getElementById('deletePopup');\n");
      out.write("        const confirmDeleteBtn = document.getElementById('confirmDeleteBtn');\n");
      out.write("        \n");
      out.write("        deletePopup.style.display = 'block';\n");
      out.write("\n");
      out.write("        confirmDeleteBtn.onclick = function() {\n");
      out.write("            window.location.href = 'deleteService?service_type_id=' + accountId;\n");
      out.write("        };\n");
      out.write("        \n");
      out.write("        document.getElementById('cancelDeleteBtn').onclick = function() {\n");
      out.write("            deletePopup.style.display = 'none';\n");
      out.write("        };\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function handleKeyPress(event) {\n");
      out.write("        if (event.key === 'Enter') {\n");
      out.write("            event.preventDefault();\n");
      out.write("            search();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function search() {\n");
      out.write("        let searchTerm = document.getElementById('searchInput').value.trim();\n");
      out.write("        if (searchTerm !== '') {\n");
      out.write("            // Chuyển hướng đến trang hiển thị kết quả tìm kiếm\n");
      out.write("            window.location.href = 'searchService?searchCriteria=' + encodeURIComponent(searchTerm);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("    \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("service");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${STlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.service_type_value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.service_type_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>Null</td>\n");
          out.write("                                    <td>Null</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <button class=\"action-btn view-btn\"  \n");
          out.write("                                                onclick=\"window.location.href='getServiceDetails?service_type_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.service_type_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\">\n");
          out.write("                                            <i class=\"fa-regular fa-eye\"></i></button>\n");
          out.write("                                        <button class=\"action-btn edit-btn\" \n");
          out.write("                                                onclick=\"window.location.href='editServiceDetails?service_type_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.service_type_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\">\n");
          out.write("                                            <i class=\"fa-regular fa-pen-to-square\"></i>\n");
          out.write("                                        </button>\n");
          out.write("                                        <button class=\"action-btn delete-btn\"\n");
          out.write("                                                onclick=\"showDeletePopup(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.service_type_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">\n");
          out.write("                                            <i class=\"fa-regular fa-trash-can\"></i></button>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
