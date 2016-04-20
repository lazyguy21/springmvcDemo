package com.cddaka.springmvcDemo.util;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by LHL on 2016/2/26.
 */
public class ViewCustomTag extends TagSupport {

    //接收传递进来的PageContext对象
    private PageContext pageContext;

    private String user;

    @Override
    public void setPageContext(PageContext pageContext) {

    }

    @Override
    public void setParent(Tag tag) {

    }

    @Override
    public Tag getParent() {
        return null;
    }

    @Override
    public int doStartTag() throws JspException {
        try {

            JspWriter out = this.pageContext.getOut();

            if(user == null) {

                out.println("No UserInfo Found...");

                return SKIP_BODY;

            }

            out.println("<table width='500px' border='1' align='center'>");

            out.println("<tr>");

            out.println("<td width='20%'>Username:</td>");

            out.println("<td>" + "123" + "</td>");

            out.println("</tr>");

            out.println("<tr>");

            out.println("<td>Age:</td>");

            out.println("<td>" + "12" + "</td>");

            out.println("</tr>");

            out.println("<tr>");

            out.println("<td>Email:</td>");

            out.println("<td>" + "10" + "</td>");

            out.println("</tr>");

            out.println("</table>");

        } catch(Exception e) {

            throw new JspException(e.getMessage());

        }

        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        return 0;
    }

    @Override
    public void release() {

        super.release();

        this.user = null;

    }
}
